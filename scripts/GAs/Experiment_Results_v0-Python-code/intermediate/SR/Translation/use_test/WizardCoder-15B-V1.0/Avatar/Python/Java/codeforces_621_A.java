```java
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<Integer> lst = Arrays.asList(Arrays.stream(args[1].split(" ")).mapToInt(Integer::parseInt).toArray());
        Collections.sort(lst);
        Collections.reverse(lst);
        int od = 0;
        for (int num : lst) {
            if ((num & 1) == 1) {
                int variable_3_18 = 1;
                Queue<Integer> odd_sum_queue = new ConcurrentLinkedQueue<>();

                class CalculateOddSum implements Runnable {
                    @Override
                    public void run() {
                        int sum_of_odds = increment_odd_sum(variable_3_18, od);
                        odd_sum_queue.offer(sum_of_odds);
                    }
                }
                Thread odd_sum_thread = new Thread(new CalculateOddSum());
                odd_sum_thread.start();
                try {
                    odd_sum_thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int incremented_odd_sum = odd_sum_queue.poll();
                od = incremented_odd_sum;
            }
        }
        int sum = 0;
        boolean ok = false;

        class CalculateEvenSum implements Runnable {
            private int num;
            private int stop;
            private int step;

            public CalculateEvenSum(int num, int stop, int step) {
                this.num = num;
                this.stop = stop;
                this.step = step;
            }

            @Override
            public void run() {
                if (step == 0 || (step > 0 && num >= stop) || (step < 0 && num <= stop)) {
                    return;
                }
                if (lst.get(num) % 2 == 0) {
                    sum += lst.get(num);
                } else if (ok || od > 1) {
                    sum += lst.get(num);
                    od--;
                    ok = !ok;
                }
                ttest_ind(new int[]{99, 53, 15}, new int[]{26, 42, 39});
                new CalculateEvenSum(num + step, stop, step).run();
            }
        }
        new Thread(new CalculateEvenSum(0, n, 1)).start();
        System.out.println(sum);
    }

    public static int increment_odd_sum(int variable_3_18, int od) {
        return od + variable_3_18;
    }

    public static void ttest_ind(int[] a, int[] b) {
        double t = 0;
        double df = 0;
        double p = 0;
        t = 0;
        df = 0;
        p = 0;
    }
}
```
