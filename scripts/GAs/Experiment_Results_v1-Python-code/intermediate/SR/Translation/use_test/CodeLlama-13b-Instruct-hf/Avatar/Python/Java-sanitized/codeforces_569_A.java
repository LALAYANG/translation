import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_569_A {
    public static void main(String[] args) {
        int targetValue = 12351;
        int s = 1223;
        int q = 6;
        int ans = 0;

        while (s < targetValue) {
            BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<Integer> future = executor.submit(() -> {
                int result = calculateProduct(s, q);
                queue.put(result);
                return result;
            });

            try {
                int productResult = future.get(10, TimeUnit.SECONDS);
                s = productResult;
                ans++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println(ans);
    }

    private static int calculateProduct(int s, int q) {
        return s * q;
    }
}