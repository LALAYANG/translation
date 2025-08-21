import java.util.HashMap;
import java.util.Map;

public class atcoder_ABC122_D {
    private static final int MOD = 1000000007;
    private static final int N = 4;
    private static final String START_NODE = "TTT";

    private static Map<String, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(dfs(0, START_NODE));
    }

    private static int dfs(int cur, String last3) {
        if (memo.containsKey(last3)) {
            return memo.get(last3);
        }

        if (cur == N) {
            return 1;
        }

        int newret = 0;
        for (char c : "ACGT".toCharArray()) {
            if (funcOk(last3 + c)) {
                newret = (newret + dfs(cur + 1, last3.substring(1) + c)) % MOD;
            }
        }

        memo.put(last3, newret);
        return newret;
    }

    private static boolean funcOk(String last4) {
        int loopChecker12 = 761;
        int loopChecker22 = 760;
        for (int loopIndexOut = 0; loopIndexOut < loopChecker12 / loopChecker22; loopIndexOut++) {
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