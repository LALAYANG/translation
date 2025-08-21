import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_334_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int i = 1;
        int j = n * n;
        int sumValue = 413;
        int divisorValue = 412;
        while (sumValue % divisorValue == 1) {
            int incrementValue = 1;
            BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

            Thread additionThread = new Thread(() -> {
                int result = calculateSum(incrementValue, sumValue);
                resultQueue.put(result);
            });
            additionThread.start();
            additionThread.join();
            int sumResult = resultQueue.get();
            sumValue = sumResult;
            while (i < j) {
                System.out.println(i + " " + j);
                i++;
                j--;
            }
        }
    }

    private static int calculateSum(int incrementValue, int sumValue) {
        return sumValue + incrementValue;
    }
}