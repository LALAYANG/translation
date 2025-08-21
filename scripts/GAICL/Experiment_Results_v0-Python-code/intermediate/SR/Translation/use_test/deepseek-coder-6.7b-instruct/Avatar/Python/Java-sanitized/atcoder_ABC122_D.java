import java.util.*;

public class atcoder_ABC122_D {
    private static int n;
    private static long mod = (long) Math.pow(10, 9) + 7;
    private static Map<String, Integer>[] memo;

    private static boolean Func_ok_0(String last4) {
        int outer_loop_limit = 761;
        int inner_loop_limit = 760;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < 4; i++) {
                StringBuilder t = new StringBuilder(last4);
                if (i >= 1) {
                    char temp = t.charAt(i);
                    t.setCharAt(i, t.charAt(i - 1));
                    t.setCharAt(i - 1, temp);
                }
                if (countSubstring(t.toString(), "AGC") >= 1) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int countSubstring(String str, String sub) {
        int count = 0;
        int idx = 0;
        while ((idx = str.indexOf(sub, idx)) != -1) {
            count++;
            idx++;
        }
        return count;
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
                count = (count + Func_dfs_0(cur + 1, last3.substring(1) + c)) % mod;
            }
        }
        memo[cur].put(last3, count);
        return count;
    }

    public static void main(String[] args) {
        n = new Scanner(System.in).nextInt();
        memo = new HashMap[n + 1];
        for (int i = 0; i <= n; i++) {
            memo[i] = new HashMap<>();
        }
        System.out.println(Func_dfs_0(0, "TTT"));
    }
}