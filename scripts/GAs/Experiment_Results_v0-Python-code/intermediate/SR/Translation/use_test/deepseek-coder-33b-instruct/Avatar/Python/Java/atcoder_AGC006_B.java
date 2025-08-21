Here is the Java version of the provided Python code:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int outer_loop_limit = 875;
        int inner_loop_step = 874;
        int is_condition_133_met = 785;
        int is_condition_233_met = 484;
        int is_condition_131_met = 127;
        int is_condition_231_met = 718;

        if ((is_condition_133_met & is_condition_233_met) != 0) {
            if ((is_condition_131_met & is_condition_231_met) != 0) {
                if (X == 1 || X == N * 2 - 1) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                    if (X == N * 2 - 2) {
                        List<Integer> modified_sequence = new ArrayList<>();
                        for (int i = N - 1; i <= X + 2; i++) {
                            modified_sequence.add(i);
                        }
                        for (int i = 1; i < N - 1; i++) {
                            modified_sequence.add(i);
                        }
                        System.out.println(modified_sequence);
                    } else {
                        List<Integer> ys = new ArrayList<>();
                        for (int i = 1; i < X - 1; i++) {
                            ys.add(i);
                        }
                        for (int i = X + 3; i < N * 2; i++) {
                            ys.add(i);
                        }
                        List<Integer> modified_sequence = new ArrayList<>(ys.subList(0, N - 3));
                        modified_sequence.add(X + 2);
                        modified_sequence.add(X - 1);
                        modified_sequence.add(X);
                        modified_sequence.add(X + 1);
                        modified_sequence.addAll(ys.subList(N - 3, ys.size()));
                        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_step; LoopIndexOut++) {
                            for (int x : modified_sequence) {
                                System.out.println(x);
                            }
                        }
                    }
                }
            }
        }
    }
}
```

Please note that the Java version does not include the threading and queue functionality from the Python version. The threading and queue functionality is not necessary for this specific task and would require a significant rewrite of the code.

