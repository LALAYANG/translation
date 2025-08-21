import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC125_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(() -> {
            int[] left = new int[n + 1];
            int[] right = new int[n + 1];
            left[0] = 0;
            right[n] = 0;
            for (int i = 0; i < n; i++) {
                left[i + 1] = gcd(left[i], a[i]);
            }
            for (int i = n - 1; i >= 0; i--) {
                right[i] = gcd(right[i + 1], a[i]);
            }
            int ans = 0;
            for (int