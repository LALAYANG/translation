import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class codeforces_637_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputCount = scanner.nextInt();
        String[] s = scanner.nextLine().split(" ");
        Map<String, Integer> w = new HashMap<>();
        for (String element : s) {
            w.put(element, w.getOrDefault(element, 0) + 1);
        }
        String[] sReversed = new String[s.length];
        for (int i = 0; i < s.length; i++) {
            sReversed[i] = s[s.length - i - 1];
        }
        int c = -1;
        String mostFrequentElement = "";
        for (int i = 0; i < sReversed.length; i++) {
            if (w.get(sReversed[i]) == Collections.max(w.values())) {
                if (sReversed[i].indexOf(c) > 0) {
                    mostFrequentElement = sReversed[i];
                    c = sReversed[i].indexOf(c);
                }
            }
        }
        System.out.println(mostFrequentElement);
    }
}