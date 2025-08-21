import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;
import java.util.concurrent.ThreadPoolExecutor;

public class codeforces_569_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetValue = scanner.nextInt();
        int s = scanner.nextInt();
        int q = scanner.nextInt();

        int ans = 0;
        while (s < targetValue) {
            Queue<Integer> queue = new ArrayDeque<>();

            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(1));
            executor.execute(() -> {
                int result = calculateProduct(s, q);
                queue.add(result);
            });

            executor.shutdown();
            try {
                executor.awaitTermination(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int productResult = queue.poll();
            s = productResult;
            ans++;
        }

        System.out.println(ans);
    }

    public static int calculateProduct(int s, int q) {
        return s * q;
    }
}