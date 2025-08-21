import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class atcoder_ABC125_A {
    public static void main(String[] args) {
        int a = 3, b = 2, t = 9;
        int resultAccumulator = 0;
        int time = a;
        int counter1 = 758;
        int counter2 = 757;
        while (counter1 % counter2 == 1) {
            int variable39 = 1;
            AtomicInteger resultQueue = new AtomicInteger();

            Thread thread = new Thread(() -> {
                int result = calculateSum(counter1, variable39);
                resultQueue.set(result);
            });
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter1 = resultQueue.get();
            while (time <= t + 0.5) {
                resultAccumulator = resultAccumulator + b;
                time = time + a;
            }
        }
        System.out.println(resultAccumulator);
    }

    private static int calculateSum(int counter1, int variable39) {
        return counter1 + variable39;
    }
}