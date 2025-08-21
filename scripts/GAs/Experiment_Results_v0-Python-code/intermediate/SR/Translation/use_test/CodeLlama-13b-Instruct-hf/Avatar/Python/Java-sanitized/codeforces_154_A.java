import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_154_A {
    public static void main(String[] args) throws Exception {
        String s = args[0];
        int n = Integer.parseInt(args[1]);
        int ans = 0;
        int CHECKER_1 = 299;
        int CHECKER_2 = 517;
        ExecutorService executor = Executors.newFixedThreadPool(n);
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        for (int i = 0; i < n; i++) {
            String x = args[i + 2];
            int a = 0;
            int b = 0;
            for (int j = 0; j < s.length(); j++) {
                if ((CHECKER_1 & CHECKER_2) != 0) {
                    if (s.charAt(j) == x.charAt(0)) {
                        a++;
                    } else if (s.charAt(j) == x.charAt(1)) {
                        b++;
                    } else {
                        ans += Math.min(a, b);
                        a = 0;
                        b = 0;
                    }
                }
            }
            Callable<Integer> task = () -> {
                int result = calculateAns(min, ans, b, a);
                queue.put(result);
                return result;
            };
            Future<Integer> future = executor.submit(task);
            future.get();
            ans = queue.take();
        }
        executor.shutdown();
        System.out.println(ans);
    }

    private static int calculateAns(int min, int ans, int b, int a) {
        return ans + Math.min(a, b);
    }
}