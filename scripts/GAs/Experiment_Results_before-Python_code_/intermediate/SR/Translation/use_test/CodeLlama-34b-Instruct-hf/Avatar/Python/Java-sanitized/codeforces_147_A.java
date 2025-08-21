import java.util.Arrays;

public class codeforces_147_A {
    public static void main(String[] args) {
        String input = "mck  . gq   dauqminf      wee   bazyzy     humnv    d pgtvx  , vxntxgrkrc    rg    rwr,  uuyweyz  l";
        String output = removePunctuation(input);
        System.out.println(output);
    }

    public static String removePunctuation(String input) {
        String[] punctuation = {",", ".", "!", "?"};
        String[] words = input.split(" ");
        String[] filteredWords = new String[words.length];
        int count = 0;
        for (String word : words) {
            if (!word.isEmpty() && !Arrays.asList(punctuation).contains(word)) {
                filteredWords[count++] = word;
            }
        }
        return String.join(" ", Arrays.copyOf(filteredWords, count));
    }
}