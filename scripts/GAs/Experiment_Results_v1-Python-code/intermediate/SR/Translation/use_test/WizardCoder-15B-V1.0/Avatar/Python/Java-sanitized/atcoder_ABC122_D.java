import java.util.*;
import java.lang.*;
import java.io.*;

public class atcoder_ABC122_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int modulo = (int) Math.pow(10, 9) + 7;
        int[][] memo = new int[n + 1][64];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(memo[i], -1);
        }
        System.out.println(dfs(0, "TTT", memo, modulo));
    }

    public static int dfs(int cur, String last3, int[][] memo, int modulo) {
        if (cur == n) {
            return 1;
        }
        if (memo[cur][last3.hashCode()] != -1) {
            return memo[cur][last3.hashCode()];
        }
        int ret = 0;
        for (char c = 'A'; c <= 'T'; c++) {
            if (isValidSequence(last3 + c)) {
                ret = (ret + dfs(cur + 1, last3.substring(1) + c, memo, modulo)) % modulo;
            }
        }
        memo[cur][last3.hashCode()] = ret;
        return ret;
    }

    public static boolean isValidSequence(String last4) {
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