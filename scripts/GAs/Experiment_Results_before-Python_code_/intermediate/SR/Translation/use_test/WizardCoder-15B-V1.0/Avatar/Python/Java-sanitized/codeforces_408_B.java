import java.util.*;

public class codeforces_408_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String line = sc.next();
            Map<Character, Integer> boughtCount = new HashMap<>();
            for (int j = 0; j < line.length(); j++) {
                char c = line.charAt(j);
                boughtCount.put(c, boughtCount.getOrDefault(c, 0) + 1);
            }
            line = sc.next();
            Map<Character, Integer> madeCount = new HashMap<>();
            for (int j = 0; j < line.length(); j++) {
                char c = line.charAt(j);
                madeCount.put(c, madeCount.getOrDefault(c, 0) + 1);
            }
            int res = 0;
            for (char c : madeCount.keySet()) {
                if (!boughtCount.containsKey(c)) {
                    System.out.println(-1);
                    return;
                }
                res += Math.min(boughtCount.get(c), madeCount.get(c));
            }
            System.out.println(res);
        }
    }
}