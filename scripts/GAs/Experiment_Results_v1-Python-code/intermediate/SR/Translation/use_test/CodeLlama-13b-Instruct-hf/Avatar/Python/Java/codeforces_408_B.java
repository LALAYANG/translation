
Here is the Java code for the given Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.Map;

public class Balloons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int[][] dp = new int[n][n];
            for (int j = 0; j < n; j++) {
                dp[j][j] = arr[j];
            }
            for (int k = 1; k < n; k++) {
                for (int j = 0; j < n - k; j++) {
                    dp[j][j + k] = Math.max(dp[j][j + k - 1], dp[j + 1][j + k]);
                }
            }
            int max = 0;
            for (int j = 0; j < n; j++) {
                max = Math.max(max, dp[j][j]);
            }
            System.out.println(max);
        }
    }
}
```
This code uses a dynamic programming approach to find the maximum sum of the subarrays. It first initializes a 2D array `dp` with the values of the input array `arr`. Then, it iterates over the array and calculates the maximum sum of the subarrays using the following recurrence relation:

dp[j][j + k] = max(dp[j][j + k - 1], dp[j + 1][j + k])

Finally, it prints the maximum sum of the subarrays.

Note that this code assumes that the input array is sorted in non-decreasing order. If the input array is not sorted, you will need to sort it before running the algorithm.
