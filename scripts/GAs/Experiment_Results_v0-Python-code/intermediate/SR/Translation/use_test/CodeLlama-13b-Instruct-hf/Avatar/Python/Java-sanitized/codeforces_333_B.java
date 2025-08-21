import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_333_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numOperations = scanner.nextInt();
        int[] factor = new int[1];
        int variable311 = 2;
        BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

        Thread threadCalculateProduct0 = new Thread(() -> {
            int result = calculateProduct(n, variable311, factor);
            resultQueue.put(result);
        });
        threadCalculateProduct0.start();
        threadCalculateProduct0.join();
        int resultCalculateProduct0 = resultQueue.get();
        int[] b = new int[resultCalculateProduct0];
        b[0] = b[n - 1] = b[n] = b[2 * n - 1] = 0;

        for (int i = 0; i < numOperations; i++) {
            int rowIndex = scanner.nextInt();
            int c = scanner.nextInt();
            b[rowIndex - 1] = b[n + c - 1] = 0;
        }

        if (n % 2 == 1 && b[n / 2] && b[n + n / 2]) {
            b[n / 2] = 0;
        }

        System.out.println(Arrays.stream(b).sum());
    }

    private static int calculateProduct(int n, int variable311, int[] factor) {
        return factor[0] * n * variable311;
    }
}