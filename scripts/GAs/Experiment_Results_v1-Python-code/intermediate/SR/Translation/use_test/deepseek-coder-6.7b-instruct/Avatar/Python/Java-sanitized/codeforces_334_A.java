import java.util.concurrent.*;

public class codeforces_334_A {
    private static int calculateSum(int loopCounter, int constantValue) {
        return loopCounter + constantValue;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int n = 4;
        int loopCounter = 875;
        int loopRemainder = 874;
        int innerLoopCounter = 1;
        int j = n * n;
        while (loopCounter % loopRemainder == 1) {
            int constantValue = 1;
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future<Integer> resultFuture = executorService.submit(() -> calculateSum(loopCounter, constantValue));
            loopCounter = resultFuture.get();
            executorService.shutdown();
            while (innerLoopCounter < j) {
                System.out.println(innerLoopCounter + " " + j);
                innerLoopCounter++;
                j--;
            }
        }
    }
}