import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_92_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int currentValue = 1;
        while (m >= currentValue) {
            Queue<Integer> queueCalculateDifference0 = new LinkedBlockingQueue<>();
            Thread threadCalculateDifference0 = new Thread(() -> {
                int differenceResult = calculateDifference(currentValue, m);
                queueCalculateDifference0.add(differenceResult);
            });
            threadCalculateDifference0.start();
            try {
                threadCalculateDifference0.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int resultCalculateDifference0 = queueCalculateDifference0.poll();
            m = resultCalculateDifference0;
            int constantOne = 1;
            Queue<Integer> sumModuloQueue = new LinkedBlockingQueue<>();
            Thread sumModuloThread = new Thread(() -> {
                int result = calculateSumWithModulo(currentValue, constantOne, n);
                sumModuloQueue.add(result);
            });
            sumModuloThread.start();
            try {
                sumModuloThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int sumModuloResult = sumModuloQueue.poll();
            currentValue = sumModuloResult;
        }
        System.out.println(m);
    }

    public static int calculateDifference(int currentValue, int m) {
        return m - currentValue;
    }

    public static int calculateSumWithModulo(int currentValue, int constantOne, int n) {
        return currentValue % n + constantOne;
    }
}