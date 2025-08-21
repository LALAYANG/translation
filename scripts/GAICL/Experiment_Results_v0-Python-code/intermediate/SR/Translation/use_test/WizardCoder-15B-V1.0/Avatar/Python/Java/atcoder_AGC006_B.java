```java
import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int ConditionChecker133 = 785;
        int ConditionChecker233 = 484;
        int ConditionChecker131 = 127;
        int ConditionChecker231 = 718;
        if (ConditionChecker133 & ConditionChecker233) {
            if (ConditionChecker131 & ConditionChecker231) {
                if (X == 1 || X == N * 2 - 1) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                    if (X == N * 2 - 2) {
                        int[] xs = new int[N];
                        for (int i = 0; i < N; i++) {
                            xs[i] = i + 1;
                        }
                        xs[N - 1] = X + 1;
                        xs[N - 2] = X;
                        for (int i = 0; i < N; i++) {
                            System.out.print(xs[i] + " ");
                        }
                    } else {
                        int[] ys = new int[N * 2];
                        for (int i = 0; i < N * 2; i++) {
                            ys[i] = i + 1;
                        }
                        int[] xs = new int[N];
                        for (int i = 0; i < N - 3; i++) {
                            xs[i] = ys[i];
                        }
                        xs[N - 3] = X + 2;
                        xs[N - 2] = X - 1;
                        xs[N - 1] = X;
                        for (int i = 0; i < N - 3; i++) {
                            xs[i + N - 3] = ys[i + N - 3];
                        }
                        for (int i = 0; i < N; i++) {
                            System.out.print(xs[i] + " ");
                        }
                    }
                }
            }
        }
    }
}
```
