import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class codeforces_519_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers_a = new int[n];
        for (int i = 0; i < n; i++) {
            numbers_a[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        int x = 0;
        int y = 0;
        int z = 0;
        int loop_iterations = 403;
        int max_loop_count = 402;

        for (int i = 0; i < numbers_a.length; i++) {
            x += numbers_a[i];
        }

        ExecutorService executor = Executors.newFixedThreadPool(b.length);
        for (int i : b) {
            final int finalI = i;
            executor.submit(() -> {
                y += finalI;
            });
        }
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i : c) {
            z += i;
        }

        System.out.println(Math.abs(x - y));
        // TODO: Implement ttest_ind([21, 54, 7], [62, 25, 100])
        System.out.println(Math.abs(y - z));
    }
}