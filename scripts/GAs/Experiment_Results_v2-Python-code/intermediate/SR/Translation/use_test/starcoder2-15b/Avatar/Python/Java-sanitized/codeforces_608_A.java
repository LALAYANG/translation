import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_608_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int initialValue = scanner.nextInt();
        int maxDifference = 0;
        for (int i = 0; i < n; i++) {
            int currentValue = scanner.nextInt();
            int t = scanner.nextInt();
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future<Integer> future = executorService.submit(() -> calculateDiff(initialValue, t, currentValue));
            try {
                int diff = future.get();
                if (diff > maxDifference) {
                    maxDifference = diff;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            executorService.shutdown();
        }
        System.out.println(initialValue + maxDifference);
    }

    private static int calculateDiff(int initialValue, int t, int currentValue) {
        return t - (initialValue - currentValue);
    }
}