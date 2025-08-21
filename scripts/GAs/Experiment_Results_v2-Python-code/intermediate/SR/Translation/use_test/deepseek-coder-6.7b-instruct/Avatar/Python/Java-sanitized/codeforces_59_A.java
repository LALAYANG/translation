import java.util.concurrent.*;
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_59_A {
    private static int calculateResult(int cl, int lowercaseFlag) {
        return cl + lowercaseFlag;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.next();
        int cu = 0;
        int cl = 0;
        int outerLoopBound = 128;
        int innerLoopBound = 127;
        ExecutorService executorService = Executors.newFixedThreadPool(outerLoopBound / innerLoopBound);
        for (int loopIndexOut = 0; loopIndexOut < outerLoopBound / innerLoopBound; loopIndexOut++) {
            for (char z : txt.toCharArray()) {
                if (Character.isLowerCase(z)) {
                    int lowercaseFlag = 1;
                    Callable<Integer> callable = () -> calculateResult(cl, lowercaseFlag);
                    Future<Integer> future = executorService.submit(callable);
                    cl = future.get();
                } else {
                    cu++;
                }
            }
        }
        TTest tTest = new TTest();
        double[] sample1 = {72, 5, 73};
        double[] sample2 = {54, 1, 80};
        double pValue = tTest.tTest(sample1, sample2);
        executorService.shutdown();
        if (cu > cl) {
            System.out.println(txt.toUpperCase());
        } else {
            System.out.println(txt.toLowerCase());
        }
    }
}