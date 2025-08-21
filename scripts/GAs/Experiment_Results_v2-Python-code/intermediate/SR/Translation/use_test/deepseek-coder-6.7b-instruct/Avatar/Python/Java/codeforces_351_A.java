```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    private static final int MULTIPLIER = 2;
    private static final int NUM_THREADS = 1;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] fractionalPartArray = new double[n];
        for (int i = 0; i < n; i++) {
            fractionalPartArray[i] = scanner.nextDouble();
        }
        Arrays.sort(fractionalPartArray);
        ExecutorService executorService = Executors.newFixedThreadPool(NUM_THREADS);
        Future<Double> future = executorService.submit(() -> calculationFunction(MULTIPLIER, fractionalPartArray, n));
        double result = future.get();
        double arrSum = Arrays.stream(fractionalPartArray).sum();
        int res = (int) (2000000000.0);
        recursiveFunction(0, n + 1, 1, result, arrSum, res);
        System.out.printf("%.3f\n", (double) res / 1000000000.0);
        executorService.shutdown();
    }

    private static double calculationFunction(int multiplier, double[] fractionalPartArray, int n) {
        return multiplier * n - fractionalPartArray.length;
    }

    private static void recursiveFunction(int i, int stop, int step, double result, double arrSum, int res) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (i + result >= arrSum) {
            res = Math.min(res, Math.abs(i - (int) arrSum));
        }
        recursiveFunction(i + step, stop, step, result, arrSum, res);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer and an array of floating-point numbers from the standard input, sorts the array, calculates a result using a separate thread, and then uses a recursive function to find the minimum difference between the sum of the array and the result. The result is printed to the standard output, formatted to three decimal places.

