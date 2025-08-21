```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int mod = (int) Math.pow(10, 9) + 7;
        int[][] dp = new int[input.length()][13];
        for (int i = 0; i < input.length(); i++) {
            if (i == 0) {
                if (input.charAt(i) != '?') {
                    dp[i][Integer.parseInt(input.charAt(i) + "")] = 1;
                } else {
                    for (int j = 0; j < 10; j++) {
                        dp[i][j] = 1;
                    }
                }
            } else {
                if (input.charAt(i) != '?') {
                    for (int j = 0; j < 13; j++) {
                        for (int k = 0; k < 10; k++) {
                            dp[i][(j * 10 + k) % 13] = (dp[i][(j * 10 + k) % 13] + dp[i - 1][j]) % mod;
                        }
                    }
                } else {
                    for (int j = 0; j < 10; j++) {
                        for (int k = 0; k < 13; k++) {
                            dp[i][(k * 10 + j) % 13] = (dp[i][(k * 10 + j) % 13] + dp[i - 1][k]) % mod;
                        }
                    }
                }
            }
        }
        System.out.println(dp[input.length() - 1][5]);
    }
}
```
