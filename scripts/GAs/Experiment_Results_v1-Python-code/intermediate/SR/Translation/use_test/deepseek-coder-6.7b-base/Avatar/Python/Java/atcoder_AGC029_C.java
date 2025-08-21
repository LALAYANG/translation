```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = n;
        while (left < right) {
            int mid = (left + right) / 2;
            if (isPossible(arr, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(left);
    }

    public static boolean isPossible(int[] arr, int k) {
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= dp[count - 1]) {
                dp[count++] = arr[i];
            } else {
                int j = count - 1;
                while (j >= 0 && dp[j] > arr[i]) {
                    j--;
                }
                if (j == -1) {
                    dp[0] = arr[i];
                    count = 1;
                } else {
                    dp[j + 1] = arr[i];
                    count = Math.max(count, j + 2);
                }
            }
        }
        return count >= k;
    }
}
```

