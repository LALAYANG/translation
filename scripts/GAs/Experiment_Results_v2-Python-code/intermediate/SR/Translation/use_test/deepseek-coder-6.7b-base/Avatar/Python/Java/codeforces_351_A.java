```
import java.util.Scanner;
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] fractionalPartArray = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        Arrays.sort(fractionalPartArray);
        double multiplier = 2;
        Queue<Double> queueCalculationFunction0 = new LinkedBlockingQueue<>();
        Thread calculationThread = new Thread(() -> {
            double calculationResult = calculationFunction(multiplier, fractionalPartArray.length, fractionalPartArray, n);
            queueCalculationFunction0.add(calculationResult);
        });
        calculationThread.start();
        try {
            calculationThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        double resultCalculationFunction0 = queueCalculationFunction0.poll();
        double calculatedValue = resultCalculationFunction0;
        double arrSum = Arrays.stream(fractionalPartArray).sum();
        double res = 2000000000.0;
        recursiveFunction(0, n + 1, 1, arrSum, res);
        System.out.printf("%.3f", res);
    }

    public static double calculationFunction(double multiplier, int len, double[] fractionalPartArray, int n) {
        return multiplier * n - len;
    }

    public static void recursiveFunction(double i, double stop, double step, double arrSum, double res) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (i + calculatedValue >= n) {
            res = Math.min(res, Math.abs(i - arrSum));
        }
        recursiveFunction(i + step, stop, step, arrSum, res);
    }
}
```

