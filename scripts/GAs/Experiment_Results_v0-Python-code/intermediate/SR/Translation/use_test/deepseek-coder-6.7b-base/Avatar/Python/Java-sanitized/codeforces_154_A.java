import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_154_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = scanner.nextInt();
        int ans = 0;
        int CHECKER_1 = 299;
        int CHECKER_2 = 517;
        for (int i = 0; i < n; i++) {
            String x = scanner.next();
            int a = 0;
            int b = 0;
            for (int j = 0; j < s.length(); j++) {
                if (CHECKER_1 & CHECKER_2) {
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
            Queue<Integer> queue = new LinkedList<>();
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future<Integer> future = executorService.submit(() -> calculateAns(Math.min, ans, b, a));
            try {
                ans = future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
            executorService.shutdown();
        }
        System.out.println(ans);
    }

    public static int calculateAns(int min, int ans, int b, int a) {
        return ans + min(a, b);
    }
}