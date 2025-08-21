import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_598_A {

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(System.console().readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(System.console().readLine());
            System.out.println(solve(n));
        }
    }

    public static int calculateIntermediateValue(int numeratorCoefficient, int n, int denominator) {
        return (numeratorCoefficient + n) * n / denominator;
    }

    public static int solve(int n) throws Exception {
        int denominator = 2;
        int numeratorCoefficient = 1;
        Queue<Integer> queueCalculateIntermediateValue0 = new ConcurrentLinkedQueue<>();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<?> futureCalculateIntermediateValue0 = executorService.submit(() -> {
            int result = calculateIntermediateValue(numeratorCoefficient, n, denominator);
            queueCalculateIntermediateValue0.add(result);
        });
        futureCalculateIntermediateValue0.get();
        int resultCalculateIntermediateValue0 = queueCalculateIntermediateValue0.poll();
        int finalResult = resultCalculateIntermediateValue0;
        int t = 1;
        while (t <= n) {
            finalResult -= 2 * t;
            t = t * 2;
        }
        return finalResult;
    }
}