import java.util.Arrays;

class Triangle {

    private final double[] sides;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        sides = new double[]{side1, side2, side3};

        this.resolveTriangle();
    }

    private boolean resolveTriangle() throws TriangleException {
        // saw this solution in other comments :)
        double sumSidesTriangle = Arrays.stream(this.sides, 0, 3).sum();

        boolean isLegalTriangle = Arrays.stream(this.sides, 0, 3)
                .allMatch(side -> (sumSidesTriangle - side) > side && side > 0);

        if (isLegalTriangle)
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
