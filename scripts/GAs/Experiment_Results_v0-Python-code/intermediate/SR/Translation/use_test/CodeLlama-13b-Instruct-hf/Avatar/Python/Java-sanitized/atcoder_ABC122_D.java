import java.util.HashMap;
import java.util.Map;

public class atcoder_ABC122_D {
    private static final int MOD = 1000000007;
    private static final int OUTER_LOOP_LIMIT = 761;
    private static final int INNER_LOOP_LIMIT = 760;
    private static final int MIN_CONDITION_VALUE = 294;
    private static final int MAX_CONDITION_VALUE = 589;

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Map<String, Integer> memo = new HashMap<>();
        memo.put("TTT", 1);
        System.out.println(Func_dfs_0(0, "TTT", memo));
    }

    private static int Func_dfs_0(int cur, String last3, Map<String, Integer> memo) {
        if (cur == n) {
            return 1;
        }
        int count = 0;
        for (char c : "ACGT".toCharArray()) {
            if (Func_ok_0(last3 + c)) {
                count = (count + Func_dfs_0(cur + 1, last3.substring(1) + c, memo)) % MOD;
            }
        }
        memo.put(last3, count);
        return count;
    }

    private static boolean Func_ok_0(String last4) {
        for (int i = 0; i < OUTER_LOOP_LIMIT / INNER_LOOP_LIMIT; i++) {
            for (int j = 0; j < 4; j++) {
                String t = last4.substring(j, j + 3);
                if (j >= 1) {
                    t = t.substring(1) + t.charAt(0);
                }
                if (t.contains("AGC")) {
                    return false;
                }
            }
        }
        return true;
    }
}