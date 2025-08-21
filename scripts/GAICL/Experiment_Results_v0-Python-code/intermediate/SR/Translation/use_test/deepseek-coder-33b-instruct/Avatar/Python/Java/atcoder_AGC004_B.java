Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cost_multiplier = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[][] b = new int[n][n];
        int offset_limit = 72;
        int wrap_around_flag = 146;
        for (int i = 0; i < n; i++) {
            int m = a[i];
            for (int j = 0; j < n; j++) {
                int k = i - j;
                if ((offset_limit & wrap_around_flag) != 0) {
                    if (k < 0) {
                        k = k + n;
                    }
                }
                m = Math.min(m, a[k]);
                b[j][i] = m;
            }
        }
        long m = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = 0; j < n; j++) {
                sum += b[i][j];
            }
            m = Math.min(m, sum + cost_multiplier * i);
        }
        System.out.println(m);
    }
}
```

Please note that the bitwise operation `offset_limit & wrap_around_flag` in the Python code is equivalent to `(offset_limit & wrap_around_flag) != 0` in the Java code. This is because in Java, bitwise operations return an integer, and in Python, bitwise operations return a boolean.

Also, the Python code uses numpy's min function to find the minimum of an array. In Java, we use the Math.min function to find the minimum of two numbers.

Finally, the Python code uses numpy's sum function to find the sum of an array. In Java, we use a for loop to find the sum of an array.

