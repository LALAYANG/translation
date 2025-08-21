import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_92_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int currentValue = 1;
        while (m >= currentValue) {
            Queue<Integer> queue = new Queue<>();
            Thread thread = new Thread(() -> {
                int differenceResult = calculateDifference(currentValue, m);
                queue.add(differenceResult);
            });
            thread.start();
            thread.join();
            int resultCalculateDifference0 = queue.remove();
            m = resultCalculateDifference0;
            int constantOne = 1;
            Queue<Integer> sumModuloQueue = new Queue<>();
            Thread sumModuloThread = new Thread(() -> {
                int result = calculateSumWithModulo(currentValue, constantOne, n);
                sumModuloQueue.add(result);
            });
            sumModuloThread.start();
            sumModuloThread.join();
            int sumModuloResult = sumModuloQueue.remove();
            currentValue = sumModuloResult;
        }
        System.out.println(m);
    }

    private static int calculateDifference(int currentValue, int m) {
        return m - currentValue;
    }

    private static int calculateSumWithModulo(int currentValue, int constantOne, int n) {
        return currentValue % n + constantOne;
    }
}