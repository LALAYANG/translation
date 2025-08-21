import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_705_B {
    public static void main(String[] args) throws Exception {
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
                    BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();
                    ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
                    executor.execute(() -> {
                        try {
                            int result = calculateDifference(variable_1_10, c);
                            resultQueue.put(result);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    });
                    executor.shutdown();
                    executor.awaitTermination(1, TimeUnit.SECONDS);
                    int difference = resultQueue.take();
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