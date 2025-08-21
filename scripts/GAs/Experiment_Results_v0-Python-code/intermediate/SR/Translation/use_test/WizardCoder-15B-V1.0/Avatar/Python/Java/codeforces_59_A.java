```java
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static void main(String[] args) {
        String txt = "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd";
        int cu = 0;
        int cl = 0;
        for (int i = 0; i < txt.length(); i++) {
            char c = txt.charAt(i);
            int upper_increment = 1;
            if (Character.isLowerCase(c)) {
                int lower_increment = 1;
                Queue<Integer> lower_queue = new ConcurrentLinkedQueue<>();

                Thread lower_thread = new Thread(() -> {
                    int intermediate_result = increment_lower_count(lower_increment, cl);
                    lower_queue.offer(intermediate_result);
                });
                lower_thread.start();
                try {
                    lower_thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int result_increment_lower_count0 = lower_queue.poll();
                cl = result_increment_lower_count0;
            } else {
                Queue<Integer> upper_queue = new ConcurrentLinkedQueue<>();

                Thread upper_thread = new Thread(() -> {
                    int intermediate_result = increment_upper_count(upper_increment, cu);
                    upper_queue.offer(intermediate_result);
                });
                upper_thread.start();
                try {
                    upper_thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int upper_count_result = upper_queue.poll();
                cu = upper_count_result;
            }
        }
        double[] arr1 = {97, 61, 53};
        double[] arr2 = {27, 100, 71};
        double t = ttest_ind(arr1, arr2)[0];
        if (cu > cl) {
            String out = txt.toUpperCase();
            System.out.println(out);
        } else {
            String out = txt.toLowerCase();
            System.out.println(out);
        }
    }

    public static int increment_upper_count(int upper_increment, int cu) {
        return cu + upper_increment;
    }

    public static int increment_lower_count(int lower_increment, int cl) {
        return cl + lower_increment;
    }
}
```
