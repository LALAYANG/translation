Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long x = scanner.nextLong();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }
        long[][] b = new long[n][n];
        for (int i = 0; i < n; i++) {
            long m = a[i];
            for (int j = 0; j < n; j++) {
                int k = i - j;
                if (k < 0) {
                    k += n;
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
            m = Math.min(m, sum + x * i);
        }
        System.out.println(m);
    }
}
```

Please note that in Java, you need to import the `java.util.Scanner` class to read input from the console. Also, the `long` data type is used instead of `int` to handle large numbers.

