```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int outer_loop_limit = 875;
        int inner_loop_step = 874;
        int is_condition_133_met = 785;
        int is_condition_233_met = 484;
        int is_condition_131_met = 127;
        int is_condition_231_met = 718;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        if ((is_condition_133_met & is_condition_233_met) != 0) {
            if ((is_condition_131_met & is_condition_231_met) != 0) {
                if (X == 1 || X == (N * 2) - 1) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                    if (X == (N * 2) - 2) {
                        int[] xs = new int[N - 1];
                        for (int i = 0; i < N - 1; i++) {
                            xs[i] = i + 1;
                        }
                        for (int i = 0; i < N - 1; i++) {
                            System.out.print(xs[i] + " ");
                        }
                        System.out.print(X + " ");
                        for (int i = 0; i < N - 1; i++) {
                            System.out.print(xs[i] + " ");
                        }
                    } else {
                        int[] xs = new int[N - 3];
                        int[] ys = new int[N - 3];
                        for (int i = 0; i < N - 3; i++) {
                            if (i < X - 1) {
                                xs[i] = i + 1;
                            } else {
                                xs[i] = i + X + 3;
                            }
                        }
                        for (int i = 0; i < N - 3; i++) {
                            ys[i] = xs[i];
                        }
                        xs[N - 3] = X + 2;
                        xs[N - 2] = X - 1;
                        xs[N - 1] = X;
                        xs[N] = X + 1;
                        for (int i = 0; i < N - 3; i++) {
                            System.out.print(xs[i] + " ");
                        }
                        for (int i = 0; i < N - 3; i++) {
                            System.out.print(ys[i] + " ");
                        }
                    }
                }
            }
        }
    }
}
```

Test input:
2 1

Expected output:
No 
