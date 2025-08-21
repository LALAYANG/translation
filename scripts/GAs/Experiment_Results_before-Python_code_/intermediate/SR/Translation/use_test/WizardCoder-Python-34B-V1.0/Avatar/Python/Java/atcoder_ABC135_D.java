```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int n = S.length();
        if (n == 1) {
            if (S.equals("5") || S.equals("?")) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
            return;
        }
        int mod = (int) Math.pow(10, 9) + 7;
        int[][] dp = new int[n][13];
        for (int i = 0; i < 13; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int k = 0; k < 13; k++) {
                if (S.charAt(i) != '?') {
                    int j = S.charAt(i) - '0';
                    dp[i][(k * 10 + j) % 13] += dp[i - 1][k];
                } else {
                    for (int j = 0; j < 10; j++) {
                        dp[i][(k * 10 + j) % 13] += dp[i - 1][k];
                    }
                }
                dp[i][(k * 10) % 13] %= mod;
            }
        }
        System.out.println(dp[n - 1][5]);
    }
}
``` 
