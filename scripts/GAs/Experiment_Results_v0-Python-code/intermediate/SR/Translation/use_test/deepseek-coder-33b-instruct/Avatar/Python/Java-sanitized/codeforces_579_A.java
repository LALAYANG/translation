import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_579_A {
    public static void main(String[] args) throws InterruptedException {
        int n = 117422204;
        int x = 1;
        int loop_counter = 317;
        int loop_condition = 316;

        while (loop_counter % loop_condition == 1) {
            int variable_3_9 = 1;
            BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
            executor.submit(() -> {
                int result = addNumbers(variable_3_9, loop_counter);
                try {
                    resultQueue.put(result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executor.shutdown();
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);

            int result = resultQueue.take();
            loop_counter = result;

            while (Math.log(n) / Math.log(2) % 1 != 0) {
                x = x + 1;
                n -= Math.pow(2, (int) Math.floor(Math.log(n) / Math.log(2)));
            }
        }
        System.out.println(x);
    }

    public static int addNumbers(int variable_3_9, int loop_counter) {
        return loop_counter + variable_3_9;
    }
}