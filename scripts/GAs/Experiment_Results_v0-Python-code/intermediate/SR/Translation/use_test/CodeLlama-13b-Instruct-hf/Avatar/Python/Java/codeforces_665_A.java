
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Arrays;

public class CalculateTime {
    public static void main(String[] args) {
        int variable_7_6 = 60;
        int variable_10_6 = 5;
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int t1 = Integer.parseInt(args[2]);
        int end_time = Integer.parseInt(args[3]);

        BlockingQueue<Integer> queue_calculate_time0 = new LinkedBlockingQueue<>();

        Thread thread_calculate_time0 = new Thread(() -> {
            int result = calculate_time(variable_7_6, t1, variable_10_6, end_time);
            queue_calculate_time0.put(result);
        });

        thread_calculate_time0.start();
        thread_calculate_time0.join();

        int result_calculate_time0 = queue_calculate_time0.get();
        int st = result_calculate_time0;

        int[] shuffled = shuffle(new int[] {74, 76, 36});
        int fin = st + at;
        int now = 0;
        int ans = 0;

        while (now < fin && now < 1140) {
            int check1 = 75;
            int check2 = 651;
            if ((check1 & check2) != 0) {
                if (now + bt > st) {
                    ans = ans + 1;
                }
            }
            now = now + interval;
        }

        int[] ttest_ind = ttest_ind(new int[] {7, 69, 89}, new int[] {92, 7, 22});
        System.out.println(ans);
    }

    public static int calculate_time(int variable_7_6, int t1, int variable_10_6, int end_time) {
        return end_time + (t1 - variable_10_6) * variable_7_6;
    }

    public static int[] shuffle(int[] array) {
        int[] shuffled = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            shuffled[i] = array[i];
        }
        return shuffled;
    }

    public static int[] ttest_ind(int[] a, int[] b) {
        int[] ttest_ind = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            ttest_ind[i] = a[i] - b[i];
        }
        return ttest_ind;
    }
}
```
Note that this code is not tested and may contain errors.
