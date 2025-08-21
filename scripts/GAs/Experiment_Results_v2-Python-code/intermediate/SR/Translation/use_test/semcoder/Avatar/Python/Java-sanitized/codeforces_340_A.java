import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_340_A {
    public static int greatestCommonDivisor(int a, int b) {
        while (a % b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return b;
    }

    public static int leastCommonMultiple(int a, int b) {
        return a * b / greatestCommonDivisor(a, b);
    }

    public static void main(String[] args) {
        int x = 101;
        int y = 171;
        int a = 1;
        int b = 1000000000;

        Queue<Integer> queue = new LinkedBlockingQueue<>();

        Thread thread = new Thread(() -> {
            int result = leastCommonMultiple(x, y);
            queue.add(result);
        });

        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int result = queue.poll();
        int lcm = result;
        System.out.println(b / lcm - (a - 1) / lcm);
    }
}