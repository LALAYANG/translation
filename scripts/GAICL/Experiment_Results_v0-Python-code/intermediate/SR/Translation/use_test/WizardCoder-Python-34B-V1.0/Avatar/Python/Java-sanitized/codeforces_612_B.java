import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Random;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class codeforces_612_B {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] result_array = new int[n];
        int[] variable_1_10 = {0};
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Integer> future = executor.submit(new CalculationWorker(variable_1_10, n));
        int calculation_result = future.get();
        recursive_array(a, result_array, 0, n, 1);
        int res = 0;
        recursive_sum(result_array, 1, n, 1, res);
        System.out.println(res);
    }

    public static int calculate_product(int[] variable_1_10, int n) {
        return variable_1_10[0] * n;
    }

    public static void my_decorator(int[] a) {
        Collections.shuffle(Arrays.asList(a), new Random());
    }

    public static void recursive_array(int[] a, int[] result_array, int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        result_array[a[i] - 1] = i;
        recursive_array(a, result_array, i + step, stop, step);
    }

    public static void recursive_sum(int[] result_array, int i, int stop, int step, int res) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        res += Math.abs(result_array[i] - result_array[i - 1]);
        recursive_sum(result_array, i + step, stop, step, res);
    }

    public static class CalculationWorker implements Callable<Integer> {
        private int[] variable_1_10;
        private int n;

        public CalculationWorker(int[] variable_1_10, int n) {
            this.variable_1_10 = variable_1_10;
            this.n = n;
        }

        public Integer call() {
            return calculate_product(variable_1_10, n);
        }
    }
}