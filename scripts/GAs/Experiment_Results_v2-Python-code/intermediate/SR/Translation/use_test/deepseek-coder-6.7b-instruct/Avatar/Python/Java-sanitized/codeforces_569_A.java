import java.util.Scanner;
import java.util.concurrent.*;

public class codeforces_569_A {

    private static int calculateProduct(int s, int q) {
        return s * q;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int targetValue = scanner.nextInt();
        int s = scanner.nextInt();
        int q = scanner.nextInt();

        int operationCount = 0;
        int loopCounterOne = 608;
        int loopCounterTwo = 607;

        while (loopCounterOne % loopCounterTwo == 1) {
            loopCounterOne += 1;
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            while (s < targetValue) {
                Future<Integer> future = executorService.submit(() -> calculateProduct(s, q));
                s = future.get();
                operationCount += 1;
            }
            executorService.shutdown();
        }
        System.out.println(operationCount);
    }
}