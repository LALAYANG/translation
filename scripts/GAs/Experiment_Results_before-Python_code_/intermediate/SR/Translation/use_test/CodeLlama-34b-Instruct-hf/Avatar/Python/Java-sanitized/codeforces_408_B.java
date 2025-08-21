import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class codeforces_408_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();

        Map<Character, Integer> boughtCount = new HashMap<>();
        for (char c : line1.toCharArray()) {
            if (!boughtCount.containsKey(c)) {
                boughtCount.put(c, 0);
            }
            boughtCount.put(c, boughtCount.get(c) + 1);
        }

        Map<Character, Integer> madeCount = new HashMap<>();
        for (char c : line2.toCharArray()) {
            if (!madeCount.containsKey(c)) {
                madeCount.put(c, 0);
            }
            madeCount.put(c, madeCount.get(c) + 1);
        }

        int res = 0;
        for (char color : madeCount.keySet()) {
            if (!boughtCount.containsKey(color)) {
                System.out.println(-1);
                return;
            }
            res += Math.min(boughtCount.get(color), madeCount.get(color));
        }

        System.out.println(res);
    }
}