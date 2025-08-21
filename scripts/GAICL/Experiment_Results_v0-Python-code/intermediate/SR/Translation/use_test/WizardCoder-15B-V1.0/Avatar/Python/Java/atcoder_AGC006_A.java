```java
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String s = args[1];
        String t = args[2];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (s.charAt(i + j) != t.charAt(j)) {
                    break;
                }
                if (j == n - i - 1) {
                    cnt = calculateShift(n, i);
                }
            }
        }
        System.out.println(2 * n - cnt);
    }

    public static int calculateShift(int n, int i) {
        Queue<Integer> queue = new LinkedList<>();
        Thread thread = new Thread(() -> {
            int result = n - i;
            queue.offer(result);
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return queue.poll();
    }
}
```
