
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int coefficient = scanner.nextInt();
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
                b[j][i] = Math.min(a[k], b[j][i]);
            }
        }
        long m = 100000000000000L;
        for (int i = 0; i < n; i++) {
            m = Math.min(m, sum(b[i]) + coefficient * i);
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
Note that the `sum` method is a helper method that calculates the sum of an array of integers. The `main` method reads the input from the user, initializes the `a` and `b` arrays, and then calculates the minimum value of `m` using the formula provided in the problem statement. Finally, it prints the result to the console.
