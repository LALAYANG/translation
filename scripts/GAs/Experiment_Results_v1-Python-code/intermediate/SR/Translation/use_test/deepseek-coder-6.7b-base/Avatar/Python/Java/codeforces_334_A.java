```
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(args[0]);
        int[][] matrix = new int[n][n];
        int loopCounter = 1;
        int innerLoopCounter = 1;
        int j = n * n;
        int loopRemainder = j - 1;
        while (loopCounter % loopRemainder == 1) {
            int constantValue = 1;
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<Integer> future = executor.submit(() -> calculateSum(loopCounter, constantValue));
            loopCounter = future.get();
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);
            while (innerLoopCounter < j) {
                System.out.println(innerLoopCounter + " " + j);
                innerLoopCounter++;
                j--;
            }
        }
    }

    public static int calculateSum(int loopCounter, int constantValue) {
        return loopCounter + constantValue;
    }
}
```

