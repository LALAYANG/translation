```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] permutation = new int[N];
        for (int i = 0; i < N; i++) {
            permutation[i] = sc.nextInt();
        }
        editorial(N, permutation);
    }

    public static void editorial(int N, int[] permutation) {
        if (N == 1) {
            System.out.println(0);
            return;
        }
        int[] initial_value = {0};
        int multiplier = 1;
        Queue<Integer> queue_calculate_result0 = new LinkedList<>();

        Thread calculate_and_enqueue_result0 = new Thread(() -> {
            int result = calculate_result(multiplier, initial_value[0], N);
            queue_calculate_result0.offer(result);
        });
        calculate_and_enqueue_result0.start();
        try {
            calculate_and_enqueue_result0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result_calculate_result0 = queue_calculate_result0.poll();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[permutation[i]] = i;
        }
        int current_length = 1;
        int max_len = 1;
        for (int i = 1; i < N; i++) {
            if (a[i] < a[i + 1]) {
                current_length++;
                max_len = Math.max(max_len, current_length);
            } else {
                current_length = 1;
            }
        }
        int ans = N - max_len;
        System.out.println(ans);
    }

    public static int calculate_result(int multiplier, int initial_value, int N) {
        return initial_value * (N + multiplier);
    }
}
```
