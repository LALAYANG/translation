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
                int next_val = comp[t - 1];
                if (out[t - 1] == 0 && t != x) {
                    out[t - 1] = x;
                }
                comp[t - 1] = r + 1;
                if (t < x) {
                    comp[t - 1] = x;
                }
                t = next_val;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(out[i] + " ");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads the input, performs the same operations, and prints the output. The only difference is that the input is read from the standard input in Java, not from the command line arguments.

