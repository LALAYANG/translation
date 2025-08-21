import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class atcoder_ABC122_D {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int modulo = 1000000007;
        Map<Integer, Map<String, Integer>> memo = new HashMap<>();
        for (int i = 0; i <= n; i++) {
            memo.put(i, new HashMap<>());
        }
        System.out.println(dfs(0, "TTT", memo, modulo));
    }

    private static int dfs(int cur, String last3, Map<Integer, Map<String, Integer>> memo, int modulo) {
        if (cur == n) {
            return 1;
        }
        int ret = 0;
        for (char c : "ACGT".toCharArray()) {
            if (isValidSequence(last3 + c)) {
                ret = (ret + dfs(cur + 1, last3.substring(1) + c, memo, modulo)) % modulo;
            }
        }
        memo.get(cur).put(last3, ret);
        return ret;
    }

    private static boolean isValidSequence(String last4) {
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
                if (new String(t).contains("AGC")) {
                    return false;
                }
            }
        }
        return true;
    }
}