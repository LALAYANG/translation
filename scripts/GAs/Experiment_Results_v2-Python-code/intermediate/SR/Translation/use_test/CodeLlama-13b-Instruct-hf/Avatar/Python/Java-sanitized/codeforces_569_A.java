import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_569_A {
    public static void main(String[] args) {
        int targetValue = Integer.parseInt(args[0]);
        int s = Integer.parseInt(args[1]);
        int q = Integer.parseInt(args[2]);

        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        Thread workerThread = new Thread(() -> {
            int calculationResult = calculateProduct(s, q);
            queue.put(calculationResult);
        });

        workerThread.start();
        workerThread.join();

        int resultCalculateProduct = queue.get();
        s = resultCalculateProduct;

        int operationCount = 0;
        while (s < targetValue) {
            queue.put(calculateProduct(s, q));
            operationCount++;
        }

        System.out.println(operationCount);
    }

    private static int calculateProduct(int s, int q) {
        return s * q;
    }
}