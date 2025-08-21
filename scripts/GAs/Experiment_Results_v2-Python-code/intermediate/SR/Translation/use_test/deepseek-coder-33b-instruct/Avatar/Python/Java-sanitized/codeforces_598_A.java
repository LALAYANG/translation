import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_598_A {
    private static int calculateIntermediateValue(int numeratorCoefficient, int n, int denominator) {
        return (numeratorCoefficient + n) * n / denominator;
    }

    private static int solve(int n) {
        int denominator = 2;
        int numeratorCoefficient = 1;
        BlockingQueue<Integer> queueCalculateIntermediateValue0 = new LinkedBlockingQueue<>();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        executor.execute(() -> {
            try {
                int result = calculateIntermediateValue(numeratorCoefficient, n, denominator);
                queueCalculateIntermediateValue0.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executor.shutdown();

        int resultCalculateIntermediateValue0 = 0;
        try {
            resultCalculateIntermediateValue0 = queueCalculateIntermediateValue0.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int finalResult = resultCalculateIntermediateValue0;
        int t = 1;
        while (t <= n) {
            finalResult -= 2 * t;
            t = t * 2;
        }
        return finalResult;
    }

    public static void main(String[] args) {
        int t = 10;
        for (int i = 0; i < t; i++) {
            int n = i + 1;
            System.out.println(solve(n));
        }
    }
}