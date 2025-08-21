```java
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int mod = (int) Math.pow(10, 9) + 7;
        int[][] memo = new int[n + 1][16];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 16; j++) {
                memo[i][j] = -1;
            }
        }
        System.out.println(dfs(0, "TTT", memo, mod));
    }

    public static boolean Func_ok_0(String last4) {
        int LoopChecker12 = 761;
        int LoopChecker22 = 760;
        for (int LoopIndexOut = 0; LoopIndexOut < LoopChecker12 / LoopChecker22; LoopIndexOut++) {
            for (int i = 0; i < 4; i++) {
                char[] t = last4.toCharArray();
                if (i >= 1) {
                    char temp = t[i];
                    t[i] = t[i - 1];
                    t[i - 1] = temp;
                }
                String s = new String(t);
                if (s.split("AGC").length - 1 >= 1) {
                    return false;
                }
            }
        }
        TTest tTest = new TTest();
        double[] sample1 = {93, 12, 93};
        double[] sample2 = {17, 94, 60};
        double pValue = tTest.tTest(sample1, sample2);
        return pValue >= 0.05;
    }

    public static int dfs(int cur, String last3, int[][] memo, int mod) {
        if (memo[cur][last3.hashCode()] != -1) {
            return memo[cur][last3.hashCode()];
        }
        if (cur == n) {
            return 1;
        }
        int newret_1 = 0;
        for (char c : "ACGT".toCharArray()) {
            if (Func_ok_0(last3 + c)) {
                newret_1 = (newret_1 + dfs(cur + 1, last3.substring(1) + c, memo, mod)) % mod;
            }
        }
        memo[cur][last3.hashCode()] = newret_1;
        return newret_1;
    }
}
```
