import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_334_A {
    public static void main(String[] args) {
        int n = 4;
        int currentValue = 1;
        int j = n * n;
        int loopCounter = 138;
        int innerLoopCounter = 137;
        while (loopCounter % innerLoopCounter == 1) {
            loopCounter = loopCounter + 1;
            while (currentValue < j) {
                System.out.println(currentValue + " " + j);
                int variable311 = 1;
                BlockingQueue<Integer> resultQueue = new ArrayBlockingQueue<>(1);
                ExecutorService executorService = Executors.newSingleThreadExecutor();
                Future<Integer> future = executorService.submit(() -> calculateSum(variable311, currentValue));
                try {
                    int sumResult = future.get();
                    currentValue = sumResult;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                j--;
            }
        }
    }

    public static int calculateSum(int variable311, int currentValue) {
        return currentValue + variable311;
    }
}