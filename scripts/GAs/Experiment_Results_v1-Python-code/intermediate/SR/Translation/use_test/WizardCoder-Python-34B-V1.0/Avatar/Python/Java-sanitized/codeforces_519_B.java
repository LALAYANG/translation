import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class codeforces_519_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array_a = new int[n];
        for (int i = 0; i < n; i++) {
            array_a[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        int x = 0;
        int y = 0;
        int sum_c = 0;
        ExecutorService executor = Executors.newFixedThreadPool(n);
        for (int i : array_a) {
            executor.submit(() -> {
                int result = calculate_sum(i, x);
                x = result;
            });
        }
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i : b) {
            y += i;
        }
        for (int i : c) {
            sum_c += i;
        }
        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - sum_c));
    }

    public static int calculate_sum(int i, int x) {
        return i + x;
    }
}