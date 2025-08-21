import java.util.concurrent.Thread;
import java.util.concurrent.Queue;

public class codeforces_351_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double[] fractionalPartArray = new double[n];
        for (int i = 0; i < n; i++) {
            fractionalPartArray[i] = Double.parseDouble(args[i + 1]);
        }
        Arrays.sort(fractionalPartArray);
        int multiplier = 2;
        Queue<Double> queueCalculationFunction0 = new Queue<>();

        Thread calculationThread = new Thread(() -> {
            double calculationResult = calculationFunction(multiplier, fractionalPartArray.length, fractionalPartArray, n);
            queueCalculationFunction0.add(calculationResult);
        });
        calculationThread.start();
        calculationThread.join();
        double resultCalculationFunction0 = queueCalculationFunction0.poll();
        double calculatedValue = resultCalculationFunction0;
        double arrSum = Arrays.stream(fractionalPartArray).sum();
        double res = 2000000000.0;

        recursiveFunction(0, n + 1, 1, calculatedValue, arrSum, res);
        System.out.printf("%.3f", res);
    }

    private static void recursiveFunction(int i, int stop, int step, double calculatedValue, double arrSum, double res) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (i + calculatedValue >= n) {
            res = Math.min(res, Math.abs(i - arrSum));
        }
        recursiveFunction(i + step, stop, step, calculatedValue, arrSum, res);
    }

    private static double calculationFunction(int multiplier, int len, double[] fractionalPartArray, int n) {
        return multiplier * n - len(fractionalPartArray);
    }
}