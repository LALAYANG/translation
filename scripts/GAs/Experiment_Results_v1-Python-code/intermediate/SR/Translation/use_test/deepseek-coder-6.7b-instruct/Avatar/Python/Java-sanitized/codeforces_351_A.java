import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_351_A {
    private static class CalculationThread implements Runnable {
        private int n;
        private double[] fractionalParts;
        private double multiplier;
        private int len;
        private int result;

        public CalculationThread(int n, int len, double multiplier, double[] fractionalParts) {
            this.n = n;
            this.len = len;
            this.multiplier = multiplier;
            this.fractionalParts = fractionalParts;
        }

        @Override
        public void run() {
            result = (int) (multiplier * n - len);
        }

        public int getResult() {
            return result;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] fractionalParts = new double[n];
        for (int i = 0; i < n; i++) {
            fractionalParts[i] = scanner.nextDouble();
        }
        Arrays.sort(fractionalParts);
        double multiplier = 2;
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        CalculationThread calculationThread = new CalculationThread(n, (int) Arrays.stream(fractionalParts).filter(value -> value - (int) value != 0).count(), multiplier, fractionalParts);
        Future<?> future = executorService.submit(calculationThread);
        future.get();
        int o = calculationThread.getResult();
        double arrSum = Arrays.stream(fractionalParts).sum();
        int res = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            res = Math.min(res, Math.abs(i - arrSum));
        }
        System.out.printf("%.3f\n", (double) res);
        executorService.shutdown();
    }
}