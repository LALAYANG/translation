import java.util.*;

public class codeforces_408_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bought = sc.nextLine();
        String made = sc.nextLine();

        Map<Character, Integer> boughtCount = new HashMap<>();
        Map<Character, Integer> madeCount = new HashMap<>();

        for (char c : bought.toCharArray()) {
            boughtCount.put(c, boughtCount.getOrDefault(c, 0) + 1);
        }

        for (char c : made.toCharArray()) {
            madeCount.put(c, madeCount.getOrDefault(c, 0) + 1);
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