import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class atcoder_AGC003_C {
    public static void main(String[] args) {
        int N = 10;
        int element = 100;
        int variable_3_9 = 2;

        Callable<Integer> calculateRemainder = MyDecorator.decorate(() -> {
            return element % N % variable_3_9;
        });

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(calculateRemainder);
        int result = future.get();
        System.out.println(result);
    }
}