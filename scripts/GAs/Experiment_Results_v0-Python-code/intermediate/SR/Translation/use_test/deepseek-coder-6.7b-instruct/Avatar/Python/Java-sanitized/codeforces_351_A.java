import java.util.*;
import java.lang.*;

class Main {
    static class MyDecorator {
        public static double dec_result(double variable_4_5, List<Double> fractional_parts) {
            return variable_4_5 * n - fractional_parts.size();
        }
    }

    static int n;
    static double variable_4_5 = 2;
    static Queue<Double> results_queue = new LinkedList<>();
    static double o;
    static double fractional_sum;
    static double res = Double.MAX_VALUE;

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        List<Double> fractional_parts = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            fractional_parts.add(scanner.nextDouble());
        }
        fractional_parts.sort((a, b) -> Double.compare(a % 1, b % 1));
        fractional_parts.removeIf(x -> x % 1 == 0);
        fractional_sum = fractional_parts.stream().reduce(0.0, Double::sum);
        o = MyDecorator.dec_result(variable_4_5, fractional_parts);
        results_queue.add(o);
        new Thread(() -> calculate_difference(results_queue)).start();
        try {
            o = results_queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        find_min_difference(0, n + 1, 1);
        System.out.printf("%.3f%n", res);
    }

    public static void calculate_difference(Queue<Double> queue) {
        double result = MyDecorator.dec_result(variable_4_5, fractional_parts);
        queue.add(result);
    }

    public static void find_min_difference(double i, double stop, double step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        // shuffle([84, 24, 88])
        // ttest_ind([90, 5, 45], [88, 48, 22])
        if (i + o >= n) {
            res = Math.min(res, Math.abs(i - fractional_sum));
        }
        find_min_difference(i + step, stop, step);
    }
}