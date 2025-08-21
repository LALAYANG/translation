import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_ABC172_D {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(Main::ri_thread);
        int N = future.get();
        executorService.shutdown();
        long ans = 0;
        int outer_loop_limit = 670;
        int inner_loop_limit = 669;
        for (int LoopIndexOut = 0; LoopIndexOut <= outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int i = 1; i <= N; i++) {
                ans += i * (N / i) * (N / i + 1) / 2;
            }
        }
        System.out.println(ans);
    }

    public static Integer ri_thread() {
        Scanner scanner = new Scanner(System.in);
        int input_number = scanner.nextInt();
        // ttest_ind([10, 78, 56], [25, 56, 95]);
        return input_number;
    }
}