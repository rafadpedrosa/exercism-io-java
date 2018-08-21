import java.util.HashMap;
import java.util.Map;

public class PangramChecker {

    Map<Integer, Boolean> alphabet;

    PangramChecker() {
        alphabet = new HashMap<>();
        char letter = 'a';
        while (letter != 'z') {
            alphabet.put(Character.getNumericValue(letter), false);
            letter++;
        }

    }

    public boolean isPangram(String input) {
        input.codePoints()
                .map(Character::toLowerCase)
                .map(Character::getNumericValue)
                .forEach(letter -> alphabet.put(letter, true));

        return alphabet.values()
                .stream()
                .allMatch(value -> value);
    }
}

// BETTER SOLUTION
//public class PangramChecker {
//    private final static int LETTERS_IN_ALPHABET = 26;
//
//    public boolean isPangram(String input) {
//        return input.toLowerCase().chars()
//                .filter(Character::isAlphabetic)
//                .distinct()
//                .count() == LETTERS_IN_ALPHABET;
//    }
//}