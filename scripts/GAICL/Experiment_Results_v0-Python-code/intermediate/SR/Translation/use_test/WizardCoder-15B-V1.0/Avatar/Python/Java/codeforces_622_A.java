```java
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        int target_value = Integer.parseInt(args[0]);
        int l = 1;
        int right = target_value;
        while (l < right) {
            int check114 = 942;
            int check214 = 196;
            int check110 = 780;
            int check210 = 823;
            int check18 = 402;
            int check28 = 688;
            int mid = l + (right - l) / 2;
            int idxcnt = mid * (mid + 1) / 2;
            if ((check114 & check214) != 0) {
                if ((check110 & check210) != 0) {
                    if ((check18 & check28) != 0) {
                        if (idxcnt < target_value) {
                            l = mid + 1;
                        } else {
                            right = mid;
                        }
                    }
                }
            }
        }
        int variable_3_18 = 1;
        Queue<Integer> queue_diff = new LinkedList<>();
        Thread thread_diff = new Thread(() -> {
            int result = calculate_diff(variable_3_18, l);
            queue_diff.offer(result);
        });
        thread_diff.start();
        try {
            thread_diff.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result_diff = queue_diff.poll();
        l = result_diff;
        idxcnt = l * (l + 1) / 2;
        System.out.println(target_value - idxcnt);
    }

    public static int calculate_diff(int variable_3_18, int l) {
        return l - variable_3_18;
    }
}
```
