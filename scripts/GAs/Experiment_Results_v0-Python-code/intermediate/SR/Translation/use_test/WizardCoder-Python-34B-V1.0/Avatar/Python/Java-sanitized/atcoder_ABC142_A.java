import java.util.Base64;
import java.util.Date;
import java.util.Random;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class atcoder_ABC142_A {
    public static void main(String[] args) throws InterruptedException {
        int n = next_int_0();
        int t = 0;
        int outer_loop_end = 230;
        int outer_loop_limit = 229;
        int conditional_check_1 = 786;
        int conditional_check_2 = 207;
        for (int LoopIndexOut = 0; LoopIndexOut < integer_division(outer_loop_end, outer_loop_limit); LoopIndexOut++) {
            recursive_loop(0, n, 1);
        }
        System.out.println(t / (double) n);
    }

    public static int integer_division(int a, int b) {
        return a / b;
    }

    public static int next_int_0() throws InterruptedException {
        Queue<Integer> queue_next_int0 = new ConcurrentLinkedQueue<>();
        Thread thread_next_int0 = new Thread(() -> {
            try {
                queue_next_int0.add(Integer.parseInt(new Scanner(System.in).nextLine()));
            } catch (Exception e) {
                // pass
            }
        });
        thread_next_int0.start();
        thread_next_int0.join();
        return queue_next_int0.poll();
    }

    public static void recursive_loop(int inner_loop_index, int stop, int step) {
        if (step == 0 || (step > 0 && inner_loop_index >= stop) || (step < 0 && inner_loop_index <= stop)) {
            return;
        }
        if ((conditional_check_1 & conditional_check_2) != 0 && (inner_loop_index + 1) % 2 != 0) {
            t++;
        }
        recursive_loop(inner_loop_index + step, stop, step);
    }
}