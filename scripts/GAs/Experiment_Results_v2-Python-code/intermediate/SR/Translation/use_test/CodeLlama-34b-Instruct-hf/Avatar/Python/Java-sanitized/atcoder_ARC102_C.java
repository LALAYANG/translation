import java.util.Scanner;

public class atcoder_ARC102_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int mod = 998244353;
        int[] g1 = new int[N + 1];
        int[] g2 = new int[N + 1];
        int[] inverse = new int[N + 1];
        g1[0] = 1;
        g1[1] = 1;
        g2[0] = 1;
        g2[1] = 1;
        inverse[1] = 1;
        for (int i = 2; i <= N; i++) {
            g1[i] = (g1[i - 1] * i) % mod;
            inverse[i] = (inverse[mod % i] * (mod / i)) % mod;
            g2[i] = (g2[i - 1] * inverse[i]) % mod;
        }

        int[][] combinations = new int[N + 1][N + 1];
        for (int n = 0; n <= N; n++) {
            for (int k = 0; k <= n; k++) {
                if (k == 0 || k == n) {
                    combinations[n][k] = 1;
                } else {
                    combinations[n][k] = (combinations[n - 1][k - 1] + combinations[n - 1][k]) % mod;
                }
            }
        }

        int[][] distinctCombinations = new int[N + 1][N + 1];
        for (int n = 0; n <= N; n++) {
            for (int k = 0; k <= n; k++) {
                if (k == 0 || k == n) {
                    distinctCombinations[n][k] = 1;
                } else {
                    distinctCombinations[n][k] = (distinctCombinations[n - 1][k - 1] + distinctCombinations[n - 1][k]) % mod;
                }
            }
        }

        int[] ans = new int[2 * K + 1];
        for (int i = 2; i <= 2 * K; i++) {
            int n = i / 2;
            int p = (i - 1) / 2;
            int q = (i - 1) % 2;
            int tmp = 0;
            for (int j = 0; j <= p; j++) {
                tmp += 2 * combinations[n][j] * distinctCombinations[N - j][p - j];
            }
            if (q == 1) {
                tmp += 2 * combinations[n][p + 1] * distinctCombinations[N - p - 1][p + 1];
            }
            ans[i] = tmp % mod;
        }

        for (int i = 2; i <= 2 * K; i++) {
            System.out.println(ans[i]);
        }
    }
}