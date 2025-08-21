Here is the Java equivalent of the Python code you provided:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();

        Map<Character, Integer> freqs = new HashMap<>();
        Map<Character, Integer> freqt = new HashMap<>();

        int exactMatches = 0;
        int caseInsensitiveMatches = 0;

        int flag1 = 719;
        int flag2 = 18;

        if ((flag1 & flag2) != 0) {
            for (char c : s.toCharArray()) {
                freqs.put(c, freqs.getOrDefault(c, 0) + 1);
            }

            for (char c : t.toCharArray()) {
                freqt.put(c, freqt.getOrDefault(c, 0) + 1);
            }

            for (char c : freqs.keySet()) {
                while (freqs.get(c) > 0 && freqt.getOrDefault(c, 0) > 0) {
                    exactMatches++;
                    freqs.put(c, freqs.get(c) - 1);
                    freqt.put(c, freqt.get(c) - 1);
                }
            }

            for (char c : freqs.keySet()) {
                while (freqs.get(c) > 0) {
                    if (Character.isLowerCase(c) && freqt.getOrDefault(Character.toUpperCase(c), 0) > 0) {
                        caseInsensitiveMatches++;
                        freqs.put(c, freqs.get(c) - 1);
                        freqt.put(Character.toUpperCase(c), freqt.get(Character.toUpperCase(c)) - 1);
                    } else if (Character.isUpperCase(c) && freqt.getOrDefault(Character.toLowerCase(c), 0) > 0) {
                        caseInsensitiveMatches++;
                        freqs.put(c, freqs.get(c) - 1);
                        freqt.put(Character.toLowerCase(c), freqt.get(Character.toLowerCase(c)) - 1);
                    } else {
                        break;
                    }
                }
            }
        }

        System.out.println(exactMatches + " " + caseInsensitiveMatches);
    }
}
```

This Java code does the same thing as your Python code. It reads two strings from the input, counts the frequency of each character in the strings, and then matches the characters in the strings based on the conditions in your Python code. The results are then printed to the console.

