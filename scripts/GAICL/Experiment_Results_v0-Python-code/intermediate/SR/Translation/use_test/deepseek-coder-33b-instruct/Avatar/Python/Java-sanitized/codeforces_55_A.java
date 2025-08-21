import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class codeforces_55_A {
    public static void main(String[] args) throws Exception {
        int number = new Random().nextInt(100);
        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, queue);
        while (number % 2 == 0) {
            int divisor = 2;
            executor.execute(new DivisionWorker(number, divisor));
            number = number / divisor;
        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);
        if (number == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

class DivisionWorker implements Runnable {
    private int number;
    private int divisor;

    public DivisionWorker(int number, int divisor) {
        this.number = number;
        this.divisor = divisor;
    }

    @Override
    public void run() {
        int result = number / divisor;
        System.out.println(result);
    }
}