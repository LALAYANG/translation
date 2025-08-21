import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class codeforces_92_A {
    public static void main(String[] args) throws InterruptedException {
        int n = 29;
        int m = 7772;
        int currentValue = 1;
        int constantOne = 1;

        while (m >= currentValue) {
            BlockingQueue<Integer> queueCalculateDifference0 = new LinkedBlockingQueue<>();

            Thread threadCalculateDifference0 = new Thread(() -> {
                try {
                    queueCalculateDifference0.put(calculateDifference(currentValue, m));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            threadCalculateDifference0.start();
            threadCalculateDifference0.join();

            m = queueCalculateDifference0.poll(1, TimeUnit.SECONDS);

            BlockingQueue<Integer> sumModuloQueue = new LinkedBlockingQueue<>();

            Thread sumModuloThread = new Thread(() -> {
                try {
                    sumModuloQueue.put(calculateSumWithModulo(currentValue, constantOne, n));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            sumModuloThread.start();
            sumModuloThread.join();

            currentValue = sumModuloQueue.poll(1, TimeUnit.SECONDS);
        }

        System.out.println(m);
    }

    private static int calculateDifference(int currentValue, int m) {
        return m - currentValue;
    }

    private static int calculateSumWithModulo(int currentValue, int constantOne, int n) {
        return currentValue % n + constantOne;
    }
}