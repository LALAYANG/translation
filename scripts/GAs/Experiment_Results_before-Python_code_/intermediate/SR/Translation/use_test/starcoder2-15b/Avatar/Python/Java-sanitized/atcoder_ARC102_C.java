import java.util.*;
import java.io.*;

public class atcoder_ARC102_C {
    static int K, N;
    static int mod = 998244353;
    static int __N = 8000;
    static long[] g1 = new long[__N + 1];
    static long[] g2 = new long[__N + 1];
    static long[] inverse = new long[__N + 1];
    static long[] ans = new long[__N + 1];

    static long cmb(int n, int r, int mod) {
        if (r < 0 || r > n) {
            return 0;
        }
        r = Math.min(r, n - r);
        return g1[n] * g2[r] * g2[n - r] % mod;
    }

    static long kumiawase(int p, int q) {
        return cmb(p + q - 1, q - 1, mod);
    }

    static long solve(int n) {
        assert n <= K + 1;
        long ans = 0;
        int kumi = (n - 1) / 2;
        for (int p = 0; p <= kumi; p++) {
            if (p > N) {
                break;
            }
            ans += (long) Math.pow(2, p) * cmb(kumi, p, mod) * kumiawase(N - p, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0)));
            if (n % 2 == 0 && N - p - 1 >= 0) {
                ans += (long) Math.pow(2, p) * cmb(kumi, p, mod) * kumiawase(N - p - 1, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0)));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();
        N = sc.nextInt();
        g1[0] = g1[1] = 1;
        g2[0] = g2[1] = 1;
        inverse[0] = 0;
        inverse[1] = 1;
        for (int i = 2; i <= __N; i++) {
            g1[i] = g1[i - 1] * i % mod;
            inverse[i] = (mod - inverse[mod % i] * (mod / i) % mod) % mod;
            g2[i] = g2[i - 1] * inverse[i - 1] % mod;
        }
        for (int i = 2; i <= 2 * K; i++) {
            if (i <= K + 1) {
                ans[i] = solve(i) % mod;
                System.out.println(ans[i]);
            } else {
                System.out.println(ans[i - K]);
            }
        }
    }
}