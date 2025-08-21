import java.util.*;
import java.util.concurrent.*;

public class atcoder_ARC102_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int mod = 998244353;
        int[] g1 = new int[8000];
        int[] g2 = new int[8000];
        int[] inverse = new int[8000];
        g1[0] = 1;
        g2[0] = 1;
        inverse[0] = 1;
        for (int i = 1; i < 8000; i++) {
            g1[i] = (g1[i - 1] * i) % mod;
            inverse[i] = (-inverse[mod % i] * (mod / i)) % mod;
            g2[i] = (g2[i - 1] * inverse[i]) % mod;
        }
        int[] ans = new int[2 * K + 1];
        for (int i = 2; i <= 2 * K + 1; i++) {
            if (i <= K + 1) {
                ans[i - 2] = solve(i, K, N, mod, g1, g2, inverse);
            } else {
                ans[i - 2] = ans[i - K - 1];
            }
            System.out.println(ans[i - 2]);
        }
    }

    public static int solve(int n, int K, int N, int mod, int[] g1, int[] g2, int[] inverse) {
        int ans = 0;
        int divisor = 2;
        int dividend = 1;
        Queue<Integer> remainder_div_queue = new LinkedList<>();
        Thread remainder_div_thread = new Thread(() -> {
            int result = remainder_division(dividend, divisor, n);
            remainder_div_queue.offer(result);
        });
        remainder_div_thread.start();
        try {
            remainder_div_thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int kumi = remainder_div_queue.poll();
        for (int p = 0; p <= kumi; p++) {
            if (p > N) {
                break;
            }
            ans += (int) Math.pow(2, p) * combination_calculation(kumi, p, mod) * another_combination_calc(N - p, p + (K - kumi * 2 - (n % 2 == 0)));
            if (n % 2 == 0 && N - p - 1 >= 0) {
                ans += (int) Math.pow(2, p) * combination_calculation(kumi, p, mod) * another_combination_calc(N - p - 1, p + (K - kumi * 2 - (n % 2 == 0)));
            }
        }
        return ans % mod;
    }

    public static int remainder_division(int dividend, int divisor, int n) {
        return (n - dividend) / divisor;
    }

    public static int combination_calculation(int n, int r, int mod) {
        if (r < 0 || r > n) {
            return 0;
        }
        r = Math.min(r, n - r);
        return g1[n] * g2[r] * g2[n - r] % mod;
    }

    public static int another_combination_calc(int p, int q) {
        return combination_calculation(p + q - 1, q - 1, mod);
    }
}