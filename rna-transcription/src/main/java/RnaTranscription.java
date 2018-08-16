import java.util.HashMap;
import java.util.LinkedHashMap;

class RnaTranscription {

    HashMap<String, String> rnaMap;

    public RnaTranscription() {
        rnaMap = new LinkedHashMap<>();
        rnaMap.put("G", "C");
        rnaMap.put("C", "G");
        rnaMap.put("T", "A");
        rnaMap.put("A", "U");
        rnaMap.put("U", "A");
    }

    // ANOTHER SOLUTION
    private static int nucleotideMap(int c) {
        switch (c) {
            case 'G':
                return 'C';
            case 'C':
                return 'G';
            case 'T':
                return 'A';
            case 'A':
                return 'U';
        }
        throw new IllegalArgumentException("Invalid input");
    }

    // ANOTHER SOLUTION
    public String transcribe2(String dnaStrand) {
        return dnaStrand
                .codePoints()
                .map(Character::toUpperCase)
                .map(RnaTranscription::nucleotideMap)
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
    }

    String transcribe(String dnaStrand) {
        StringBuilder rna = new StringBuilder();


        System.out.println("oloko 0");
        dnaStrand.codePoints().forEach(System.out::println);
        System.out.println("oloko 1");

        dnaStrand.chars()
                .mapToObj(intCodeChar -> String.format("%c", intCodeChar))
                .map(rnaMap::get)
                .forEach(rna::append);

        return rna.toString();
    }


}
