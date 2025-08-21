```
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int sho = h / a;
        int am = h % a;
        if (am != 0) {
            int variable_3_12 = 1;
            Queue<Integer> func0_queue = new LinkedBlockingQueue<>();
            ThreadPoolExecutor func0_thread_pool = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
            func0_thread_pool.execute(() -> {
                int result = func0(variable_3_12, sho);
                func0_queue.add(result);
            });
            func0_thread_pool.shutdown();
            try {
                func0_thread_pool.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
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

