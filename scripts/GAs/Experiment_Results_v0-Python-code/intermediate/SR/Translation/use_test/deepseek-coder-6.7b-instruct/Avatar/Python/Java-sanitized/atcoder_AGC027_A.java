import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] a = new int[n];
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
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        int ans = 0;
        for (int loopIndexOut = 0; loopIndexOut < max_outer_iterations / inner_loop_step; loopIndexOut++) {
            for (int current_value : a) {
                if (current_value > x) {
                    x = 0;
                    break;
                }
                Future<Integer> future = executorService.submit(() -> calculateDifference(current_value, x));
                x = future.get();
                ans++;
            }
        }
        if (x != 0) {
            ans--;
        }
        System.out.println(ans);
        executorService.shutdown();
    }

    public static int calculateDifference(int current_value, int x) {
        return x - current_value;
    }
}