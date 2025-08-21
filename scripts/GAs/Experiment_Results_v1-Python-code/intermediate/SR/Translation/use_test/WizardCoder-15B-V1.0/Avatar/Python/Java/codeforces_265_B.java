```java
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count_input = scanner.nextInt();
        Queue<Integer> list_input = new LinkedList<>();
        for (int i = 0; i < count_input; i++) {
            list_input.add(scanner.nextInt());
        }
        int constant_variable = 1;
        Queue<Integer> queue_difference = new LinkedBlockingQueue<>();
        Thread thread_calculate_difference0 = new Thread(() -> {
            int result = calculate_difference(count_input, constant_variable);
            queue_difference.offer(result);
        });
        thread_calculate_difference0.start();
        try {
            thread_calculate_difference0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int difference_result = queue_difference.poll();
        int ans = difference_result;
        int last = 0;
        for (int i : list_input) {
            ans += Math.abs(last - i) + 1;
            last = i;
        }
        System.out.println(ans);
    }

    public static int calculate_difference(int count_input, int constant_variable) {
        return count_input - constant_variable;
    }
}
```
