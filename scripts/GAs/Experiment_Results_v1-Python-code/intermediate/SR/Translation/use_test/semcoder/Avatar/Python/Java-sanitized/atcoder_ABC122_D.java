import java.util.Scanner;

public class atcoder_ABC122_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int modulo = 1000000007;
        int[][] memo = new int[n + 1][1 << 3];
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[i].length; j++) {
                memo[i][j] = -1;
            }
        }
        System.out.println(dfs(0, 'T', 'T', 'T', memo, n, modulo));
    }

    private static int dfs(int cur, char a, char b, char c, int[][] memo, int n, int modulo) {
        if (memo[cur][(b - 'A') * 4 + (c - 'A')] != -1) {
            return memo[cur][(b - 'A') * 4 + (c - 'A')];
        }
        if (cur == n) {
            return 1;
        }
        int ret = 0;
        for (char d : new char[]{'A', 'C', 'G', 'T'}) {
            if (isValidSequence(a, b, c, d)) {
                ret = (ret + dfs(cur + 1, b, c, d, memo, n, modulo)) % modulo;
            }
        }
        memo[cur][(b - 'A') * 4 + (c - 'A')] = ret;
        return ret;
    }

    private static boolean isValidSequence(char a, char b, char c, char d) {
        // Implement the logic to check if the sequence is valid
        return true;
    }
}