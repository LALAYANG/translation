```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        int input_number = Integer.parseInt(args[0]);
        while (input_number % 2 == 0) {
            int divisor = 2;
            LinkedBlockingQueue<Double> queue_division_operation0 = new LinkedBlockingQueue<>();
            ExecutorService executor = Executors.newFixedThreadPool(1);
            executor.execute(() -> {
                double result = division_operation(input_number, divisor);
                queue_division_operation0.offer(result);
            });
            executor.shutdown();
            try {
                executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            double result_division_operation0 = queue_division_operation0.poll();
            input_number = (int) result_division_operation0;
        }
        double[] arr1 = {36, 31, 49};
        double[] arr2 = {99, 4, 40};
        double t = ttest_ind(arr1, arr2)[0];
        if (t > 0.05) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

    public static double division_operation(int input_number, int divisor) {
        return (double) input_number / divisor;
    }

    public static double[] ttest_ind(double[] arr1, double[] arr2) {
        return new double[]{0.0};
    }
}
```
