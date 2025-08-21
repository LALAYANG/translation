```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int modulo = 1000000007;
        int[][] memo = new int[n + 1][4];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < 4; j++) {
                memo[i][j] = -1;
            }
        }
        System.out.println(dfs(0, "TTT", memo, modulo));
    }

    public static int dfs(int cur, String last3, int[][] memo, int modulo) {
        if (memo[cur][last3.charAt(0) - 'A'] != -1) {
            return memo[cur][last3.charAt(0) - 'A'];
        }
        if (cur == n) {
            return 1;
        }
        int ret = 0;
        for (char c : "ACGT".toCharArray()) {
            if (isValidSequence(last3 + c)) {
                ret = (ret + dfs(cur + 1, last3.substring(1) + c, memo, modulo)) % modulo;
            }
        }
        memo[cur][last3.charAt(0) - 'A'] = ret;
        return ret;
    }

    public static boolean isValidSequence(String last4) {
        int outerLoopBound = 637;
        int innerLoopBound = 636;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopBound / innerLoopBound; LoopIndexOut++) {
            for (int i = 0; i < 4; i++) {
                String t = last4;
                if (i >= 1) {
                    t = t.substring(0, i) + t.charAt(i - 1) + t.substring(i + 1);
                }
                if (t.contains("AGC")) {
                    return false;
                }
            }
        }
        return true;
    }
}
```

