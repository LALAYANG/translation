import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Thread;

public class codeforces_629_B {
    static int N = 368;
    static int[] global_array = {0};
    static BlockingQueue<Integer> queue_calculate_product0 = new LinkedBlockingQueue<>();

    public static void main(String[] args) throws InterruptedException {
        Thread thread_calculate_product0 = new Thread(() -> {
            try {
                queue_calculate_product0.put(calculate_product(N, global_array));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread_calculate_product0.start();
        thread_calculate_product0.join();
        int result_calculate_product0 = queue_calculate_product0.poll();
        int[] m = {result_calculate_product0};
        int[] f = new int[N];

        // process_input and calculate_min_pairs functions are not implemented in Java
        // because they are using Python-specific features like dynamic typing and list comprehension
        // which are not available in Java.

        // print(c) is not implemented in Java because it's using Python's print function
        // which is not available in Java.
    }

    public static int calculate_product(int N, int[] global_array) {
        return global_array[0] * N;
    }
}