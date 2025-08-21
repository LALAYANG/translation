import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class codeforces_598_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();
        ExecutorService executorService = Executors.newFixedThreadPool(iterations);
        LinkedBlockingQueue<Future<Integer>> resultQueue = new LinkedBlockingQueue<>();
        for (int i = 0; i < iterations; i++) {
            int n = scanner.nextInt();
            Future<Integer> future = executorService.submit(() -> {
                int variable_3_13 = 2;
                int variable_7_13 = 1;
                int result = computeResult(variable_7_13, variable_3_13, n);
                int iterations = 1;
                while (iterations <= n) {
                    result -= 2 * iterations;
                    iterations = iterations * 2;
                }
                return result;
            });
            resultQueue.add(future);
        }
        for (int i = 0; i < iterations; i++) {
            try {
                System.out.println(resultQueue.take().get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static int computeResult(int variable_7_13, int variable_3_13, int n) {
        return (variable_7_13 + n) * n / variable_3_13;
    }
}