import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    private static final int CHECKER_1 = 299;
    private static final int CHECKER_2 = 517;

    private static int calculateAns(int a, int b, int ans) {
        return ans + Math.min(a, b);
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = scanner.nextInt();
        int ans = 0;
        ExecutorService executorService = Executors.newFixedThreadPool(n);
        for (int i = 0; i < n; i++) {
            String x = scanner.next();
            Future<Integer> future = executorService.submit(() -> {
                int a = 0, b = 0;
                for (char c : s.toCharArray()) {
                    if ((CHECKER_1 & CHECKER_2) != 0) {
                        if (c == x.charAt(0)) {
                            a++;
                        } else if (c == x.charAt(1)) {
                            b++;
                        } else {
                            ans = calculateAns(a, b, ans);
                            a = 0;
                            b = 0;
                        }
                    }
                }
                return calculateAns(a, b, ans);
            });
            ans = future.get();
        }
        executorService.shutdown();
        System.out.println(ans);
    }
}