import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int exact_matches = 0;
        int case_insensitive_matches = 0;
        HashMap<Character, Integer> freqs = new HashMap<Character, Integer>();
        HashMap<Character, Integer> freqt = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (freqs.containsKey(s.charAt(i))) {
                freqs.put(s.charAt(i), freqs.get(s.charAt(i)) + 1);
            } else {
                freqs.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (freqt.containsKey(t.charAt(i))) {
                freqt.put(t.charAt(i), freqt.get(t.charAt(i)) + 1);
            } else {
                freqt.put(t.charAt(i), 1);
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
                if (Character.isLowerCase(c) && freqt.containsKey(Character.toUpperCase(c)) && (freqt.get(Character.toUpperCase(c)) > 0)) {
                    case_insensitive_matches++;
                    freqs.put(c, freqs.get(c) - 1);
                    freqt.put(Character.toUpperCase(c), freqt.get(Character.toUpperCase(c)) - 1);
                } else if (Character.isUpperCase(c) && freqt.containsKey(Character.toLowerCase(c)) && (freqt.get(Character.toLowerCase(c)) > 0)) {
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