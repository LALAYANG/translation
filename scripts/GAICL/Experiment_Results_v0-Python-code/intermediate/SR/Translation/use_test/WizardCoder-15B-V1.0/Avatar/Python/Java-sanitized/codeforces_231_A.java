import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class codeforces_231_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        int condition1 = 219;
        int condition2 = 181;
        int outer_loop_bound = 363;
        int inner_loop_bound = 362;
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
            for (int i = 0; i < n; i++) {
                int[] input_list = new int[3];
                for (int j = 0; j < 3; j++) {
                    input_list[j] = sc.nextInt();
                }
                if ((condition1 & condition2) != 0) {
                    if (input_list[0] + input_list[1] + input_list[2] > 1) {
                        Future<Integer> future = executor.submit(() -> {
                            int input_flag = 1;
                            return process_input(input_flag, c);
                        });
                        try {
                            c = future.get(10, TimeUnit.SECONDS);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        executor.shutdown();
        System.out.println(c);
    }

    private static int process_input(int input_flag, int c) {
        ttest_ind(new int[]{67, 31, 64}, new int[]{87, 20, 35});
        return c + input_flag;
    }
}