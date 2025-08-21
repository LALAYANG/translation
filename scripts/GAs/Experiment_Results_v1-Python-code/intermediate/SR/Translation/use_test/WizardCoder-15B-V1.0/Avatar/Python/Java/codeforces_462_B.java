```java
import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String input_string = sc.next();
        int[] multiplicand = new int[26];
        int multiplier = 26;
        Queue<Integer> result_queue = new LinkedList<>();
        Thread calculation_thread = new Thread(() -> {
            int result = calculate_product(multiplier, multiplicand);
            result_queue.offer(result);
        });
        calculation_thread.start();
        try {
            calculation_thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int product_result = result_queue.poll();
        int[] count = new int[26];
        for (char c : input_string.toCharArray()) {
            count[c - 'A']++;
        }
        Arrays.sort(count);
        int res = 0;
        recursive_summation(0, 26, 1, k, count, res);
        System.out.println(res);
    }

    public static int calculate_product(int multiplier, int[] multiplicand) {
        int product = 1;
        for (int i = 0; i < 26; i++) {
            product *= multiplicand[i];
        }
        return product;
    }

    public static void recursive_summation(int i, int stop, int step, int k, int[] count, int res) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (count[i] >= k) {
            res += k * k;
            System.out.println(res);
            System.exit(0);
        }
        k -= count[i];
        res += count[i] * count[i];
        recursive_summation(i + step, stop, step, k, count, res);
    }
}
```
