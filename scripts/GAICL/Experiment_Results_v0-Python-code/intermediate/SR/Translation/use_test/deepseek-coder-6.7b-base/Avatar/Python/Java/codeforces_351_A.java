```
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int n = Integer.parseInt(System.console().readLine());
        double[] fractionalParts = Stream.of(System.console().readLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .filter(x -> x - (int) x != 0)
                .sorted()
                .toArray();
        double variable45 = 2;
        Queue<Double> resultQueue = new ConcurrentLinkedQueue<>();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> resultQueue.add(calculateDifference(n, fractionalParts, variable45)));
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);
        double differenceResult = resultQueue.poll();
        double fractionalSum = IntStream.range(0, fractionalParts.length)
                .mapToDouble(i -> fractionalParts[i])
                .sum();
        AtomicReference<Double> result = new AtomicReference<>(Double.MAX_VALUE);
        findMinDifference(0, n + 1, 1, fractionalSum, differenceResult, result);
        System.out.printf("%.3f", result.get());
    }

    private static void findMinDifference(int i, int stop, int step, double fractionalSum, double differenceResult, AtomicReference<Double> result) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (i + differenceResult >= n) {
            result.set(Math.min(result.get(), Math.abs(i - fractionalSum)));
        }
        findMinDifference(i + step, stop, step, fractionalSum, differenceResult, result);
    }

    private static double calculateDifference(int n, double[] fractionalParts, double variable45) {
        return variable45 * n - fractionalParts.length;
    }
}
```

