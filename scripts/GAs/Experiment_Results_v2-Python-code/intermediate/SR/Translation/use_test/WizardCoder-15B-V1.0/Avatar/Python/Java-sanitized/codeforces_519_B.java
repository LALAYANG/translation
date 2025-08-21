import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class codeforces_519_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<Integer> a = Arrays.asList(Arrays.stream(args[1].split(" ")).mapToInt(Integer::parseInt).toArray());
        List<Integer> b = Arrays.asList(Arrays.stream(args[2].split(" ")).mapToInt(Integer::parseInt).toArray());
        List<Integer> numbers_c = Arrays.asList(Arrays.stream(args[3].split(" ")).mapToInt(Integer::parseInt).toArray());
        int x = 0;
        int y = 0;
        Random random = new Random();
        for (int i : a) {
            Queue<Integer> queue_sum_x0 = new ConcurrentLinkedQueue<>();
            ExecutorService executor = Executors.newFixedThreadPool(1);
            executor.execute(() -> {
                int result = sum_x(i, x);
                queue_sum_x0.offer(result);
            });
            executor.shutdown();
            try {
                executor.awaitTermination(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            x = queue_sum_x0.poll();
        }
        for (int i : b) {
            y += i;
        }
        double[] a_arr = a.stream().mapToDouble(i -> i).toArray();
        double[] b_arr = b.stream().mapToDouble(i -> i).toArray();
        double t = ttest_ind(a_arr, b_arr)[0];
        System.out.println(t);
        int z = 0;
        for (int i : numbers_c) {
            z += i;
        }
        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - z));
    }

    public static int sum_x(int i, int x) {
        return x + i;
    }

    public static double[] ttest_ind(double[] a, double[] b) {
        double mean_a = Arrays.stream(a).average().getAsDouble();
        double mean_b = Arrays.stream(b).average().getAsDouble();
        double var_a = Arrays.stream(a).map(i -> Math.pow(i - mean_a, 2)).average().getAsDouble();
        double var_b = Arrays.stream(b).map(i -> Math.pow(i - mean_b, 2)).average().getAsDouble();
        double var_pooled = (var_a + var_b) / 2;
        double std_err_a = Math.sqrt(var_a / a.length);
        double std_err_b = Math.sqrt(var_b / b.length);
        double t = (mean_a - mean_b) / Math.sqrt(var_pooled * (1.0 / a.length + 1.0 / b.length));
        double df = a.length + b.length - 2;
        double p = 1.0 - new TDistribution(df).cumulativeProbability(Math.abs(t));
        return new double[]{t, df, p};
    }
}

class TDistribution extends org.apache.commons.math3.distribution.TDistribution {
    public TDistribution(double df) {
        super(df);
    }
}