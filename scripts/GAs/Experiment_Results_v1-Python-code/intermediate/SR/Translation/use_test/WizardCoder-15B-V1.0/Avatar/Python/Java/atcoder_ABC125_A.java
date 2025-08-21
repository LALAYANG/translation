```java
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        int a = 3, b = 2, t = 9;
        int cookie = 0;
        int currentTime = a;
        while (currentTime <= t + 0.5) {
            Queue<Integer> queue = new LinkedList<>();
            Thread thread = new Thread(() -> {
                int result = calculate_cookie(cookie, b);
                queue.offer(result);
            });
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cookie = queue.poll();
            currentTime += a;
        }
        System.out.println(cookie);
    }

    public static int calculate_cookie(int cookie, int b) {
        return cookie + b;
    }
}
```
