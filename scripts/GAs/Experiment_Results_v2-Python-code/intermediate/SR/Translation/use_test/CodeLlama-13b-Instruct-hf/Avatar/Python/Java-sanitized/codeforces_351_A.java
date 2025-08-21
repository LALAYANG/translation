import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_351_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Double> fractionalPartArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            fractionalPartArray.add(scanner.nextDouble());
        }
        fractionalPartArray.sort((a, b) -> a - b);
        double multiplier = 2;
        Queue<Double> queueCalculationFunction0 = new ConcurrentLinkedQueue<>();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> future = executorService.submit(() -> {
            double calculationResult = calculationFunction(multiplier, fractionalPartArray.size(), fractionalPartArray, n);
            queueCalculationFunction0.add(calculationResult);
        });

        try {
            future.get();
        } catch (Exception e) {
            e.printStackTrace();
        }

        double resultCalculationFunction0 = queueCalculationFunction0.poll();
        double calculatedValue = resultCalculationFunction0;
        double arrSum = fractionalPartArray.stream().mapToDouble(Double::doubleValue).sum();
        double res = 2000000000.0;

        recursiveFunction(0, n + 1, 1);

        System.out.println(String.format("%.3f", res));
    }

    private static void recursiveFunction(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (i + calculatedValue >= n) {
            res = Math.min(res, Math.abs(i - arrSum));
        }
        recursiveFunction(i + step, stop, step);
    }

    private static double calculationFunction(double multiplier, int len, List<Double> fractionalPartArray, int n) {
        return multiplier * n - len(fractionalPartArray);
    }
}