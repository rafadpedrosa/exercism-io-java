class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String numbersToCheckConverted = String.valueOf(numberToCheck);

        new StringBuilder(numbersToCheckConverted);

        final int numberSize = numbersToCheckConverted.length();
        final int numberPorSum;
        numberPorSum = numbersToCheckConverted
                .chars()
                .mapToLong(n -> Character.getNumericValue(n))
                .mapToInt(number -> this.pow(number, numberSize))
                .sum();

        return numberPorSum == numberToCheck;
    }

    private int pow(long number, int pow) {
        Double convertedNumber = Double.valueOf(number);
        Double convertedPow = Double.valueOf(String.valueOf(pow));
        return (int) Math.pow(convertedNumber, convertedPow);
    }

}
