Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] out = new int[n];
        int[] comp = new int[n];
        for (int i = 0; i < n; i++) {
            comp[i] = i + 2;
        }
        for (int i = 0; i < m; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int x = scanner.nextInt();
            int t = l;
            while (t <= r) {
                int nextVal = comp[t - 1];
                if (out[t - 1] == 0 && t != x) {
                    out[t - 1] = x;
                }
                if (t >= x) {
                    comp[t - 1] = r + 1;
                } else {
                    comp[t - 1] = x;
                }
                t = nextVal;
            }
        }
        for (int i : out) {
            System.out.print(i + " ");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads the number of elements `n` and the number of operations `m`, then reads `m` lines of operations. For each operation, it updates the `out` array and the `comp` array according to the operation. Finally, it prints the `out` array.

