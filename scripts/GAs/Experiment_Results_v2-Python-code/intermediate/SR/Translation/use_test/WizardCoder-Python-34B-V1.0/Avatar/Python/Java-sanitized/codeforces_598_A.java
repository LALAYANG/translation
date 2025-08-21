import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class codeforces_598_A {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int t = Integer.parseInt(args[0]);
        ExecutorService executor = Executors.newFixedThreadPool(1);
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(args[i+1]);
            Future<Integer> future = executor.submit(new CalculateIntermediateValue(n));
            int result = future.get();
            int finalResult = result;
            int t = 1;
            while (t <= n) {
                finalResult -= 2 * t;
                t *= 2;
            }
            System.out.println(finalResult);
        }
        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
    }
}

class CalculateIntermediateValue implements Callable<Integer> {
    private int n;
    private int denominator = 2;
    private int numerator_coefficient = 1;

    public CalculateIntermediateValue(int n) {
        this.n = n;
    }

    public Integer call() {
        return calculateIntermediateValue(numerator_coefficient, n, denominator);
    }

    private int calculateIntermediateValue(int numerator_coefficient, int n, int denominator) {
        return (numerator_coefficient + n) * n / denominator;
    }
}