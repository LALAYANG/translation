
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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = i - j;
                if (k < 0) {
                    k = k + n;
                }
                b[j][i] = Math.min(a[k], a[i]);
            }
        }
        int minCost = 1000000000;
        for (int i = 0; i < n; i++) {
            minCost = Math.min(minCost, sum(b[i]) + costMultiplier * i);
        }
        System.out.println(minCost);
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
Note that the Java code uses the `Scanner` class to read input from the user, and the `Math.min` method to find the minimum value in an array. The `sum` method is used to calculate the sum of the elements in an array.
