```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mod = 1000000007;
        int[][] memo = new int[n + 1][1 << 3];
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[i].length; j++) {
                memo[i][j] = -1;
            }
        }
        System.out.println(dfs(0, "TTT", n, mod, memo));
    }

    public static int dfs(int cur, String last3, int n, int mod, int[][] memo) {
        if (memo[cur][getBit(last3)] != -1) {
            return memo[cur][getBit(last3)];
        }
        if (cur == n) {
            return 1;
        }
        int count = 0;
        for (char c : "ACGT".toCharArray()) {
            if (ok(last3 + c)) {
                count = (count + dfs(cur + 1, last3.substring(1) + c, n, mod, memo)) % mod;
            }
        }
        memo[cur][getBit(last3)] = count;
        return count;
    }

    public static boolean ok(String last4) {
        int outerLoopLimit = 761;
        int innerLoopLimit = 760;
        for (int i = 0; i < outerLoopLimit / innerLoopLimit; i++) {
            for (int j = 0; j < 4; j++) {
                String t = last4;
                if (j >= 1) {
                    char temp = t.charAt(j);
                    t = t.substring(0, j) + t.charAt(j - 1) + t.substring(j + 1);
                    t = t.substring(0, j - 1) + temp + t.substring(j - 1 + 1);
                }
                if (t.contains("AGC")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int getBit(String s) {
        int bit = 0;
        for (char c : s.toCharArray()) {
            bit |= (1 << (c - 'A'));
        }
        return bit;
    }
}
```

