import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class codeforces_37_A {
    public static int increment(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static int decrement(int arg1, int arg2) {
        return arg1 - arg2;
    }

    public static int increment_count(int high, int increment_amount) {
        return increment(high, increment_amount);
    }

    public static int decrement_tower(int tower, int decrement_amount) {
        return decrement(tower, decrement_amount);
    }

    public static void process_list(int i, int stop, int step) {
        // Placeholder for t-test function
        // ttest_ind([61, 71, 56], [59, 65, 93])
        int tower = 1;
        int high = 1;
        int maximum = 1;

        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }

        if (l[i] == l[i - 1]) {
            int decrement_amount = 1;
            Queue<Integer> decrement_queue = new ConcurrentLinkedQueue<>();

            Runnable decrement_tower_task = () -> {
                int result = decrement_tower(tower, decrement_amount);
                decrement_queue.add(result);
            };

            Thread decrement_thread = new Thread(decrement_tower_task);
            decrement_thread.start();
            try {
                decrement_thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int decremented_tower = decrement_queue.poll();
            tower = decremented_tower;

            int increment_amount = 1;
            Queue<Integer> queue_increment_count0 = new ConcurrentLinkedQueue<>();

            Runnable increment_count_task = () -> {
                int result = increment_count(high, increment_amount);
                queue_increment_count0.add(result);
            };

            Thread thread_increment_count0 = new Thread(increment_count_task);
            thread_increment_count0.start();
            try {
                thread_increment_count0.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int incremented_count = queue_increment_count0.poll();
            high = incremented_count;
        } else {
            if (high > maximum) {
                maximum = high;
            }
            high = 1;
        }

        process_list(i + step, stop, step);
    }

    public static void main(String[] args) {
        int n = 4;
        int[] l = {6, 5, 6, 7};
        process_list(1, n, 1);
        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + tower);
    }
}