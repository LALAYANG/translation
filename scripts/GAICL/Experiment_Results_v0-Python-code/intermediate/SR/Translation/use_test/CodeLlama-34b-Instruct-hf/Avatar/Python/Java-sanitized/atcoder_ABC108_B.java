import java.util.Queue;
import java.util.concurrent.Thread;

public class atcoder_ABC108_B {
    public static void main(String[] args) {
        int x1 = Integer.parseInt(args[0]);
        int y1 = Integer.parseInt(args[1]);
        int x2 = Integer.parseInt(args[2]);
        int y2 = Integer.parseInt(args[3]);

        Queue<Integer> queueDiffX = new Queue<>();
        Thread threadDiffX = new Thread(() -> {
            int diffX = x2 - x1;
            queueDiffX.add(diffX);
        });
        threadDiffX.start();
        threadDiffX.join();
        int resultDiffX = queueDiffX.poll();

        Queue<Integer> queueDiffY = new Queue<>();
        Thread threadDiffY = new Thread(() -> {
            int diffY = y2 - y1;
            queueDiffY.add(diffY);
        });
        threadDiffY.start();
        threadDiffY.join();
        int resultDiffY = queueDiffY.poll();

        int x3 = x2 - resultDiffY;
        int y3 = y2 + resultDiffX;
        int x4 = x1 - resultDiffY;
        int y4 = y1 + resultDiffX;

        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }
}