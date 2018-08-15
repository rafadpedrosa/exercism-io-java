class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String numbersToCheckConverted = String.valueOf(numberToCheck);

        new StringBuilder(numbersToCheckConverted);

        final int numberSize = numbersToCheckConverted.length();
        final int numberPorSum;
        numberPorSum = numbersToCheckConverted
                .chars()
                .mapToLong(n -> Character.getNumericValue(n))
                .mapToInt(number -> (int) Math.pow(number, numberSize))
                .sum();

        return numberPorSum == numberToCheck;
    }
}
