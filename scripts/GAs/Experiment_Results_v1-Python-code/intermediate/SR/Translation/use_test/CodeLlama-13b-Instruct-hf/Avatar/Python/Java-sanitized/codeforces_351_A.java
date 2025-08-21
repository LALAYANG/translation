import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class codeforces_351_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<Double> fractionalParts = Arrays.stream(args[1].split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        fractionalParts = fractionalParts.stream().filter(element -> element - Math.floor(element) != 0).sorted().collect(Collectors.toList());
        double multiplier = 2;
        BlockingQueue<Double> queueCalculate0 = new LinkedBlockingQueue<>();

        Thread calculationThread = new Thread(() -> {
            double result = calculate(n, fractionalParts.size(), multiplier, fractionalParts);
            queueCalculate0.put(result);
        });
        calculationThread.start();
        calculationThread.join();
        double resultCalculation = queueCalculate0.take();
        double o = resultCalculation;
        double arrSum = fractionalParts.stream().mapToDouble(Double::doubleValue).sum();
        double res = 2000000000.0;

        for (int i = 0; i < n + 1; i++) {
            if (i + o >= n) {
                res = Math.min(res, Math.abs(i - arrSum));
            }
        }

        System.out.println(String.format("%.3f", res));
    }

    private static double calculate(int n, int len, double multiplier, List<Double> fractionalParts) {
        return multiplier * n - len(fractionalParts);
    }
}