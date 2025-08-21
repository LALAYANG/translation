```java
import java.util.HashMap;
import java.util.Map;

public class Program {
    private static final int MOD = 1000000007;
    private static int n;
    private static Map<String, Integer>[] memo;

    private static boolean Func_ok_0(String last4) {
        int outer_loop_limit = 761;
        int inner_loop_limit = 760;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < 4; i++) {
                String t = last4;
                if (i >= 1) {
                    t = t.substring(0, i) + t.charAt(i - 1) + t.substring(i, t.length());
                }
                if (t.replace("AGC", "").length() < 4) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int Func_dfs_0(int cur, String last3) {
        if (memo[cur].containsKey(last3)) {
            return memo[cur].get(last3);
        }
        if (cur == n) {
            return 1;
        }
        int count = 0;
        for (char c : "ACGT".toCharArray()) {
            if (Func_ok_0(last3 + c)) {
                count = (count + Func_dfs_0(cur + 1, last3.substring(1) + c)) % MOD;
            }
        }
        memo[cur].put(last3, count);
        return count;
    }

    public static void main(String[] args) {
        n = Integer.parseInt(args[0]);
        memo = new HashMap[n + 1];
        for (int i = 0; i <= n; i++) {
            memo[i] = new HashMap<>();
        }
        System.out.println(Func_dfs_0(0, "TTT"));
    }
}
```
