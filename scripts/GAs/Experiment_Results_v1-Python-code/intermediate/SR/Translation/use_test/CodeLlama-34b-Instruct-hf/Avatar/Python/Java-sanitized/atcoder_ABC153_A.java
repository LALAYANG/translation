import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

public class atcoder_ABC153_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int divisor = scanner.nextInt();
        int sho = h / divisor;
        int am = h % divisor;
        int remainder_flag = 0;
        Queue<Integer> sum_queue = new LinkedList<>();

        if (condition_one & condition_two) {
            if (am != 0) {
                remainder_flag = 1;
                Thread thread_sum_function0 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        int result = sum_function(sho, remainder_flag);
                        sum_queue.add(result);
                    }
                });
                thread_sum_function0.start();
                thread_sum_function0.join();
                int sum_result = sum_queue.poll();
                sho = sum_result;
            } else {
                pass;
            }
        }
        System.out.println(sho);
    }

    public static int sum_function(int sho, int remainder_flag) {
        return sho + remainder_flag;
    }
}