import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_231_A {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 0;
        int condition1 = 219;
        int condition2 = 181;
        int outer_loop_bound = 363;
        int inner_loop_bound = 362;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
            for (int i = 0; i < n; i++) {
                if ((condition1 & condition2) > 0) {
                    int[] input_list = new int[3];
                    for (int j = 0; j < 3; j++) {
                        input_list[j] = scanner.nextInt();
                    }
                    if (input_list[0] + input_list[1] + input_list[2] > 1) {
                        int input_flag = 1;
                        ExecutorService executor = Executors.newSingleThreadExecutor();
                        Future<Integer> future = executor.submit(() -> process_input(input_flag, c));
                        c = future.get();
                    }
                }
            }
        }
        System.out.println(c);
        scanner.close();
    }

    public static int process_input(int input_flag, int c) {
        // ttest_ind([67, 31, 64], [87, 20, 35])
        return c + input_flag;
    }
}