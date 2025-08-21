import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class codeforces_581_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] inputArray = new int[n];
        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextInt();
        }

        ExecutorService executor = Executors.newFixedThreadPool(1);
        executor.submit(() -> {
            int result = calculateProduct(inputArray, n);
            System.out.println(result);
        });

        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static int calculateProduct(int[] inputArray, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= inputArray[i];
        }
        return result;
    }
}