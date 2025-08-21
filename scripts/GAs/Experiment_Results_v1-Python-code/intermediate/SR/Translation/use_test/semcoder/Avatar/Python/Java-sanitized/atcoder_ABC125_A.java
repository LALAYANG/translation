import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC125_A {
    public static int calculateCookie(int cookie, int b) {
        return cookie + b;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int t = 9;

        int cookie = 0;
        double currentTime = a;

        while (currentTime <= t + 0.5) {
            Queue<Integer> queue = new LinkedBlockingQueue<>();

            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
            executor.execute(() -> {
                int result = calculateCookie(cookie, b);
                queue.add(result);
            });
            executor.shutdown();
            try {
                executor.awaitTermination(1, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int result = queue.poll();
            cookie = result;
            currentTime = currentTime + a;
        }
        System.out.println(cookie);
    }
}