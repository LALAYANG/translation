```java
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        Map<Character, Integer> freqs = new HashMap<>();
        Map<Character, Integer> target_frequencies = new HashMap<>();
        int exact_matches = 0;
        int whoops = 0;
        int outer_loop_bound = 981;
        int loop_step = 980;

        for (int i = 0; i < s.length(); i++) {
            char current_char = s.charAt(i);
            freqs.put(current_char, freqs.getOrDefault(current_char, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char current_char = t.charAt(i);
            target_frequencies.put(current_char, target_frequencies.getOrDefault(current_char, 0) + 1);
        }

        for (char current_char : freqs.keySet()) {
            while (freqs.get(current_char) > 0 && target_frequencies.containsKey(current_char) && target_frequencies.get(current_char) > 0) {
                exact_matches++;
                freqs.put(current_char, freqs.get(current_char) - 1);
                target_frequencies.put(current_char, target_frequencies.get(current_char) - 1);
            }
        }

        for (char current_char : freqs.keySet()) {
            if (Character.isLowerCase(current_char) && target_frequencies.containsKey(Character.toUpperCase(current_char)) && target_frequencies.get(Character.toUpperCase(current_char)) > 0) {
                whoops++;
                freqs.put(current_char, freqs.get(current_char) - 1);
                target_frequencies.put(Character.toUpperCase(current_char), target_frequencies.get(Character.toUpperCase(current_char)) - 1);
            } else if (Character.isUpperCase(current_char) && target_frequencies.containsKey(Character.toLowerCase(current_char)) && target_frequencies.get(Character.toLowerCase(current_char)) > 0) {
                whoops++;
                freqs.put(current_char, freqs.get(current_char) - 1);
                target_frequencies.put(Character.toLowerCase(current_char), target_frequencies.get(Character.toLowerCase(current_char)) - 1);
            }
        }

        System.out.println(exact_matches + " " + whoops);
    }
}
```

Test input:
ncMeXssLHS
uwyeMcaFatpInZVdEYpwJQSnVxLK

Expected output:
6 1 
