import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class codeforces_637_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputCount = sc.nextInt();
        String[] s = sc.nextLine().split(" ");
        Map<String, Integer> w = new HashMap<>();
        for (String str : s) {
            if (w.containsKey(str)) {
                w.put(str, w.get(str) + 1);
            } else {
                w.put(str, 1);
            }
        }

        int mostFrequentElement = 0;
        int c = 0;
        for (Map.Entry<String, Integer> entry : w.entrySet()) {
            if (entry.getValue() == w.values().stream().max(Integer::compareTo).get()) {
                if (s.indexOf(entry.getKey()) > c) {
                    mostFrequentElement = entry.getKey();
                    c = s.indexOf(entry.getKey());
                }
            }
        }

        System.out.println(mostFrequentElement);
    }
}