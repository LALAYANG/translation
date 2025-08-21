```
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws Exception {
        String[] p = System.console().readLine().split(" ");
        int x1 = Integer.parseInt(p[0]);
        int y1 = Integer.parseInt(p[1]);
        int x2 = Integer.parseInt(p[2]);
        int y2 = Integer.parseInt(p[3]);
        Queue<Integer> queue_difference_x = new ConcurrentLinkedQueue<>();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future_difference_x = executor.submit(() -> calculate_difference_x(x1, x2));
        int difference_x = future_difference_x.get();
        int DIF1 = difference_x;
        int DIF2 = y2 - y1;
        int x3 = x2 - DIF2;
        int y3 = y2 + DIF1;
        int x4 = x1 - DIF2;
        int y4 = y1 + DIF1;
        System.out.println(String.format("%d %d %d %d", x3, y3, x4, y4));
    }

    public static int calculate_difference_x(int x1, int x2) {
        return x2 - x1;
    }
}
```

