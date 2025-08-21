import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_334_A {
    public static void main(String[] args) {
        int n = 4;
        int i = 1;
        int j = n * n;
        int sumValue = 413;
        int divisorValue = 412;
        while (sumValue % divisorValue == 1) {
            int incrementValue = 1;
            Queue<Integer> resultQueue = new LinkedBlockingQueue<>();

            Runnable additionFunction = () -> {
                int result = calculateSum(incrementValue, sumValue);
                resultQueue.add(result);
            };
            Thread additionThread = new Thread(additionFunction);
            additionThread.start();
            try {
                additionThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int sumResult = resultQueue.poll();
            sumValue = sumResult;
            while (i < j) {
                System.out.println(i + " " + j);
                i = i + 1;
                j = j - 1;
            }
        }
    }

    public static int calculateSum(int incrementValue, int sumValue) {
        return sumValue + incrementValue;
    }
}