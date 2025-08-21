import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class codeforces_334_A {
    public static void main(String[] args) throws InterruptedException {
        int n = Integer.parseInt(args[0]);
        int currentValue = 1;
        int j = n * n;
        int loopCounter = 138;
        int innerLoopCounter = 137;
        while (loopCounter % innerLoopCounter == 1) {
            loopCounter++;
            while (currentValue < j) {
                System.out.println(currentValue + " " + j);
                int variable311 = 1;
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<Integer> future = executor.submit(() -> calculateSum(variable311, currentValue));
                int sumResult = future.get(1, TimeUnit.SECONDS);
                currentValue = sumResult;
                j--;
            }
        }
    }

    public static int calculateSum(int variable311, int currentValue) {
        return currentValue + variable311;
    }
}