```java
import java.util.Arrays;

public class PunctuationRemover {
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
```
Explanation:

1. The `main` method takes a string input and passes it to the `removePunctuation` method.
2. The `removePunctuation` method splits the input string into an array of words using the `split` method.
3. The method then iterates over the array of words and checks if each word is empty or contains any punctuation characters. If a word is empty or contains punctuation, it is not added to the `filteredWords` array.
4. The `filteredWords` array is then joined back into a string using the `join` method and returned.
5. The `main` method then prints the output string.

Note: The `Arrays.asList` method is used to create a list of punctuation characters to check against. The `Arrays.copyOf` method is used to create a new array of the correct size to hold the filtered words.
