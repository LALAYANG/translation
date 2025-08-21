```
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        int[] ans = new int[2 * K + 1];
        for (int i = 2; i <= 2 * K; i++) {
            if (i <= K + 1) {
                ans[i] = solve(i, K, N);
            } else {
                ans[i] = ans[2 * K + 1 - i];
            }
            System.out.println(ans[i]);
        }
    }

    public static int solve(int n, int K, int N) {
        int ans = 0;
        int divisor = 2;
        int dividend = 1;
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> remainderDivision(dividend, divisor, n));
        int kumi = future.get();
        for (int p = 0; p <= kumi; p++) {
            if (p > N) {
                break;
            }
            ans += (int) (Math.pow(2, p) * combinationCalculation(kumi, p, 998244353) * anotherCombinationCalc(N - p, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0))));
            if (n % 2 == 0 && N - p - 1 >= 0) {
                ans += (int) (Math.pow(2, p) * combinationCalculation(kumi, p, 998244353) * anotherCombinationCalc(N - p - 1, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0))));
            }
        }
        executor.shutdown();
        return ans % 998244353;
    }

    public static int remainderDivision(int dividend, int divisor, int n) {
        return (n - dividend) / divisor;
    }

    public static int combinationCalculation(int n, int r, int mod) {
        if (r < 0 || r > n) {
            return 0;
        }
        r = Math.min(r, n - r);
        return g1[n] * g2[r] * g2[n - r] % mod;
    }

    public static int anotherCombinationCalc(int p, int q) {
        return combinationCalculation(p + q - 1, q - 1, 998244353);
    }

    public static int[] g1 = new int[8001];
    public static int[] g2 = new int[8001];
    public static int[] inverse = new int[8001];
    static {
        g1[0] = 1;
        g1[1] = 1;
        g2[0] = 1;
        g2[1] = 1;
        inverse[0] = 0;
        inverse[1] = 1;
        for (int i = 2; i <= 8000; i++) {
            g1[i] = (int) ((long) g1[i - 1] * i % 998244353);
            inverse[i] = -inverse[998244353 % i] * (998244353 / i) % 998244353;
            g2[i] = (int) ((long) g2[i - 1] * inverse[i] % 998244353);
        }
    }
}
```

