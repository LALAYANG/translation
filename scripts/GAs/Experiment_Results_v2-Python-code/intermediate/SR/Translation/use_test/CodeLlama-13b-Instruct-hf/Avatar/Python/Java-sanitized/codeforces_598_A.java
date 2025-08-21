import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class codeforces_598_A {
    public static void main(String[] args) {
        int t = Integer.parseInt(args[0]);
        ExecutorService executor = Executors.newFixedThreadPool(t);
        for (int i = 0; i < t; i++) {
            Future<Integer> future = executor.submit(() -> {
                int n = Integer.parseInt(args[i + 1]);
                int denominator = 2;
                int numeratorCoefficient = 1;
                int result = calculateIntermediateValue(numeratorCoefficient, n, denominator);
                int finalResult = result;
                int t = 1;
                while (t <= n) {
                    finalResult -= 2 * t;
                    t *= 2;
                }
                return finalResult;
            });
            try {
                System.out.println(future.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }

    private static int calculateIntermediateValue(int numeratorCoefficient, int n, int denominator) {
        return (numeratorCoefficient + n) * n / denominator;
    }
}