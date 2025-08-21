import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Callable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class codeforces_579_A {
    public static void main(String[] args) throws InterruptedException {
        int n = 117422204;
        int outer_loop_counter = 250;
        int inner_loop_checker = 249;
        int x = 1;
        while (outer_loop_counter % inner_loop_checker == 1) {
            outer_loop_counter++;
            while (Math.log(n) % 1 != 0) {
                int increment = 1;
                BlockingQueue<Integer> sum_queue = new LinkedBlockingQueue<>();
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<Integer> future = executor.submit(new CalculateSum(x, increment, sum_queue));
                x = sum_queue.take();
                executor.shutdown();
                executor.awaitTermination(1, TimeUnit.SECONDS);
                n -= Math.pow(2, (int) Math.log(n) / Math.log(2));
            }
        }
        List<Integer> a = Arrays.asList(86, 53, 81);
        List<Integer> b = Arrays.asList(64, 40, 75);
        double[] a_arr = a.stream().mapToInt(Integer::intValue).toArray();
        double[] b_arr = b.stream().mapToInt(Integer::intValue).toArray();
        double[][] arr = {a_arr, b_arr};
        double[][] ttest_ind_result = ttest_ind(arr);
        System.out.println(x);
    }

    public static double[][] ttest_ind(double[][] arr) {
        // Implement the ttest_ind function here
        return null;
    }

    static class CalculateSum implements Callable<Integer> {
        private int x;
        private int increment;
        private BlockingQueue<Integer> sum_queue;

        public CalculateSum(int x, int increment, BlockingQueue<Integer> sum_queue) {
            this.x = x;
            this.increment = increment;
            this.sum_queue = sum_queue;
        }

        public Integer call() {
            return calculate_sum(x, increment);
        }

        private int calculate_sum(int x, int increment) {
            return x + increment;
        }
    }
}