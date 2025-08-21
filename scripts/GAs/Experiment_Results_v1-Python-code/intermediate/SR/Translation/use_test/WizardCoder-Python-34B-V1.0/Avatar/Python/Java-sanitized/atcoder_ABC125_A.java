import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Scanner;

public class atcoder_ABC125_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int t = scanner.nextInt();
        int cookie = 0;
        double currentTime = a;
        ExecutorService executor = Executors.newSingleThreadExecutor();
        while (currentTime <= t + 0.5) {
            int result = calculateCookie(cookie, b);
            cookie = result;
            currentTime += a;
        }
        System.out.println(cookie);
    }

    public static int calculateCookie(int cookie, int b) {
        return cookie + b;
    }
}