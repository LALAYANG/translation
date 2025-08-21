```
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        HashMap<Character, Integer> freqs = new HashMap<>();
        HashMap<Character, Integer> freqt = new HashMap<>();
        int exact_matches = 0;
        int case_insensitive_matches = 0;
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                freqs.put(c, freqs.getOrDefault(c, 0) + 1);
            }
        }
        for (char c : t.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                freqt.put(c, freqt.getOrDefault(c, 0) + 1);
            }
        }
        for (char c : freqs.keySet()) {
            while (freqs.get(c) > 0 && freqt.containsKey(c) && (freqt.get(c) > 0)) {
                exact_matches++;
                freqs.put(c, freqs.get(c) - 1);
                freqt.put(c, freqt.get(c) - 1);
            }
        }
        for (char c : freqs.keySet()) {
            while (freqs.get(c) > 0) {
                if (c >= 'a' && c <= 'z' && freqt.containsKey((char) (c - 32)) && (freqt.get((char) (c - 32)) > 0)) {
                    case_insensitive_matches++;
                    freqs.put(c, freqs.get(c) - 1);
                    freqt.put((char) (c - 32), freqt.get((char) (c - 32)) - 1);
                } else if (c >= 'A' && c <= 'Z' && freqt.containsKey((char) (c + 32)) && (freqt.get((char) (c + 32)) > 0)) {
                    case_insensitive_matches++;
                    freqs.put(c, freqs.get(c) - 1);
                    freqt.put((char) (c + 32), freqt.get((char) (c + 32)) - 1);
                } else {
                    break;
                }
            }
        }
        System.out.println(exact_matches + " " + case_insensitive_matches);
    }
}
```

