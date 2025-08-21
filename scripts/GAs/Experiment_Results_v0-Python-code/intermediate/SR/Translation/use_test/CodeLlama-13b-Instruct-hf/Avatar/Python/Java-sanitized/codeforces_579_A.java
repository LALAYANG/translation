import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_579_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int x = 1;
        int loopCounter = 317;
        int loopCondition = 316;
        while (loopCounter % loopCondition == 1) {
            int variable39 = 1;
            BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<Integer> future = executor.submit(() -> {
                int result = addNumbers(variable39, loopCounter);
                resultQueue.put(result);
                return result;
            });

            try {
                int result = future.get(10, TimeUnit.SECONDS);
                loopCounter = result;
            } catch (Exception e) {
                e.printStackTrace();
            }

            while (Math.log2(n) % 1 != 0) {
                x = x + 1;
                n -= 2 * (int) Math.pow(2, Math.log2(n));
            }
        }
        System.out.println(x);
    }

    private static int addNumbers(int variable39, int loopCounter) {
        return loopCounter + variable39;
    }
}