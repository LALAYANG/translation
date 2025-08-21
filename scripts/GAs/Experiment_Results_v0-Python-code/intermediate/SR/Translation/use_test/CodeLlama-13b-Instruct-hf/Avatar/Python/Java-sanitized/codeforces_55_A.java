import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_55_A {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int divisor = 2;
        BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> {
            int result = divideNumbers(number, divisor);
            resultQueue.put(result);
            return result;
        });

        try {
            int divisionResult = future.get(10, TimeUnit.SECONDS);
            number = divisionResult;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        }

        if (number == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static int divideNumbers(int number, int divisor) {
        return number / divisor;
    }
}