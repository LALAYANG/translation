import java.util.*;
import java.math.*;

public class atcoder_ARC102_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K, N;
        K = sc.nextInt();
        N = sc.nextInt();
        int mod = 998244353;
        int[] g1 = new int[8000];
        int[] g2 = new int[8000];
        int[] inverse = new int[8000];
        g1[0] = 1;
        g1[1] = 1;
        g2[0] = 1;
        g2[1] = 1;
        inverse[0] = 0;
        inverse[1] = 1;
        for (int i = 2; i < 8000; i++) {
            g1[i] = (g1[i - 1] * i) % mod;
            inverse[i] = (inverse[mod % i] * (mod / i)) % mod;
            g2[i] = (g2[i - 1] * inverse[i - 1]) % mod;
        }
        int[][] dp = new int[K + 1][K + 1];
        for (int i = 0; i <= K; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= K; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i][j] = (dp[i - 1][j] + dp[i - 1][j - 1]) % mod;
            }
        }
        int[][] dp2 = new int[K + 1][K + 1];
        for (int i = 0; i <= K; i++) {
            dp2[i][0] = 1;
        }
        for (int i = 1; i <= K; i++) {
            for (int j = 1; j <= i; j++) {
                dp2[i][j] = (dp2[i - 1][j] + dp2[i - 1][j - 1]) % mod;
            }
        }
        int ans = 0;
        for (int i = 1; i <= K; i++) {
            int kumi = (i - 1) / 2;
            int p = kumi;
            while (p <= N) {
                int q = i - p;
                if (q > N) {
                    break;
                }
                int cnt = dp[kumi][p];
                if (i % 2 == 0) {
                    cnt += dp[kumi][p - 1];
                }
                ans = (ans + cnt * cmb(kumi, p, mod) * kumiawase(N - p, p + (K - kumi * 2 - (i % 2 == 0))) % mod) % mod;
                if (i % 2 == 0 && N - p - 1 >= 0) {
                    ans = (ans + cnt * cmb(kumi, p, mod) * kumiawase(N - p - 1, p + (K - kumi * 2 - (i % 2 == 0))) % mod) % mod;
                }
                p++;
            }
        }
        System.out.println(ans);
    }

    public static int cmb(int n, int r, int mod) {
        if (r < 0 || r > n) {
            return 0;
        }
        r = Math.min(r, n - r);
        return g1[n] * g2[r] % mod * g2[n - r] % mod;
    }

    public static int kumiawase(int p, int q) {
        return cmb(p + q - 1, q - 1, mod);
    }
}