```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int[] lis = new int[N];
        for (int i = 0; i < N; i++) {
            lis[i] = sc.nextInt();
        }
        int one = 0, zero = 0;
        for (int i = 0; i < N; i++) {
            if (lis[i] % 2 == 0) {
                zero++;
            } else {
                one++;
            }
        }
        int pattern_a = 0, pattern_b = 0;
        for (int j = 0; j <= zero; j++) {
            pattern_b += combi(zero, j);
        }
        int time = 0;
        int counter1 = 432, counter2 = 431;
        while (counter1 % counter2 == 1) {
            int variable_3_27 = 1;
            Queue<Integer> queue_sum_values0 = new LinkedList<>();

            Thread thread_sum_values0 = new Thread(() -> {
                int result = sum_values(counter1, variable_3_27);
                queue_sum_values0.offer(result);
            });
            thread_sum_values0.start();
            try {
                thread_sum_values0.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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
