import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC153_A {
    public static void main(String[] args) {
        int totalItems, a, sho, remainderItems, incrementValue;
        String[] input = args[0].split(" ");
        totalItems = Integer.parseInt(input[0]);
        a = Integer.parseInt(input[1]);
        sho = totalItems / a;
        remainderItems = totalItems % a;
        if (remainderItems != 0) {
            incrementValue = 1;
            ExecutorService executor = Executors.newFixedThreadPool(1);
            LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

            Runnable runnable = () -> {
                int resultSho = calculateSho(incrementValue, sho);
                queue.offer(resultSho);
            };
            executor.execute(runnable);
            try {
                int result = queue.poll(1, TimeUnit.SECONDS);
                if (result != null) {
                    sho = result;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            executor.shutdown();
        }
        System.out.println(sho);
    }

    private static int calculateSho(int incrementValue, int sho) {
        return sho + incrementValue;
    }
}