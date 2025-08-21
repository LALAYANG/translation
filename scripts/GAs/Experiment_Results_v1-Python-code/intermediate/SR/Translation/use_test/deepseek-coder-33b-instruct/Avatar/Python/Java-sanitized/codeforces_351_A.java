import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Thread;

public class codeforces_351_A {
    public static void main(String[] args) throws InterruptedException {
        int n = 1;
        List<Double> fractionalParts = new ArrayList<>();
        fractionalParts.add(0.014);
        Collections.sort(fractionalParts);
        int multiplier = 2;
        BlockingQueue<Double> queueCalculate0 = new LinkedBlockingQueue<>();

        Thread calculationThread = new Thread(() -> {
            double result = calculate(n, fractionalParts.size(), multiplier, fractionalParts);
            try {
                queueCalculate0.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        calculationThread.start();
        calculationThread.join();
        double resultCalculation = queueCalculate0.poll();
        double o = resultCalculation;
        double arrSum = fractionalParts.stream().mapToDouble(Double::doubleValue).sum();
        double res = Integer.MAX_VALUE;

        recursiveLoop(0, n + 1, 1, o, arrSum, res);
        System.out.printf("%.3f\n", res);
    }

    private static double calculate(int n, int len, int multiplier, List<Double> fractionalParts) {
        return multiplier * n - len;
    }

    private static void recursiveLoop(double i, double stop, double step, double o, double arrSum, double res) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (i + o >= stop) {
            res = Math.min(res, Math.abs(i - arrSum));
        }
        recursiveLoop(i + step, stop, step, o, arrSum, res);
    }
}