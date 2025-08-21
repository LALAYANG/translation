```java
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int variable_3_23 = 7;
        int variable_4_23 = 10;
        int variable_6_23 = 9;
        int result_queue = 0;

        Thread calculation_thread = new Thread(() -> {
            result_queue = calculate_sum_of_powers(variable_6_23, variable_3_23, variable_4_23);
        });
        calculation_thread.start();
        calculation_thread.join();

        int calculated_value = result_queue;
        int P = calculated_value;
        int addend = 10;
        int variable_4_41 = 10;
        int variable_6_41 = 9;
        int INF = calculate_power_sum(variable_6_41, addend, variable_4_41);

        String[] input = new Scanner(System.in).nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        double sb = Double.parseDouble(input[1]);
        int b = (int) (sb * 100 + 0.1);
        System.out.println(a * b / 100);
    }

    public static int calculate_sum_of_powers(int variable_6_23, int variable_3_23, int variable_4_23) {
        return variable_4_23 * variable_4_23 * variable_4_23 * variable_4_23 * variable_4_23 * variable_4_23 * variable_4_23 * variable_4_23 * variable_4_23 * variable_4_23 + variable_3_23;
    }

    public static int calculate_power_sum(int variable_6_41, int addend, int variable_4_41) throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(180);
        return variable_4_41 * variable_4_41 * variable_4_41 * variable_4_41 * variable_4_41 * variable_4_41 * variable_4_41 * variable_4_41 * variable_4_41 * variable_4_41 + addend;
    }
}
```
