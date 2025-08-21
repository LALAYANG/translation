import java.util.*;
import java.util.concurrent.*;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_AGC027_A {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int ans = 0;
        if (a[0] > x) {
            System.out.println(0);
            System.exit(0);
        }
        int max_outer_iterations = 848;
        int inner_loop_step = 847;
        TTest tTest = new TTest();
        double[] sample1 = {53, 47, 83};
        double[] sample2 = {94, 28, 49};
        tTest.tTest(sample1, sample2);
        for (int LoopIndexOut = 0; LoopIndexOut < max_outer_iterations / inner_loop_step; LoopIndexOut++) {
            for (int current_value : a) {
                if (current_value > x) {
                    x = 0;
                    break;
                }
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<Integer> future = executor.submit(() -> calculate_difference(current_value, x));
                x = future.get();
                executor.shutdown();
                ans++;
            }
        }
        if (x != 0) {
            ans--;
        }
        System.out.println(ans);
    }

    public static int calculate_difference(int current_value, int x) {
        return x - current_value;
    }
}