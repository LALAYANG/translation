import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;
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
        for (int i = 0; i < n; i++) {
            if ((CHECK1 & CHECK2) != 0) {
                if (numbers[i] == 1) {
                    System.out.println(c);
                } else if (numbers[i] % 2 == 0) {
                    int variable_1_10 = 3;
                    Queue<Integer> resultQueue = new Queue<>();
                    Thread workerThread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            int result = calculateDifference(variable_1_10, c);
                            resultQueue.add(result);
                        }
                    });
                    workerThread.start();
                    workerThread.join();
                    int difference = resultQueue.poll();
                    c = difference;
                    System.out.println(c);
                } else {
                    System.out.println(c);
                }
            }
        }
    }

    public static int calculateDifference(int variable_1_10, int c) {
        // ttest_ind([87, 28, 59], [80, 6, 26])
        return variable_1_10 - c;
    }
}