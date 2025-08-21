import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class codeforces_518_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        Map<Character, Integer> freqs = new HashMap<>();
        Map<Character, Integer> target_frequencies = new HashMap<>();
        int exact_matches = 0;
        int whoops = 0;
        for (int i = 0; i < s.length(); i++) {
            char current_char = s.charAt(i);
            if (freqs.containsKey(current_char)) {
                freqs.put(current_char, freqs.get(current_char) + 1);
            } else {
                freqs.put(current_char, 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char current_char = t.charAt(i);
            if (target_frequencies.containsKey(current_char)) {
                target_frequencies.put(current_char, target_frequencies.get(current_char) + 1);
            } else {
                target_frequencies.put(current_char, 1);
            }
        }
        for (char current_char : freqs.keySet()) {
            while (freqs.get(current_char) > 0 && target_frequencies.containsKey(current_char) && target_frequencies.get(current_char) > 0) {
                exact_matches++;
                freqs.put(current_char, freqs.get(current_char) - 1);
                target_frequencies.put(current_char, target_frequencies.get(current_char) - 1);
            }
        }
        for (char current_char : freqs.keySet()) {
            while (freqs.get(current_char) > 0) {
                if (Character.isLowerCase(current_char) && target_frequencies.containsKey(Character.toUpperCase(current_char)) && target_frequencies.get(Character.toUpperCase(current_char)) > 0) {
                    whoops++;
                    freqs.put(current_char, freqs.get(current_char) - 1);
                    target_frequencies.put(Character.toUpperCase(current_char), target_frequencies.get(Character.toUpperCase(current_char)) - 1);
                } else if (Character.isUpperCase(current_char) && target_frequencies.containsKey(Character.toLowerCase(current_char)) && target_frequencies.get(Character.toLowerCase(current_char)) > 0) {
                    whoops++;
                    freqs.put(current_char, freqs.get(current_char) - 1);
                    target_frequencies.put(Character.toLowerCase(current_char), target_frequencies.get(Character.toLowerCase(current_char)) - 1);
                } else {
                    break;
                }
            }
        }
        System.out.println(exact_matches + " " + whoops);
    }
}