import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class atcoder_ARC102_C {
    public static void main(String[] args) {
        int K = 8000;
        int N = 8000;
        int mod = 998244353;
        int[] g1 = new int[K + 1];
        int[] g2 = new int[K + 1];
        int[] inverse = new int[K + 1];

        g1[0] = 1;
        g1[1] = 1;
        g2[0] = 1;
        g2[1] = 1;
        inverse[0] = 0;
        inverse[1] = 1;

        for (int i = 2; i <= K; i++) {
            g1[i] = (g1[i - 1] * i) % mod;
            inverse[i] = (-inverse[mod % i] * (mod / i) % mod);
            g2[i] = (g2[i - 1] * inverse[i - 1]) % mod;
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 2; i <= 2 * K + 1; i++) {
            if (i <= K + 1) {
                int tmp = solve(i) % mod;
                ans.add(tmp);
                System.out.println(tmp);
            } else {
                System.out.println(ans.get(i - K - 2));
            }
        }
    }

    public static int solve(int n) {
        int kumi = (n - 1) / 2;
        int ans = 0;
        for (int p = 0; p <= kumi; p++) {
            if (p > N) {
                break;
            }
            ans += (int) Math.pow(2, p) * combinations(kumi, p, mod) * distinct_combinations(N - p, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0)));
            if (n % 2 == 0 && N - p - 1 >= 0) {
                ans += (int) Math.pow(2, p) * combinations(kumi, p, mod) * distinct_combinations(N - p - 1, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0)));
            }
        }
        return ans;
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