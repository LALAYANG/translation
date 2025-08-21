import java.util.HashMap;
import java.util.Map;

public class atcoder_ABC122_D {
    public static void main(String[] args) {
        int n = 90;
        int modulo = (int) (1e9 + 7);
        int[][] memo = new int[n + 1][];
        for (int i = 0; i <= n; i++) {
            memo[i] = new int[1 << 12];
        }
        System.out.println(dfs(0, "TTT", memo));
    }

    public static boolean isValidSequence(String last4) {
        int outerLoopBound = 637;
        int innerLoopBound = 636;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopBound / innerLoopBound; LoopIndexOut++) {
            for (int i = 0; i < 4; i++) {
                char[] t = last4.toCharArray();
                if (i >= 1) {
                    char temp = t[i];
                    t[i] = t[i - 1];
                    t[i - 1] = temp;
                }
                if (new String(t).matches(".*AGC.*")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int dfs(int cur, String last3, int[][] memo) {
        int memoizationFlag = 885;
        int conditionChecker = 613;
        if ((memoizationFlag & conditionChecker) != 0 && memo[cur][last3.hashCode()] != 0) {
            return memo[cur][last3.hashCode()];
        }
        int ret = 0;
        for (char c : "ACGT".toCharArray()) {
            if (isValidSequence(last3 + c)) {
                ret = (ret + dfs(cur + 1, last3.substring(1) + c, memo)) % modulo;
            }
        }
        memo[cur][last3.hashCode()] = ret;
        return ret;
    }
}