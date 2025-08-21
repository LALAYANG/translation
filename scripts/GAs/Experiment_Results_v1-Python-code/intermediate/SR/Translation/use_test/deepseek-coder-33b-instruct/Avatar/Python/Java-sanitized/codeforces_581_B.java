import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_581_B {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] inputArray = new int[n];
        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextInt();
        }
        int[] initialValue = {0};
        BlockingQueue<Integer> queueCalculateProduct0 = new LinkedBlockingQueue<>();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
        executor.submit(() -> {
            try {
                int result = calculateProduct(initialValue[0], n);
                queueCalculateProduct0.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
        int resultCalculateProduct0 = queueCalculateProduct0.take();
        int[] resultArray = new int[n];
        resultArray[0] = resultCalculateProduct0;
        int mx = inputArray[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            resultArray[i] = Math.max(0, mx - inputArray[i] + 1);
            if (inputArray[i] > mx) {
                mx = inputArray[i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(resultArray[i] + " ");
        }
    }

    private static int calculateProduct(int initialValue, int n) {
        return initialValue * n;
    }
}