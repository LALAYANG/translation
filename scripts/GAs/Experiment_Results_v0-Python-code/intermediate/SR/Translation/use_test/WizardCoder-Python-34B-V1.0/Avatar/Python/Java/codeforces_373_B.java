```java
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int lo = 0;
        int hi = (int) 1e+18;
        while (hi - lo > 1) {
            int check1 = 809;
            int check2 = 867;
            int variable_3_23 = 2;
            Queue<Integer> midpoint_queue = new LinkedList<>();
            Lock lock = new ReentrantLock();
            Condition condition = lock.newCondition();

            Thread midpoint_thread = new Thread(() -> {
                int midpoint_result = calculate_midpoint(lo, variable_3_23, hi);
                lock.lock();
                try {
                    midpoint_queue.add(midpoint_result);
                    condition.signal();
                } finally {
                    lock.unlock();
                }
            });
            midpoint_thread.start();

            lock.lock();
            try {
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int midpoint_result = midpoint_queue.peek();
            int median_value = midpoint_result;
            int c = Func_sum_0(m + median_value - 1) - Func_sum_0(m - 1);
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

    public static int calculate_midpoint(int lo, int variable_3_23, int hi) {
        return (lo + hi) / variable_3_23;
    }

    public static int Func_sum_0(int k) {
        int ret = 0;
        int power_of_ten = 10;
        int len = 1;
        while (true) {
            int cur = Math.min(power_of_ten - 1, k);
            int prev = power_of_ten / 10;
            ret += (cur - prev + 1) * len;
            if (power_of_ten - 1 >= k) {
                break;
            }
            len++;
            power_of_ten *= 10;
        }
        return ret;
    }
}
```

Sample test case:

Test input:
462 183 8

Expected output:
19 
