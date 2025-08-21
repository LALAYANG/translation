import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class codeforces_92_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int current_value = 1;
        while (m >= current_value) {
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<Integer> future = executor.submit(() -> calculateDifference(current_value, m));
            try {
                m = future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
            int constant_one = 1;
            Future<Integer> future2 = executor.submit(() -> calculateSumWithModulo(current_value, constant_one, n));
            try {
                current_value = future2.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
            executor.shutdown();
            try {
                executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(m);
    }

    public static int calculateDifference(int current_value, int m) {
        return m - current_value;
    }

    public static int calculateSumWithModulo(int current_value, int constant_one, int n) {
        return current_value % n + constant_one;
    }
}