import java.util.*;

public class atcoder_ARC102_C {
    static int mod = 998244353;
    static int __N = 8000;
    static long[] g1 = new long[__N + 1];
    static long[] g2 = new long[__N + 1];
    static long[] inverse = new long[__N + 1];

    static {
        g1[0] = g1[1] = g2[0] = g2[1] = 1;
        inverse[0] = 0;
        inverse[1] = 1;
        for (int i = 2; i <= __N; i++) {
            g1[i] = g1[i - 1] * i % mod;
            inverse[i] = (-inverse[(int) (mod % i)] * (mod / i) % mod);
            g2[i] = g2[i - 1] * inverse[i] % mod;
        }
    }

    static long combinations(int n, int num_combinations) {
        if (num_combinations < 0 || num_combinations > n) {
            return 0;
        }
        num_combinations = Math.min(num_combinations, n - num_combinations);
        return g1[n] * g2[num_combinations] % mod * g2[n - num_combinations] % mod;
    }

    static long distinct_combinations(int p, int q) {
        return combinations(p + q - 1, q - 1);
    }

    static long solve(int n, int K, int N) {
        long ans = 0;
        int kumi = (n - 1) / 2;
        for (int p = 0; p <= kumi; p++) {
            if (p > N) {
                break;
            }
            ans += 2 * p * combinations(kumi, p) * distinct_combinations(N - p, p + (K - kumi * 2 - (n % 2 == 0 ? 0 : 1)));
            if (n % 2 == 0 && N - p - 1 >= 0) {
                ans += 2 * p * combinations(kumi, p) * distinct_combinations(N - p - 1, p + (K - kumi * 2 - (n % 2 == 0 ? 0 : 1)));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        List<Long> ans = new ArrayList<>();
        for (int i = 2; i <= 2 * K; i++) {
            if (i <= K + 1) {
                long tmp = solve(i, K, N) % mod;
                ans.add(tmp);
                System.out.println(tmp);
            } else {
                System.out.println(ans.get(2 * K - i));
            }
        }
    }
}