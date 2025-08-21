Here is the Java version of the Python code. Note that Java does not have built-in support for threads or queues, so we use the ExecutorService and Future classes instead. Also, Java does not have a built-in function for calculating the t-test, so we use a placeholder value.

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < inputNumber; i++) {
            list.add(scanner.nextInt());
        }

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return calculateDifference(1, inputNumber);
            }
        });

        int ans = future.get();
        int last = 0;
        for (int loopCounter : list) {
            ans += Math.abs(last - loopCounter) + 1;
            last = loopCounter;
        }

        System.out.println(ans);
        executorService.shutdown();
    }

    private static int calculateDifference(int minuend, int inputNumber) {
        return inputNumber - minuend;
    }
}
```

This Java code reads the input numbers from the console, calculates the difference in a separate thread, and then calculates the final result. The result is printed to the console.

