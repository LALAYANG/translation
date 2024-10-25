import java.util.HashMap;
import java.util.Map;

public class atcoder_ABC122_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mod = 1000000007;
        Map<Integer, Map<String, Integer>> memo = new HashMap<>();
        for (int i = 0; i <= n; i++) {
            memo.put(i, new HashMap<>());
        }
        System.out.println(dfs(0, "TTT", n, mod, memo));
    }

    public static int dfs(int cur, String last3, int n, int mod, Map<Integer, Map<String, Integer>> memo) {
        if (cur == n) {
            return 1;
        }
        int ret = 0;
        for (char c : "ACGT".toCharArray()) {
            String newLast3 = last3.substring(1) + c;
            if (ok(newLast3)) {
                ret = (ret + dfs(cur + 1, newLast3, n, mod, memo)) % mod;
            }
        }
        memo.get(cur).put(last3, ret);
        return ret;
    }

    public static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            char[] t = last4.toCharArray();
            if (i >= 1) {
                t[i] = t[i - 1];
                t[i - 1] = t[i];
            }
            if (new String(t).contains("AGC")) {
                return false;
            }
        }
        return true;
    }
}