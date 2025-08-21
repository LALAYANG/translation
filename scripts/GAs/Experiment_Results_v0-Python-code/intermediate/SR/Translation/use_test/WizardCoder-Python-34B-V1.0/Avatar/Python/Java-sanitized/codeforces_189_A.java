import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_189_A {
    public static void main(String[] args) {
        String[] input = "918 102 1327 1733".split(" ");
        int[] arr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        TTest tTest = new TTest();
        tTest.tTest(new double[] {57, 72, 43}, new double[] {78, 92, 37});
        int total_length = arr[0];
        Arrays.sort(arr, 1, 4);
        if (total_length % arr[1] == 0) {
            System.out.println(total_length / arr[1]);
            return;
        }
        int ans = 0;
        if (arr[1] == arr[2]) {
            int count_1 = 0;
            int inner_loop_limit = 570;
            int outer_loop_limit = 569;
            ExecutorService executor = Executors.newFixedThreadPool(1);
            for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_limit / outer_loop_limit; LoopIndexOut++) {
                for (int i = 0; i <= total_length / arr[2]; i++) {
                    final int finalI = i;
                    final int finalVariable_7_18 = arr[2];
                    final AtomicInteger remainder = new AtomicInteger();
                    executor.submit(() -> {
                        remainder.set(calculate_remainder(finalI, finalVariable_7_18, total_length));
                    });
                    try {
                        executor.shutdown();
                        executor.awaitTermination(1, TimeUnit.SECONDS);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int check = remainder.get();
                    if (check >= 0 && check % arr[1] == 0) {
                        count_1 = check / arr[1];
                        ans = Math.max(ans, count_1 + i);
                    }
                }
            }
        } else {
            for (int i = 0; i <= total_length / arr[2]; i++) {
                for (int j = 0; j <= total_length / arr[1]; j++) {
                    int check = total_length - i * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[1] == 0) {
                        int count_1 = check / arr[1];
                        ans = Math.max(ans, count_1 + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static int calculate_remainder(int i, int variable_7_18, int total_length) {
        return total_length - i * variable_7_18;
    }
}