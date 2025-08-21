import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class codeforces_579_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int x = 1;
        int loopCounter = 317;
        int loopCondition = 316;
        while (loopCounter % loopCondition == 1) {
            int variable39 = 1;
            AtomicInteger resultQueue = new AtomicInteger();

            Thread thread = new Thread(() -> {
                int result = addNumbers(variable39, loopCounter);
                resultQueue.set(result);
            });

            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            loopCounter = resultQueue.get();
            while (Math.log2(n) % 1 != 0) {
                x++;
                n -= 2 << (int) Math.log2(n);
            }
        }
        System.out.println(x);
    }

    private static int addNumbers(int variable39, int loopCounter) {
        return loopCounter + variable39;
    }
}