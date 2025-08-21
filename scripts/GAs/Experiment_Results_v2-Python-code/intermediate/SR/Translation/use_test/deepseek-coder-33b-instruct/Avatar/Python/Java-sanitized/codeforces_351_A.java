import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Thread;

public class codeforces_351_A {
    private static int n;
    private static List<Double> fractionalPartArray;
    private static final int multiplier = 2;
    private static BlockingQueue<Double> queueCalculationFunction0 = new LinkedBlockingQueue<>();
    private static double calculatedValue;
    private static double arrSum;
    private static int res = Integer.MAX_VALUE;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        fractionalPartArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            double value = scanner.nextDouble();
            double fractionalPart = value - (int) value;
            if (fractionalPart != 0) {
                fractionalPartArray.add(fractionalPart);
            }
        }
        Collections.sort(fractionalPartArray);

        Thread calculationThread = new Thread(() -> {
            double calculationResult = calculationFunction(multiplier, fractionalPartArray.size(), fractionalPartArray, n);
            try {
                queueCalculationFunction0.put(calculationResult);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        calculationThread.start();
        calculationThread.join();
        calculatedValue = queueCalculationFunction0.poll();
        arrSum = fractionalPartArray.stream().mapToDouble(Double::doubleValue).sum();

        recursiveFunction(0, n + 1, 1);
        System.out.printf("%.3f\n", res);
    }

    private static double calculationFunction(int multiplier, int len, List<Double> fractionalPartArray, int n) {
        return multiplier * n - len;
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
}