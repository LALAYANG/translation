import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC108_B {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<Integer> future1 = executor.submit(() -> {
            int x1 = Integer.parseInt(args[0]);
            int y1 = Integer.parseInt(args[1]);
            int x2 = Integer.parseInt(args[2]);
            int y2 = Integer.parseInt(args[3]);

            int diffX = x2 - x1;
            int diffY = y2 - y1;

            return diffX + diffY;
        });

        Future<Integer> future2 = executor.submit(() -> {
            int x1 = Integer.parseInt(args[0]);
            int y1 = Integer.parseInt(args[1]);
            int x2 = Integer.parseInt(args[2]);
            int y2 = Integer.parseInt(args[3]);

            int diffX = x2 - x1;
            int diffY = y2 - y1;

            return diffX + diffY;
        });

        int result1 = future1.get();
        int result2 = future2.get();

        System.out.println(result1 + " " + result2);

        executor.shutdown();
    }
}