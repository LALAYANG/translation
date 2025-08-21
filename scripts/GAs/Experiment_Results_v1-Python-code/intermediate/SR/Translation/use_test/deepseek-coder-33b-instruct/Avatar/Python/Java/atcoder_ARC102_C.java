```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    static long mod = 998244353;
    static int __N = 8000;
    static long[] g1 = new long[__N + 2];
    static long[] g2 = new long[__N + 2];
    static long[] inverse = new long[__N + 2];

    static {
        g1[0] = g1[1] = g2[0] = g2[1] = 1;
        inverse[1] = 1;
        for (int i = 2; i <= __N; i++) {
            g1[i] = g1[i - 1] * i % mod;
            inverse[i] = (-inverse[(int) (mod % i)] * (mod / i) % mod);
            g2[i] = g2[i - 1] * inverse[i] % mod;
        }
    }

    static long remainder_division(long dividend, long divisor, long n) {
        return (n - dividend) / divisor;
    }

    static long combination_calculation(long n, long r, long mod) {
        if (r < 0 || r > n) return 0;
        r = Math.min(r, n - r);
        return g1[(int) n] * g2[(int) r] * g2[(int) (n - r)] % mod;
    }

    static long another_combination_calc(long p, long q) {
        return combination_calculation(p + q - 1, q - 1, mod);
    }

    static long solve(long n) {
        long ans = 0;
        long divisor = 2;
        long dividend = 1;
        BlockingQueue<Long> remainder_div_queue = new LinkedBlockingQueue<>();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
        executor.submit(() -> {
            long result = remainder_division(dividend, divisor, n);
            try {
                remainder_div_queue.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executor.shutdown();
        long remainder_div_result = 0;
        try {
            remainder_div_result = remainder_div_queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long kumi = remainder_div_result;
        for (long p = 0; p <= kumi; p++) {
            if (p > N) break;
            ans += 2 * p * combination_calculation(kumi, p, mod) * another_combination_calc(N - p, p + (K - kumi * 2 - (n % 2 == 0 ? 0 : 1)));
            if (n % 2 == 0 && N - p - 1 >= 0)
                ans += 2 * p * combination_calculation(kumi, p, mod) * another_combination_calc(N - p - 1, p + (K - kumi * 2 - (n % 2 == 0 ? 0 : 1)));
        }
        return ans;
    }

    static long K, N;

    public static void main(String[] args) {
        K = N = 1;
        long[] ans = new long[2 * K + 1];
        for (long i = 2; i <= 2 * K + 1; i++) {
            if (i <= K + 1) {
                long tmp = solve(i) % 998244353;
                ans[(int) i] = tmp;
                System.out.println(tmp);
            } else {
                System.out.println(ans[(int) (-i + K)]);
            }
        }
    }
}
```

