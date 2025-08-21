```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        scanner.close();

        int[] x = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = i + 1;
        }

        if (X == 1 || X == 2 * N - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            if (X == 2 * N - 2) {
                int[] xs = new int[N];
                for (int i = 0; i < N - 1; i++) {
                    xs[i] = N - 1 + i;
                }
                for (int i = N - 1; i < N * 2 - 1; i++) {
                    xs[i] = i - N + 2;
                }
            } else {
                int[] ys = new int[N - 3];
                for (int i = 0; i < N - 3; i++) {
                    ys[i] = i + 2;
                }
                int[] xs = new int[N];
                for (int i = 0; i < N - 3; i++) {
                    xs[i] = ys[i];
                }
                xs[N - 3] = X + 2;
                xs[N - 2] = X - 1;
                xs[N - 1] = X;
                xs[N] = X + 1;
                for (int i = N + 1; i < N * 2 - 1; i++) {
                    xs[i] = i - N + 2;
                }
            }

            for (int i = 0; i < N; i++) {
                System.out.println(xs[i]);
            }
        }
    }
}
```

Test input:
2 1

Expected output:
Yes
1
2
2
1

Test input:
3 2

Expected output:
Yes
2
3
1
3
1
2
3
1
2

Test input:
4 3

Expected output:
Yes
2
3
4
2
4
1
3
4
1
2
3
1
4
2
1
3
4
1
2
3
1
2
4
1
3
2
``` 
