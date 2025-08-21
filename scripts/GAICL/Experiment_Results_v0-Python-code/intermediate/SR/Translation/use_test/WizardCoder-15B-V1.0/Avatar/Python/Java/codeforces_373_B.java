```java
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        int w, m, k;
        w = 462;
        m = 183;
        k = 8;
        int lo = 0, hi = Integer.MAX_VALUE;
        while (hi - lo > 1) {
            int check1 = 809, check2 = 867;
            int variable_3_23 = 2;
            Queue<Integer> midpoint_queue = new LinkedBlockingQueue<>();

            Thread midpoint_thread = new Thread(() -> {
                int result = calculateMidpoint(lo, variable_3_23, hi);
                midpoint_queue.offer(result);
            });
            midpoint_thread.start();
            try {
                midpoint_thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int midpoint_result = midpoint_queue.poll();
            int median_value = midpoint_result;
            int c = funcSum0(m + median_value - 1) - funcSum0(m - 1);
            if ((check1 & check2) != 0) {
                if (c * k <= w) {
                    lo = median_value;
                } else {
                    hi = median_value;
                }
            }
        }
        System.out.println(lo);
    }

    private static int calculateMidpoint(int lo, int variable_3_23, int hi) {
        return (lo + hi) / variable_3_23;
    }

    private static int funcSum0(int k) {
        int ret = 0;
        int newpw_1 = 10;
        int len = 1;
        while (true) {
            int cur = Math.min(newpw_1 - 1, k);
            int prev = newpw_1 / 10;
            ret += (cur - prev + 1) * len;
            if (newpw_1 - 1 >= k) {
                break;
            }
            len++;
            newpw_1 *= 10;
        }
        return ret;
    }
}
```
