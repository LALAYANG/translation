import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_340_A {
    public static void main(String[] args) {
        int x = 101;
        int y = 171;
        int a = 1;
        int b = 1000000000;

        Queue<Integer> queue = new Queue<>();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int result = leastCommonMultiple(x, y);
                queue.add(result);
            }
        });

        thread.start();
        thread.join();

        int result = queue.remove();
        int lcm = result;
        System.out.println(b / lcm - (a - 1) / lcm);
    }

    public static int greatestCommonDivisor(int a, int b) {
        int localLoopCounterOne = 686;
        int localLoopCounterTwo = 685;
        while (localLoopCounterOne % localLoopCounterTwo == 1) {
            localLoopCounterOne += 1;
            while (a % b != 0) {
                (a, b) = (b, a % b);
            }
        }
        return b;
    }

    public static int leastCommonMultiple(int a, int b) {
        return a * b / greatestCommonDivisor(a, b);
    }
}