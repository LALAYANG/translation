```java
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        int input_number = Integer.parseInt(args[0]);
        int condition_one = 368;
        int condition_two = 165;
        int divisor = 2;
        Queue<Integer> queue_division_operation0 = new LinkedList<>();

        Thread thread_division_operation0 = new Thread(() -> {
            int result = division_operation(divisor, input_number);
            queue_division_operation0.offer(result);
        });
        thread_division_operation0.start();
        try {
            thread_division_operation0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result_division_operation0 = queue_division_operation0.poll();
        input_number = result_division_operation0;

        if ((condition_one & condition_two) != 0) {
            if (input_number == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static int division_operation(int divisor, int input_number) {
        return input_number / divisor;
    }
}
```
