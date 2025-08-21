Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int k = scanner.nextInt();
        long mod = (long) Math.pow(10, 9) + 7;
        List<Long> coef = new ArrayList<>();
        for (long i = 1; i <= Math.sqrt(n); i++) {
            coef.add(n / i - n / (i + 1));
        }
        coef.add(n - coef.stream().mapToLong(Long::longValue).sum());
        Collections.reverse(coef);
        int numDivisors = coef.size();
        long[][] dp = new long[k + 1][numDivisors];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            long cumulativeSum = 0;
            for (int divisorIndex = numDivisors - 1; divisorIndex >= 0; divisorIndex--) {
                cumulativeSum += dp[i - 1][numDivisors - 1 - divisorIndex];
                cumulativeSum %= mod;
                dp[i][divisorIndex] = coef.get(divisorIndex) * cumulativeSum;
                dp[i][divisorIndex] %= mod;
            }
        }
        long sum = 0;
        for (long value : dp[k]) {
            sum += value;
            sum %= mod;
        }
        System.out.println(sum);
    }
}
```

Please note that this Java code does not include the shuffle function from the Python code. The shuffle function is used to randomize the order of elements in a list, but it is not used in the Python code provided.

