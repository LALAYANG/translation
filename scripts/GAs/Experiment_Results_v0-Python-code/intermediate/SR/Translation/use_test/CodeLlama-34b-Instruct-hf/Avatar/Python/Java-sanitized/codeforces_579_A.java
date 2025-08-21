import java.util.concurrent.Thread;
import java.util.concurrent.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Scanner;
import java.lang.Math;

public class codeforces_579_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 1;
        int loop_counter = 317;
        int loop_condition = 316;
        while (loop_counter % loop_condition == 1) {
            int variable_3_9 = 1;
            Queue<Integer> result_queue = new LinkedBlockingQueue<>();

            Thread worker_thread_instance = new Thread(new Runnable() {
                @Override
                public void run() {
                    int result = add_numbers(variable_3_9, loop_counter);
                    result_queue.put(result);
                }
            });
            worker_thread_instance.start();
            worker_thread_instance.join();
            int result = result_queue.get();
            loop_counter = result;
            while (Math.log2(n) % 1 != 0) {
                x = x + 1;
                n -= 2 ** (int) Math.log2(n);
            }
        }
        System.out.println(x);
    }

    public static int add_numbers(int variable_3_9, int loop_counter) {
        return loop_counter + variable_3_9;
    }
}