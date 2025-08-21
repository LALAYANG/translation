import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_333_B {
    static int n;
    static int num_operations;
    static int[] factor = new int[]{1};
    static int variable_3_11 = 2;
    static BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        num_operations = scanner.nextInt();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        executor.execute(() -> {
            int result = calculateProduct(n, variable_3_11, factor);
            try {
                resultQueue.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);

        int result_calculate_product0 = resultQueue.poll();
        int[] b = new int[result_calculate_product0];
        b[0] = b[n - 1] = b[n] = b[2 * n - 1] = 0;

        processMatrix(0, num_operations, 1);
        if (n % 2 != 0 && b[n / 2] != 0 && b[n + n / 2] != 0) {
            b[n / 2] = 0;
        }

        int sum = 0;
        for (int value : b) {
            sum += value;
        }
        System.out.println(sum);
    }

    private static int calculateProduct(int n, int variable_3_11, int[] factor) {
        return factor[0] * n * variable_3_11;
    }

    private static void processMatrix(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        Scanner scanner = new Scanner(System.in);
        int row_index = scanner.nextInt();
        int c = scanner.nextInt();
        int[] b = new int[n];
        b[row_index - 1] = b[n + c - 1] = 0;
        processMatrix(i + step, stop, step);
    }
}