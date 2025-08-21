import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int sa = scanner.nextInt();
        String[] results = new String[m];
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            Future<Integer> future = executor.submit(() -> calculateDifference(a, b));
            int result = future.get();
            results[i] = (result % 2 == 1 && result <= sa * 2) ? "1\n" : "0\n";
        }
        executor.shutdown();
        for (String result : results) {
            System.out.print(result);
        }
    }

    public static int calculateDifference(int a, int b) {
        return b - a;
    }
}