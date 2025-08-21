import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

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

                Thread sumWorker = new Thread(() -> {
                    int sumResult = calculateSum(variable311, currentValue);
                    resultQueue.set(sumResult);
                });
                sumWorker.start();
                sumWorker.join();
                currentValue = resultQueue.get();
                j--;
            }
        }
    }

    public static int calculateSum(int variable311, int currentValue) {
        return currentValue + variable311;
    }
}