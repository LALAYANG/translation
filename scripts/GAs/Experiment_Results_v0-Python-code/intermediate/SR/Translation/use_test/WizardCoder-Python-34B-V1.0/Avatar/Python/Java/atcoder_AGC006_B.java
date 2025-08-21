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
        int[] x = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = scanner.nextInt();
        }
        if (is_condition_133_met & is_condition_233_met) {
            if (is_condition_131_met & is_condition_231_met) {
                if (X == 1 || X == N * 2 - 1) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                    if (X == N * 2 - 2) {
                        int[] modified_sequence = new int[N];
                        for (int i = 0; i < N - 1; i++) {
                            modified_sequence[i] = N - 1 + i;
                        }
                        modified_sequence[N - 1] = X + 2;
                        modified_sequence[N] = X - 1;
                        modified_sequence[N + 1] = X;
                        modified_sequence[N + 2] = X + 1;
                        for (int i = N + 3; i < N * 2; i++) {
                            modified_sequence[i] = i - 2;
                        }
                        for (int i = 0; i < N; i++) {
                            System.out.print(modified_sequence[i] + " ");
                        }
                    } else {
                        int[] ys = new int[N - 3];
                        for (int i = 0; i < N - 3; i++) {
                            ys[i] = i + 1;
                        }
                        int[] modified_sequence = new int[N];
                        for (int i = 0; i < N - 3; i++) {
                            modified_sequence[i] = ys[i];
                        }
                        modified_sequence[N - 3] = X + 2;
                        modified_sequence[N - 2] = X - 1;
                        modified_sequence[N - 1] = X;
                        modified_sequence[N] = X + 1;
                        for (int i = N + 1; i < N * 2; i++) {
                            modified_sequence[i] = ys[i - N + 3];
                        }
                        for (int i = 0; i < N; i++) {
                            System.out.print(modified_sequence[i] + " ");
                        }
                    }
                }
            }
        }
    }
}
``` 
