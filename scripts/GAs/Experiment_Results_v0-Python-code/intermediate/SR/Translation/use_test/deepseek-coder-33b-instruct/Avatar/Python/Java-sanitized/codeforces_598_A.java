import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_598_A {
    public static void main(String[] args) throws InterruptedException {
        int iterations = 10;
        for (int i = 0; i < iterations; i++) {
            int n = i + 1;
            System.out.println(solve(n));
        }
    }

    public static int solve(int n) throws InterruptedException {
        int variable_3_13 = 2;
        int variable_7_13 = 1;
        BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

        Thread workerThread = new Thread(() -> {
            int result = computeResult(variable_7_13, variable_3_13, n);
            try {
                resultQueue.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        workerThread.start();
        workerThread.join();
        int threadResult = resultQueue.take();
        int result = threadResult;
        int iterations = 1;
        while (iterations <= n) {
            result -= 2 * iterations;
            iterations *= 2;
        }
        return result;
    }

    public static int computeResult(int variable_7_13, int variable_3_13, int n) {
        int[] array = {37, 26, 1};
        shuffleArray(array);
        return (variable_7_13 + n) * n / variable_3_13;
    }

    private static void shuffleArray(int[] array) {
        int index;
        int temp;
        for (int i = array.length - 1; i > 0; i--) {
            index = ThreadLocalRandom.current().nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}