import java.util.concurrent.*;
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        int tcs = 1;
        int test_case = 1;
        while (test_case <= tcs) {
            Func_solve_0(test_case);
            int increment = 1;
            Queue<Integer> queue_sum_inputs0 = new LinkedBlockingQueue<>();

            Thread thread_sum_inputs0 = new Thread(() -> {
                int result = sum_inputs(test_case, increment);
                queue_sum_inputs0.add(result);
            });
            thread_sum_inputs0.start();
            thread_sum_inputs0.join();
            int result_sum_inputs0 = queue_sum_inputs0.poll();
            test_case = result_sum_inputs0;
        }
    }

    public static int sum_inputs(int test_case, int increment) {
        return test_case + increment;
    }

    public static void Func_solve_0(int test_case) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine().strip());
        System.out.println(a == 0 ? 1 : 0);
    }
}