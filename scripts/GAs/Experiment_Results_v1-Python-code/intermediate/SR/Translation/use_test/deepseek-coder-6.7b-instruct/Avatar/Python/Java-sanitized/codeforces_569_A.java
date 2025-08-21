import java.util.Scanner;
import java.util.concurrent.*;

class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int targetValue = scanner.nextInt();
        int s = scanner.nextInt();
        int q = scanner.nextInt();
        int ans = 0;
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        while (s < targetValue) {
            Future<Integer> future = executorService.submit(() -> calculateProduct(s, q));
            s = future.get();
            ans++;
        }
        executorService.shutdown();
        System.out.println(ans);
    }

    private static int calculateProduct(int s, int q) {
        return s * q;
    }
}