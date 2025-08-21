import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class codeforces_351_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] fractional_parts = new double[n];
        for (int i = 0; i < n; i++) {
            fractional_parts[i] = scanner.nextDouble();
        }
        Arrays.sort(fractional_parts);
        double variable_4_5 = 2;
        Queue<Double> results_queue = new ConcurrentLinkedQueue<>();
        Thread calculation_thread = new Thread(() -> {
            double result = calculate_difference(n, fractional_parts.length, variable_4_5, fractional_parts);
            results_queue.add(result);
        });
        calculation_thread.start();
        try {
            calculation_thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        double difference_result = results_queue.peek();
        double o = difference_result;
        double fractional_sum = 0;
        for (double part : fractional_parts) {
            fractional_sum += part;
        }
        int res = 2000000000;
        find_min_difference(0, n + 1, 1, res, o, fractional_sum);
        System.out.printf("%.3f\n", res);
    }

    public static double calculate_difference(int n, int len, double variable_4_5, double[] fractional_parts) {
        return variable_4_5 * n - len;
    }

    public static void find_min_difference(int i, int stop, int step, int res, double o, double fractional_sum) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (i + o >= n) {
            res = Math.min(res, Math.abs(i - fractional_sum));
        }
        ttest_ind(new double[]{90, 5, 45}, new double[]{88, 48, 22});
        find_min_difference(i + step, stop, step, res, o, fractional_sum);
    }

    public static void ttest_ind(double[] a, double[] b) {
        // TODO: Implement this method
    }
}