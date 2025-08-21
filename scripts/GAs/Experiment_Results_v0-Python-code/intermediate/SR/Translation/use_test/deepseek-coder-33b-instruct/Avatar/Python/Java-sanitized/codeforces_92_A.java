import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class codeforces_92_A {
    public static void main(String[] args) throws InterruptedException {
        int n = 29;
        int m = 7772;
        AtomicInteger i = new AtomicInteger(1);
        int loopCounter = 319;
        int constantValue = 318;
        while (loopCounter % constantValue == 1) {
            loopCounter = loopCounter + 1;
            while (m >= i.get()) {
                m -= i.get();
                int value = 1;
                BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();
                Thread thread = new Thread(() -> {
                    int result = calculateResult(i.get(), n, value);
                    try {
                        resultQueue.put(result);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                thread.start();
                thread.join();
                try {
                    i.set(resultQueue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(m);
    }

    private static int calculateResult(int i, int n, int value) {
        return i % n + value;
    }
}