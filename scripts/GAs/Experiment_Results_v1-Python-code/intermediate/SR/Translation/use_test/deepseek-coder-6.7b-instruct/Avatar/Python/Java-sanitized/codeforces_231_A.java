import java.util.Scanner;
import java.util.concurrent.*;

public class codeforces_231_A {
    private static int calculateSum(int valueToAdd, int c) {
        return c + valueToAdd;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 0;
        int conditionCheckOne = 500;
        int conditionCheckTwo = 144;
        int outerLoopBound = 60;
        int innerLoopBound = 59;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopBound / innerLoopBound; loopIndexOut++) {
            for (int innerLoopIndex = 0; innerLoopIndex < n; innerLoopIndex++) {
                int[] l1 = new int[3];
                for (int i = 0; i < 3; i++) {
                    l1[i] = scanner.nextInt();
                }
                if ((conditionCheckOne & conditionCheckTwo) != 0) {
                    int sum = 0;
                    for (int i : l1) {
                        sum += i;
                    }
                    if (sum > 1) {
                        int valueToAdd = 1;
                        ExecutorService executorService = Executors.newSingleThreadExecutor();
                        Future<Integer> resultFuture = executorService.submit(() -> calculateSum(valueToAdd, c));
                        c = resultFuture.get();
                        executorService.shutdown();
                    }
                }
            }
        }
        System.out.println(c);
    }
}