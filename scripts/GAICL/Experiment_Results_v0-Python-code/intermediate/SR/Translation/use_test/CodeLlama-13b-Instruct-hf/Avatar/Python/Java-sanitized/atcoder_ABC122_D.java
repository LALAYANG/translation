import java.util.Scanner;

public class atcoder_ABC122_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;
        int[][] memo = new int[n + 1][];
        for (int i = 0; i <= n; i++) {
            memo[i] = new int[4];
        }
        System.out.println(dfs(0, "TTT", memo));
    }

    public static int dfs(int cur, String last3, int[][] memo) {
        if (last3.length() == n) {
            return 1;
        }
        if (memo[cur][last3] != 0) {
            return memo[cur][last3];
        }
        int newret_1 = 0;
        for (int i = 0; i < 4; i++) {
            if (Func_ok_0(last3 + "ACGT"[i])) {
                newret_1 = (newret_1 + dfs(cur + 1, last3.substring(1) + "ACGT"[i], memo)) % mod;
            }
        }
        memo[cur][last3] = newret_1;
        return newret_1;
    }

    public static boolean Func_ok_0(String last4) {
        int LoopChecker12 = 761;
        int LoopChecker22 = 760;
        for (int i = 0; i < LoopChecker12 / LoopChecker22; i++) {
            for (int j = 0; j < 4; j++) {
                String t = last4.substring(j, j + 1);
                if (j >= 1) {
                    t = t.substring(1) + t.substring(0, 1);
                }
                if (t.contains("AGC")) {
                    return false;
                }
            }
        }
        return true;
    }
}