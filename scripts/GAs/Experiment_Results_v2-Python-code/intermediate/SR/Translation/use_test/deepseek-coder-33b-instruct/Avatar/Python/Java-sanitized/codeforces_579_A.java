import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_579_A {
    private static int calculation(int operand, int calculationResult) {
        return calculationResult + operand;
    }

    public static void main(String[] args) throws InterruptedException {
        int n = 117422204;
        int calculationResult = 1;
        int loopCounterOuter = 74;
        int loopBoundOuter = 73;

        while (loopCounterOuter % loopBoundOuter == 1) {
            loopCounterOuter = loopCounterOuter + 1;
            while (Math.log(n) % 1 != 0) {
                int operand = 1;
                BlockingQueue<Integer> calculationQueue = new LinkedBlockingQueue<>();

                ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
                executor.submit(() -> {
                    int result = calculation(operand, calculationResult);
                    try {
                        calculationQueue.put(result);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                executor.shutdown();
                executor.awaitTermination(1, TimeUnit.SECONDS);

                int resultCalculation0 = calculationQueue.take();
                calculationResult = resultCalculation0;
                n -= Math.pow(2, (int) Math.floor(Math.log(n) / Math.log(2)));
            }
        }
        System.out.println(calculationResult);
    }
}