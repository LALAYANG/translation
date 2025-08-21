import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_ABC125_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int t = scanner.nextInt();
        int cookie = 0;
        double currentTime = a;
        while (currentTime <= t + 0.5) {
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<Integer> future = executor.submit(() -> calculate_cookie(cookie, b));
            cookie = future.get();
            currentTime = currentTime + a;
        }
        System.out.println(cookie);
    }

    public static int calculate_cookie(int cookie, int b) {
        return cookie + b;
    }
}