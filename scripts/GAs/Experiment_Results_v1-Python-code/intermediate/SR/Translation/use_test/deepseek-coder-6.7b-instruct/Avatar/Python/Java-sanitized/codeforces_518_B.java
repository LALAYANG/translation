import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codeforces_518_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        Map<Character, Integer> freqs = new HashMap<>();
        Map<Character, Integer> target_frequencies = new HashMap<>();
        int exact_matches = 0;
        int whoops = 0;
        int outer_loop_bound = 981;
        int loop_step = 980;
        int bitwise_mask = 610;
        int condition_flag = 111;

        countFrequencies(s, freqs, 0, outer_loop_bound / loop_step, 1);

        for (char c : t.toCharArray()) {
            if ((bitwise_mask & condition_flag) != 0) {
                target_frequencies.put(c, target_frequencies.getOrDefault(c, 0) + 1);
            }
        }

        for (char c : freqs.keySet()) {
            while (freqs.get(c) > 0 && target_frequencies.containsKey(c) && target_frequencies.get(c) > 0) {
                exact_matches++;
                freqs.put(c, freqs.get(c) - 1);
                target_frequencies.put(c, target_frequencies.get(c) - 1);
            }
        }

        for (char c : freqs.keySet()) {
            while (freqs.get(c) > 0) {
                if (Character.isLowerCase(c) && target_frequencies.containsKey((char)(c - 'a' + 'A')) && target_frequencies.get((char)(c - 'a' + 'A')) > 0) {
                    whoops++;
                    freqs.put(c, freqs.get(c) - 1);
                    target_frequencies.put((char)(c - 'a' + 'A'), target_frequencies.get((char)(c - 'a' + 'A')) - 1);
                } else if (Character.isUpperCase(c) && target_frequencies.containsKey((char)(c - 'A' + 'a')) && target_frequencies.get((char)(c - 'A' + 'a')) > 0) {
                    whoops++;
                    freqs.put(c, freqs.get(c) - 1);
                    target_frequencies.put((char)(c - 'A' + 'a'), target_frequencies.get((char)(c - 'A' + 'a')) - 1);
                } else {
                    break;
                }
            }
        }

        System.out.println(exact_matches + " " + whoops);
    }

    private static void countFrequencies(String s, Map<Character, Integer> freqs, int loopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (char c : s.toCharArray()) {
            freqs.put(c, freqs.getOrDefault(c, 0) + 1);
        }
        countFrequencies(s, freqs, loopIndexOut + step, stop, step);
    }
}