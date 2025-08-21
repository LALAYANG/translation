import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Scanner;

public class atcoder_ABC153_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int divisor = scanner.nextInt();

        int sho = h / divisor;
        int am = h % divisor;

        if (am != 0) {
            int remainder_flag = 1;
            Queue<Integer> sum_queue = new ConcurrentLinkedQueue<>();

            Thread thread_sum_function0 = new Thread(() -> {
                int result = sum_function(sho, remainder_flag);
                sum_queue.add(result);
            });

            thread_sum_function0.start();
            thread_sum_function0.join();

            int sum_result = sum_queue.poll();
            sho = sum_result;
        }

        System.out.println(sho);
    }

    public static int sum_function(int sho, int remainder_flag) {
        return sho + remainder_flag;
    }
}