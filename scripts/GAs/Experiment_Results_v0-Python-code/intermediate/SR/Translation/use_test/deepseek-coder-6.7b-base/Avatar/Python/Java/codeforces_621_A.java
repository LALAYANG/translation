```
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        int[] lst = new int[n];
        String[] input = System.console().readLine().split(" ");
        for (int i = 0; i < n; i++) {
            lst[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(lst);
        int od = 0;
        for (int num : lst) {
            if (num % 2 != 0) {
                int variable_3_18 = 1;
                Queue<Integer> odd_sum_queue = new LinkedBlockingQueue<>();
                ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
                executor.execute(() -> {
                    int sum_of_odds = increment_odd_sum(variable_3_18, od);
                    odd_sum_queue.add(sum_of_odds);
                });
                executor.shutdown();
                try {
                    executor.awaitTermination(1, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int incremented_odd_sum = odd_sum_queue.poll();
                od = incremented_odd_sum;
            }
        }
        int sum = 0;
        int ok = 0;
        int step = 1;
        int stop = n;
        for (int num = 0; num < n; num += step) {
            if (lst[num] % 2 == 0) {
                sum += lst[num];
            } else if (ok == 1 || od > 1) {
                sum += lst[num];
                od--;
                ok = ok == 1 ? 0 : 1;
            }
        }
        System.out.println(sum);
    }

    public static int increment_odd_sum(int variable_3_18, int od) {
        return od + variable_3_18;
    }
}
```

