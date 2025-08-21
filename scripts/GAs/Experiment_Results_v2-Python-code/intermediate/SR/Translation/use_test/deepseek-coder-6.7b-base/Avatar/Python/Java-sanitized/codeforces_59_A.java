import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class codeforces_59_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        int cu = 0;
        int cl = 0;
        int outer_loop_bound = 128;
        int inner_loop_bound = 127;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
            for (int z = 0; z < txt.length(); z++) {
                if (Character.isLowerCase(txt.charAt(z))) {
                    int lowercase_flag = 1;
                    Queue<Integer> queue_calculate_result0 = new LinkedList<>();
                    Thread thread_calculate_result0 = new Thread(() -> {
                        int result = calculate_result(cl, lowercase_flag);
                        queue_calculate_result0.add(result);
                    });
                    thread_calculate_result0.start();
                    thread_calculate_result0.join();
                    int result_calculate_result0 = queue_calculate_result0.poll();
                    cl = result_calculate_result0;
                } else {
                    cu++;
                }
            }
        }
        double[] sample1 = {72, 5, 73};
        double[] sample2 = {54, 1, 80};
        double t_statistic = ttest_ind(sample1, sample2);
        if (cu > cl) {
            String final_output = txt.toUpperCase();
            System.out.println(final_output);
        } else {
            String final_output = txt.toLowerCase();
            System.out.println(final_output);
        }
    }

    public static int calculate_result(int cl, int lowercase_flag) {
        return cl + lowercase_flag;
    }

    public static double ttest_ind(double[] sample1, double[] sample2) {
        // Implement the t-test for independent samples
        return 0;
    }
}