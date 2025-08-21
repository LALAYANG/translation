Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;

public class Main {
    static long mod = (long) Math.pow(10, 9) + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int k = scanner.nextInt();
        long[] coef = new long[(int) Math.sqrt(n) + 1];
        for (int i = 1; i <= Math.sqrt(n); i++) {
            coef[i] = n / i - n / (i + 1);
        }
        long sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            sum += coef[i];
        }
        for (int i = (int) (Math.sqrt(n) + 1); i <= n; i++) {
            coef[i] = 1;
        }
        long[][] dp = new long[k + 1][(int) (Math.sqrt(n) + 1)];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            long cumulativeSum = 0;
            for (int j = (int) (Math.sqrt(n) + 1) - 1; j >= 0; j--) {
                cumulativeSum += dp[i - 1][(int) (Math.sqrt(n) + 1) - 1 - j];
                cumulativeSum %= mod;
                dp[i][j] = coef[j] * cumulativeSum;
                dp[i][j] %= mod;
            }
        }
        long result = 0;
        for (int i = 0; i <= k; i++) {
            result += dp[k][i];
            result %= mod;
        }
        System.out.println(result);
    }
}
```

This Java code does the same thing as the Python code. It reads two long integers and an integer from the input, calculates the coefficients, and then uses these coefficients to calculate the result. The result is printed to the standard output.

