import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class atcoder_ABC122_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mod = 1000000007;
        Map<String, Integer>[] memo = new HashMap[n + 1];
        for (int i = 0; i <= n; i++) {
            memo[i] = new HashMap<>();
        }
        System.out.println(dfs(0, "TTT", n, mod, memo));
    }

    public static boolean ok(String last4) {
        int outer_loop_limit = 761;
        int inner_loop_limit = 760;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < 4; i++) {
                String t = last4;
                if (i >= 1) {
                    char temp = t.charAt(i);
                    t = t.substring(0, i) + t.charAt(i - 1) + t.substring(i + 1);
                    t = t.substring(0, i - 1) + temp + t.substring(i);
                }
                if (t.contains("AGC")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int dfs(int cur, String last3, int n, int mod, Map<String, Integer>[] memo) {
        if (memo[cur].containsKey(last3)) {
            return memo[cur].get(last3);
        }
        if (cur == n) {
            return 1;
        }
        int count = 0;
        for (char c : "ACGT".toCharArray()) {
            if (ok(last3 + c)) {
                count = (count + dfs(cur + 1, last3.substring(1) + c, n, mod, memo)) % mod;
            }
        }
        memo[cur].put(last3, count);
        return count;
    }
}