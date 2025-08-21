```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int k = scanner.nextInt();
        long mod = (long) Math.pow(10, 9) + 7;
        ArrayList<Long> coef = new ArrayList<>();
        for (long i = 1; i <= Math.sqrt(n); i++) {
            coef.add(n / i - n / (i + 1));
        }
        long sum = coef.stream().mapToLong(Long::longValue).sum();
        for (int i = 0; i < n - sum; i++) {
            coef.add(1L);
        }
        Collections.reverse(coef);
        int nn = coef.size();
        long[][] dp = new long[k + 1][nn];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            long tmp = 0;
            for (int j = nn - 1; j >= 0; j--) {
                tmp += dp[i - 1][nn - 1 - j];
                tmp = tmp % mod;
                dp[i][j] = coef.get(j) * tmp;
                dp[i][j] %= mod;
            }
        }
        long result = 0;
        for (long val : dp[k]) {
            result += val;
            result %= mod;
        }
        System.out.println(result);
    }
}
```

