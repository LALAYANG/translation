import java.util.Scanner;
import java.util.Collections;
import java.util.HashMap;

public class atcoder_ABC110_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        System.out.println(run(s, t));
    }

    public static String run(String s, String t) {
        HashMap<Character, Integer> counterS = new HashMap<>();
        HashMap<Character, Integer> counterT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (counterS.containsKey(c)) {
                counterS.put(c, counterS.get(c) + 1);
            } else {
                counterS.put(c, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (counterT.containsKey(c)) {
                counterT.put(c, counterT.get(c) + 1);
            } else {
                counterT.put(c, 1);
            }
        }

        if (counterS.equals(counterT)) {
            return "Yes";
        } else {
            return "No";
        }
    }
}