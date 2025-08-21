import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class codeforces_313_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int queryCount = scanner.nextInt();
        int[] queries = new int[queryCount];
        for (int i = 0; i < queryCount; i++) {
            queries[i] = scanner.nextInt();
        }

        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < queryCount; i++) {
            int query = queries[i];
            executor.submit(() -> {
                int result = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[j] == query) {
                        result++;
                    }
                }
                System.out.println(result);
            });
        }

        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}