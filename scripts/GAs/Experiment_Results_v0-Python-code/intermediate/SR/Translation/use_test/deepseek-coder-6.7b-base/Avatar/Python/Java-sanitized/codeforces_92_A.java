import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class codeforces_92_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int i = 1;
        int loopCounter = 319;
        int constantValue = 318;
        while (loopCounter % constantValue == 1) {
            loopCounter = loopCounter + 1;
            while (m >= i) {
                m -= i;
                int value = 1;
                Queue<Integer> resultQueue = new LinkedList<>();

                Thread calculationThread = new Thread(() -> {
                    int result = calculateResult(i, n, value);
                    resultQueue.add(result);
                });
                calculationThread.start();
                try {
                    calculationThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i = resultQueue.poll();
            }
        }
        System.out.println(m);
    }

    @FunctionalInterface
    public interface MyDecorator {
        int decResult(int i, int n, int value);
    }

    public static int calculateResult(int i, int n, int value) {
        return i % n + value;
    }
}