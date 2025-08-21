import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_92_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int remainder = scanner.nextInt();
        int i = 1;
        int currentValue = 849;
        int divisor = 848;
        while (currentValue % divisor == 1) {
            int operand = 1;
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future<Integer> future = executorService.submit(() -> sumOperands(operand, currentValue));
            int sumResult = future.get();
            currentValue = sumResult;
            while (remainder >= i) {
                remainder -= i;
                i = i % n + 1;
            }
        }
        System.out.println(remainder);
    }

    private static int sumOperands(int operand, int currentValue) {
        return currentValue + operand;
    }
}