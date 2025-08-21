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
        for (char letra : s.toCharArray()) {
            freqs.put(letra, freqs.getOrDefault(letra, 0) + 1);
        }
        for (char letra : t.toCharArray()) {
            freqt.put(letra, freqt.getOrDefault(letra, 0) + 1);
        }
        for (char letra : freqs.keySet()) {
            while (freqs.get(letra) > 0 && freqt.containsKey(letra) && freqt.get(letra) > 0) {
                yay++;
                freqs.put(letra, freqs.get(letra) - 1);
                freqt.put(letra, freqt.get(letra) - 1);
            }
        }
        for (char letra : freqs.keySet()) {
            while (freqs.get(letra) > 0) {
                if (Character.isLowerCase(letra) && freqt.containsKey(Character.toUpperCase(letra)) && freqt.get(Character.toUpperCase(letra)) > 0) {
                    whoops++;
                    freqs.put(letra, freqs.get(letra) - 1);
                    freqt.put(Character.toUpperCase(letra), freqt.get(Character.toUpperCase(letra)) - 1);
                } else if (Character.isUpperCase(letra) && freqt.containsKey(Character.toLowerCase(letra)) && freqt.get(Character.toLowerCase(letra)) > 0) {
                    whoops++;
                    freqs.put(letra, freqs.get(letra) - 1);
                    freqt.put(Character.toLowerCase(letra), freqt.get(Character.toLowerCase(letra)) - 1);
                } else {
                    break;
                }
            }
        }
        System.out.println(yay + " " + whoops);
    }
}
```

This Java code does the same thing as the Python code. It reads two strings from the standard input, calculates the frequency of each character in both strings, and then iterates over the characters in the first string. For each character, it checks if the same character (case sensitive) exists in the second string. If it does, it increments the yay counter and decrements the frequency of the character in both strings. If it doesn't, it checks if a character with the same lower/upper case exists in the second string. If it does, it increments the whoops counter and decrements the frequency of the character in both strings. Finally, it prints the yay and whoops counters.

