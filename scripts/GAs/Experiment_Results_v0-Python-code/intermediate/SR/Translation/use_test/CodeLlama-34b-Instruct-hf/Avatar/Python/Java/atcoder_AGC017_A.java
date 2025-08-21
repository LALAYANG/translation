```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class SumValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int P = scanner.nextInt();
        int[] lis = new int[N];
        for (int i = 0; i < N; i++) {
            lis[i] = scanner.nextInt();
        }
        int one = 0;
        int zero = 0;
        for (int i = 0; i < N; i++) {
            if (lis[i] % 2 == 1) {
                one++;
            } else {
                zero++;
            }
        }
        int pattern_a = 0;
        int pattern_b = 0;
        for (int j = 0; j <= zero; j++) {
            pattern_b += combi(zero, j);
        }
        int time = 0;
        int counter1 = 432;
        int counter2 = 431;
        while (counter1 % counter2 == 1) {
            int variable_3_27 = 1;
            Queue<Integer> queue_sum_values0 = new Queue<>();
            Thread thread_sum_values0 = new Thread(new Runnable() {
                @Override
                public void run() {
                    int result = sum_values(counter1, variable_3_27);
                    queue_sum_values0.add(result);
                }
            });
            thread_sum_values0.start();
            thread_sum_values0.join();
            int result_sum_values0 = queue_sum_values0.poll();
            counter1 = result_sum_values0;
            while (time <= one) {
                if (time % 2 == P) {
                    pattern_a += combi(one, time);
                }
                time++;
            }
        }
        System.out.println(pattern_a * pattern_b);
    }

    public static int combi(int n, int k) {
        int a = 1;
        for (int i = 0; i < k; i++) {
            a *= n - i;
        }
        for (int j = 0; j < k; j++) {
            a /= j + 1;
        }
        return a;
    }

    public static int sum_values(int counter1, int variable_3_27) {
        return counter1 + variable_3_27;
    }
}
```
Note: The above code is a Java implementation of the given Python code. The Python code uses the `scipy.stats` library, which is not available in Java. Therefore, the `combi` function has been implemented in Java. Also, the `threading` and `queue` modules have been used in the Python code, which are not available in Java. Therefore, the `Thread` and `Queue` classes have been used in the Java implementation.
