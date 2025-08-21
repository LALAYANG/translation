```java
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String s = args[1];
        String target = args[2];
        int cnt = 0;
        for (int shift_amount = 0; shift_amount < n; shift_amount++) {
            for (int j = 0; j < n - shift_amount; j++) {
                if (s.charAt(shift_amount + j) != target.charAt(j)) {
                    break;
                }
                if (j == n - shift_amount - 1) {
                    Queue<Integer> queue_calculate_shift = new LinkedList<>();
                    Thread thread_calculate_shift = new Thread(() -> {
                        int result = calculate_shift(shift_amount, n);
                        queue_calculate_shift.offer(result);
                    });
                    thread_calculate_shift.start();
                    try {
                        thread_calculate_shift.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int result_calculate_shift = queue_calculate_shift.poll();
                    cnt = result_calculate_shift;
                }
            }
        }
        System.out.println(2 * n - cnt);
    }

    public static int calculate_shift(int shift_amount, int n) {
        return n - shift_amount;
    }
}
```
