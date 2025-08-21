import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.Random;
import java.util.Scanner;

public class atcoder_ABC178_A {
    private static int sum_inputs(int test_case, int increment) {
        return test_case + increment;
    }

    private static void my_decorator(Runnable func) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        executor.execute(func);
        executor.shutdown();
    }

    private static void Func_solve_0(int test_case) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a == 0 ? 1 : 0);
    }

    public static void main(String[] args) {
        int tcs = 1;
        int test_case = 1;
        while (test_case <= tcs) {
            Func_solve_0(test_case);
            int increment = 1;
            BlockingQueue<Integer> queue_sum_inputs0 = new LinkedBlockingQueue<>();
            my_decorator(() -> {
                try {
                    queue_sum_inputs0.put(sum_inputs(test_case, increment));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            try {
                test_case = queue_sum_inputs0.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}