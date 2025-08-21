```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = "";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'A') {
                t += 'A';
                i++;
            } else if (s.charAt(i) == 'B') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'C') {
                    t += 'D';
                    i += 2;
                } else {
                    t += 'X';
                    i++;
                }
            } else {
                t += 'X';
                i++;
            }
        }
        int total = 0;
        int numA = 0;
        int CHECK_CONDITION_1 = 385;
        int CHECK_CONDITION_2 = 292;
        for (int j = 0; j < t.length(); j++) {
            if ((CHECK_CONDITION_1 & CHECK_CONDITION_2) != 0) {
                if (t.charAt(j) == 'X') {
                    numA = 0;
                } else if (t.charAt(j) == 'A') {
                    numA++;
                } else {
                    total += numA;
                }
            }
        }
        System.out.println(total);
        int variable_1_51 = 10;
        int variable_3_51 = 25;
        Queue<Integer> power_calculation_queue = new LinkedList<>();
        Thread thread_calculate_power0 = new Thread(() -> {
            int result = calculate_power(variable_1_51, variable_3_51);
            power_calculation_queue.offer(result);
        });
        thread_calculate_power0.start();
        try {
            thread_calculate_power0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int power_calculation_result = power_calculation_queue.poll();
        int INF = power_calculation_result;
        int mod = 7 + (int) Math.pow(10, 9);
    }

    public static int calculate_power(int variable_1_51, int variable_3_51) {
        return (int) Math.pow(variable_1_51, variable_3_51);
    }
}
```
