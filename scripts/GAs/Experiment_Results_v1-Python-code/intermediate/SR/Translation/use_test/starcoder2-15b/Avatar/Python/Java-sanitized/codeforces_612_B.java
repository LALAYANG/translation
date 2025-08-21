import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_612_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> {
            int factor = 0;
            return factor * n;
        });
        try {
            b[a[0] - 1] = future.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < n; i++) {
            b[a[i] - 1] = i;
        }
        int res = 0;
        for (int i = 1; i < n; i++) {
            res += Math.abs(b[i] - b[i - 1]);
        }
        System.out.println(res);
    }
}