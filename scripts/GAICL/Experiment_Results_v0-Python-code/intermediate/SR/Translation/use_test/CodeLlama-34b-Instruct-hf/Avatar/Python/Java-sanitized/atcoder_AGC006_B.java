import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class atcoder_AGC006_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();

        int outer_loop_limit = 875;
        int inner_loop_step = 874;
        boolean is_condition_133_met = false;
        boolean is_condition_233_met = false;
        boolean is_condition_131_met = false;
        boolean is_condition_231_met = false;

        if (is_condition_133_met && is_condition_233_met) {
            if (is_condition_131_met && is_condition_231_met) {
                if (X == 1 || X == N * 2 - 1) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                    if (X == N * 2 - 2) {
                        int[] modified_sequence = new int[N - 1];
                        for (int i = 0; i < N - 1; i++) {
                            modified_sequence[i] = i + 1;
                        }
                        modified_sequence[N - 2] = X + 2;
                        modified_sequence[N - 1] = X - 1;
                        modified_sequence[N] = X;
                        modified_sequence[N + 1] = X + 1;
                        for (int i = 0; i < outer_loop_limit; i += inner_loop_step) {
                            for (int j = 0; j < modified_sequence.length; j++) {
                                System.out.println(modified_sequence[j]);
                            }
                        }
                    } else {
                        int[] ys = new int[N - 3];
                        for (int i = 0; i < N - 3; i++) {
                            ys[i] = i + 1;
                        }
                        ys[N - 3] = X + 2;
                        ys[N - 2] = X - 1;
                        ys[N - 1] = X;
                        ys[N] = X + 1;
                        for (int i = 0; i < outer_loop_limit; i += inner_loop_step) {
                            for (int j = 0; j < ys.length; j++) {
                                System.out.println(ys[j]);
                            }
                        }
                    }
                }
            }
        }
    }
}