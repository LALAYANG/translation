Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();

        Map<Character, Integer> freqs = new HashMap<>();
        Map<Character, Integer> freqt = new HashMap<>();

        int yay = 0, whoops = 0;

        for (char c : s.toCharArray()) {
            freqs.put(c, freqs.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            freqt.put(c, freqt.getOrDefault(c, 0) + 1);
        }

        for (char c : freqs.keySet()) {
            while (freqs.get(c) > 0 && freqt.containsKey(c) && freqt.get(c) > 0) {
                yay++;
                freqs.put(c, freqs.get(c) - 1);
                freqt.put(c, freqt.get(c) - 1);
            }
        }

        for (char c : freqs.keySet()) {
            while (freqs.get(c) > 0) {
                if (Character.isLowerCase(c) && freqt.containsKey(Character.toUpperCase(c)) && freqt.get(Character.toUpperCase(c)) > 0) {
                    whoops++;
                    freqs.put(c, freqs.get(c) - 1);
                    freqt.put(Character.toUpperCase(c), freqt.get(Character.toUpperCase(c)) - 1);
                } else if (Character.isUpperCase(c) && freqt.containsKey(Character.toLowerCase(c)) && freqt.get(Character.toLowerCase(c)) > 0) {
                    whoops++;
                    freqs.put(c, freqs.get(c) - 1);
                    freqt.put(Character.toLowerCase(c), freqt.get(Character.toLowerCase(c)) - 1);
                } else {
                    break;
                }
            }
        }

        System.out.println(yay + " " + whoops);
    }
}
```

This Java code does the same thing as the Python code. It reads two strings `s` and `t`, counts the frequency of each character in `s` and `t` respectively, and then iterates over the keys of `freqs`. For each key, it checks if it exists in `freqt` and if the count in both maps is greater than 0. If it is, it increments `yay` and decrements the count in both maps. If the key is uppercase and its lowercase counterpart exists in `freqt` and its count is greater than 0, it increments `whoops` and decrements the count in both maps. If the key is lowercase and its uppercase counterpart exists in `freqt` and its count is greater than 0, it increments `whoops` and decrements the count in both maps. Finally, it prints `yay` and `whoops`.

