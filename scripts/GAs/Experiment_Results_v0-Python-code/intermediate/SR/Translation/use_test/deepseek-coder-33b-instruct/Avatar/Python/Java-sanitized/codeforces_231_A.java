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
                int[] input_list = new int[3];
                for (int j = 0; j < 3; j++) {
                    input_list[j] = scanner.nextInt();
                }
                if ((condition1 & condition2) > 0) {
                    int sum = 0;
                    for (int num : input_list) {
                        sum += num;
                    }
                    if (sum > 1) {
                        int input_flag = 1;
                        ExecutorService executor = Executors.newSingleThreadExecutor();
                        Future<Integer> future = executor.submit(() -> processInput(input_flag, c));
                        c = future.get();
                        executor.shutdown();
                    }
                }
            }
        }
        System.out.println(c);
    }

    public static int processInput(int input_flag, int c) {
        // ttest_ind([67, 31, 64], [87, 20, 35])
        // This function is not available in Java, so I've commented it out.
        return c + input_flag;
    }
}