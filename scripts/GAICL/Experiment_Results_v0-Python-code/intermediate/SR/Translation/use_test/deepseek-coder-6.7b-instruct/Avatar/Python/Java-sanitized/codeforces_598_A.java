import java.util.concurrent.*;
import java.util.Random;

class Main {
    static int computeResult(int variable_7_13, int variable_3_13, int n) {
        return (variable_7_13 + n) * n / variable_3_13;
    }

    static int solve(int n) {
        int variable_3_13 = 2;
        int variable_7_13 = 1;
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Integer> resultFuture = executor.submit(() -> computeResult(variable_7_13, variable_3_13, n));
        int threadResult;
        try {
            threadResult = resultFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        int result = threadResult;
        int iterations = 1;
        while (iterations <= n) {
            result -= 2 * iterations;
            iterations *= 2;
        }
        executor.shutdown();
        return result;
    }

    public static void main(String[] args) {
        int iterations = new Random().nextInt(10) + 1;
        for (int i = 0; i < iterations; i++) {
            int n = new Random().nextInt(10) + 1;
            System.out.println(solve(n));
        }
    }
}