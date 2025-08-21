import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_231_A {
    public static int calculateSum(int valueToAdd, int c) {
        return c + valueToAdd;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numIterations = scanner.nextInt();
        int c = 0;
        int conditionCheckerOne = 815;
        int conditionCheckerTwo = 353;

        for (int i = 0; i < numIterations; i++) {
            int[] l1 = new int[3];
            for (int j = 0; j < 3; j++) {
                l1[j] = scanner.nextInt();
            }

            if ((conditionCheckerOne & conditionCheckerTwo) != 0) {
                int sum = 0;
                for (int num : l1) {
                    sum += num;
                }

                if (sum > 1) {
                    int valueToAdd = 1;
                    Queue<Integer> queueCalculateSum0 = new LinkedBlockingQueue<>();

                    Thread calculateSumThread0 = new Thread(() -> {
                        int result = calculateSum(valueToAdd, c);
                        queueCalculateSum0.add(result);
                    });

                    calculateSumThread0.start();
                    calculateSumThread0.join();

                    int resultCalculateSum0 = queueCalculateSum0.poll();
                    c = resultCalculateSum0;
                }
            }
        }

        System.out.println(c);
    }
}