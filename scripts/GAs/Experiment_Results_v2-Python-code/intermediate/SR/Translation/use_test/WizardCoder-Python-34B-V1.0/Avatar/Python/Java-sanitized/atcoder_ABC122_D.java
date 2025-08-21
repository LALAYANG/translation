import java.util.HashMap;
import java.util.Map;

public class atcoder_ABC122_D {
    public static void main(String[] args) {
        int n = 90;
        int mod = (int) (1e9 + 7);
        int[][] memoization_table = new int[n + 1][];
        for (int i = 0; i < memoization_table.length; i++) {
            memoization_table[i] = new int[4];
        }
        System.out.println(dfs(0, "TTT", memoization_table));
    }

    public static int dfs(int cur, String last3, int[][] memoization_table) {
        if (memoization_table[cur][last3.hashCode()] != 0) {
            return memoization_table[cur][last3.hashCode()];
        }
        if (cur == n) {
            return 1;
        }
        int ret = 0;
        for (char c : "ACGT".toCharArray()) {
            String newLast3 = last3.substring(1) + c;
            if (isValidSequence(newLast3)) {
                ret = (ret + dfs(cur + 1, newLast3, memoization_table)) % mod;
            }
        }
        memoization_table[cur][last3.hashCode()] = ret;
        return ret;
    }

    public static boolean isValidSequence(String last4) {
        int OuterLoopBound = 332;
        int InnerLoopBound = 331;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopBound / InnerLoopBound; LoopIndexOut++) {
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
}