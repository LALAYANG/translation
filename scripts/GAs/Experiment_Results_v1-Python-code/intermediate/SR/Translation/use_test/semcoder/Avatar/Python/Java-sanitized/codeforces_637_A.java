import java.util.Scanner;
import java.util.HashMap;

public class codeforces_637_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String[] s = input.nextLine().split(" ");
        HashMap<String, Integer> w = new HashMap<>();
        for (String word : s) {
            w.put(word, w.getOrDefault(word, 0) + 1);
        }
        String[] sReversed = new String[s.length];
        for (int i = 0; i < s.length; i++) {
            sReversed[i] = s[s.length - 1 - i];
        }
        int c = -1;
        String a = "";
        for (String word : w.keySet()) {
            if (w.get(word) == maxOccurrences(w) && s.indexOf(word) > c) {
                a = word;
                c = s.indexOf(word);
            }
        }
        System.out.println(a);
    }

    private static int maxOccurrences(HashMap<String, Integer> map) {
        int max = 0;
        for (int value : map.values()) {
            max = Math.max(max, value);
        }
        return max;
    }
}