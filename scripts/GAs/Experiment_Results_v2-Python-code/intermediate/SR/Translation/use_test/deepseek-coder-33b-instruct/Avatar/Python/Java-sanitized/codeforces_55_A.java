import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_55_A {
    public static void main(String[] args) throws Exception {
        int inputNumber = 10;
        while (inputNumber % 2 == 0) {
            int divisor = 2;
            BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
            executor.submit(() -> {
                try {
                    queue.put(divisionOperation(inputNumber, divisor));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);
            inputNumber = queue.take();
        }
        if (inputNumber == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static int divisionOperation(int inputNumber, int divisor) {
        return inputNumber / divisor;
    }
}