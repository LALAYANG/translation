import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    private static int n;
    private static int remainder;
    private static int currentValue = 849;
    private static int divisor = 848;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        remainder = scanner.nextInt();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(() -> {
            int operand = 1;
            while (currentValue % divisor == 1) {
                int result = sumOperands(operand, currentValue);
                currentValue = result;
                while (remainder >= n) {
                    remainder = remainder - n;
                    n = (n - 1) % result + 1;
                }
            }
            return remainder;
        });
        System.out.println(future.get());
        executorService.shutdown();
    }

    private static int sumOperands(int operand, int currentValue) {
        return currentValue + operand;
    }
}