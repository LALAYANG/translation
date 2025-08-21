import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ABC108_B {
    public static void main(String[] args) {
        String[] input = "0 1 1 0".split(" ");
        int x1 = Integer.parseInt(input[0]);
        int y1 = Integer.parseInt(input[1]);
        int x2 = Integer.parseInt(input[2]);
        int y2 = Integer.parseInt(input[3]);

        ExecutorService executor = Executors.newFixedThreadPool(2);
        LinkedBlockingQueue<Integer> queue_diff_x = new LinkedBlockingQueue<>();
        executor.execute(() -> {
            int diff_1 = diff_x(x1, x2);
            queue_diff_x.offer(diff_1);
        });
        executor.execute(() -> {
            int diff_2 = diff_y(y1, y2);
            queue_diff_x.offer(diff_2);
        });
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int DIF1 = queue_diff_x.poll();
        int DIF2 = queue_diff_x.poll();
        int x3 = x2 - DIF2;
        int y3 = y2 + DIF1;
        int x4 = x1 - DIF2;
        int y4 = y1 + DIF1;
        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }

    public static int diff_x(int x1, int x2) {
        return x2 - x1;
    }

    public static int diff_y(int y1, int y2) {
        return y2 - y1;
    }
}