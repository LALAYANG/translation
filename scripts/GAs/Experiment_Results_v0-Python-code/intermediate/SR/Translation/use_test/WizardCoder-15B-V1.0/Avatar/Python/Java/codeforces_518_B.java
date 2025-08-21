```java
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        Map<Character, Integer> freqs = new HashMap<>();
        Map<Character, Integer> freqt = new HashMap<>();
        int exact_matches = 0;
        int case_insensitive_matches = 0;
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
        for (char c : freqs.keySet()) {
            while (freqs.get(c) > 0 && freqt.containsKey(c) && freqt.get(c) > 0) {
                exact_matches++;
                freqs.put(c, freqs.get(c) - 1);
                freqt.put(c, freqt.get(c) - 1);
            }
        }
        for (char c : freqs.keySet()) {
            while (freqs.get(c) > 0) {
                if (Character.isLowerCase(c) && freqt.containsKey(Character.toUpperCase(c)) && freqt.get(Character.toUpperCase(c)) > 0) {
                    case_insensitive_matches++;
                    freqs.put(c, freqs.get(c) - 1);
                    freqt.put(Character.toUpperCase(c), freqt.get(Character.toUpperCase(c)) - 1);
                } else if (Character.isUpperCase(c) && freqt.containsKey(Character.toLowerCase(c)) && freqt.get(Character.toLowerCase(c)) > 0) {
                    case_insensitive_matches++;
                    freqs.put(c, freqs.get(c) - 1);
                    freqt.put(Character.toLowerCase(c), freqt.get(Character.toLowerCase(c)) - 1);
                } else {
                    break;
                }
            }
        }
        System.out.println(exact_matches + " " + case_insensitive_matches);
    }
}
```
