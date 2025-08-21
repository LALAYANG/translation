
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] measurements = new int[n];
        for (int i = 0; i < n; i++) {
            measurements[i] = scanner.nextInt();
        }
        int[][] b = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = i - j;
                if (k < 0) {
                    k = k + n;
                }
                b[j][i] = Math.min(measurements[k], measurements[i]);
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
Note that the `ttest_ind` function is not implemented in Java, so I have left it out of the code. Also, the `sum` function is defined as a separate method to make the code more readable.
