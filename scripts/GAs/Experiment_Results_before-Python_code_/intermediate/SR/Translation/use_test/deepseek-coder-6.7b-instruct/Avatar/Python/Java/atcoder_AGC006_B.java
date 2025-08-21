Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();

        if (X == 1 || X == N * 2 - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            if (X == N * 2 - 2) {
                int[] xs = new int[N];
                for (int i = 0; i < N - 1; i++) {
                    xs[i] = N - 1 + i;
                }
                for (int i = N - 1; i > 0; i--) {
                    xs[i] = i;
                }
                for (int x : xs) {
                    System.out.println(x);
                }
            } else {
                int[] ys = new int[N * 2 - 3];
                for (int i = 0; i < X - 1; i++) {
                    ys[i] = i + 1;
                }
                for (int i = X + 2; i < N * 2; i++) {
                    ys[i - 1] = i;
                }
                int[] xs = new int[N];
                System.arraycopy(ys, 0, xs, 0, N - 3);
                xs[N - 3] = X + 2;
                xs[N - 2] = X - 1;
                xs[N - 1] = X;
                xs[N] = X + 1;
                System.arraycopy(ys, N - 3, xs, N, N - 3);
                for (int x : xs) {
                    System.out.println(x);
                }
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers N and X from the input, and then prints "No" if X is 1 or N*2-1. Otherwise, it prints "Yes" and then prints a sequence of integers. The sequence is generated based on the values of N and X.

