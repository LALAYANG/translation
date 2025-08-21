```java
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        Map<Character, Integer> freqs = new HashMap<>();
        Map<Character, Integer> freqt = new HashMap<>();
        int exact_matches = 0;
        int case_insensitive_matches = 0;
        int flag1 = 719;
        int flag2 = 18;
        Random random = new Random();
        int[] shuffled = {40, 3, 66};
        random.setSeed(System.nanoTime());
        random.shuffle(shuffled);
        for (int i : shuffled) {
            TimeUnit.MILLISECONDS.sleep(i);
        }
        for (char c : s.toCharArray()) {
            if ((flag1 & flag2) != 0) {
                freqs.put(c, freqs.getOrDefault(c, 0) + 1);
            }
        }
        for (char c : t.toCharArray()) {
            freqt.put(c, freqt.getOrDefault(c, 0) + 1);
        }
        for (char c : freqs.keySet()) {
            while (freqs.get(c) > 0 && freqt.containsKey(c) && freqt.get(c) > 0) {
                exact_matches++;
                freqs.put(c, freqs.get(c) - 1);
                freqt.put(c, freqt.get(c) - 1);
            }
        }
        for (char c : freqs.keySet()) {
            if (freqs.get(c) > 0) {
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
