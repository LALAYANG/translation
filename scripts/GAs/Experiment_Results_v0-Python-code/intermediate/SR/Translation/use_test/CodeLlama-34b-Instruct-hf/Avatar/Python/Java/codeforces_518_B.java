```java
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();

        Map<Character, Integer> freqs = new HashMap<>();
        Map<Character, Integer> freqt = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (freqs.containsKey(c)) {
                freqs.put(c, freqs.get(c) + 1);
            } else {
                freqs.put(c, 1);
            }
        }

        for (char c : t.toCharArray()) {
            if (freqt.containsKey(c)) {
                freqt.put(c, freqt.get(c) + 1);
            } else {
                freqt.put(c, 1);
            }
        }

        int exactMatches = 0;
        int caseInsensitiveMatches = 0;

        for (char c : freqs.keySet()) {
            while (freqs.get(c) > 0 && freqt.containsKey(c) && freqt.get(c) > 0) {
                exactMatches++;
                freqs.put(c, freqs.get(c) - 1);
                freqt.put(c, freqt.get(c) - 1);
            }
        }

        for (char c : freqs.keySet()) {
            if (freqs.get(c) > 0) {
                if (c.isLowerCase() && freqt.containsKey(c.toUpperCase()) && freqt.get(c.toUpperCase()) > 0) {
                    caseInsensitiveMatches++;
                    freqs.put(c, freqs.get(c) - 1);
                    freqt.put(c.toUpperCase(), freqt.get(c.toUpperCase()) - 1);
                } else if (c.isUpperCase() && freqt.containsKey(c.toLowerCase()) && freqt.get(c.toLowerCase()) > 0) {
                    caseInsensitiveMatches++;
                    freqs.put(c, freqs.get(c) - 1);
                    freqt.put(c.toLowerCase(), freqt.get(c.toLowerCase()) - 1);
                }
            }
        }

        System.out.println(exactMatches + " " + caseInsensitiveMatches);
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses a `HashMap` to store the character frequencies in the two input strings, and then iterates over the characters in the first string to find the exact and case-insensitive matches. The `isLowerCase()` and `isUpperCase()` methods are used to check if a character is lowercase or uppercase. The `toUpperCase()` and `toLowerCase()` methods are used to convert a character to uppercase or lowercase.
