import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_351_A {
    private static int n;
    private static List<Double> fractionalParts;
    private static double variable_4_5;
    private static BlockingQueue<Double> resultsQueue = new LinkedBlockingQueue<>();
    private static double o;
    private static double fractionalSum;
    private static double res;

    public static void main(String[] args) throws InterruptedException {
        n = 1;
        fractionalParts = Stream.of(6418.000, 157.986)
                .map(x -> x - (int) x)
                .filter(x -> x != 0)
                .sorted()
                .collect(Collectors.toList());
        variable_4_5 = 2;

        Thread calculationThread = new Thread(() -> {
            double result = calculateDifference(n, fractionalParts.size(), variable_4_5, fractionalParts);
            try {
                resultsQueue.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        calculationThread.start();
        calculationThread.join();
        o = resultsQueue.poll();
        fractionalSum = fractionalParts.stream().mapToDouble(Double::doubleValue).sum();
        res = Integer.MAX_VALUE;

        findMinDifference(0, n + 1, 1);
        System.out.printf("%.3f%n", res);
    }

    private static double calculateDifference(int n, int len, double variable_4_5, List<Double> fractionalParts) {
        return variable_4_5 * n - len;
    }

    private static void findMinDifference(double i, double stop, double step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 84, 24, 88);
        Collections.shuffle(list);
        if (i + o >= n) {
            res = Math.min(res, Math.abs(i - fractionalSum));
        }
        new TTest().tTest(new double[]{90, 5, 45}, new double[]{88, 48, 22});
        findMinDifference(i + step, stop, step);
    }
}