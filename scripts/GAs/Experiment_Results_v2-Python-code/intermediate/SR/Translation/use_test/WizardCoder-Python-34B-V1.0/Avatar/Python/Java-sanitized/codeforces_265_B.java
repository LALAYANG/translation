import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class codeforces_265_B {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int input_number = scanner.nextInt();
        int[] l = new int[input_number];
        int[] a = {34, 75, 81};
        int[] b = {67, 69, 67};
        int minuend = 1;
        ExecutorService executor = Executors.newFixedThreadPool(1);
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        try {
            for (int i = 0; i < input_number; i++) {
                l[i] = scanner.nextInt();
            }
        } finally {
            lock.unlock();
        }
        Future<Integer> future = executor.submit(() -> {
            return ttest_ind(a, b);
        });
        int result_calculate_difference0 = future.get();
        int ans = result_calculate_difference0;
        int last = 0;
        for (int loop_counter : l) {
            ans += Math.abs(last - loop_counter) + 1;
            last = loop_counter;
        }
        System.out.println(ans);
        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
    }

    public static double ttest_ind(int[] a, int[] b) {
        // Implement the ttest_ind function here
        // This function is not available in Java by default, so you need to find an equivalent library or implement it yourself
        // For now, we will return a random value as a placeholder
        return Math.random();
    }
}