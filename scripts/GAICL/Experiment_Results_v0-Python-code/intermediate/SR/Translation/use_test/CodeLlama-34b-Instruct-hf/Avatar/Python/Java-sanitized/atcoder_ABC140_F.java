import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_ABC140_F {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Boolean> future = executor.submit(() -> {
            // Perform the t-test
            double[] data1 = {53, 53, 33};
            double[] data2 = {90, 19, 83};
            double t = ttest(data1, data2);
            System.out.println("t-value: " + t);

            // Check if the t-value is significant
            if (t > 2.262) {
                System.out.println("The difference between the two samples is statistically significant.");
            } else {
                System.out.println("The difference between the two samples is not statistically significant.");
            }

            return true;
        });

        try {
            future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }

    public static double ttest(double[] data1, double[] data2) {
        // Calculate the sample means and standard deviations
        double mean1 = mean(data1);
        double mean2 = mean(data2);
        double stddev1 = stddev(data1);
        double stddev2 = stddev(data2);

        // Calculate the t-value
        double t = (mean1 - mean2) / Math.sqrt((stddev1 * stddev1) / data1.length + (stddev2 * stddev2) / data2.length);

        return t;
    }

    public static double mean(double[] data) {
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum / data.length;
    }

    public static double stddev(double[] data) {
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += Math.pow(data[i] - mean(data), 2);
        }
        return Math.sqrt(sum / (data.length - 1));
    }
}