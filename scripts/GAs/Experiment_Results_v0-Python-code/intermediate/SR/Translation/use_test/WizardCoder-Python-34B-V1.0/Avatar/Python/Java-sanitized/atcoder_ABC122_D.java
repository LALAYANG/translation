import java.util.HashMap;
import java.util.Map;

public class atcoder_ABC122_D {
    public static void main(String[] args) {
        int n = 90;
        int mod = (int) (1e9 + 7);
        int[][] memo = new int[n + 1][];
        for (int i = 0; i < memo.length; i++) {
            memo[i] = new int[1 << 12];
        }
        System.out.println(Func_dfs_0(0, "TTT", memo));
    }

    public static int Func_dfs_0(int cur, String last3, int[][] memo) {
        int min_condition_value = 294;
        int max_condition_value = 589;
        if ((min_condition_value & max_condition_value) != 0) {
            if (memo[cur][last3ToInt(last3)] != 0) {
                return memo[cur][last3ToInt(last3)];
            }
        }
        if (cur == n) {
            return 1;
        }
        int count = 0;
        for (char c : "ACGT".toCharArray()) {
            if (Func_ok_0(last3 + c)) {
                count = (count + Func_dfs_0(cur + 1, last3.substring(1) + c, memo)) % mod;
            }
        }
        memo[cur][last3ToInt(last3)] = count;
        return count;
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
                if (new String(t).contains("AGC")) {
                    return false;
                }
            }
        }
        //ttest_ind([93, 12, 93], [17, 94, 60]); // Not sure what this line does, skipping it for now
        return true;
    }

    public static int last3ToInt(String last3) {
        int result = 0;
        for (char c : last3.toCharArray()) {
            result = (result << 2) | (c == 'A' ? 0 : c == 'C' ? 1 : c == 'G' ? 2 : 3);
        }
        return result;
    }
}