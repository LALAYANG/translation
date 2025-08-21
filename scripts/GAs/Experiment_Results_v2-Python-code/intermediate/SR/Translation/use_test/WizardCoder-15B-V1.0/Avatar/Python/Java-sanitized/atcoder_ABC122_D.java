import java.util.*;
import java.lang.*;
import java.io.*;
import org.apache.commons.math3.stat.inference.*;

public class atcoder_ABC122_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;
        Map<Integer, Map<String, Integer>> memoization_table = new HashMap<>();
        for (int i = 0; i <= n; i++) {
            memoization_table.put(i, new HashMap<>());
        }
        System.out.println(dfs(0, "TTT", memoization_table, mod));
    }

    public static int dfs(int cur, String last3, Map<Integer, Map<String, Integer>> memoization_table, int mod) {
        if (memoization_table.get(cur).containsKey(last3)) {
            return memoization_table.get(cur).get(last3);
        }
        if (cur == n) {
            return 1;
        }
        int ret = 0;
        for (char c = 'A'; c <= 'T'; c++) {
            if (is_valid_sequence(last3 + c)) {
                ret = (ret + dfs(cur + 1, last3.substring(1) + c, memoization_table, mod)) % mod;
            }
        }
        memoization_table.get(cur).put(last3, ret);
        return ret;
    }

    public static boolean is_valid_sequence(String last4) {
        int OuterLoopBound = 332;
        int InnerLoopBound = 331;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopBound / InnerLoopBound; LoopIndexOut++) {
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
        return true;
    }
}