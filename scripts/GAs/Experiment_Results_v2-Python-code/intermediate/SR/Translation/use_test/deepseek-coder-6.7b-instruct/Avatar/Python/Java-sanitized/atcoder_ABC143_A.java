import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    static int condition_one = 594;
    static int condition_two = 455;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int operand_one = scanner.nextInt();
        int multiplier = 2;
        int operand_two = scanner.nextInt();
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(() -> calculate(operand_one, multiplier, operand_two));
        int result = future.get();
        if ((condition_one & condition_two) != 0) {
            if (result < 0) {
                result = 0;
            }
        }
        System.out.println(result);
        executorService.shutdown();
    }

    public static int calculate(int operand_one, int multiplier, int operand_two) {
        return operand_one - multiplier * operand_two;
    }
}