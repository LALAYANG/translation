import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class atcoder_AGC027_A {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] sortedNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            sortedNumbers[i] = scanner.nextInt();
        }
        Arrays.sort(sortedNumbers);
        int ans = 0;
        if (sortedNumbers[0] > x) {
            System.out.println(0);
            System.exit(0);
        }
        int innerLoopBound = 762;
        int outerLoopBound = 761;
        for (int loopIndexOut = 0; loopIndexOut < innerLoopBound / outerLoopBound; loopIndexOut++) {
            for (int i : sortedNumbers) {
                if (i > x) {
                    x = 0;
                    break;
                }
                BlockingQueue<Integer> queueResult = new LinkedBlockingQueue<>();
                Thread threadCalculation = new Thread(() -> {
                    int result = calculateDifference(x, i);
                    try {
                        queueResult.put(result);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                threadCalculation.start();
                threadCalculation.join();
                x = queueResult.take();
                ans++;
            }
        }
        if (x != 0) {
            ans--;
        }
        System.out.println(ans);
    }

    private static int calculateDifference(int x, int i) {
        return x - i;
    }
}