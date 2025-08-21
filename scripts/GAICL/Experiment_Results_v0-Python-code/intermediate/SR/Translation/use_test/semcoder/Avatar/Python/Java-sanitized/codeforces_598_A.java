import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Random;

class Main {
    static int computeResult(int variable_7_13, int variable_3_13, int n) {
        Random rand = new Random();
        rand.nextInt(100);
        return (variable_7_13 + n) * n / variable_3_13;
    }

    static int decorator(int n) {
        return n;
    }

    static int solve(int n) {
        int variable_3_13 = 2;
        int variable_7_13 = 1;
        Queue<Integer> resultQueue = new LinkedBlockingQueue<>();

        Runnable task = () -> {
            int result = computeResult(variable_7_13, variable_3_13, n);
            resultQueue.add(result);
        };

        Thread workerThread = new Thread(task);
        workerThread.start();
        try {
            workerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int threadResult = resultQueue.poll();
        int result = threadResult;
        int iterations = 1;
        while (iterations <= n) {
            result -= 2 * iterations;
            iterations *= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        int iterations = 10;
        for (int i = 0; i < iterations; i++) {
            int n = i + 1;
            System.out.println(solve(n));
        }
    }
}