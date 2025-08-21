import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC125_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeIncrement = scanner.nextInt();
        int b = scanner.nextInt();
        int t = scanner.nextInt();

        int cookie = 0;
        int time = timeIncrement;
        int outerLoopCounter = 222;
        int innerLoopCounter = 221;

        while (outerLoopCounter % innerLoopCounter == 1) {
            outerLoopCounter++;
            while (time <= t + 0.5) {
                Queue<Integer> queueCalculateCookie = new ArrayDeque<>();

                ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(1));
                executor.execute(new CalculateCookieThread(queueCalculateCookie));

                try {
                    queueCalculateCookie.put(calculateCookie(cookie, b));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                cookie = queueCalculateCookie.take();
                time = time + timeIncrement;
            }
        }

        System.out.println(cookie);
    }

    private static int calculateCookie(int cookie, int b) {
        return cookie + b;
    }

    private static class CalculateCookieThread implements Runnable {
        private Queue<Integer> queue;

        public CalculateCookieThread(Queue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            try {
                queue.put(calculateCookie(0, 0));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}