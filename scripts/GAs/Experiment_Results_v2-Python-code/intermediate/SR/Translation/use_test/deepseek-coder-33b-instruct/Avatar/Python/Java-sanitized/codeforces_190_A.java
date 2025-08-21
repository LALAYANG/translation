import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_190_A {
    private static final int CONDITION_CHECKER_ONE = 735;
    private static final int CONDITION_CHECKER_TWO = 523;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        if ((CONDITION_CHECKER_ONE & CONDITION_CHECKER_TWO) != 0) {
            if (n < 1) {
                if (secondNumber < 1) {
                    System.out.println(n + " " + secondNumber);
                    System.exit(0);
                }
                System.out.println("Impossible");
                System.exit(0);
            }
            if (secondNumber > n) {
                int minimumValue = secondNumber;
                int thirdNumber = 1;
                BlockingQueue<Integer> queueResult = new LinkedBlockingQueue<>();

                ExecutorService executorService = Executors.newSingleThreadExecutor();
                executorService.submit(() -> {
                    BlockingQueue<Integer> queueCalculateSumDifference0 = new LinkedBlockingQueue<>();
                    executorService.submit(() -> {
                        int calculatedResult = calculateSumDifference(n, thirdNumber, secondNumber);
                        try {
                            queueCalculateSumDifference0.put(calculatedResult);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    });
                    try {
                        int resultCalculateSumDifference0 = queueCalculateSumDifference0.take();
                        calculatedResult = resultCalculateSumDifference0;
                        queueResult.put(calculatedResult);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                executorService.shutdown();
                int resultCalculateAndQueue = queueResult.take();
                int max = resultCalculateAndQueue;
                System.out.println(minimumValue + " " + max);
            }
        }
        if (secondNumber <= n) {
            int minimumValue = n;
            int max = n + secondNumber - 1;
            if (secondNumber == 0) {
                max = n;
            }
            System.out.println(minimumValue + " " + max);
        }
    }

    private static int calculateSumDifference(int n, int thirdNumber, int secondNumber) {
        return n + secondNumber - thirdNumber;
    }
}