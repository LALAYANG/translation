import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_333_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numOperations = scanner.nextInt();
        int factor = 1;
        int variable311 = 2;
        Queue<Integer> resultQueue = new Queue<>();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int result = calculateProduct(n, variable311, factor);
                resultQueue.add(result);
            }
        });
        thread.start();
        thread.join();
        int result = resultQueue.remove();
        int b = result;
        b[0] = b[n - 1] = b[n] = b[2 * n - 1] = 0;

        processMatrix(0, numOperations, 1);
        if (n % 2 == 0 && b[n / 2] != 0 && b[n + n / 2] != 0) {
            b[n / 2] = 0;
        }
        System.out.println(b);
    }

    private static int calculateProduct(int n, int variable311, int factor) {
        return factor * n * variable311;
    }

    private static void processMatrix(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int rowIndex = scanner.nextInt();
        int c = scanner.nextInt();
        b[rowIndex - 1] = b[n + c - 1] = 0;
        processMatrix(i + step, stop, step);
    }
}