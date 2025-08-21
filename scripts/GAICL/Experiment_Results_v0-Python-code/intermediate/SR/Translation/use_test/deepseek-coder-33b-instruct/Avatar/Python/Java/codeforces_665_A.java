Here is the Java equivalent of the Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Thread;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int at = scanner.nextInt();
        int interval = scanner.nextInt();
        int bt = scanner.nextInt();
        int t1 = scanner.nextInt();
        int end_time = scanner.nextInt();
        int variable_7_6 = 60;
        int variable_10_6 = 5;
        BlockingQueue<Integer> queue_calculate_time0 = new LinkedBlockingQueue<>();

        Thread thread_calculate_time0 = new Thread(() -> {
            int result = calculate_time(variable_7_6, t1, variable_10_6, end_time);
            try {
                queue_calculate_time0.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread_calculate_time0.start();
        thread_calculate_time0.join();
        int result_calculate_time0 = queue_calculate_time0.poll();
        int st = result_calculate_time0;
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
        System.out.println(ans);
    }

    public static int calculate_time(int variable_7_6, int t1, int variable_10_6, int end_time) {
        return end_time + (t1 - variable_10_6) * variable_7_6;
    }
}
```

Please note that Java does not have a direct equivalent to Python's `scipy.stats.ttest_ind` and `sklearn.utils.shuffle` functions. These functions are used for statistical analysis and data shuffling respectively, which are not directly applicable in this Java code.

