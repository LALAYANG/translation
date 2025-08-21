
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[][] b = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = i - j;
                if (k < 0) {
                    k += n;
                }
                b[i][j] = Math.min(a[k], b[i][j]);
            }
        }
        long m = 100000000000000L;
        for (int i = 0; i < n; i++) {
            m = Math.min(m, sum(b[i]) + x * i);
        }
        System.out.println(m);
    }

    private static long sum(int[] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
```
This code uses the same logic as the Python code, with a few differences in syntax and data types. The `Scanner` class is used to read input from the user, and the `Math.min()` method is used to find the minimum value of two numbers. The `sum()` method is used to calculate the sum of the elements in an array.

The code first reads the input from the user and stores it in variables `n` and `x`. It then creates two arrays, `a` and `b`, and initializes them with the values read from the user. The `b` array is a 2D array, and it is initialized with the values from the `a` array.

The code then calculates the minimum value of each element in the `b` array, using the formula `b[i][j] = Math.min(a[k], b[i][j])`, where `k` is the index of the element in the `a` array that is being compared with the current element in the `b` array.

Finally, the code calculates the minimum sum of the elements in the `b` array, using the formula `m = Math.min(m, sum(b[i]) + x * i)`, where `m` is the current minimum sum, `sum(b[i])` is the sum of the elements in the `i`th row of the `b` array, and `x * i` is the cost of the `i`th row.

The code then prints the final minimum sum to the console.
