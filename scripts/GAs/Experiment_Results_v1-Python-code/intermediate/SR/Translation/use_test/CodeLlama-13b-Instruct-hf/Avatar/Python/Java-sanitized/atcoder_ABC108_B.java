import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ABC108_B {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        Future<Integer> future = executor.submit(() -> {
            int x1 = Integer.parseInt(args[0]);
            int y1 = Integer.parseInt(args[1]);
            int x2 = Integer.parseInt(args[2]);
            int y2 = Integer.parseInt(args[3]);

            int differenceX = x2 - x1;
            int differenceY = y2 - y1;

            int x3 = x2 - differenceY;
            int y3 = y2 + differenceX;
            int x4 = x1 - differenceY;
            int y4 = y1 + differenceX;

            return String.format("%d %d %d %d", x3, y3, x4, y4);
        });

        try {
            String result = future.get(10, TimeUnit.SECONDS);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}