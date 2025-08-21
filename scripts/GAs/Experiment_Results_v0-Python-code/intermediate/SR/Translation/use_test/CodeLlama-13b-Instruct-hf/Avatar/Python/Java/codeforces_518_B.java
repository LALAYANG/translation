
Here is the Java code that translates the Python code:
```java
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        String s = "ncMeXssLHS";
        String t = "uwyeMcaFatpInZVdEYpwJQSnVxLK";

        Map<Character, Integer> freqs = new HashMap<>();
        Map<Character, Integer> freqt = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freqs.containsKey(c)) {
                freqs.put(c, freqs.get(c) + 1);
            } else {
                freqs.put(c, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (freqt.containsKey(c)) {
                freqt.put(c, freqt.get(c) + 1);
            } else {
                freqt.put(c, 1);
            }
        }

        int exactMatches = 0;
        int caseInsensitiveMatches = 0;

        for (Map.Entry<Character, Integer> entry : freqs.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            while (count > 0 && freqt.containsKey(c) && freqt.get(c) > 0) {
                exactMatches++;
                count--;
                freqt.put(c, freqt.get(c) - 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : freqs.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            while (count > 0) {
                if (Character.isLowerCase(c) && Character.isUpperCase(c.toUpperCase()) && freqt.containsKey(c.toUpperCase()) && freqt.get(c.toUpperCase()) > 0) {
                    caseInsensitiveMatches++;
                    count--;
                    freqt.put(c.toUpperCase(), freqt.get(c.toUpperCase()) - 1);
                } else if (Character.isUpperCase(c) && Character.isLowerCase(c.toLowerCase()) && freqt.containsKey(c.toLowerCase()) && freqt.get(c.toLowerCase()) > 0) {
                    caseInsensitiveMatches++;
                    count--;
                    freqt.put(c.toLowerCase(), freqt.get(c.toLowerCase()) - 1);
                } else {
                    break;
                }
            }
        }

        System.out.println(exactMatches + " " + caseInsensitiveMatches);
    }
}
```
Note that this code uses the `HashMap` class to store the frequency of each character in the two strings, and the `Map.Entry` class to iterate over the entries in the map. It also uses the `Character` class to check if a character is lowercase or uppercase.
