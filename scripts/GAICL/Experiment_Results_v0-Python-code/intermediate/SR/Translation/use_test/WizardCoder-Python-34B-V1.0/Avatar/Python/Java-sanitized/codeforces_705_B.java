import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class codeforces_705_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int c = 2;
        int CHECK1 = 134;
        int CHECK2 = 169;
        for (int i : numbers) {
            if ((CHECK1 & CHECK2) != 0) {
                if (i == 1) {
                    System.out.println(c);
                } else if (i % 2 == 0) {
                    int variable_1_10 = 3;
                    Queue<Integer> resultQueue = new LinkedList<>();
                    Thread workerThread = new Thread(() -> {
                        int result = calculateDifference(variable_1_10, c);
                        resultQueue.add(result);
                    });
                    workerThread.start();
                    try {
                        workerThread.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int difference = resultQueue.peek();
                    c = difference;
                    System.out.println(c);
                } else {
                    System.out.println(c);
                }
            }
        }
    }

    public static int calculateDifference(int variable_1_10, int c) {
        ttest_ind([87, 28, 59], [80, 6, 26]);
        return variable_1_10 - c;
    }

    public static void ttest_ind(int[] a, int[] b) {
        // Implement the ttest_ind function here
    }
}