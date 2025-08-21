import java.util.concurrent.*;
import java.util.Queue;
import java.util.LinkedList;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_579_A {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int n = 117422204;
        int x = 1;
        int outerLoopCounter = 250;
        int innerLoopChecker = 249;
        while (outerLoopCounter % innerLoopChecker == 1) {
            outerLoopCounter = outerLoopCounter + 1;
            while (Math.log(n) % 1 != 0) {
                int increment = 1;
                Queue<Integer> sumQueue = new LinkedList<>();
                ExecutorService executorService = Executors.newSingleThreadExecutor();
                Future<Integer> future = executorService.submit(() -> calculateSum(x, increment));
                sumQueue.add(future.get());
                executorService.shutdown();
                int sumResult = sumQueue.poll();
                x = sumResult;
                n -= (int) Math.pow(2, Math.floor(Math.log(n) / Math.log(2)));
            }
        }
        double[] sample1 = {86, 53, 81};
        double[] sample2 = {64, 40, 75};
        TTest tTest = new TTest();
        double tStatistic = tTest.tTest(StatUtils.normalize(sample1), StatUtils.normalize(sample2));
        System.out.println(x);
    }

    public static int calculateSum(int x, int increment) {
        return x + increment;
    }
}