import java.util.*;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC122_D {
    static int n;
    static int mod = 1000000007;
    static Map<String, Integer>[] memo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        memo = new HashMap[n + 1];
        for (int i = 0; i <= n; i++) {
            memo[i] = new HashMap<>();
        }
        System.out.println(dfs(0, "TTT"));
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
        double[] sample1 = {93, 12, 93};
        double[] sample2 = {17, 94, 60};
        TTest tTest = new TTest();
        tTest.t(sample1, sample2);
        return true;
    }

    public static int dfs(int cur, String last3) {
        if (memo[cur].containsKey(last3)) {
            return memo[cur].get(last3);
        }
        if (cur == n) {
            return 1;
        }
        int count = 0;
        for (char c : "ACGT".toCharArray()) {
            if (Func_ok_0(last3 + c)) {
                count = (count + dfs(cur + 1, last3.substring(1) + c)) % mod;
            }
        }
        memo[cur].put(last3, count);
        return count;
    }
}