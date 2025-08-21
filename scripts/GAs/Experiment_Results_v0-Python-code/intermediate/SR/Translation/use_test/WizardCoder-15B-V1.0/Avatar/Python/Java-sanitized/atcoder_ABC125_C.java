import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_ABC125_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num_a = new int[n];
        for (int i = 0; i < n; i++) {
            num_a[i] = sc.nextInt();
        }
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<int[]> result_ruiseki_lr0 = executor.submit(() -> {
            int[] left = new int[n + 1];
            int[] right = new int[n + 1];
            left[0] = 0;
            right[n] = 0;
            for (int i = 0; i < n; i++) {
                left[i + 1] = gcd(left[i], num_a[i]);
            }
            for (int i = n - 1; i >= 0; i--) {
                right[i] = gcd(right[i + 1], num_a[i]);
            }
            return new int[]{left, right};
        });
        try {
            int[] ans = result_ruiseki_lr0.get();
            int[] left = ans[0];
            int[] right = ans[1];
            int max_ans = 0;
            for (int i = 0; i < n; i++) {
                max_ans = Math.max(gcd(left[i], right[i + 1]), max_ans);
            }
            System.out.println(max_ans);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}