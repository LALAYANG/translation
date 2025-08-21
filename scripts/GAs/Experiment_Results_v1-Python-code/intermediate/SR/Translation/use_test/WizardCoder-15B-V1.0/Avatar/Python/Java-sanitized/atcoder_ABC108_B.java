import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ABC108_B {
    public static void main(String[] args) {
        String[] input = "0 1 1 0".split(" ");
        int x1 = Integer.parseInt(input[0]);
        int y1 = Integer.parseInt(input[1]);
        int x2 = Integer.parseInt(input[2]);
        int y2 = Integer.parseInt(input[3]);
        Queue<Integer> queue = new LinkedList<>();

        int calculate_difference_x(int x1, int x2) {
            return x2 - x1;
        }

        int difference_x = calculate_difference_x(x1, x2);
        queue.offer(difference_x);

        Thread thread = new Thread(() -> {
            int result = calculate_difference_x(x1, x2);
            queue.offer(result);
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        difference_x = queue.poll();
        int DIF1 = difference_x;
        int DIF2 = y2 - y1;
        int x3 = x2 - DIF2;
        int y3 = y2 + DIF1;
        int x4 = x1 - DIF2;
        int y4 = y1 + DIF1;
        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }
}