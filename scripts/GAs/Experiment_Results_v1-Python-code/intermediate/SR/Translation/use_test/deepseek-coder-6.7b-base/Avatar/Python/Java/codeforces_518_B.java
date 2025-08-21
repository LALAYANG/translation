```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int[] freqs = new int[128];
        int[] target_frequencies = new int[128];
        int exact_matches = 0;
        int whoops = 0;
        for (int i = 0; i < s.length(); i++) {
            freqs[s.charAt(i)]++;
        }
        for (int i = 0; i < t.length(); i++) {
            target_frequencies[t.charAt(i)]++;
        }
        for (int i = 0; i < freqs.length; i++) {
            while (freqs[i] > 0 && target_frequencies[i] > 0) {
                exact_matches++;
                freqs[i]--;
                target_frequencies[i]--;
            }
        }
        for (int i = 0; i < freqs.length; i++) {
            while (freqs[i] > 0) {
                if (i >= 'a' && i <= 'z' && target_frequencies[i - 32] > 0) {
                    whoops++;
                    freqs[i]--;
                    target_frequencies[i - 32]--;
                } else if (i >= 'A' && i <= 'Z' && target_frequencies[i + 32] > 0) {
                    whoops++;
                    freqs[i]--;
                    target_frequencies[i + 32]--;
                } else {
                    break;
                }
            }
        }
        System.out.println(exact_matches + " " + whoops);
    }
}
```

