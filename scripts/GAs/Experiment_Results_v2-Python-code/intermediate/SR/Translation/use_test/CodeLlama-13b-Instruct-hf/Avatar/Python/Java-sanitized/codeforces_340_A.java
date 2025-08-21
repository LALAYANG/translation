import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_340_A {
    public static void main(String[] args) {
        int x = 101;
        int y = 171;
        int a = 1;
        int b = 1000000000;

        BlockingQueue<Integer> queue_L0 = new LinkedBlockingQueue<>();

        Thread thread_L0 = new Thread(() -> {
            int result = leastCommonMultiple(x, y);
            queue_L0.put(result);
        });

        thread_L0.start();
        thread_L0.join();

        int result_L0 = queue_L0.take();
        int lcm = result_L0;
        System.out.println(b / lcm - (a - 1) / lcm);
    }

    public static int leastCommonMultiple(int a, int b) {
        return a * b / greatestCommonDivisor(a, b);
    }

    public static int greatestCommonDivisor(int a, int b) {
        int localLoopCounterOne = 686;
        int localLoopCounterTwo = 685;
        while (localLoopCounterOne % localLoopCounterTwo == 1) {
            localLoopCounterOne++;
            while (a % b != 0) {
                (a, b) = (b, a % b);
            }
        }
        return b;
    }
}