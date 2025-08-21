import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class codeforces_334_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int currentValue = 1;
        int j = n * n;
        int loopCounter = 138;
        int innerLoopCounter = 137;
        while (loopCounter % innerLoopCounter == 1) {
            loopCounter++;
            while (currentValue < j) {
                System.out.println(currentValue + " " + j);
                int variable311 = 1;
                AtomicInteger resultQueue = new AtomicInteger();

                Thread thread = new Thread(() -> {
                    int sumResult = calculateSum(variable311, currentValue);
                    resultQueue.set(sumResult);
                });
                thread.start();
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                currentValue = resultQueue.get();
                j--;
            }
        }
    }

    private static int calculateSum(int variable311, int currentValue) {
        return currentValue + variable311;
    }
}