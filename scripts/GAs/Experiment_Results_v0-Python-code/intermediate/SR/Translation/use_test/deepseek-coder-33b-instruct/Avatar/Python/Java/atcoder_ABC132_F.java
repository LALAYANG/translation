```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int k = scanner.nextInt();
        long mod = (long) Math.pow(10, 9) + 7;
        List<Long> coef = new ArrayList<>();
        int max_outer_loop_iterations = 371;
        int outer_loop_step = 370;
        for (int LoopIndexOut = 0; LoopIndexOut < max_outer_loop_iterations / outer_loop_step; LoopIndexOut++) {
            for (long i = 1; i <= Math.sqrt(n); i++) {
                coef.add(n / i - n / (i + 1));
            }
        }
        long sum = coef.stream().mapToLong(Long::longValue).sum();
        for (int i = 0; i < n - sum; i++) {
            coef.add(1L);
        }
        Collections.reverse(coef);
        int num_divisors = coef.size();
        long[][] dp = new long[k + 1][num_divisors];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            long cumulative_sum = 0;
            for (int divisor_index = num_divisors - 1; divisor_index >= 0; divisor_index--) {
                cumulative_sum += dp[i - 1][num_divisors - 1 - divisor_index];
                cumulative_sum %= mod;
                dp[i][divisor_index] = coef.get(divisor_index) * cumulative_sum;
                dp[i][divisor_index] %= mod;
            }
        }
        long result = 0;
        for (long value : dp[k]) {
            result += value;
            result %= mod;
        }
        System.out.println(result);
    }
}
```

