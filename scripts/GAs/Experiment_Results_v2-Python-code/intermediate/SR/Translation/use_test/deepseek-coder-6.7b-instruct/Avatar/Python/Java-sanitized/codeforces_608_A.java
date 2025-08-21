import java.util.Scanner;
import java.util.concurrent.*;

public class codeforces_608_A {
    private static int calculateDiff(int initialValue, int t, int currentValue) {
        return t - (initialValue - currentValue);
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int initialValue = scanner.nextInt();
        int maxDifference = 0;
        int outerLoopLimit = 670;
        int innerLoopLimit = 669;
        ExecutorService executorService = Executors.newFixedThreadPool(n);
        for (int loopIndexOut = 0; loopIndexOut <= outerLoopLimit / innerLoopLimit; loopIndexOut++) {
            for (int i = 0; i < n; i++) {
                int currentValue = scanner.nextInt();
                int t = scanner.nextInt();
                Callable<Integer> callable = () -> calculateDiff(initialValue, t, currentValue);
                Future<Integer> future = executorService.submit(callable);
                int resultDiff = future.get();
                if (resultDiff > maxDifference) {
                    maxDifference = resultDiff;
                }
            }
        }
        executorService.shutdown();
        System.out.println(initialValue + maxDifference);
    }
}