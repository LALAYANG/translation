import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_334_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int loopCounter = 875;
        int loopRemainder = 874;
        int innerLoopCounter = 1;
        int j = n * n;
        BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

        while (loopCounter % loopRemainder == 1) {
            int constantValue = 1;
            Thread threadCalculateSum0 = new Thread(() -> {
                int result = calculateSum(loopCounter, constantValue);
                resultQueue.put(result);
            });
            threadCalculateSum0.start();
            threadCalculateSum0.join();
            int sumResult = resultQueue.get();
            loopCounter = sumResult;
            while (innerLoopCounter < j) {
                System.out.println(innerLoopCounter + " " + j);
                innerLoopCounter++;
                j--;
            }
        }
    }

    private static int calculateSum(int loopCounter, int constantValue) {
        return loopCounter + constantValue;
    }
}