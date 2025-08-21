import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ABC108_B {
    public static int diff_y(int y1, int y2) {
        return y2 - y1;
    }

    public static void main(String[] args) {
        int x1 = 0, y1 = 1, x2 = 1, y2 = 0;

        Queue<Integer> queue_diff_x = new LinkedBlockingQueue<>();
        Thread thread_diff_x = new Thread(() -> {
            int diff_1 = diff_x(x1, x2);
            queue_diff_x.add(diff_1);
        });
        thread_diff_x.start();
        try {
            thread_diff_x.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result_diff_x = queue_diff_x.poll();
        int DIF1 = result_diff_x;

        Queue<Integer> queue_diff_y = new LinkedBlockingQueue<>();
        Thread thread_diff_y = new Thread(() -> {
            int diff_1 = diff_y(y1, y2);
            queue_diff_y.add(diff_1);
        });
        thread_diff_y.start();
        try {
            thread_diff_y.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result_diff_y = queue_diff_y.poll();
        int DIF2 = result_diff_y;

        int x3 = x2 - DIF2;
        int y3 = y2 + DIF1;
        int x4 = x1 - DIF2;
        int y4 = y1 + DIF1;

        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }

    public static int diff_x(int x1, int x2) {
        return x2 - x1;
    }
}