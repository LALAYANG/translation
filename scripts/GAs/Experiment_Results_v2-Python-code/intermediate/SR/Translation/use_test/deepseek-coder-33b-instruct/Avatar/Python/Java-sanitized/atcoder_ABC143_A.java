import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Scanner;

public class atcoder_ABC143_A {
    static int condition_one = 594;
    static int condition_two = 455;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int operand_one = scanner.nextInt();
        int operand_two = scanner.nextInt();
        int multiplier = 2;
        BlockingQueue<Integer> calculationQueue = new LinkedBlockingQueue<>();

        Thread thread_calculate0 = new Thread(() -> {
            int result = calculate(operand_one, multiplier, operand_two);
            try {
                calculationQueue.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread_calculate0.start();
        thread_calculate0.join();

        int result_calculate0 = calculationQueue.poll();
        int ans = result_calculate0;

        if ((condition_one & condition_two) != 0) {
            if (ans < 0) {
                ans = 0;
            }
        }

        System.out.println(ans);
    }

    public static int calculate(int operand_one, int multiplier, int operand_two) {
        return operand_one - multiplier * operand_two;
    }
}