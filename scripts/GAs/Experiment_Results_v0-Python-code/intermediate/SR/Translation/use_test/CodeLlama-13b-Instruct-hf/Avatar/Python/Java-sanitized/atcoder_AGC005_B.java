import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_AGC005_B {
    public static void main(String[] args) throws InterruptedException {
        int n = Integer.parseInt(args[0]);
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = i + 1;
        }
        int y = values.length;
        int[] result = new int[n];
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        Thread thread = new Thread(() -> {
            for (int i = 0; i < n; i++) {
                int x = values[i];
                int product = x * y;
                queue.put(product);
            }
        });
        thread.start();
        thread.join();
        for (int i = 0; i < n; i++) {
            result[i] = queue.take();
        }
        int maxValue = 0;
        for (int i = 0; i < n; i++) {
            maxValue = Math.max(maxValue, result[i]);
        }
        System.out.println(maxValue);
    }
}