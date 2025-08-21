```java
import java.util.concurrent.*;
import java.util.Scanner;

class Main {
    static int calculateSumWithModulo(int currentValue, int constantOne, int n) {
        return (currentValue % n + constantOne);
    }

    static int calculateDifference(int currentValue, int m) {
        return m - currentValue;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int currentValue = 1;
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        while (m >= currentValue) {
            Future<Integer> futureDifference = executorService.submit(() -> calculateDifference(currentValue, m));
            m = futureDifference.get();
            int constantOne = 1;
            Future<Integer> futureSum = executorService.submit(() -> calculateSumWithModulo(currentValue, constantOne, n));
            currentValue = futureSum.get();
        }
        executorService.shutdown();
        System.out.println(m);
    }
}
```

This Java code does the same thing as the Python code. It uses the `ExecutorService` to create and manage threads. The `calculateDifference` method is run in a separate thread to calculate the difference between `m` and `currentValue`, and the result is stored in a `Future` object. The `calculateSumWithModulo` method is run in a separate thread to calculate the sum of `currentValue`, `constantOne`, and `n`, and the result is stored in another `Future` object. The `get` method is used to retrieve the results of the `Future` objects. The `shuffle` method is not used in this code because Java does not have a built-in method for shuffling arrays or lists.

