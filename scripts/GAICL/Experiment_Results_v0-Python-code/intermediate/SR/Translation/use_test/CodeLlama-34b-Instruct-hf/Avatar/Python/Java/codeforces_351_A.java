
Here's the Java code that is equivalent to the Python code you provided:
```java
import java.util.Queue;
import java.util.concurrent.Thread;

public class JavaEquivalent {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double[] fractionalParts = new double[n];
        for (int i = 0; i < n; i++) {
            fractionalParts[i] = Double.parseDouble(args[i + 1]);
        }
        Arrays.sort(fractionalParts);
        int variable45 = 2;
        Queue<Double> resultsQueue = new Queue<>();
        Thread calculationThread = new Thread(() -> {
            double result = calculateDifference(n, fractionalParts.length, variable45, fractionalParts);
            resultsQueue.add(result);
        });
        calculationThread.start();
        calculationThread.join();
        double differenceResult = resultsQueue.poll();
        double fractionalSum = Arrays.stream(fractionalParts).sum();
        double res = 2000000000.0;
        findMinDifference(0, n + 1, 1, differenceResult, fractionalSum, res);
        System.out.printf("%.3f", res);
    }

    private static double calculateDifference(int n, int len, int variable45, double[] fractionalParts) {
        return variable45 * n - len(fractionalParts);
    }

    private static void findMinDifference(int i, int stop, int step, double differenceResult, double fractionalSum, double res) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (i + differenceResult >= n) {
            res = Math.min(res, Math.abs(i - fractionalSum));
        }
        ttestInd([90, 5, 45], [88, 48, 22]);
        findMinDifference(i + step, stop, step, differenceResult, fractionalSum, res);
    }

    private static void ttestInd(double[] arr1, double[] arr2) {
        // Implement t-test here
    }
}
```
Note that I have not implemented the `ttestInd` function as it is not clear what it does or how it is used in the context of the code you provided. You will need to implement this function yourself or replace it with a suitable alternative.

Also, note that the `findMinDifference` function is a recursive function, which means it calls itself repeatedly until a certain condition is met. This can be a potential source of errors or performance issues if the function is not implemented carefully.

I hope this helps! Let me know if you have any questions or need further assistance.
