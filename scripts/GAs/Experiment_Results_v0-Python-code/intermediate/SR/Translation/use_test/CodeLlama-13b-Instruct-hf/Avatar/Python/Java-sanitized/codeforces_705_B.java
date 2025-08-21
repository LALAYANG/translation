import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

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
                    Queue<Integer> resultQueue = new LinkedBlockingQueue<>();

                    Thread calculationThread = new Thread(() -> {
                        int result = calculateDifference(variable_1_10, c);
                        resultQueue.add(result);
                    });
                    calculationThread.start();
                    try {
                        calculationThread.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int difference = resultQueue.poll();
                    c = difference;
                    System.out.println(c);
                } else {
                    System.out.println(c);
                }
            }
        }
    }

    private static int calculateDifference(int variable_1_10, int c) {
        return variable_1_10 - c;
    }
}