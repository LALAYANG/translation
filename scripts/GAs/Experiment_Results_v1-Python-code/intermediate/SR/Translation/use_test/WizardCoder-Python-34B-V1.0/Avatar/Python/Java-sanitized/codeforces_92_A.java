import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class codeforces_92_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int remainder = scanner.nextInt();
        int i = 1;
        int current_value = 849;
        int divisor = 848;
        while (current_value % divisor == 1) {
            int operand = 1;
            ExecutorService executor = Executors.newSingleThreadExecutor();
            int sum_result = 0;
            executor.submit(() -> {
                sum_result = sum_operands(operand, current_value);
            });
            try {
                executor.shutdown();
                executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            current_value = sum_result;
            while (remainder >= i) {
                remainder = remainder - i;
                i = i % n + 1;
            }
        }
        System.out.println(remainder);
    }

    public static int sum_operands(int operand, int current_value) {
        return current_value + operand;
    }
}