```java
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareStringCounts {
    public static void main(String[] args) {
        String s = "chokudai";
        String t = "redcoder";

        List<Integer> sortedSourceCounts = Arrays.asList(Collections.frequency(s.toCharArray(), 'c'),
                Collections.frequency(s.toCharArray(), 'e'), Collections.frequency(s.toCharArray(), 'a'),
                Collections.frequency(s.toCharArray(), 'd'), Collections.frequency(s.toCharArray(), 'f'),
                Collections.frequency(s.toCharArray(), 'b'));

        List<Integer> sortedTargetCounts = Arrays.asList(Collections.frequency(t.toCharArray(), 'c'),
                Collections.frequency(t.toCharArray(), 'e'), Collections.frequency(t.toCharArray(), 'a'),
                Collections.frequency(t.toCharArray(), 'd'), Collections.frequency(t.toCharArray(), 'f'),
                Collections.frequency(t.toCharArray(), 'b'));

        if (sortedSourceCounts.equals(sortedTargetCounts)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
Note: The `Collections.frequency()` method is used to count the number of occurrences of each character in the input strings. The `Arrays.asList()` method is used to create a list of the counts for each character. The `List.equals()` method is used to compare the two lists of counts.
