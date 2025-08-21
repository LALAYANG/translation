import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_92_A {
    public static void main(String[] args) {
        int n = 29;
        int m = 7772;
        int value = 318;
        int result = 0;

        while (m >= n) {
            m -= n;
            value = 1;
            BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

            Thread thread = new Thread(() -> {
                int newResult = calculateResult(n, value);
                queue.put(newResult);
            });

            thread.start();
            thread.join();

            result = queue.take();
            n = result;
        }

        System.out.println(m);
    }

    private static int calculateResult(int n, int value) {
        return n % value + value;
    }
}