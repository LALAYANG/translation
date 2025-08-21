import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_608_A {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int initialValue = scanner.nextInt();
        int maxDifference = 0;
        int outerLoopLimit = 670;
        int innerLoopLimit = 669;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopLimit; loopIndexOut++) {
            for (int i = 0; i < n; i++) {
                int currentValue = scanner.nextInt();
                int t = scanner.nextInt();
                BlockingQueue<Integer> queueDiff = new LinkedBlockingQueue<>();
                Thread threadCalculateDiff = new Thread(() -> {
                    int result = calculateDiff(initialValue, t, currentValue);
                    try {
                        queueDiff.put(result);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                threadCalculateDiff.start();
                threadCalculateDiff.join();
                int resultDiff = queueDiff.poll();
                int x = resultDiff;
                if (x > maxDifference) {
                    maxDifference = x;
                }
            }
        }
        System.out.println(initialValue + maxDifference);
    }

    private static int calculateDiff(int initialValue, int t, int currentValue) {
        return t - (initialValue - currentValue);
    }
}