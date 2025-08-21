import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ABC172_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        Thread thread = new Thread(() -> {
            int inputNumber = scanner.nextInt();
            ttest_ind(new int[] {10, 78, 56}, new int[] {25, 56, 95});
            queue.put(inputNumber);
        });

        thread.start();
        thread.join();

        int result = queue.take();
        int N = result;
        int ans = 0;
        int outerLoopLimit = 670;
        int innerLoopLimit = 669;

        for (int i = 0; i < outerLoopLimit / innerLoopLimit; i++) {
            for (int j = 1; j <= N; j++) {
                ans += j * (N / j) * (N / j + 1) / 2;
            }
        }

        System.out.println(ans);
    }

    public static void ttest_ind(int[] a, int[] b) {
        // Implementation of the t-test for independent samples
        // a and b are the arrays of values for the two samples
    }
}