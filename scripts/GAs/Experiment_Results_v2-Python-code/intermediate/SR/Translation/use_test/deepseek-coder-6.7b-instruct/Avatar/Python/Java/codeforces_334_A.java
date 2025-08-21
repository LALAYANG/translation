Here is the Java version of your Python code:

```java
import java.util.concurrent.*;

public class Main {
    private static int sumValue = 413;
    private static int divisorValue = 412;
    private static int i = 1;
    private static int j = 413;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        while (sumValue % divisorValue == 1) {
            Future<Integer> future = executor.submit(new AdditionTask());
            sumValue = future.get();
            while (i < j) {
                System.out.println(i + " " + j);
                i = i + 1;
                j = j - 1;
            }
        }
        executor.shutdown();
    }

    static class AdditionTask implements Callable<Integer> {
        private int incrementValue = 1;

        @Override
        public Integer call() {
            return sumValue + incrementValue;
        }
    }
}
```

This Java code does the same thing as your Python code. It creates a new thread to calculate the sum and prints the numbers in a while loop. The `Callable` interface is used to create a task that returns a result and the `ExecutorService` is used to manage the thread.

Please note that the `scipy.stats.ttest_ind` function from the scipy library is not used in this code as it is not relevant to the problem you described.

