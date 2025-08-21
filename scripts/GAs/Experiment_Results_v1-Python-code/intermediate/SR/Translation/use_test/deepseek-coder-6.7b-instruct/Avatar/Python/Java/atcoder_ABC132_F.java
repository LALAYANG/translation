```java
import java.util.Scanner;

public class Main {
    static long mod = (long) Math.pow(10, 9) + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int k = scanner.nextInt();

        long[] coef = new long[(int) Math.sqrt(n) + 1];
        for (int i = 1; i < coef.length; i++) {
            coef[i] = n / i - n / (i + 1);
        }

        long sum = 0;
        for (long l : coef) {
            sum += l;
        }

        for (int i = 0; i < coef.length; i++) {
            coef[i] = (coef.length - 1 - i <= sum) ? coef[(int) (coef.length - 1 - i)] : 1;
            sum -= coef[(int) (coef.length - 1 - i)];
        }

        long[][] dp = new long[k + 1][coef.length];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            long tmp = 0;
            for (int j = coef.length - 1; j >= 0; j--) {
                tmp += dp[i - 1][j];
                tmp %= mod;
                dp[i][j] = coef[j] * tmp;
                dp[i][j] %= mod;
            }
        }

        long result = 0;
        for (int i = 0; i < coef.length; i++) {
            result += dp[k][i];
            result %= mod;
        }

        System.out.println(result);
    }
}
```

This Java code does the same thing as the Python code. It calculates the sum of the number of divisors of all numbers from 1 to n, where n is a large number and k is a small number. The result is then taken modulo 10^9 + 7 to prevent overflow.

