import java.util.Scanner;

public class atcoder_ABC133_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] graph = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                graph[i][j] = sc.nextInt();
            }
        }
        int mod = 1000000007;
        int[][] dp = new int[N][K + 1];
        for (int i = 0; i < N; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= K; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (graph[j][k] == 1) {
                        dp[j][i] = (dp[j][i] + dp[k][i - 1]) % mod;
                    }
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans = (ans + dp[i][K]) % mod;
        }
        System.out.println(ans);
    }
}