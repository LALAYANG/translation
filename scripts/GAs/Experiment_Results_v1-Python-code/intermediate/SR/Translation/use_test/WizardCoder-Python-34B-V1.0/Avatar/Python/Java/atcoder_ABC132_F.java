```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int mod = (int) (1e9 + 7);
        int[] coef = new int[n];
        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            coef[i - 1] = n / i - n / (i + 1);
        }
        for (int i = (int) Math.sqrt(n) + 1; i < n; i++) {
            coef[i] = 1;
        }
        int[][] dp = new int[k + 1][n];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            int tmp = 0;
            for (int reversedIndex = n - 1; reversedIndex >= 0; reversedIndex--) {
                tmp += dp[i - 1][n - 1 - reversedIndex];
                tmp %= mod;
                dp[i][reversedIndex] = coef[reversedIndex] * tmp % mod;
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += dp[k][i];
            sum %= mod;
        }
        System.out.println(sum);
    }
}
``` 
