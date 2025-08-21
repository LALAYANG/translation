import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class codeforces_147_A {
    public static void main(String[] args) {
        String input = "mck  . gq   dauqminf      wee   bazyzy     humnv    d pgtvx  , vxntxgrkrc    rg    rwr,  uuyweyz  l";
        String output = processInput(input);
        System.out.println(output);
    }

    private static String processInput(String input) {
        List<String> words = Arrays.asList(input.split(" "));
        List<String> processedWords = words.stream()
                .map(word -> word.replaceAll("\\s+", ""))
                .filter(word -> !word.isEmpty())
                .collect(Collectors.toList());
        return String.join(" ", processedWords);
    }
}