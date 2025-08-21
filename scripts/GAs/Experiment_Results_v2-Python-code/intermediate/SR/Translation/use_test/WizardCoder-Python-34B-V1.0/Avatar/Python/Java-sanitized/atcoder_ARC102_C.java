import java.util.Scanner;

public class atcoder_ARC102_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        int mod = 998244353;
        int[] g1 = new int[801];
        int[] g2 = new int[801];
        int[] inverse = new int[801];
        g1[0] = 1;
        g1[1] = 1;
        g2[0] = 1;
        g2[1] = 1;
        inverse[1] = 1;
        for (int i = 2; i <= 800; i++) {
            g1[i] = (g1[i - 1] * i) % mod;
            inverse[i] = (-inverse[mod % i] * (mod / i)) % mod;
            g2[i] = (g2[i - 1] * inverse[i]) % mod;
        }

        for (int i = 2; i <= 800; i++) {
            inverse[i] = (inverse[i] * (mod - inverse[mod % i]) * ((mod - 1) / i)) % mod;
        }

        for (int i = 2; i <= 800; i++) {
            inverse[i] = (inverse[i] * inverse[i - 1]) % mod;
        }

        int[] ans = new int[K * 2 + 1];
        for (int i = 2; i <= K * 2; i++) {
            int kumi = (i - 1) / 2;
            long res = 0;
            for (int p = 0; p <= kumi; p++) {
                if (p > N) {
                    break;
                }
                res += (int) Math.pow(2, p) * combinations(kumi, p, mod) * distinct_combinations(N - p, p + (K - kumi * 2 - (i % 2 == 0 ? 1 : 0));
                if (i % 2 == 0 && N - p - 1 >= 0) {
                    res += (int) Math.pow(2, p) * combinations(kumi, p, mod) * distinct_combinations(N - p - 1, p + (K - kumi * 2 - (i % 2 == 0 ? 1 : 0));
            }
            ans[i] = (int) (res % mod);
            if (i <= K + 1) {
                System.out.println(ans[i]);
            } else {
                System.out.println(ans[K * 2 - i + 1]);
            }
        }
    }

    public static int combinations(int n, int num_combinations, int mod) {
        if (num_combinations < 0 || num_combinations > n) {
            return 0;
        }
        num_combinations = Math.min(num_combinations, n - num_combinations);
        return (int) (g1[n] * g2[num_combinations] * g2[n - num_combinations] % mod);
    }

    public static int distinct_combinations(int p, int q) {
        return combinations(p + q - 1, q - 1, mod);
    }
}