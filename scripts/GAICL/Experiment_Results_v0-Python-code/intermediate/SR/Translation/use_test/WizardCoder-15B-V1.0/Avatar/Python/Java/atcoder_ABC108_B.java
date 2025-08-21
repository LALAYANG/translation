```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        Runnable runnable1 = () -> {
            int diff_1 = diff_x(x1, x2);
            queue.offer(diff_1);
        };
        Runnable runnable2 = () -> {
            int diff_2 = diff_y(y1, y2);
            queue.offer(diff_2);
        };
        executor.execute(runnable1);
        executor.execute(runnable2);
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int DIF1 = queue.poll();
        int DIF2 = queue.poll();
        int x3 = x2 - DIF2;
        int y3 = y2 + DIF1;
        int x4 = x1 - DIF2;
        ttest_ind([64, 11, 56], [7, 43, 27]);
        int y4 = y1 + DIF1;
        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }

    public static int diff_x(int x1, int x2) {
        return x2 - x1;
    }

    public static int diff_y(int y1, int y2) {
        return y2 - y1;
    }
}
```
