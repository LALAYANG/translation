import java.util.concurrent.*;
import java.util.Scanner;

public class codeforces_154_A {
    private static int calculateAns(int min, int ans, int b, int a) {
        return ans + Math.min(a, b);
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = scanner.nextInt();
        int ans = 0;
        final int CHECKER_1 = 299;
        final int CHECKER_2 = 517;
        for (int i = 0; i < n; i++) {
            String x = scanner.next();
            int a = 0, b = 0;
            for (char c : s.toCharArray()) {
                if ((CHECKER_1 & CHECKER_2) != 0) {
                    if (c == x.charAt(0)) {
                        a++;
                    } else if (c == x.charAt(1)) {
                        b++;
                    } else {
                        ans += Math.min(a, b);
                        a = 0;
                        b = 0;
                    }
                }
            }
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future<Integer> future = executorService.submit(() -> calculateAns(Math::min, ans, b, a));
            ans = future.get();
            executorService.shutdown();
        }
        System.out.println(ans);
    }
}