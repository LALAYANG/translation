```java
import java.util.HashMap;
import java.util.Map;

public class TTestInd {
    public static void main(String[] args) {
        String s = "ncMeXssLHS";
        String t = "uwyeMcaFatpInZVdEYpwJQSnVxLK";

        Map<Character, Integer> freqs = new HashMap<>();
        Map<Character, Integer> targetFreqs = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (freqs.containsKey(c)) {
                freqs.put(c, freqs.get(c) + 1);
            } else {
                freqs.put(c, 1);
            }
        }

        for (char c : t.toCharArray()) {
            if (targetFreqs.containsKey(c)) {
                targetFreqs.put(c, targetFreqs.get(c) + 1);
            } else {
                targetFreqs.put(c, 1);
            }
        }

        int exactMatches = 0;
        int whoops = 0;

        for (char c : freqs.keySet()) {
            while (freqs.get(c) > 0 && targetFreqs.containsKey(c) && targetFreqs.get(c) > 0) {
                exactMatches++;
                freqs.put(c, freqs.get(c) - 1);
                targetFreqs.put(c, targetFreqs.get(c) - 1);
            }
        }

        for (char c : freqs.keySet()) {
            while (freqs.get(c) > 0) {
                if (c.isLowerCase() && targetFreqs.containsKey(c.toUpperCase()) && targetFreqs.get(c.toUpperCase()) > 0) {
                    whoops++;
                    freqs.put(c, freqs.get(c) - 1);
                    targetFreqs.put(c.toUpperCase(), targetFreqs.get(c.toUpperCase()) - 1);
                } else if (c.isUpperCase() && targetFreqs.containsKey(c.toLowerCase()) && targetFreqs.get(c.toLowerCase()) > 0) {
                    whoops++;
                    freqs.put(c, freqs.get(c) - 1);
                    targetFreqs.put(c.toLowerCase(), targetFreqs.get(c.toLowerCase()) - 1);
                } else {
                    break;
                }
            }
        }

        System.out.println(exactMatches + " " + whoops);
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses a `HashMap` to store the character frequencies and a `for` loop to iterate over the characters in the input strings. The `while` loops are used to count the exact matches and the whoops. The `isLowerCase()` and `isUpperCase()` methods are used to check if a character is lowercase or uppercase.
