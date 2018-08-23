import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Flattener {

    public List flatten(List<Object> six) {
        List test = new ArrayList();

        six.stream()
                .filter(Objects::nonNull) // values not null
                .reduce(test, this::callFlattenRecursively);

        // Find the lists
        return test;
    }

    private List callFlattenRecursively(Object a, Object b) {
        List arrays = (List) a;

        if (b.toString().matches("^\\[.*")) {
            arrays.addAll(this.flatten((List<Object>) b));
        } else {
            arrays.add(b);
        }

        return arrays;
    }
}
