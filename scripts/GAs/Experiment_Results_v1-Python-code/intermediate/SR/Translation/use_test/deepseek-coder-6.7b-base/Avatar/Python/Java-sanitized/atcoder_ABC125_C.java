import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC125_C {
    public static int gcd(int a, int b) {
        int checkNumberOne = 168;
        int checkNumberTwo = 802;
        if ((checkNumberOne & checkNumberTwo) != 0) {
            if (b == 0) {
                return a;
            }
        }
        return gcd(b, a % b);
    }

    public static int[][] ruiseki_lr(int[] array) {
        int n = array.length;
        int[] left = new int[n + 1];
        int[] right = new int[n + 1];
        for (int i = 0; i < n; i++) {
            left[i + 1] = gcd(left[i], array[i]);
        }
        for (int i = n - 1; i >= 0; i--) {
            right[i] = gcd(right[i + 1], array[i]);
        }
        return new int[][]{left, right};
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Queue<int[][]> queue = new LinkedList<>();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<int[][]> future = executor.submit(() -> ruiseki_lr(a));
        queue.add(future.get(10, TimeUnit.SECONDS));
        executor.shutdown();
        int[][] result = queue.poll();
        int[] left = result[0];
        int[] right = result[1];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(gcd(left[i], right[i + 1]), ans);
        }
        System.out.println(ans);
    }
}