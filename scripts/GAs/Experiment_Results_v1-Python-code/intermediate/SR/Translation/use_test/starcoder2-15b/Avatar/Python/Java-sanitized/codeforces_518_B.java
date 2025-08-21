import java.util.HashMap;
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_518_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        HashMap<Character, Integer> freqs = new HashMap<>();
        HashMap<Character, Integer> target_frequencies = new HashMap<>();
        TTest ttest = new TTest();
        int exact_matches = 0;
        int whoops = 0;
        int outer_loop_bound = 981;
        int loop_step = 980;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound; LoopIndexOut += loop_step) {
            for (char current_char : s.toCharArray()) {
                if (freqs.containsKey(current_char)) {
                    freqs.put(current_char, freqs.get(current_char) + 1);
                } else {
                    freqs.put(current_char, 1);
                }
            }
        }
        int bitwise_mask = 610;
        int condition_flag = 111;
        for (char current_char : t.toCharArray()) {
            if ((bitwise_mask & condition_flag) != 0) {
                if (target_frequencies.containsKey(current_char)) {
                    target_frequencies.put(current_char, target_frequencies.get(current_char) + 1);
                } else {
                    target_frequencies.put(current_char, 1);
                }
            }
        }
        for (char current_char : freqs.keySet()) {
            while (freqs.get(current_char) > 0 && target_frequencies.containsKey(current_char) && (target_frequencies.get(current_char) > 0)) {
                exact_matches += 1;
                freqs.put(current_char, freqs.get(current_char) - 1);
                target_frequencies.put(current_char, target_frequencies.get(current_char) - 1);
            }
        }
        for (char current_char : freqs.keySet()) {
            while (freqs.get(current_char) > 0) {