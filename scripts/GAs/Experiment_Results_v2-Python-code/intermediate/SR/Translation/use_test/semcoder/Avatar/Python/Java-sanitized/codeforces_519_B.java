import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_519_B {
    public static int sum_x(int i, int x) {
        return x + i;
    }

    public static void main(String[] args) {
        int n = 6; // Assuming n is provided as input
        int[] a = {1, 4, 3, 3, 5, 7};
        int[] b = {3, 7, 5, 4, 3};
        int[] numbers_c = {4, 3, 7, 5};
        int x = 0;
        int y = 0;
        int z = 0;

        for (int i : a) {
            Queue<Integer> queue_sum_x0 = new LinkedBlockingQueue<>();
            Thread thread_sum_x0 = new Thread(() -> {
                int result = sum_x(i, x);
                queue_sum_x0.add(result);
            });
            thread_sum_x0.start();
            try {
                thread_sum_x0.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            x = queue_sum_x0.poll();
        }

        for (int i : b) {
            y += i;
        }

        // ttest_ind([31, 42, 42], [25, 19, 18])

        for (int i : numbers_c) {
            z += i;
        }

        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - z));
    }
}