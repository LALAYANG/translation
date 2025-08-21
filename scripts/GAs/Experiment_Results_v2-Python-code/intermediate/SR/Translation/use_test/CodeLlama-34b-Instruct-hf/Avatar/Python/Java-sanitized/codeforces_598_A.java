import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class codeforces_598_A {
    public static void main(String[] args) {
        int t = Integer.parseInt(args[0]);
        ExecutorService executor = Executors.newFixedThreadPool(t);
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(args[i + 1]);
            Future<Integer> future = executor.submit(() -> solve(n));
            try {
                System.out.println(future.get(10, TimeUnit.SECONDS));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }

    public static int solve(int n) {
        int denominator = 2;
        int numeratorCoefficient = 1;
        int queueCalculateIntermediateValue0 = 0;

        Runnable calculateIntermediateValueThread = () -> {
            int result = calculateIntermediateValue(numeratorCoefficient, n, denominator);
            queueCalculateIntermediateValue0 = result;
        };
        Thread threadCalculateIntermediateValue0 = new Thread(calculateIntermediateValueThread);
        threadCalculateIntermediateValue0.start();
        threadCalculateIntermediateValue0.join();
        int resultCalculateIntermediateValue0 = queueCalculateIntermediateValue0;
        int finalResult = resultCalculateIntermediateValue0;
        int t = 1;
        while (t <= n) {
            finalResult -= 2 * t;
            t = t * 2;
        }
        return finalResult;
    }

    public static int calculateIntermediateValue(int numeratorCoefficient, int n, int denominator) {
        return (numeratorCoefficient + n) * n / denominator;
    }
}