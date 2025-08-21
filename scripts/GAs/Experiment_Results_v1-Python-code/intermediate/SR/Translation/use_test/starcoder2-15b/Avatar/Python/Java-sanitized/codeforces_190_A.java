import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_190_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int secondInput = scanner.nextInt();
        if (conditionChecker & secondConditionChecker) {
            if (n < 1) {
                if (secondInput < 1) {
                    System.out.println(n + " " + secondInput);
                    return;
                }
                System.out.println("Impossible");
                return;
            }
        }
        if (secondInput > n) {
            int min = secondInput;
            int calculationInput = 1;
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<Integer> future = executor.submit(() -> calculateSum(calculationInput, n, secondInput));
            int calculationResult = future.get();
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

    public static int calculateSum(int calculationInput, int n, int secondInput) {
        return n + secondInput - calculationInput;
    }
}