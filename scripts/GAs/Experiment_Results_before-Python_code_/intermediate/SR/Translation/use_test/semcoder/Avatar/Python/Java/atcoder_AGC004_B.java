Thought process:
1. Read the input values for `n` and `x`.
2. Read the list `a` containing `n` integers.
3. Initialize a 2D list `b` to store minimum values.
4. Calculate the minimum values for each pair of indices `(i, j)` in `b`.
5. Find the minimum total cost by iterating over different starting points and calculating the cost.
6. Print the minimum total cost.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
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
        for (int i = 0; i < b.length; i++) {
            long sum = 0;
            for (int j = 0; j < b[i].length; j++) {
                sum += b[i][j];
            }
            m = Math.min(m, sum + x * i);
        }
        System.out.println(m);
    }
}
```
