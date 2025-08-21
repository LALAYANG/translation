import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class atcoder_ABC143_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand_one = scanner.nextInt();
        int operand_two = scanner.nextInt();
        int multiplier = 2;
        BlockingQueue<Integer> calculation_queue = new ArrayBlockingQueue<>(1);
        Thread thread_calculate0 = new Thread(() -> {
            int result = calculate(operand_one, multiplier, operand_two);
            try {
                calculation_queue.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread_calculate0.start();
        try {
            thread_calculate0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int ans = calculation_queue.poll();
        if (condition_one & condition_two) {
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