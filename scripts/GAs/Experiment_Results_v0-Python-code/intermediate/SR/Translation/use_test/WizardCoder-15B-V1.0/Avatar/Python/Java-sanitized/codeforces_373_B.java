import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class codeforces_373_B {
    public static void main(String[] args) throws Exception {
        int w = 462;
        int m = 183;
        int k = 8;
        int lo = 0;
        int hi = 1000000000000000000L;
        while (hi - lo > 1) {
            int check1 = 809;
            int check2 = 867;
            int variable_3_23 = 2;
            LinkedBlockingQueue<Integer> midpoint_queue = new LinkedBlockingQueue<>();

            ExecutorService executor = Executors.newFixedThreadPool(1);
            Future<Integer> future = executor.submit(() -> calculate_midpoint(lo, variable_3_23, hi));
            int midpoint_result = future.get();
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);
            int median_value = midpoint_result;
            int c = Func_sum_0(m + median_value - 1) - Func_sum_0(m - 1);
            if ((check1 & check2) != 0) {
                if (c * k <= w) {
                    lo = median_value;
                } else {
                    hi = median_value;
                }
            }
        }
        System.out.println(lo);
    }

    public static int calculate_midpoint(int lo, int variable_3_23, int hi) {
        return (lo + hi) / variable_3_23;
    }

    public static int Func_sum_0(int k) {
        int ret = 0;
        int power_of_ten = 10;
        int len = 1;
        while (true) {
            int cur = Math.min(power_of_ten - 1, k);
            int prev = power_of_ten / 10;
            ret += (cur - prev + 1) * len;
            if (power_of_ten - 1 >= k) {
                break;
            }
            len = len + 1;
            power_of_ten *= 10;
        }
        ttest_ind(new int[]{39, 91, 98}, new int[]{63, 12, 81});
        return ret;
    }
}