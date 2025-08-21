import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_351_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Double> fractionalParts = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            double fractionalPart = scanner.nextDouble() - (int) scanner.nextDouble();
            if (fractionalPart != 0) {
                fractionalParts.add(fractionalPart);
            }
        }
        scanner.close();
        Collections.sort(fractionalParts);
        int variable45 = 2;
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<Integer> callable = () -> calculateDifference(n, fractionalParts.size(), variable45, fractionalParts);
        Future<Integer> future = executor.submit(callable);
        int differenceResult = future.get();
        int o = differenceResult;
        double fractionalSum = 0;
        for (double fractionalPart : fractionalParts) {
            fractionalSum += fractionalPart;
        }
        int res = 2000000000;
        findMinDifference(0, n + 1, 1, o, fractionalSum, res);
        System.out.printf("%.3f", res);
    }

    public static int calculateDifference(int n, int len, int variable45, List<Double> fractionalParts) {
        return variable45 * n - len;
    }

    public static void findMinDifference(int i, int stop, int step, int o, double fractionalSum, int res) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (i + o >= n) {
            res = Math.min(res, Math.abs(i - fractionalSum));
        }
        findMinDifference(i + step, stop, step, o, fractionalSum, res);
    }
}