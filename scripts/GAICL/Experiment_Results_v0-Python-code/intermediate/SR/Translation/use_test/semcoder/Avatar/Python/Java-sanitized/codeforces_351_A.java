import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class codeforces_351_A {
    public static void main(String[] args) {
        int n = 6418;
        double[] fractionalParts = {157.986};
        fractionalParts = Arrays.stream(fractionalParts).map(x -> x - (int) x).filter(x -> x != 0).sorted().toArray();
        double variable45 = 2;
        Queue<Double> resultsQueue = new ConcurrentLinkedQueue<>();

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> resultsQueue.add(calculateDifference(n, fractionalParts.length, variable45, fractionalParts)));
        executor.shutdown();

        double differenceResult = resultsQueue.poll();
        double o = differenceResult;
        double fractionalSum = Arrays.stream(fractionalParts).sum();
        double res = 2000000000.0;

        findMinDifference(0, n + 1, 1, fractionalParts, fractionalSum, variable45, o, res);
        System.out.printf("%.3f%n", res);
    }

    private static double calculateDifference(int n, int len, double variable45, double[] fractionalParts) {
        return variable45 * n - len;
    }

    private static void findMinDifference(int i, int stop, int step, double[] fractionalParts, double fractionalSum, double variable45, double o, double res) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (i + o >= fractionalParts.length) {
            res = Math.min(res, Math.abs(i - fractionalSum));
        }
        findMinDifference(i + step, stop, step, fractionalParts, fractionalSum, variable45, o, res);
    }
}