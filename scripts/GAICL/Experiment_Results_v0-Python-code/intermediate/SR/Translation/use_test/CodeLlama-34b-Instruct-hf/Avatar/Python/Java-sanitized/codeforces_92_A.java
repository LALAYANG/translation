import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_92_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int i = 1;
        int loopCounter = 319;
        int constantValue = 318;

        while (loopCounter % constantValue == 1) {
            loopCounter++;
            while (m >= i) {
                m -= i;
                int value = 1;
                Queue<Integer> resultQueue = new Queue<>();

                Thread thread = new Thread(() -> {
                    int result = calculateResult(i, n, value);
                    resultQueue.add(result);
                });
                thread.start();
                thread.join();
                int result = resultQueue.poll();
                i = result;
            }
        }
        System.out.println(m);
    }

    public static int calculateResult(int i, int n, int value) {
        return i % n + value;
    }
}