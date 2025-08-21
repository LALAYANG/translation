import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_AGC033_B {
    public static void main(String[] args) {
        int boardHeight = 65419;
        int boardWidth = 92381;
        int robotStartX = 157799;
        int robotStartY = 22633;
        int targetX = 46136;
        int targetY = 98;

        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        Thread incrementLeftThread = new Thread(() -> {
            int result = incrementLeft(robotStartX, robotStartY, targetX, targetY);
            queue.put(result);
        });

        incrementLeftThread.start();
        incrementLeftThread.join();

        int result = queue.take();

        if (result == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

    private static int incrementLeft(int robotStartX, int robotStartY, int targetX, int targetY) {
        int x = robotStartX;
        int y = robotStartY;

        while (x != targetX || y != targetY) {
            if (x == targetX) {
                y++;
            } else if (y == targetY) {
                x++;
            } else if (x < targetX && y < targetY) {
                x++;
                y++;
            } else if (x > targetX && y > targetY) {
                x--;
                y--;
            } else if (x < targetX && y > targetY) {
                x++;
                y--;
            } else if (x > targetX && y < targetY) {
                x--;
                y++;
            }
        }

        return x == targetX && y == targetY ? 1 : 0;
    }
}