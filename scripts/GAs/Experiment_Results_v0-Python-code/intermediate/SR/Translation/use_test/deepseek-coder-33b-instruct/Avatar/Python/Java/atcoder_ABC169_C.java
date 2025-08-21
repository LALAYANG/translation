Here is the Java equivalent of the Python code:

```java
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Func_main_0();
    }

    public static void Func_main_0() {
        int variable_3_23 = 7;
        int variable_4_23 = 10;
        int variable_6_23 = 9;
        BlockingQueue<Integer> result_queue = new ArrayBlockingQueue<>(1);

        Thread worker_thread = new Thread(() -> {
            int result = calculate_sum_of_powers(variable_6_23, variable_3_23, variable_4_23);
            try {
                result_queue.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        worker_thread.start();
        try {
            worker_thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int calculated_value = 0;
        try {
            calculated_value = result_queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int P = calculated_value;
        int addend = 10;
        int variable_4_41 = 10;
        int variable_6_41 = 9;
        int INF = calculate_power_sum(variable_6_41, addend, variable_4_41);
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = (int) (Float.parseFloat(input[1]) * 100 + 0.1);
        System.out.println(a * b / 100);
    }

    public static int calculate_sum_of_powers(int variable_6_23, int variable_3_23, int variable_4_23) {
        return (int) Math.pow(variable_4_23, variable_6_23) + variable_3_23;
    }

    public static int calculate_power_sum(int variable_6_41, int addend, int variable_4_41) {
        try {
            Thread.sleep(180);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return (int) (Math.pow(variable_4_41, variable_6_41) + addend);
    }
}
```

Please note that the Java code is not exactly equivalent to the Python code. The Python code uses some Python-specific features that do not exist in Java, such as decorators, threading, and the `queue` module. The Java code uses Java's built-in threading and concurrency utilities to achieve similar functionality.

