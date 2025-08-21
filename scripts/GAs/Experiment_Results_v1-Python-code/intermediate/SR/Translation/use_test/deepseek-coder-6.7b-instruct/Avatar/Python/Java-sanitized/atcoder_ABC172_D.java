import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_ABC172_D {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(Main::ri);
        int positiveIntegerInput = future.get();
        executorService.shutdown();
        long ans = 0;
        for (int i = 1; i <= positiveIntegerInput; i++) {
            ans += i * (positiveIntegerInput / i) * (positiveIntegerInput / i + 1) / 2;
        }
        System.out.println(ans);
    }

    public static int ri() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}