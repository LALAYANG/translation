import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class codeforces_534_B {
    public static void main(String[] args) {
        String[] input = System.console().readLine().split(" ");
        int initialVelocity = Integer.parseInt(input[0]);
        int v2 = Integer.parseInt(input[1]);
        input = System.console().readLine().split(" ");
        int t = Integer.parseInt(input[0]);
        int d = Integer.parseInt(input[1]);
        int a = 1;
        int v = initialVelocity;
        int distance = 0;
        for (int i = 0; i < t; i++) {
            if (v - v2 > (t - i - 1) * d) {
                a *= -1;
                v = (t - i - 1) * d + v2;
            }
            Queue<Integer> functionQueue = new ConcurrentLinkedQueue<>();
            Thread functionThread = new Thread(() -> {
                int result = calculateDistance(v, distance);
                functionQueue.add(result);
            });
            functionThread.start();
            try {
                functionThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            distance = functionQueue.poll();
            v += a * d;
        }
        System.out.println(distance);
    }

    private static int calculateDistance(int v, int distance) {
        return distance + v;
    }
}