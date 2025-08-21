import java.util.Scanner;

public class atcoder_ABC142_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double t = 0;
        int outer_loop_end = 230;
        int outer_loop_limit = 229;
        int conditional_check_1 = 786;
        int conditional_check_2 = 207;

        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_end / outer_loop_limit; LoopIndexOut++) {
            for (int inner_loop_index = 0, stop = n, step = 1;
                 step != 0 && ((step > 0 && inner_loop_index < stop) || (step < 0 && inner_loop_index > stop));
                 inner_loop_index += step) {
                if ((conditional_check_1 & conditional_check_2) != 0 && (inner_loop_index + 1 & 1) != 0) {
                    t++;
                }
            }
        }

        System.out.println(t / n);
    }
}