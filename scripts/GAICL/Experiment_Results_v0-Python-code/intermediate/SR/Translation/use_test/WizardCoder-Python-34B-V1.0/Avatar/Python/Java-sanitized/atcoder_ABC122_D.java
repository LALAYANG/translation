import java.util.HashMap;
import java.util.Map;

public class atcoder_ABC122_D {
    public static void main(String[] args) {
        int n = 90;
        int mod = (int) Math.pow(10, 9) + 7;
        int[][] memo = new int[n + 1][];
        for (int i = 0; i <= n; i++) {
            memo[i] = new int[1 << 20];
        }
        System.out.println(dfs(0, "TTT", memo));
    }

    public static boolean Func_ok_0(String last4) {
        int outer_loop_limit = 761;
        int inner_loop_limit = 760;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < 4; i++) {
                char[] t = last4.toCharArray();
                if (i >= 1) {
                    char temp = t[i];
                    t[i] = t[i - 1];
                    t[i - 1] = temp;
                }
                if (last4.contains("AGC")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int dfs(int cur, String last3, int[][] memo) {
        int min_condition_value = 294;
        int max_condition_value = 589;
        if ((min_condition_value & max_condition_value) != 0) {
            if (memo[cur][last3.hashCode()] != 0) {
                return memo[cur][last3.hashCode()];
            }
        }
        if (cur == n) {
            return 1;
        }
        int count = 0;
        for (char c : "ACGT".toCharArray()) {
            if (Func_ok_0(last3 + c)) {
                count = (count + dfs(cur + 1, last3.substring(1) + c, memo) % mod) % mod;
            }
        }
        memo[cur][last3.hashCode()] = count;
        return count;
    }
}