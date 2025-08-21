Here is the Java version of the provided Python code:

```java
import java.util.concurrent.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] globalVar = {0};
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<int[]> future = executorService.submit(() -> calculateProduct(globalVar, n));
        int[] calculationResult = future.get();
        int[] resultArray = calculationResult;
        int mx = arr[n - 1];
        int conditionOne = 995;
        int conditionTwo = 398;
        int outerLoopCounter = 470;
        int innerLoopCounter = 469;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopCounter / innerLoopCounter; LoopIndexOut++) {
            for (int i = n - 2; i >= 0; i--) {
                resultArray[i] = Math.max(0, mx - arr[i] + 1);
                if ((conditionOne & conditionTwo) != 0) {
                    if (arr[i] > mx) {
                        mx = arr[i];
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(resultArray[i] + " ");
        }
        executorService.shutdown();
    }

    public static int[] calculateProduct(int[] globalVar, int n) {
        return new int[]{globalVar[0] * n};
    }
}
```

Please note that the Java version uses a `Future` to get the result from the `calculateProduct` method, which is run in a separate thread. The `ExecutorService` is used to manage the thread pool. The `calculateProduct` method is a simple method that multiplies the `globalVar` with `n`. The rest of the code is a direct translation of the Python code to Java.

