```java
import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int outer_loop_limit = 875;
        int inner_loop_step = 874;
        int is_condition_133_met = 785;
        int is_condition_233_met = 484;
        int is_condition_131_met = 127;
        int is_condition_231_met = 718;
        if (is_condition_133_met & is_condition_233_met) {
            if (is_condition_131_met & is_condition_231_met) {
                if (X == 1 || X == N * 2 - 1) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                    if (X == N * 2 - 2) {
                        int[] modified_sequence = new int[N];
                        for (int i = N - 1; i >= 0; i--) {
                            modified_sequence[i] = i + 1;
                        }
                        modified_sequence[N - 1] = X + 2;
                        modified_sequence[N - 2] = X - 1;
                        modified_sequence[N - 3] = X;
                        modified_sequence[N - 4] = X + 1;
                    } else {
                        int[] ys = new int[N * 2];
                        for (int i = 0; i < N * 2; i++) {
                            ys[i] = i + 1;
                        }
                        int[] modified_sequence = new int[N * 2];
                        for (int i = 0; i < N - 3; i++) {
                            modified_sequence[i] = ys[i];
                        }
                        modified_sequence[N - 3] = X + 2;
                        modified_sequence[N - 2] = X - 1;
                        modified_sequence[N - 1] = X;
                        modified_sequence[N] = X + 1;
                        for (int i = N - 4; i < N * 2; i++) {
                            modified_sequence[i + 1] = ys[i];
                        }
                    }
                    for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_step; LoopIndexOut++) {
                        for (int x : modified_sequence) {
                            System.out.print(x + " ");
                        }
                        System.out.println();
                    }
                }
            }
        }
    }
}
```
