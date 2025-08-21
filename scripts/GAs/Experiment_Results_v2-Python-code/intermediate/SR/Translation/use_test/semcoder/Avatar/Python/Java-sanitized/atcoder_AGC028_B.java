import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_AGC028_B {
    public static int calculateValue(int exponentVal, int addedValue, int baseValue) {
        return (int) (Math.pow(baseValue, exponentVal) + addedValue);
    }

    public static void main(String[] args) {
        int addedValue = 7;
        int baseValue = 10;
        int exponentVal = 9;

        Queue<Integer> queue = new LinkedBlockingQueue<>();

        Thread thread = new Thread(() -> {
            int result = calculateValue(exponentVal, addedValue, baseValue);
            queue.add(result);
        });

        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int MOD = queue.poll();

        // Rest of the Java code goes here
    }
}