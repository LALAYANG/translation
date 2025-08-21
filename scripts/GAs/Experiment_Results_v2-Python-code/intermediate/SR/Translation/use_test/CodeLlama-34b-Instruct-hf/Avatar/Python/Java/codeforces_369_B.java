```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CalculateValues {
    public static void main(String[] args) throws InterruptedException {
        int totalCount = 50;
        int k = 25;
        int l = 1000;
        int r = 1000;
        int sa = 50000;
        int sk = 25000;

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> calculateValues(k, totalCount, sk, sa));
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);

        int result = future.get();
        System.out.println(result);
    }

    private static int calculateValues(int k, int totalCount, int sk, int sa) {
        int result = 0;
        for (int i = 0; i < totalCount; i++) {
            if (i < k) {
                result += sk;
            } else {
                result += sa - sk;
            }
        }
        return result;
    }
}
```
Explanation:

The Python code uses the `threading` module to create a new thread that runs the `calculate_values` function in the background. The `calculate_values` function takes four arguments: `k`, `total_count`, `sk`, and `sa`. It returns the result of the calculation, which is a list of integers.

The Java code uses the `ExecutorService` class to create a new thread that runs the `calculateValues` method in the background. The `calculateValues` method takes four arguments: `k`, `totalCount`, `sk`, and `sa`. It returns the result of the calculation, which is an integer.

The Python code uses the `map` function to apply the `calculate_values` function to the input arguments. The Java code uses the `Future` class to get the result of the calculation from the background thread.

The Python code uses the `print` function to print the result of the calculation. The Java code uses the `System.out.println` method to print the result of the calculation.

Note that the Java code uses the `ExecutorService` class to create a new thread that runs the `calculateValues` method in the background. This is not necessary in the Python code, as the `threading` module is used to create a new thread that runs the `calculate_values` function in the background.
