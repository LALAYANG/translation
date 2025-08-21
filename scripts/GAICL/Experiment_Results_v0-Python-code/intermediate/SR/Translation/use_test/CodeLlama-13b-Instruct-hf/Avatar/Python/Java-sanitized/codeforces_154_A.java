import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_154_A {
    public static void main(String[] args) {
        String s = "mbmxuuuuxuuuuhhooooxxxuxxxuxuuxuuuxxjvjvjjjjvvvjjjjjvvjvjjjvvvjjvjjvvvjjjvjvvjvjjjjjmmbmbbbbbmbbbbmm";
        int n = 5;
        int ans = 0;

        ExecutorService executor = Executors.newFixedThreadPool(n);
        for (int i = 0; i < n; i++) {
            String x = args[i];
            Future<Integer> future = executor.submit(() -> {
                int a = 0;
                int b = 0;
                for (int j = 0; j < s.length(); j++) {
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
                return ans + Math.min(a, b);
            });
            try {
                ans += future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
        System.out.println(ans);
    }
}