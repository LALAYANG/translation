```
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
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
```
The above code is a Java implementation of the Python code you provided. It uses the `split` method to split the input string into a list of words, and then uses the `map` and `filter` methods to process each word and remove any empty strings. Finally, it uses the `join` method to join the processed words back into a single string.

Note that the `processInput` method is marked as `private` because it is not intended to be called from outside the class. If you want to make it accessible from outside the class, you can change the access modifier to `public`.
