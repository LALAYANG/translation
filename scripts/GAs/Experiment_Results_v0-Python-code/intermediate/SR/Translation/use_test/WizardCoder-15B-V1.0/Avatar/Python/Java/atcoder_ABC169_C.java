```java
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        int variable_3_23 = 7;
        int variable_4_23 = 10;
        int variable_6_23 = 9;
        int result_queue = new java.util.concurrent.LinkedBlockingQueue<>();

        Thread calculation_thread = new Thread(() -> {
            int calculated_value = calculate_sum_of_powers(variable_6_23, variable_3_23, variable_4_23);
            result_queue.offer(calculated_value);
        });
        calculation_thread.start();
        try {
            calculated_value = result_queue.poll(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int P = calculated_value;
        int addend = 10;
        int variable_4_41 = 10;
        int variable_6_41 = 9;
        int INF = calculate_power_sum(variable_6_41, addend, variable_4_41);
        String[] input_a_sb = input().split(" ");
        int a = Integer.parseInt(input_a_sb[0]);
        int b = (int) (Double.parseDouble(input_a_sb[1]) * 100 + 0.1);
        System.out.println(a * b / 100);
    }

    public static int calculate_power_sum(int variable_6_41, int addend, int variable_4_41) {
        try {
            TimeUnit.MILLISECONDS.sleep(180);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return (int) Math.pow(variable_4_41, variable_6_41) + addend;
    }

    public static int calculate_sum_of_powers(int variable_6_23, int variable_3_23, int variable_4_23) {
        return (int) Math.pow(variable_4_23, variable_6_23) + variable_3_23;
    }

    public static int my_decorator(int func) {
        return func;
    }
}
```
