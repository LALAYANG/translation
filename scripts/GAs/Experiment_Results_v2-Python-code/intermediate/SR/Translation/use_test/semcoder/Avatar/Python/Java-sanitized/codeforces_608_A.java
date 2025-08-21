import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class codeforces_608_A {
    public static int calculateDiff(int initialValue, int t, int currentValue) {
        return t - (initialValue - currentValue);
    }

    public static void main(String[] args) {
        int n = 2;
        int initialValue = 10;
        int maxDifference = 0;

        ExecutorService executor = Executors.newFixedThreadPool(n);
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();

        for (int i = 0; i < n; i++) {
            int currentValue = 9;
            int t = 3;

            Runnable task = () -> {
                int result = calculateDiff(initialValue, t, currentValue);
                queue.add(result);
            };

            executor.execute(task);
        }

        executor.shutdown();

        while (!queue.isEmpty()) {
            int resultDiff = queue.poll();
            int x = resultDiff;
            if (x > maxDifference) {
                maxDifference = x;
            }
        }

        System.out.println(initialValue + maxDifference);
    }
}