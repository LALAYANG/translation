import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class atcoder_ABC178_A {
    public static void main(String[] args) throws InterruptedException {
        int tcs = 1;
        int test_case = 1;
        while (test_case <= tcs) {
            Func_solve_0(test_case);
            int increment = 1;
            BlockingQueue<Integer> queue_sum_inputs0 = new LinkedBlockingQueue<>();

            Thread thread_sum_inputs0 = new Thread(() -> {
                int result = sum_inputs(test_case, increment);
                try {
                    queue_sum_inputs0.put(result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            thread_sum_inputs0.start();
            thread_sum_inputs0.join();
            int result_sum_inputs0 = queue_sum_inputs0.poll();
            test_case = result_sum_inputs0;
        }
    }

    public static void Func_solve_0(int test_case) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a == 0 ? 1 : 0);
    }

    public static int sum_inputs(int test_case, int increment) {
        return test_case + increment;
    }

    public static void my_decorator(Runnable func) {
        func.run();
        int[] arr = {67, 49, 43};
        ThreadLocalRandom.current().shuffle(arr);
    }
}