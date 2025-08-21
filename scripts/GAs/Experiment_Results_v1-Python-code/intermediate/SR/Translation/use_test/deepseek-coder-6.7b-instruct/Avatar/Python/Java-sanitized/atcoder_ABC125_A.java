import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    private static int cookie = 0;
    private static int b;
    private static int t;
    private static final Object lock = new Object();

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        b = scanner.nextInt();
        t = scanner.nextInt();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int currentTime = a; currentTime <= t + 0.5; currentTime += a) {
            Future<Integer> future = executorService.submit(() -> calculateCookie(cookie, b));
            cookie = future.get();
        }
        executorService.shutdown();
        System.out.println(cookie);
    }

    public static int calculateCookie(int cookie, int b) {
        synchronized (lock) {
            return cookie + b;
        }
    }
}