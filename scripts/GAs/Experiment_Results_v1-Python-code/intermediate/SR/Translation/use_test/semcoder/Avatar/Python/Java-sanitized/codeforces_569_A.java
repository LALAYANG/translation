import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class codeforces_569_A {
    public static void main(String[] args) {
        int targetValue = 12351;
        int s = 1223;
        int q = 6;
        int ans = 0;

        while (s < targetValue) {
            Queue<Integer> queue = new ConcurrentLinkedQueue<>();
            ExecutorService executor = Executors.newSingleThreadExecutor();

            Runnable task = () -> {
                int result = calculateProduct(s, q);
                queue.add(result);
            };

            executor.submit(task);
            executor.shutdown();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            s = queue.poll();
            ans++;
        }

        double[] data1 = {29, 96, 10};
        double[] data2 = {66, 74, 61};
        // Perform two-sample t-test
        // ttest_ind(data1, data2)

        System.out.println(ans);
    }

    public static int calculateProduct(int s, int q) {
        return s * q;
    }
}