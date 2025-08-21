import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_92_A {
    public static void main(String[] args) throws InterruptedException {
        int n = 29;
        int m = 7772;
        int currentValue = 1;
        int constantOne = 1;

        BlockingQueue<Integer> queueCalculateDifference = new LinkedBlockingQueue<>();
        Thread threadCalculateDifference = new Thread(() -> {
            int differenceResult = calculateDifference(currentValue, m);
            queueCalculateDifference.put(differenceResult);
        });
        threadCalculateDifference.start();
        threadCalculateDifference.join();
        int resultCalculateDifference = queueCalculateDifference.take();
        m = resultCalculateDifference;

        BlockingQueue<Integer> queueSumModulo = new LinkedBlockingQueue<>();
        Thread threadSumModulo = new Thread(() -> {
            int sumModuloResult = calculateSumWithModulo(currentValue, constantOne, n);
            queueSumModulo.put(sumModuloResult);
        });
        threadSumModulo.start();
        threadSumModulo.join();
        int sumModuloResult = queueSumModulo.take();
        currentValue = sumModuloResult;

        System.out.println(m);
    }

    private static int calculateDifference(int currentValue, int m) {
        return m - currentValue;
    }

    private static int calculateSumWithModulo(int currentValue, int constantOne, int n) {
        return (currentValue % n + constantOne) % n;
    }
}