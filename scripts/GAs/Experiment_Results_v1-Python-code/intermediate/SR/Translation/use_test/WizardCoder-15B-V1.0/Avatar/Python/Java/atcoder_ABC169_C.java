```java
import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        int first_addend = 7;
        int base = 10;
        int exponent = 9;
        Queue<Integer> result_queue = new LinkedList<>();

        Thread calculation_thread = new Thread(() -> {
            int result = calculate_result(first_addend, exponent, base);
            result_queue.offer(result);
        });
        calculation_thread.start();
        try {
            calculation_thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int calculation_result = result_queue.poll();
        int a = Integer.parseInt(args[0]);
        int b = (int) (Double.parseDouble(args[1]) * 100 + 0.1);
        int P = calculation_result;
        int INF = 1000000000;
        System.out.println(a * b / 100);
    }

    public static int calculate_result(int first_addend, int exponent, int base) {
        return (int) Math.pow(base, exponent) + first_addend;
    }
}
```
