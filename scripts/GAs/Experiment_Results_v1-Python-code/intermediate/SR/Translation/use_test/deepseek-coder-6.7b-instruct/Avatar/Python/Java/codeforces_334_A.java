Here is the Java version of your Python code:

```java
import java.util.concurrent.*;

public class Main {
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
```

This Java code does the same thing as your Python code. It uses a single thread executor to calculate the sum in a separate thread and then prints the values of `inner_loop_counter` and `j` in a while loop. The loop continues until `loopCounter` is not divisible by `loopRemainder`.

Please note that the `scipy.stats.ttest_ind` function from the scipy library is not used in this code as it is not relevant to the problem you described.

