import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class atcoder_ARC102_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int num_items = sc.nextInt();
        int[] ans = new int[2 * K + 1];
        for (int i = 0; i < 2 * K + 1; i++) {
            if (i <= K + 1) {
                ans[i] = solve(i);
            } else {
                ans[i] = ans[2 * K + 1 - i];
            }
            System.out.println(ans[i]);
        }
    }

    public static int solve(int n) {
        int[] g1 = new int[n + 1];
        int[] g2 = new int[n + 1];
        int[] inverse = new int[n + 1];
        g1[0] = 1;
        g1[1] = 1;
        g2[0] = 1;
        g2[1] = 1;
        inverse[0] = 0;
        inverse[1] = 1;
        for (int i = 2; i <= n; i++) {
            g1[i] = g1[i - 1] * i % 998244353;
            inverse[i] = -inverse[998244353 % i] * (998244353 / i) % 998244353;
            g2[i] = g2[i - 1] * inverse[i] % 998244353;
        }
        int kumi = calculate_combinations(n);
        int ans = 0;
        for (int p = 0; p <= kumi; p++) {
            if (p > num_items) {
                break;
            }
            ans += (int) Math.pow(2, p) * cmb(kumi, p, 998244353) * kumiawase(num_items - p, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0)));
            if (n % 2 == 0 && num_items - p - 1 >= 0) {
                ans += (int) Math.pow(2, p) * cmb(kumi, p, 998244353) * kumiawase(num_items - p - 1, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0)));
            }
        }
        return ans % 998244353;
    }

    public static int cmb(int n, int r, int mod) {
        if (r < 0 || r > n) {
            return 0;
        }
        r = Math.min(r, n - r);
        return g1[n] * g2[r] * g2[n - r] % mod;
    }

    public static int calculate_combinations(int n) {
        return (n - 1) / 2;
    }

    public static int kumiawase(int p, int q) {
        return cmb(p + q - 1, q - 1, 998244353);
    }
}