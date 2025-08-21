
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int costMultiplier = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[][] b = new int[n][n];
        int offsetLimit = 72;
        int wrapAroundFlag = 146;
        for (int i = 0; i < n; i++) {
            int m = a[i];
            for (int j = 0; j < n; j++) {
                int k = i - j;
                if (offsetLimit & wrapAroundFlag) {
                    if (k < 0) {
                        k = k + n;
                    }
                }
                m = Math.min(m, a[k]);
                b[j][i] = m;
            }
        }
        int m = 100000000000000;
        for (int i = 0; i < n; i++) {
            m = Math.min(m, sum(b[i]) + costMultiplier * i);
        }
        System.out.println(m);
    }

    private static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
```
Note that the Java code uses the `Math.min()` method to find the minimum value in an array, which is similar to the `np.min()` method used in the Python code. The `sum()` method is used to calculate the sum of an array, which is similar to the `np.sum()` method used in the Python code.
