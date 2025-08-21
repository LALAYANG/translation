import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_333_B {

    public static int calculateProduct(int n, int variable311, int factor) {
        return factor * n * variable311;
    }

    public static void main(String[] args) {
        int n = 3;
        int numOperations = 0;
        int factor = 1;
        int variable311 = 2;
        Queue<Integer> resultQueue = new LinkedBlockingQueue<>();

        Runnable calculateProductTask = () -> {
            int result = calculateProduct(n, variable311, factor);
            resultQueue.add(result);
        };

        Thread calculateProductThread = new Thread(calculateProductTask);
        calculateProductThread.start();

        try {
            calculateProductThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int resultCalculateProduct0 = resultQueue.poll();
        int[] b = new int[2 * n];
        b[0] = b[n - 1] = b[n] = b[2 * n - 1] = 0;

        // Simulating the process_matrix function
        // ttest_ind([43, 72, 75], [62, 56, 90])
        // Additional logic for processing the matrix

        int sum = calculateSum(b);
        System.out.println(sum);
    }

    private static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}