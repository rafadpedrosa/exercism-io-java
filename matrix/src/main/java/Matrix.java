import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Matrix {

    List<String[]> matrix = new ArrayList<>();

    Matrix(String matrixAsString) {
        Stream.of(matrixAsString.split("\n"))
                .map(row -> row.split(" "))
                .forEach(matrix::add);
    }

    int[] getRow(int rowNumber) {
        return Arrays.stream(matrix.get(rowNumber)).mapToInt(Integer::valueOf).toArray();
    }

    int[] getColumn(int columnNumber) {
        return matrix.stream().map(row -> row[columnNumber]).mapToInt(Integer::valueOf).toArray();
    }
}
