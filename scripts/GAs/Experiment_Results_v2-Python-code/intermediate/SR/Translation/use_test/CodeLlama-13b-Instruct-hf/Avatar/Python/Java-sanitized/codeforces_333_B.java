import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_333_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int m = scanner.nextInt();
        int[] initialList = new int[1];
        int multiplier = 2;
        BlockingQueue<int[]> resultQueue = new LinkedBlockingQueue<>();

        Thread calculationThread = new Thread(() -> {
            int[] result = calculateProduct(multiplier, initialList, arraySize);
            resultQueue.put(result);
        });
        calculationThread.start();
        try {
            calculationThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int[] calculationResult = resultQueue.take();
        int[] b = calculationResult;
        b[0] = b[arraySize - 1] = b[arraySize] = b[2 * arraySize - 1] = 0;

        processInput(0, m, 1);
        if (arraySize % 2 == 1 && b[arraySize / 2] && b[arraySize + arraySize / 2]) {
            b[arraySize / 2] = 0;
        }
        System.out.println(sum(b));
    }

    private static int[] calculateProduct(int multiplier, int[] initialList, int arraySize) {
        int[] result = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            result[i] = initialList[0] * multiplier;
        }
        return result;
    }

    private static void processInput(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int[] rowIndexAndC = scanner.nextLine().split(" ");
        int rowIndex = Integer.parseInt(rowIndexAndC[0]);
        int c = Integer.parseInt(rowIndexAndC[1]);
        b[rowIndex - 1] = b[arraySize + c - 1] = 0;
        processInput(i + step, stop, step);
    }

    private static int sum(int[] b) {
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum += b[i];
        }
        return sum;
    }
}