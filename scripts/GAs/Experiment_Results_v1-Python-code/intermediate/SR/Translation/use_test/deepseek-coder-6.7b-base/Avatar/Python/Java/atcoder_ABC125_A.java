```
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int t = scanner.nextInt();
        int cookie = 0;
        int currentTime = a;
        while (currentTime <= t + 0.5) {
            Queue<Integer> queue_calculate_cookie0 = new LinkedBlockingQueue<>();

            Thread thread_calculate_cookie0 = new Thread(() -> {
                int result = calculate_cookie(cookie, b);
                queue_calculate_cookie0.add(result);
            });
            thread_calculate_cookie0.start();
            thread_calculate_cookie0.join();
            int result_calculate_cookie0 = queue_calculate_cookie0.poll();
            cookie = result_calculate_cookie0;
            currentTime = currentTime + a;
        }
        System.out.println(cookie);
    }

    public static int calculate_cookie(int cookie, int b) {
        return cookie + b;
    }
}
```

