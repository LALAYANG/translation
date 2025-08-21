import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class atcoder_ABC108_B {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        BlockingQueue<Integer> queueDiffX = new LinkedBlockingQueue<>();
        BlockingQueue<Integer> queueDiffY = new LinkedBlockingQueue<>();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 2, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());

        executor.execute(() -> {
            try {
                queueDiffX.put(diffX(x1, x2));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.execute(() -> {
            try {
                queueDiffY.put(diffY(y1, y2));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        int resultDiffX = queueDiffX.take();
        int DIF1 = resultDiffX;

        int resultDiffY = queueDiffY.take();
        int DIF2 = resultDiffY;

        int x3 = x2 - DIF2;
        int y3 = y2 + DIF1;
        int x4 = x1 - DIF2;
        int y4 = y1 + DIF1;

        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }

    public static int diffX(int x1, int x2) {
        return x2 - x1;
    }

    public static int diffY(int y1, int y2) {
        return y2 - y1;
    }
}