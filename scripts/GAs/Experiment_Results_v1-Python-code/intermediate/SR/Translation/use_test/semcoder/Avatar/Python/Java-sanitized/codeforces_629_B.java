import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_629_B {
    public static void main(String[] args) {
        int N = 368;
        int[] global_array = new int[1];
        Queue<Integer> queue_calculate_product0 = new LinkedBlockingQueue<>();

        new Thread(() -> {
            int result = calculate_product(N, global_array);
            queue_calculate_product0.add(result);
        }).start();

        int m = queue_calculate_product0.poll();
        int[] f = new int[N];

        // Rest of the code remains the same as in the Python solution
    }

    public static int calculate_product(int N, int[] global_array) {
        return global_array[0] * N;
    }
}