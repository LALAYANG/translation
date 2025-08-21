import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_351_A {
    private static double res = 2000000000.0;
    private static double o;
    private static double variable_4_5 = 2;
    private static int n;
    private static double[] fractionalParts;
    private static double fractionalSum;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        fractionalParts = new double[n];
        for (int i = 0; i < n; i++) {
            fractionalParts[i] = scanner.nextDouble();
        }
        Arrays.sort(fractionalParts);
        fractionalParts = Arrays.stream(fractionalParts).filter(x -> x - (int) x != 0).toArray();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> future = executorService.submit(() -> calculateDifference(n, variable_4_5, fractionalParts));
        o = future.get();
        executorService.shutdown();
        fractionalSum = Arrays.stream(fractionalParts).sum();
        findMinDifference(0, n + 1, 1);
        System.out.printf("%.3f", res);
    }

    private static double calculateDifference(int n, double variable_4_5, double[] fractionalParts) {
        return variable_4_5 * n - fractionalParts.length;
    }

    private static void findMinDifference(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (i + o >= n) {
            res = Math.min(res, Math.abs(i - fractionalSum));
        }
        findMinDifference(i + step, stop, step);
    }
}