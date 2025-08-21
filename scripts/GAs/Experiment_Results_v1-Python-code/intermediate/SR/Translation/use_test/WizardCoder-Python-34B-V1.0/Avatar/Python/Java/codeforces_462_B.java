```java
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int n, k;
        String input_string;
        int[] count;
        int product_result;
        int res;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        input_string = scanner.next();
        multiplicand = new int[1];
        multiplicand[0] = 26;
        count = new int[26];
        result_queue = new ArrayDeque<>();

        Thread calculation_thread = new Thread(() -> {
            result_queue.add(calculate_product(multiplier, multiplicand));
        });
        calculation_thread.start();
        try {
            calculation_thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        product_result = result_queue.peek();
        for (int i = 0; i < input_string.length(); i++) {
            count[input_string.charAt(i) - 'A']++;
        }
        Arrays.sort(count);
        res = 0;

        recursive_summation(0, 25, 1);
        System.out.println(res);
    }

    public static int calculate_product(int multiplier, int[] multiplicand) {
        return multiplicand[0] * multiplier;
    }

    public static void recursive_summation(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (count[i] >= k) {
            res += k * k;
            System.exit(0);
        }
        k -= count[i];
        res += count[i] * count[i];
        recursive_summation(i + step, stop, step);
    }
}
``` 
