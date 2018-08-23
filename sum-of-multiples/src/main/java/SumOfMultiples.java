import java.util.stream.IntStream;

class SumOfMultiples {
    private final int[] set;
    private final int[] multiples;

    SumOfMultiples(int number, int[] set) {
        this.set = set;
        multiples = IntStream.range(0, number)
                .filter(this::isMultiple)
                .toArray();
    }

    private boolean isMultiple(int range) {
        return IntStream.range(0, set.length).filter(multiple -> range % set[multiple] == 0).count() > 0;
    }

    int getSum() {
        return IntStream.range(0, multiples.length).map(index -> multiples[index]).sum();
    }


//    public static int sum(int limit, int[] factors) {
//        Supplier<IntStream> factorStream =
//                () -> Arrays.stream(factors);
//
//        IntPredicate isMultiple =
//                x -> factorStream.get()
//                        .anyMatch(factor -> x % factor == 0);
//
//        return IntStream.range(1, limit)
//                .filter(isMultiple)
//                .sum();
//    }
}
