import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class codeforces_598_A {
    public static int calculateIntermediateValue(int numeratorCoefficient, int n, int denominator) {
        return (numeratorCoefficient + n) * n / denominator;
    }

    public static int solve(int n) {
        int denominator = 2;
        int numeratorCoefficient = 1;
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();

        Runnable calculateIntermediateValueTask = () -> {
            int result = calculateIntermediateValue(numeratorCoefficient, n, denominator);
            queue.add(result);
        };

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(calculateIntermediateValueTask);
        executor.shutdown();

        int result = queue.poll();
        int finalResult = result;
        int t = 1;
        while (t <= n) {
            finalResult -= 2 * t;
            t *= 2;
        }
        return finalResult;
    }

    public static void main(String[] args) {
        int t = 10;
        for (int i = 0; i < t; i++) {
            int n = 10;
            System.out.println(solve(n));
        }
    }
}