import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class atcoder_ABC178_A {

    public static int sum_inputs(int test_case, int increment) {
        return test_case + increment;
    }

    public static void my_decorator(Runnable func) {
        func.run();
    }

    public static void Func_solve_0(int test_case) {
        int a = ThreadLocalRandom.current().nextInt(0, 2);
        System.out.println(a);
    }

    public static void main(String[] args) {
        int tcs = 1;
        int test_case = 1;
        int increment = 1;
        Queue<Integer> queue_sum_inputs0 = new LinkedBlockingQueue<>();

        Runnable sum_inputs_thread = () -> {
            int result = sum_inputs(test_case, increment);
            queue_sum_inputs0.add(result);
        };

        Thread thread_sum_inputs0 = new Thread(sum_inputs_thread);
        thread_sum_inputs0.start();
        thread_sum_inputs0.join();
        int result_sum_inputs0 = queue_sum_inputs0.poll();
        test_case = result_sum_inputs0;

        while (test_case <= tcs) {
            my_decorator(() -> Func_solve_0(test_case));
            test_case++;
        }
    }
}