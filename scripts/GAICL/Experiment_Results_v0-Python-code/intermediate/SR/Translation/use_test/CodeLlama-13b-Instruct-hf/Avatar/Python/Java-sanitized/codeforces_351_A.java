import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_351_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<Double> fractionalParts = new ArrayList<>();
        for (String part : args[1].split(" ")) {
            fractionalParts.add(Double.parseDouble(part));
        }
        fractionalParts.sort((a, b) -> a - b);
        double variable45 = 2;
        Queue<Double> resultsQueue = new ArrayBlockingQueue<>(1);

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Double> future = executor.submit(() -> {
            double result = calculateDifference(n, fractionalParts.size(), variable45, fractionalParts);
            resultsQueue.put(result);
            return result;
        });

        try {
            double differenceResult = future.get();
            double o = differenceResult;
            double fractionalSum = fractionalParts.stream().mapToDouble(Double::doubleValue).sum();
            double res = 2000000000.0;

            for (int i = 0; i < n + 1; i++) {
                if (i + o >= n) {
                    res = Math.min(res, Math.abs(i - fractionalSum));
                }
                ttestInd(new double[] {90, 5, 45}, new double[] {88, 48, 22});
            }

            System.out.println(String.format("%.3f", res));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }

    private static double calculateDifference(int n, int len, double variable45, List<Double> fractionalParts) {
        return variable45 * n - len(fractionalParts);
    }

    private static void ttestInd(double[] arr1, double[] arr2) {
        // implementation of ttest_ind from scipy.stats
    }
}