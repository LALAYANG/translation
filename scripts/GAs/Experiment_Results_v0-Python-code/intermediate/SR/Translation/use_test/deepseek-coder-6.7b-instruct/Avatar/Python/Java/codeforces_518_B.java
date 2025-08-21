```java
import java.util.*;

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
        List<Integer> list = Arrays.asList(40, 3, 66);
        Collections.shuffle(list);
        for (char c : s.toCharArray()) {
            if ((flag1 & flag2) != 0) {
                freqs.put(c, freqs.getOrDefault(c, 0) + 1);
            }
        }
        for (char c : t.toCharArray()) {
            freqt.put(c, freqt.getOrDefault(c, 0) + 1);
        }
        for (char c : freqs.keySet()) {
            while (freqs.get(c) > 0 && freqt.containsKey(c) && (freqt.get(c) > 0)) {
                exactMatches++;
                freqs.put(c, freqs.get(c) - 1);
                freqt.put(c, freqt.get(c) - 1);
            }
        }
        for (char c : freqs.keySet()) {
            while (freqs.get(c) > 0) {
                if (Character.isLowerCase(c) && freqt.containsKey(Character.toUpperCase(c)) && (freqt.get(Character.toUpperCase(c)) > 0)) {
                    caseInsensitiveMatches++;
                    freqs.put(c, freqs.get(c) - 1);
                    freqt.put(Character.toUpperCase(c), freqt.get(Character.toUpperCase(c)) - 1);
                } else if (Character.isUpperCase(c) && freqt.containsKey(Character.toLowerCase(c)) && (freqt.get(Character.toLowerCase(c)) > 0)) {
                    caseInsensitiveMatches++;
                    freqs.put(c, freqs.get(c) - 1);
                    freqt.put(Character.toLowerCase(c), freqt.get(Character.toLowerCase(c)) - 1);
                } else {
                    break;
                }
            }
        }
        System.out.println(exactMatches + " " + caseInsensitiveMatches);
    }
}
```

This Java code does the same thing as the Python code. It reads two strings `s` and `t` from the input, and then counts the exact matches and case-insensitive matches in `s` and `t`. The results are printed to the standard output.

