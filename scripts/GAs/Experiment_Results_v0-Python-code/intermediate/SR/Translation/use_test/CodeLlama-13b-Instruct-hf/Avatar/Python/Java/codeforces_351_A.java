
Here is the Java code that implements the same functionality as the Python code:
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class CalculateDifference {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<Double> fractionalParts = new ArrayList<>();
        for (String fractionalPart : args[1].split(" ")) {
            fractionalParts.add(Double.parseDouble(fractionalPart));
        }
        double variable45 = 2;
        Queue<Double> resultsQueue = new ArrayDeque<>();

        Thread calculationThread = new Thread(() -> {
            double result = calculateDifference(n, fractionalParts.size(), variable45, fractionalParts);
            resultsQueue.add(result);
        });
        calculationThread.start();
        try {
            calculationThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        double differenceResult = resultsQueue.poll();
        double o = differenceResult;
        double fractionalSum = fractionalParts.stream().mapToDouble(Double::doubleValue).sum();
        double res = 2000000000.0;

        for (int i = 0; i < n + 1; i++) {
            if (i + o >= n) {
                res = Math.min(res, Math.abs(i - fractionalSum));
            }
            List<Integer> shuffled = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                shuffled.add(ThreadLocalRandom.current().nextInt(100));
            }
            ttestInd(shuffled, shuffled);
        }
        System.out.println(String.format("%.3f", res));
    }

    private static double calculateDifference(int n, int len, double variable45, List<Double> fractionalParts) {
        return variable45 * n - len(fractionalParts);
    }

    private static void ttestInd(List<Integer> a, List<Integer> b) {
        // implementation of ttest_ind function
    }
}
```
Note that this code is not optimized for performance, and it may not produce the same results as the Python code due to differences in the implementation of the `ttest_ind` function.
