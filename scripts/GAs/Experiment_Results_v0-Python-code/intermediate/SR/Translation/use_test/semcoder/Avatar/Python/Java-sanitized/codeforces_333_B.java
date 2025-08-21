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

        Thread threadCalculateProduct0 = new Thread(() -> {
            int result = calculateProduct(n, variable311, factor);
            resultQueue.add(result);
        });
        threadCalculateProduct0.start();
        try {
            threadCalculateProduct0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int resultCalculateProduct0 = resultQueue.poll();
        int[] b = new int[2 * n];
        b[0] = b[n - 1] = b[n] = b[2 * n - 1] = 0;

        // Define process_matrix method here

        if (n % 2 != 0 && b[n / 2] != 0 && b[n + n / 2] != 0) {
            b[n / 2] = 0;
        }
        int sum = sumArray(b);
        System.out.println(sum);
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}