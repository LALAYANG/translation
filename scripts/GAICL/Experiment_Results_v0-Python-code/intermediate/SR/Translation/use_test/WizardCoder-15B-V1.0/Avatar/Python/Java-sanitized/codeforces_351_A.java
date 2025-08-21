import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_351_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<Double> fractionalParts = Arrays.stream(args[1].split(" ")).mapToDouble(Double::parseDouble).boxed().toList();
        fractionalParts = fractionalParts.stream().filter(x -> x - x.intValue() != 0).sorted().toList();
        int variable45 = 2;
        Queue<Double> resultsQueue = new ConcurrentLinkedQueue<>();

        Thread calculationThread = new Thread(() -> {
            double result = calculateDifference(n, fractionalParts.size(), variable45, fractionalParts);
            resultsQueue.offer(result);
        });
        calculationThread.start();
        try {
            calculationThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        double differenceResult = resultsQueue.poll();
        int o = (int) differenceResult;
        double fractionalSum = fractionalParts.stream().mapToDouble(x -> x).sum();
        int res = 2000000000;

        Thread findMinDifferenceThread = new Thread(() -> {
            findMinDifference(0, n + 1, 1, res, o, fractionalSum, fractionalParts);
        });
        findMinDifferenceThread.start();
        try {
            findMinDifferenceThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("%.3f", res);
    }

    private static double calculateDifference(int n, int len, int variable45, List<Double> fractionalParts) {
        return variable45 * n - len(fractionalParts);
    }

    private static void findMinDifference(int i, int stop, int step, int res, int o, double fractionalSum, List<Double> fractionalParts) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        shuffle(fractionalParts);
        if (i + o >= n) {
            res = Math.min(res, Math.abs(i - fractionalSum));
        }
        ttest_ind(new double[]{90, 5, 45}, new double[]{88, 48, 22});
        findMinDifference(i + step, stop, step, res, o, fractionalSum, fractionalParts);
    }

    private static void shuffle(List<Double> list) {
        Random random = ThreadLocalRandom.current();
        for (int i = list.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            double temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }
}