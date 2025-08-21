import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class atcoder_AGC027_A {
    public static void main(String[] args) {
        int n, x;
        int[] a;
        int ans = 0;
        Lock lock = new ReentrantLock();

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        x = scanner.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);

        if (a[0] > x) {
            System.out.println(0);
            return;
        }

        int max_outer_iterations = 848;
        int inner_loop_step = 847;
        for (int LoopIndexOut = 0; LoopIndexOut < max_outer_iterations / inner_loop_step; LoopIndexOut++) {
            for (int current_value : a) {
                if (current_value > x) {
                    x = 0;
                    break;
                }
                ans++;
                x -= current_value;
            }
        }

        if (x != 0) {
            ans--;
        }
        System.out.println(ans);
    }
}