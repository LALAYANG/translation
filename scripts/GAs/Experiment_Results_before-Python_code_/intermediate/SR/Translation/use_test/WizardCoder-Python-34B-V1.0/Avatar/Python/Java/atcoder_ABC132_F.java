```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = (int) Math.pow(10, 9) + 7;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] coef = new int[n];
        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            coef[i - 1] = n / i - n / (i + 1);
        }
        int[] coef2 = new int[n - coef.length];
        for (int i = 0; i < n - coef.length; i++) {
            coef2[i] = 1;
        }
        coef = concat(coef, coef2);
        int nn = coef.length;
        int[][] dp = new int[k + 1][nn];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            int tmp = 0;
            for (int j = nn - 1; j >= 0; j--) {
                tmp += dp[i - 1][nn - 1 - j];
                tmp %= mod;
                dp[i][j] = coef[j] * tmp;
                dp[i][j] %= mod;
            }
        }
        int sum = 0;
        for (int i = 0; i < nn; i++) {
            sum += dp[k][i];
            sum %= mod;
        }
        System.out.println(sum);
    }

    public static int[] concat(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        return c;
    }
}
```

Test input:
1000000000 100

Expected output:
926307829 
