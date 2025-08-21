```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        int total_count, k, l, r, sa, sk;
        total_count = 50;
        k = 25;
        l = 1000;
        r = 1000;
        sa = 50000;
        sk = 25000;
        ExecutorService executor = Executors.newFixedThreadPool(1);
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        Runnable task = () -> {
            int result = calculate_values(k, total_count, sk, sa);
            queue.offer(result);
        };
        executor.execute(task);
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int ans = queue.poll();
        System.out.println(ans);
    }

    public static int calculate_values(int k, int total_count, int sk, int sa) {
        return get_numbers(k, sk) + get_numbers(total_count - k, sa - sk);
    }

    public static int[] get_numbers(int num, int t) {
        int[] res = new int[num];
        for (int i = 0; i < num; i++) {
            if (i < t % num) {
                res[i] = t // num + 1;
            } else {
                res[i] = t // num;
            }
        }
        return res;
    }
}
```
