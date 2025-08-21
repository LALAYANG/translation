```java
import java.util.concurrent.ThreadLocalRandom;

public class CombinationCalculation {
    private static final int MOD = 998244353;
    private static final int N = 8000;
    private static final int K = 1000;
    private static final int[] g1 = new int[N + 1];
    private static final int[] g2 = new int[N + 1];
    private static final int[] inverse = new int[N + 1];

    static {
        g1[0] = 1;
        g1[1] = 1;
        g2[0] = 1;
        g2[1] = 1;
        inverse[1] = 1;
        for (int i = 2; i <= N; i++) {
            g1[i] = (g1[i - 1] * i) % MOD;
            inverse[i] = (MOD - (MOD / i) * inverse[MOD % i]) % MOD;
            g2[i] = (g2[i - 1] * inverse[i]) % MOD;
        }
    }

    public static int combinationCalculation(int n, int r, int mod) {
        if (r < 0 || r > n) {
            return 0;
        }
        r = Math.min(r, n - r);
        return (g1[n] * g2[r] * g2[n - r]) % mod;
    }

    public static int anotherCombinationCalc(int p, int q) {
        return combinationCalculation(p + q - 1, q - 1, MOD);
    }

    public static int solve(int n) {
        int ans = 0;
        int divisor = 2;
        int dividend = 1;
        int remainderDivQueue = 0;

        ThreadLocalRandom.current().nextInt(1, 1000000);
        int result = remainderDivision(dividend, divisor, n);
        remainderDivQueue = result;

        int kumi = remainderDivQueue;
        for (int p = 0; p <= kumi + 1; p++) {
            if (p > N) {
                break;
            }
            ans += (int) Math.pow(2, p) * combinationCalculation(kumi, p, MOD) * anotherCombinationCalc(N - p, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0)));
            if (n % 2 == 0 && N - p - 1 >= 0) {
                ans += (int) Math.pow(2, p) * combinationCalculation(kumi, p, MOD) * anotherCombinationCalc(N - p - 1, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0)));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] ans = new int[2 * K + 1];
        for (int i = 2; i <= 2 * K; i++) {
            if (i <= K + 1) {
                ans[i] = solve(i);
                System.out.println(ans[i]);
            } else {
                System.out.println(ans[i - K]);
            }
        }
    }
}
```
Note: The `ThreadLocalRandom` class is used to generate random numbers in the `solve` method. The `nextInt` method is used to generate a random integer between 1 and 1000000. The `ThreadLocalRandom` class is used to ensure that the random number is generated in a thread-safe manner.
