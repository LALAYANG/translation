import java.util.Scanner;
import java.util.HashMap;

public class codeforces_131_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> w = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (w.containsKey(num)) {
                w.put(num, w.get(num) + 1);
            } else {
                w.put(num, 1);
            }
        }
        int c = 0;
        for (int i : w.keySet()) {
            if (i == 0) {
                c += w.get(i) * (w.get(i) - 1);
            } else {
                if (w.containsKey(-i)) {
                    c += w.get(i) * w.get(-i);
                }
            }
        }
        System.out.println(c / 2);
    }
}