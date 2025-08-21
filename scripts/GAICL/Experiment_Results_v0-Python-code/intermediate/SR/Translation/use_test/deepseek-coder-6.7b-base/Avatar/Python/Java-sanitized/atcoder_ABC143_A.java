import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ABC143_A {
    public static void main(String[] args) {
        int A = Integer.parseInt(args[0]);
        int B = Integer.parseInt(args[1]);
        int multiplier = 2;
        Queue<Integer> resultQueue = new LinkedBlockingQueue<>();
        new Thread(() -> {
            int result = calculateDifference(multiplier, A, B);
            resultQueue.add(result);
        }).start();
        int result = resultQueue.poll();
        int finalResult = result;
        if (finalResult < 0) {
            finalResult = 0;
        }
        System.out.println(finalResult);
    }

    public static int calculateDifference(int multiplier, int A, int B) {
        return A - multiplier * B;
    }
}