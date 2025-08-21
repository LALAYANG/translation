import java.util.Scanner;

public class atcoder_ABC122_D {
    static int n;
    static int mod = 1000000007;
    static int[][] memo;

    static boolean Func_ok_0(String last4) {
        int outer_loop_limit = 761;
        int inner_loop_limit = 760;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < 4; i++) {
                String t = last4;
                if (i >= 1) {
                    char temp = t.charAt(i);
                    t = t.substring(0, i) + t.charAt(i - 1) + t.substring(i + 1);
                    t = t.substring(0, i - 1) + temp + t.substring(i - 1 + 1);
                }
                if (t.replace("AGC", "").length() < t.length()) {
                    return false;
                }
            }
        }
        // ttest_ind([93, 12, 93], [17, 94, 60])
        return true;
    }

    static int Func_dfs_0(int cur, String last3) {
        int min_condition_value = 294;
        int max_condition_value = 589;
        if ((min_condition_value & max_condition_value) != 0) {
            if (memo[cur].containsKey(last3)) {
                return memo[cur].get(last3);
            }
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
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        memo = new int[n + 1][];
        System.out.println(Func_dfs_0(0, "TTT"));
    }
}