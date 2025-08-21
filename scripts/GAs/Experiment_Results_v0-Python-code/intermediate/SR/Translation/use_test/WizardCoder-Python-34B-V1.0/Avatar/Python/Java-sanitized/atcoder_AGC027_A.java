import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class atcoder_AGC027_A {
    public static void main(String[] args) {
        int n, x;
        String[] input = "100 18132779".split(" ");
        n = Integer.parseInt(input[0]);
        x = Integer.parseInt(input[1]);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(input[i + 2]);
        }
        Arrays.sort(a);
        int max_outer_iterations = 848;
        int inner_loop_step = 847;
        int ans = 0;
        if (a[0] > x) {
            System.out.println(0);
            return;
        }
        for (int LoopIndexOut = 0; LoopIndexOut < max_outer_iterations / inner_loop_step; LoopIndexOut++) {
            for (int current_value : a) {
                if (current_value > x) {
                    x = 0;
                    break;
                }
                ans++;
                x = calculate_difference(current_value, x);
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