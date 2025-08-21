import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC149_B {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int firstValue = scanner.nextInt();
        int thirdValue = scanner.nextInt();
        int cookieValues = scanner.nextInt();

        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
        executor.submit(() -> {
            try {
                queue.put(calculateDifference(thirdValue, firstValue));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);

        int result = queue.take();
        int leftOver = result;
        int takahashi = Math.max(0, leftOver);
        System.out.println(takahashi + " " + (cookieValues > 0 ? cookieValues : Math.max(0, cookieValues - Math.abs(leftOver))));
    }

    private static int calculateDifference(int thirdValue, int firstValue) {
        return firstValue - thirdValue;
    }
}