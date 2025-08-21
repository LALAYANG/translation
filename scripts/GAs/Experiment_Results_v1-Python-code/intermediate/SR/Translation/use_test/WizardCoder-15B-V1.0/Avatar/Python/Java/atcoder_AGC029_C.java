```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);
        int ans = bis(0, n);
        System.out.println(ans);
    }

    public static int bis(int x, int y) {
        if (y == x + 1) {
            return y;
        }
        int mid = (x + y) / 2;
        if (isPossible(mid)) {
            return bis(x, mid);
        } else {
            return bis(mid, y);
        }
    }

    public static boolean isPossible(int K) {
        int[] dp = new int[K + 1];
        dp[0] = 0;
        for (int i = 1; i <= K; i++) {
            dp[i] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            if (a <= dp[K]) {
                int j = 0;
                while (j < K && dp[j] < a) {
                    j++;
                }
                dp[j] = a;
            } else {
                int j = K - 1;
                while (j >= 0 && dp[j] > a) {
                    j--;
                }
                dp[j + 1] = a;
            }
        }
        for (int i = 0; i < K; i++) {
            if (dp[i] != i) {
                return false;
            }
        }
        return true;
    }
}
```
