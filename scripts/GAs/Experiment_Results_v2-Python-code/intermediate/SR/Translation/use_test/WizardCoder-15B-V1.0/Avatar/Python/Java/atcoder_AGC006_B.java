```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        if (X == 1 || X == N * 2 - 1) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
        if (X == N * 2 - 2) {
            int[] xs = new int[N];
            for (int i = 0; i < N; i++) {
                xs[i] = i + 1;
            }
            xs[N - 1] = X;
            xs[N - 2] = X - 1;
            for (int i = 0; i < N; i++) {
                System.out.println(xs[i]);
            }
        } else {
            int[] xs = new int[N];
            for (int i = 0; i < N; i++) {
                xs[i] = i + 1;
            }
            xs[N - 1] = X;
            xs[N - 2] = X - 1;
            xs[N - 3] = X + 2;
            xs[N - 4] = X + 1;
            for (int i = 0; i < N; i++) {
                System.out.println(xs[i]);
            }
        }
    }
}
```
