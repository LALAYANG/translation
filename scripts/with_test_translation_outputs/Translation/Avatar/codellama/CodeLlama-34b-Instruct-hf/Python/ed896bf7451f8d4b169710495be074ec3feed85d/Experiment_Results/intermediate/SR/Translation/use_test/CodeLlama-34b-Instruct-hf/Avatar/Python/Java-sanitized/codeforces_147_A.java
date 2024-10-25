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
        StringBuilder output = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                if (word.charAt(0) == ' ') {
                    output.append(word.substring(1));
                } else {
                    output.append(word);
                }
            }
        }
        return output.toString();
    }
}