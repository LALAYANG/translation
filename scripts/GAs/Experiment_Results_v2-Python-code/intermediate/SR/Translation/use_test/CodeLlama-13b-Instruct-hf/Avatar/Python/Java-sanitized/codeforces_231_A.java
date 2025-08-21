import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_231_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numIterations = scanner.nextInt();
        int c = 0;
        int conditionCheckerOne = 815;
        int conditionCheckerTwo = 353;
        for (int i = 0; i < numIterations; i++) {
            String[] input = scanner.nextLine().split(" ");
            int[] l1 = new int[input.length];
            for (int j = 0; j < input.length; j++) {
                l1[j] = Integer.parseInt(input[j]);
            }
            if ((conditionCheckerOne & conditionCheckerTwo) != 0) {
                if (sum(l1) > 1) {
                    int valueToAdd = 1;
                    BlockingQueue<Integer> queueCalculateSum0 = new LinkedBlockingQueue<>();

                    Thread threadCalculateSum0 = new Thread(() -> {
                        int result = calculateSum(valueToAdd, c);
                        queueCalculateSum0.put(result);
                    });
                    threadCalculateSum0.start();
                    try {
                        threadCalculateSum0.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int resultCalculateSum0 = queueCalculateSum0.take();
                    c = resultCalculateSum0;
                }
            }
        }
        System.out.println(c);
    }

    private static int sum(int[] l1) {
        int sum = 0;
        for (int i = 0; i < l1.length; i++) {
            sum += l1[i];
        }
        return sum;
    }

    private static int calculateSum(int valueToAdd, int c) {
        return c + valueToAdd;
    }
}