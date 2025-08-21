```java
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class CalculateDifference {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double[] fractionalParts = new double[n];
        for (int i = 0; i < n; i++) {
            fractionalParts[i] = Double.parseDouble(args[i + 1]);
        }
        Arrays.sort(fractionalParts);
        double variable45 = 2;
        Queue<Double> resultsQueue = new LinkedList<>();
        Thread calculationThread = new Thread(() -> {
            double result = calculateDifference(n, fractionalParts.length, variable45, fractionalParts);
            resultsQueue.add(result);
        });
        calculationThread.start();
        calculationThread.join();
        double differenceResult = resultsQueue.poll();
        double fractionalSum = Arrays.stream(fractionalParts).sum();
        double res = 2000000000.0;
        findMinDifference(0, n + 1, 1, res, fractionalSum, differenceResult);
        System.out.printf("%.3f", res);
    }

    private static double calculateDifference(int n, int len, double variable45, double[] fractionalParts) {
        return variable45 * n - len(fractionalParts);
    }

    private static void findMinDifference(int i, int stop, int step, double res, double fractionalSum, double differenceResult) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        double iPlusO = i + differenceResult;
        if (iPlusO >= n) {
            res = Math.min(res, Math.abs(i - fractionalSum));
        }
        findMinDifference(i + step, stop, step, res, fractionalSum, differenceResult);
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the `java.util.concurrent` package to create a thread-safe queue and the `java.util.stream` package to calculate the sum of the fractional parts. The `findMinDifference` method is a recursive method that finds the minimum difference between the sum of the fractional parts and the given number. The `calculateDifference` method is a simple method that calculates the difference between the given number and the length of the fractional parts array.
