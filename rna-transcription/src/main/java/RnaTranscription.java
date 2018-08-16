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

    String transcribe(String dnaStrand) {
        StringBuilder rna = new StringBuilder();

        dnaStrand.chars()
                .mapToObj(intCodeChar -> String.format("%c", intCodeChar))
                .map(rnaMap::get)
                .forEach(rna::append);

        return rna.toString();
    }

}
