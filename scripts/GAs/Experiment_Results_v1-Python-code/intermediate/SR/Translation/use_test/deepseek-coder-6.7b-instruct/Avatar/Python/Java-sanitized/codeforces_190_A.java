import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_190_A {
    private static final int conditionChecker = 853;
    private static final int secondConditionChecker = 892;

    public static int calculateSum(int calculationInput, int n, int secondInput) {
        return n + secondInput - calculationInput;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int secondInput = scanner.nextInt();

        if ((conditionChecker & secondConditionChecker) != 0) {
            if (n < 1) {
                if (secondInput < 1) {
                    System.out.println(n + " " + secondInput);
                    System.exit(0);
                }
                System.out.println("Impossible");
                System.exit(0);
            }
        }

        if (secondInput > n) {
            int min = secondInput;
            int calculationInput = 1;
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future<Integer> future = executorService.submit(() -> calculateSum(calculationInput, n, secondInput));
            int calculationResult = future.get();
            int max = calculationResult;
            System.out.println(min + " " + max);
            executorService.shutdown();
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