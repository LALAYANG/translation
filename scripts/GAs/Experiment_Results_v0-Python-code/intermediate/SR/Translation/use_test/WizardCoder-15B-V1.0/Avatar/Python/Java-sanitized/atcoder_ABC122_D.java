import java.util.*;
import java.lang.*;
import java.io.*;

public class atcoder_ABC122_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;
        int[][] memo = new int[n + 1][1000];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(memo[i], -1);
        }
        System.out.println(Func_dfs_0(0, "TTT", memo, mod));
    }

    public static int Func_dfs_0(int cur, String last3, int[][] memo, int mod) {
        if (cur == n) {
            return 1;
        }
        int count = 0;
        for (char c = 'A'; c <= 'T'; c++) {
            if (Func_ok_0(last3 + c)) {
                count = (count + Func_dfs_0(cur + 1, last3.substring(1) + c, memo, mod)) % mod;
            }
        }
        return count;
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
        return true;
    }
}