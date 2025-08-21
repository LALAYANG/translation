import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_379_A {
    public static void main(String[] args) throws InterruptedException {
        int whole_candles = 3;
        int b = 2;
        int s = 0;
        int restoSciolte = 0;
        int current_value = 637;
        int loop_bound = 636;

        while (current_value % loop_bound == 1) {
            int increment = 1;
            BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
            executor.submit(() -> {
                int sumResult = calculateSum(current_value, increment);
                try {
                    resultQueue.put(sumResult);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);

            int calculatedValue = resultQueue.take();
            current_value = calculatedValue;

            while (whole_candles > 0 || restoSciolte >= b) {
                whole_candles += restoSciolte / b;
                restoSciolte = restoSciolte % b;
                s += whole_candles;
                restoSciolte += whole_candles % b;
                whole_candles /= b;
            }
        }

        System.out.println(s);
    }

    private static int calculateSum(int current_value, int increment) {
        return current_value + increment;
    }
}