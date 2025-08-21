import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ABC125_A {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int t = Integer.parseInt(args[2]);
        int cookie = 0;
        double currentTime = a;
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        while (currentTime <= t + 0.5) {
            Thread thread = new Thread(() -> {
                int result = calculateCookie(cookie, b);
                queue.put(result);
            });
            thread.start();
            thread.join();
            int result = queue.take();
            cookie = result;
            currentTime = currentTime + a;
        }

        System.out.println(cookie);
    }

    private static int calculateCookie(int cookie, int b) {
        return cookie + b;
    }
}