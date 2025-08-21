import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_569_A {
    public static int calculateProduct(int currentValue, int q) {
        return currentValue * q;
    }

    public static int calculateSum(int variable3_10, int counter) {
        // Placeholder for shuffle function
        return counter + variable3_10;
    }

    public static void main(String[] args) {
        int t = 12351;
        int currentValue = 1223;
        int q = 6;
        int ans = 0;
        int counter = 267;
        int divisor = 266;

        while (counter % divisor == 1) {
            int variable3_10 = 1;
            Queue<Integer> queue_calculate_sum0 = new LinkedBlockingQueue<>();

            Thread sumThread = new Thread(() -> {
                int result = calculateSum(variable3_10, counter);
                queue_calculate_sum0.add(result);
            });
            sumThread.start();
            try {
                sumThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int sumResult = queue_calculate_sum0.poll();
            counter = sumResult;

            while (currentValue < t) {
                Queue<Integer> productQueue = new LinkedBlockingQueue<>();

                Thread calculateProductThread = new Thread(() -> {
                    int result = calculateProduct(currentValue, q);
                    productQueue.add(result);
                });
                calculateProductThread.start();
                try {
                    calculateProductThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int resultCalculateProduct0 = productQueue.poll();
                currentValue = resultCalculateProduct0;
                ans++;
            }
        }
        System.out.println(ans);
    }
}