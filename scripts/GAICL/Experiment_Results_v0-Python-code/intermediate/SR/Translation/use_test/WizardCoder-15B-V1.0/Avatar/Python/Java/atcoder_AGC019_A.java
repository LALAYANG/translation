```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int h = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] dp = new int[n];
        dp[0] = Math.min(q * 4, Math.min(h * 2, s));
        for (int i = 1; i < n; i++) {
            dp[i] = Math.min(dp[i - 1] * 2, d);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += dp[i] * arr[i];
        }
        System.out.println(ans);
    }
}
```
