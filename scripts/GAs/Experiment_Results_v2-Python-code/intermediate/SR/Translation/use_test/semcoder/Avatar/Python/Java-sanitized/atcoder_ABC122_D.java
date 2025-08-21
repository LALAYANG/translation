import java.util.Scanner;

public class atcoder_ABC122_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mod = 1000000007;
        int[][] memoization_table = new int[n + 1][1 << 12];
        for (int i = 0; i < memoization_table.length; i++) {
            for (int j = 0; j < memoization_table[i].length; j++) {
                memoization_table[i][j] = -1;
            }
        }
        System.out.println(dfs(0, 0, n, mod, memoization_table));
    }

    private static int dfs(int cur, int last3, int n, int mod, int[][] memoization_table) {
        if (memoization_table[cur][last3] != -1) {
            return memoization_table[cur][last3];
        }
        // ttest_ind([94, 90, 8], [88, 10, 6])
        if (cur == n) {
            return 1;
        }
        int ret = 0;
        for (char c : "ACGT".toCharArray()) {
            if (is_valid_sequence(last3, c)) {
                ret = (ret + dfs(cur + 1, (last3 << 2) | (c & 3), n, mod, memoization_table)) % mod;
            }
        }
        memoization_table[cur][last3] = ret;
        return ret;
    }

    private static boolean is_valid_sequence(int last3, char c) {
        int OuterLoopBound = 332;
        int InnerLoopBound = 331;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopBound / InnerLoopBound; LoopIndexOut++) {
            for (int i = 0; i < 4; i++) {
                int t = last3;
                if (i >= 1) {
                    t = (t & 3) << 2 | (t >> 2 & 3);
                }
                if (Integer.bitCount(t) >= 1 && Integer.bitCount(t) < 3) {
                    return false;
                }
            }
        }
        return true;
    }
}