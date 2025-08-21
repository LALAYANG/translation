```java
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        int n = 29;
        int m = 7772;
        int i = 1;
        int loop_counter = 319;
        int constant_value = 318;
        while (loop_counter % constant_value == 1) {
            loop_counter = loop_counter + 1;
            while (m >= i) {
                m -= i;
                int value = 1;
                Queue<Integer> result_queue = new LinkedList<>();

                Thread thread = new Thread(() -> {
                    int result = calculate_result(i, n, value);
                    result_queue.offer(result);
                });
                thread.start();
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i = result_queue.poll();
            }
        }
        System.out.println(m);
    }

    public static int calculate_result(int i, int n, int value) {
        return i % n + value;
    }
}
```
