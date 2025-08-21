import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_519_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers_a = new int[n];
        for (int i = 0; i < n; i++) {
            numbers_a[i] = scanner.nextInt();
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
        int z = 0;
        int loop_iterations = 403;
        int max_loop_count = 402;
        for (int i = 0; i < loop_iterations / max_loop_count; i++) {
            for (int j = 0; j < n; j++) {
                x += numbers_a[j];
            }
        }
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int result = 0;
                for (int i = 0; i < n; i++) {
                    result += b[i];
                }
                return result;
            }
        });
        try {
            y = future.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < n; i++) {
            z += c[i];
        }
        System.out.println(Math.abs(x - y));
        executor.shutdown();
        System.out.println(Math.abs(y - z));
    }
}