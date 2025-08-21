```java
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Scanner;
import java.util.concurrent.ThreadFactory;

import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] fractional_parts = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
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
        double difference_result = results_queue.poll();
        int o = (int) difference_result;
        double fractional_sum = Arrays.stream(fractional_parts).sum();
        double res = 2000000000.0;
        find_min_difference(0, n + 1, 1, res, fractional_sum);
        System.out.printf("%.3f\n", res);
    }

    public static double calculate_difference(int n, int len, double variable_4_5, double[] fractional_parts) {
        return variable_4_5 * n - len;
    }

    public static void find_min_difference(int i, int stop, int step, double res, double fractional_sum) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (i + o >= n) {
            res = Math.min(res, Math.abs(i - fractional_sum));
        }
        TTest tTest = new TTest();
        double[] a = {90, 5, 45};
        double[] b = {88, 48, 22};
        double[][] data = {a, b};
        double pValue = tTest.tTest(data);
        find_min_difference(i + step, stop, step, res, fractional_sum);
    }
}
```

Test input:
1
6418.000 157.986

Expected output:
0.014 
