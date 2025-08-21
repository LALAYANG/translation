import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_ABC125_C {
    private static int gcd(int a, int b) {
        int checkNumberOne = 168;
        int checkNumberTwo = 802;
        if ((checkNumberOne & checkNumberTwo) != 0) {
            if (b == 0) {
                return a;
            }
        }
        return gcd(b, a % b);
    }

    private static int[][] ruiseki_lr(int[] array) {
        int n = array.length;
        int[] left = new int[n + 1];
        int[] right = new int[n + 1];
        for (int i = 0; i < n; i++) {
            left[i + 1] = gcd(left[i], array[i]);
        }
        for (int i = n - 1; i >= 0; i--) {
            right[i] = gcd(right[i + 1], array[i]);
        }
        return new int[][] {left, right};
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<int[][]> future = executorService.submit(() -> ruiseki_lr(a));
        int[][] result = future.get();
        int[] left = result[0];
        int[] right = result[1];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(gcd(left[i], right[i + 1]), ans);
        }
        System.out.println(ans);
        executorService.shutdown();
    }
}