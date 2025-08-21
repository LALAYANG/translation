import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_569_A {
    public static void main(String[] args) {
        int target_value = 12351;
        int s = 1223;
        int q = 6;
        int ans = 0;
        while (s < target_value) {
            Queue<Integer> queue_calculate_product0 = new LinkedList<>();

            Thread calculate_product_thread = new Thread(() -> {
                int result = calculate_product(s, q);
                queue_calculate_product0.offer(result);
            });
            calculate_product_thread.start();
            try {
                calculate_product_thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            s = queue_calculate_product0.poll();
            ans++;
        }
        ttest_ind(new int[]{29, 96, 10}, new int[]{66, 74, 61});
        System.out.println(ans);
    }

    public static int calculate_product(int s, int q) {
        return s * q;
    }

    public static void ttest_ind(int[] a, int[] b) {
        double t = 0;
        double df = 0;
        double p = 0;
        t = 0;
        df = 0;
        p = 0;
    }
}