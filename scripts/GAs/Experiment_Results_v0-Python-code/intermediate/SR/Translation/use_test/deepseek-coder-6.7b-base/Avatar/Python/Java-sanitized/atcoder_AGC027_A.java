import java.util.Scanner;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_AGC027_A {
    public static void main(String[] args) {
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
            return;
        }
        int maxOuterIterations = 848;
        int innerLoopStep = 847;
        for (int loopIndexOut = 0; loopIndexOut < maxOuterIterations / innerLoopStep; loopIndexOut++) {
            for (int currentValue : a) {
                if (currentValue > x) {
                    x = 0;
                    break;
                }
                ExecutorService executorService = Executors.newSingleThreadExecutor();
                Future<Integer> future = executorService.submit(() -> calculateDifference(currentValue, x));
                x = future.get();
                ans++;
            }
        }
        if (x != 0) {
            ans--;
        }
        System.out.println(ans);
    }

    public static int calculateDifference(int currentValue, int x) {
        return x - currentValue;
    }
}