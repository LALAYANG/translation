import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_190_A {
    private static int calculateSum(int calculationInput, int n, int secondInput) {
        return n + secondInput - calculationInput;
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int secondInput = scanner.nextInt();
        int conditionChecker = 853;
        int secondConditionChecker = 892;
        if ((conditionChecker & secondConditionChecker) != 0) {
            if (n < 1) {
                if (secondInput < 1) {
                    System.out.println(n + " " + secondInput);
                    System.exit(0);
                }
                System.out.println("Impossible");
                System.exit(0);
            }
            if (secondInput > n) {
                int min = secondInput;
                int calculationInput = 1;
                BlockingQueue<Integer> queue_calculateSum0 = new LinkedBlockingQueue<>();
                ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
                executor.execute(() -> {
                    try {
                        int result = calculateSum(calculationInput, n, secondInput);
                        queue_calculateSum0.put(result);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                executor.shutdown();
                executor.awaitTermination(1, TimeUnit.SECONDS);
                int calculationResult = queue_calculateSum0.take();
                int max = calculationResult;
                System.out.println(min + " " + max);
            }
            if (secondInput <= n) {
                int min = n;
                int max = n + secondInput - 1;
                if (secondInput == 0) {
                    max = n;
                }
                System.out.println(min + " " + max);
            }
        }
    }
}