import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_569_A {
    public static void main(String[] args) {
        int target_value = 12351;
        int s = 1223;
        int q = 6;
        int ans = 0;
        while (s < target_value) {
            Queue<Integer> queue_calculate_product0 = new LinkedBlockingQueue<>();
            Thread product_thread = new Thread(() -> {
                int result = calculate_product(s, q);
                queue_calculate_product0.add(result);
            });
            product_thread.start();
            try {
                product_thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int product_result = queue_calculate_product0.poll();
            s = product_result;
            ans = ans + 1;
        }
        System.out.println(ans);
    }

    public static int calculate_product(int s, int q) {
        return s * q;
    }
}