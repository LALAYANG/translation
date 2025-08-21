import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_351_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] fractionalParts = new double[n];
        for (int i = 0; i < n; i++) {
            fractionalParts[i] = scanner.nextDouble();
        }
        scanner.close();

        double[] sortedFractionalParts = new double[n];
        int sortedFractionalPartsIndex = 0;
        for (int i = 0; i < n; i++) {
            double fractionalPart = fractionalParts[i];
            if (fractionalPart - (int) fractionalPart != 0) {
                sortedFractionalParts[sortedFractionalPartsIndex] = fractionalPart;
                sortedFractionalPartsIndex++;
            }
        }

        double[] sortedFractionalPartsCopy = new double[sortedFractionalPartsIndex];
        for (int i = 0; i < sortedFractionalPartsIndex; i++) {
            sortedFractionalPartsCopy[i] = sortedFractionalParts[i];
        }

        double sum = 0;
        for (int i = 0; i < sortedFractionalPartsIndex; i++) {
            sum += sortedFractionalPartsCopy[i];
        }

        double multiplier = 2;
        Queue<Double> queue = new LinkedBlockingQueue<>();
        Thread thread = new Thread(() -> {
            double result = calculate(n, sortedFractionalPartsIndex, multiplier, sortedFractionalPartsCopy);
            queue.add(result);
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        double result = queue.poll();
        double o = result;

        double res = 2000000000.0;
        recursiveLoop(0, n + 1, 1, sortedFractionalPartsCopy, sum, res);
        System.out.printf("%.3f", res);
    }

    public static double calculate(int n, int len, double multiplier, double[] fractionalParts) {
        return multiplier * n - len;
    }

    public static void recursiveLoop(int i, int stop, int step, double[] sortedFractionalPartsCopy, double sum, double res) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (i + o >= n) {
            res = Math.min(res, Math.abs(i - sum));
        }
        recursiveLoop(i + step, stop, step, sortedFractionalPartsCopy, sum, res);
    }
}