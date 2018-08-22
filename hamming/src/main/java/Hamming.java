import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Hamming {

    private List<Integer> leftStrand;
    private List<Integer> rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        this.leftStrand = this.transformInList(leftStrand);
        this.rightStrand = this.transformInList(rightStrand);
    }

    private List<Integer> transformInList(String strand) {
        return strand.codePoints()
                .boxed()
                .collect(Collectors.toList());
    }

    int getHammingDistance() {
        LinkedList<Integer> lStrand = new LinkedList<>(this.leftStrand);
        Predicate<Integer> notEqualStrands = rStrand -> !rStrand.equals(lStrand.pop());

        return (int) this.rightStrand.stream()
                .filter(notEqualStrands)
                .count();
    }

}

//    public static int compute(final String sequence1, final String sequence2) {
//        if (sequence1.length() != sequence2.length()) {
//            throw new IllegalArgumentException("Sequences cannot have different length");
//        }
//
//        return IntStream
//                .range(0, sequence1.length())
//                .map(i -> sequence1.charAt(i) != sequence2.charAt(i) ? 1 : 0)
//                .sum();
//    }
