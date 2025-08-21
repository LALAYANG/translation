import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_231_A {
    private static int c = 0;
    private static final int condition1 = 219;
    private static final int condition2 = 181;
    private static final int outer_loop_bound = 363;
    private static final int inner_loop_bound = 362;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
            for (int i = 0; i < n; i++) {
                if ((condition1 & condition2) != 0) {
                    int[] input_list = new int[3];
                    for (int j = 0; j < 3; j++) {
                        input_list[j] = scanner.nextInt();
                    }
                    if (sum(input_list) > 1) {
                        Future<Integer> result = executorService.submit(() -> process_input(1, c));
                        c = result.get();
                    }
                }
            }
        }
        executorService.shutdown();
        System.out.println(c);
    }

    public static int process_input(int input_flag, int c) {
        TTest tTest = new TTest();
        double[] sample1 = {67, 31, 64};
        double[] sample2 = {87, 20, 35};
        tTest.tTest(sample1, sample2);
        return c + input_flag;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}