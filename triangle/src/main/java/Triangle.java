import java.util.Arrays;
import java.util.stream.IntStream;

class Triangle {

    private final double[] sides;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        sides = new double[]{side1, side2, side3};
        double[][] compareMatrix = {{side1, side2, side3}, {side2, side3, side1}, {side3, side1, side2}};

        this.resolveTriangle(compareMatrix);
    }

    private boolean resolveTriangle(double[][] compareMatrix) throws TriangleException {
        boolean isSidesBiggerThanZero = Arrays.stream(this.sides, 0, 2)
                .anyMatch(side -> side > 0);

        boolean isTwoSidesLessThanThird = IntStream.range(0, 2)
                .anyMatch(index -> (compareMatrix[index][0] + compareMatrix[index][1]) < compareMatrix[index][2]);


        if (!isTwoSidesLessThanThird && isSidesBiggerThanZero)
            return true;
        else
            throw new TriangleException();
    }

    boolean isEquilateral() {
        return Arrays.stream(this.sides, 0, 3)
                .distinct()
                .count() == 1;
    }

    boolean isIsosceles() {
        return this.isEquilateral() || Arrays.stream(this.sides, 0, 3)
                .distinct()
                .count() == 2;
    }

    boolean isScalene() {
        return Arrays.stream(this.sides, 0, 3)
                .distinct()
                .count() == 3;
    }

}
