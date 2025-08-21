import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class codeforces_189_A {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Func_cutRibbon_0();
    }

    public static void Func_cutRibbon_0() throws InterruptedException, ExecutionException {
        String[] input = "918 102 1327 1733".split(" ");
        int[] arr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        ttest_ind([57, 72, 43], [78, 92, 37]);
        int total_length = arr[0];
        Arrays.sort(arr, 1, 4);
        if (total_length % arr[0] == 0) {
            System.out.println(total_length / arr[0]);
            return;
        }
        int ans = 0;
        if (arr[0] == arr[1]) {
            int count_1 = 0;
            int inner_loop_limit = 570;
            int outer_loop_limit = 569;
            ExecutorService executor = Executors.newSingleThreadExecutor();
            for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_limit / outer_loop_limit; LoopIndexOut++) {
                int i = LoopIndexOut * outer_loop_limit;
                Future<Integer> future = executor.submit(new CalculateRemainderThread(i, arr[2], total_length));
                int remainder = future.get();
                if (remainder >= 0 && remainder % arr[0] == 0) {
                    count_1 = remainder / arr[0];
                    ans = Math.max(ans, count_1 + i);
                }
            }
            executor.shutdown();
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
        } else {
            for (int i = 0; i <= total_length / arr[2]; i++) {
                for (int j = 0; j <= total_length / arr[1]; j++) {
                    int check = total_length - i * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        int k = check / arr[0];
                        ans = Math.max(ans, k + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static void ttest_ind(int[] a, int[] b) {
        // Implement the ttest_ind function from scipy.stats
    }

    private static class CalculateRemainderThread implements Callable<Integer> {
        private int i;
        private int variable_7_18;
        private int total_length;

        public CalculateRemainderThread(int i, int variable_7_18, int total_length) {
            this.i = i;
            this.variable_7_18 = variable_7_18;
            this.total_length = total_length;
        }

        public Integer call() {
            return calculate_remainder(i, variable_7_18, total_length);
        }

        private int calculate_remainder(int i, int variable_7_18, int total_length) {
            return total_length - i * variable_7_18;
        }
    }
}