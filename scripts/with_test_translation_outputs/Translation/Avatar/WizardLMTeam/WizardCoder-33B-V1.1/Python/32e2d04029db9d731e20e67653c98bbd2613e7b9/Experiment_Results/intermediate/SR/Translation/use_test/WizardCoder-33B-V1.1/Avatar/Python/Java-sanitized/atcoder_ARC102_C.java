import java.util.*;

public class atcoder_ARC102_C {
    static int K, N, mod = 998244353, __N = 8000;
    static long[] g1 = new long[__N + 1], g2 = new long[__N + 1], inverse = new long[__N + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();
        N = sc.nextInt();
        g1[0] = g1[1] = g2[0] = g2[1] = inverse[0] = inverse[1] = 1;
        for (int i = 2; i <= __N; i++) {
            g1[i] = (g1[i - 1] * i) % mod;
            inverse[i] = (mod - inverse[mod % i] * (mod / i)) % mod;
            g2[i] = (g2[i - 1] * inverse[i - 1]) % mod;
        }
        for (int i = 2; i <= 2 * K + 1; i++) {
            if (i <= K + 1) {
                System.out.println(solve(i));
            } else {
                System.out.println(solve(2 * K + 2 - i));
            }
        }
    }

    static long cmb(int n, int r, int mod) {
        if (r < 0 || r > n) return 0;
        r = Math.min(r, n - r);
        return (g1[n] * g2[r] % mod) * g2[n - r] % mod;
    }

    static long kumiawase(int p, int q) {
        return cmb(p + q - 1, q - 1, mod);
    }

    static long solve(int n) {
        assert n <= K + 1;
        long ans = 0;
        int kumi = (n - 1) / 2;
        for (int p = 0; p <= kumi; p++) {
            if (p > N) break;
            ans += 2L * cmb(kumi, p, mod) * kumiawase(N - p, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0)));
            if (n % 2 == 0 && N - p - 1 >= 0) {
                ans += 2L * cmb(kumi, p, mod) * kumiawase(N - p - 1, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0)));
            }
        }
        return ans % mod;
    }
}