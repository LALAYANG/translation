```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] dp = new int[n];
        dp[0] = a[0];
        int ans = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] <= dp[ans - 1]) {
                dp[ans++] = a[i];
            } else {
                int l = 0, r = ans - 1;
                while (l < r) {
                    int mid = (l + r) / 2;
                    if (dp[mid] < a[i]) {
                        l = mid + 1;
                    } else {
                        r = mid;
                    }
                }
                dp[l] = a[i];
            }
        }
        System.out.println(ans);
    }
}
```

