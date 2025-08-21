import java.util.Queue;
import java.util.concurrent.Thread;

public class atcoder_ABC108_B {
    public static void main(String[] args) {
        Queue<Integer> queue_calculateDifference = new Queue<>();
        Thread thread_calculateDifference = new Thread(() -> {
            int firstNumber = Integer.parseInt(args[0]);
            int x2 = Integer.parseInt(args[1]);
            int y2 = Integer.parseInt(args[2]);
            int y1 = Integer.parseInt(args[3]);
            int diffResult = calculateDifferenceThread(firstNumber, x2);
            queue_calculateDifference.put(diffResult);
        });
        thread_calculateDifference.start();
        thread_calculateDifference.join();
        int differenceResult = queue_calculateDifference.get();
        int DIF1 = differenceResult;
        int DIF2 = calculateDifference(y2, y1);
        int x3 = x2 - DIF2;
        int y3 = y2 + DIF1;
        int x4 = firstNumber - DIF2;
        int y4 = y1 + DIF1;
        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }

    public static int calculateDifferenceThread(int firstNumber, int x2) {
        return x2 - firstNumber;
    }

    public static int calculateDifference(int y2, int y1) {
        return y2 - y1;
    }
}