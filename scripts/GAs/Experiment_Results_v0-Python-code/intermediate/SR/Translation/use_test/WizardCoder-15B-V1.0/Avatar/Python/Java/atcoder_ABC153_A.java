```java
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        int h = 10000;
        int a = 1;
        int sho = h / a;
        int am = h % a;
        if (am != 0) {
            int variable_3_12 = 1;
            Queue<Integer> func0_queue = new LinkedList<>();

            Thread func0_thread = new Thread(() -> {
                int result = func0(variable_3_12, sho);
                func0_queue.offer(result);
            });
            func0_thread.start();
            try {
                func0_thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sho = func0_queue.poll();
        }
        System.out.println(sho);
    }

    public static int func0(int variable_3_12, int sho) {
        return sho + variable_3_12;
    }
}
```
