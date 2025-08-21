import java.util.concurrent.Thread;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ABC108_B {
    public static void main(String[] args) {
        int x1 = Integer.parseInt(args[0]);
        int y1 = Integer.parseInt(args[1]);
        int x2 = Integer.parseInt(args[2]);
        int y2 = Integer.parseInt(args[3]);

        BlockingQueue<Integer> queueDiffX = new LinkedBlockingQueue<>();
        BlockingQueue<Integer> queueDiffY = new LinkedBlockingQueue<>();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 2, 10, TimeUnit.SECONDS, new LinkedBlockingQueue<>());

        executor.execute(() -> {
            int diffX = x2 - x1;
            queueDiffX.put(diffX);
        });

        executor.execute(() -> {
            int diffY = y2 - y1;
            queueDiffY.put(diffY);
        });

        int x3 = x2 - queueDiffY.take();
        int y3 = y2 + queueDiffX.take();
        int x4 = x1 - queueDiffY.take();
        int y4 = y1 + queueDiffX.take();

        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }
}