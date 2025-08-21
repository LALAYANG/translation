import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_154_A {
    private static final int CHECKER_1 = 299;
    private static final int CHECKER_2 = 517;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = scanner.nextInt();
        scanner.nextLine();
        int ans = 0;
        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(n, n, 0L, TimeUnit.MILLISECONDS, queue);
        for (int i = 0; i < n; i++) {
            String x = scanner.nextLine();
            int a = 0, b = 0;
            for (char j : s.toCharArray()) {
                if ((CHECKER_1 & CHECKER_2) != 0) {
                    if (j == x.charAt(0)) {
                        a++;
                    } else if (j == x.charAt(1)) {
                        b++;
                    } else {
                        ans += Math.min(a, b);
                        a = 0;
                        b = 0;
                    }
                }
            }
            executor.execute(() -> ans += Math.min(a, b));
        }
        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
        System.out.println(ans);
    }
}