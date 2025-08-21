Here is the Java translation of the Python code:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int n = 1;
        List<Double> fractionalParts = Stream.of(6418.000, 157.986)
                .map(x -> x - Math.floor(x))
                .filter(x -> x != 0)
                .sorted()
                .collect(Collectors.toList());
        int variable_4_5 = 2;
        BlockingQueue<Double> resultsQueue = new LinkedBlockingQueue<>();

        Thread calculationThread = new Thread(() -> {
            double result = calculateDifference(n, fractionalParts.size(), variable_4_5, fractionalParts);
            try {
                resultsQueue.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        calculationThread.start();
        calculationThread.join();
        double differenceResult = resultsQueue.poll();
        double o = differenceResult;
        double fractionalSum = fractionalParts.stream().mapToDouble(Double::doubleValue).sum();
        int res = Integer.MAX_VALUE;

        findMinDifference(0, n + 1, 1, res, fractionalSum, o);
        System.out.printf("%.3f%n", res);
    }

    private static double calculateDifference(int n, int len, int variable_4_5, List<Double> fractionalParts) {
        return variable_4_5 * n - len;
    }

    private static void findMinDifference(int i, int stop, int step, int res, double fractionalSum, double o) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 84, 24, 88);
        Collections.shuffle(list);
        if (i + o >= stop) {
            res = Math.min(res, Math.abs(i - fractionalSum));
        }
        findMinDifference(i + step, stop, step, res, fractionalSum, o);
    }
}
```

Please note that the `ttest_ind` function from scipy.stats is not available in Java, so it is not used in the translation. Also, the `shuffle` function from sklearn.utils is replaced with `Collections.shuffle`.

The `calculate_difference` function is translated to a static method `calculateDifference`. The `find_min_difference` function is translated to a static method `findMinDifference`. The `results_queue` is replaced with a `BlockingQueue`. The `input` function is replaced with hardcoded values. The `print` function is replaced with `System.out.printf`.

Please note that the translation is not perfect and may not work as expected. The translation is based on the assumption that the original Python code is correct and the translation is based on the best guess of the original Python code's functionality.

