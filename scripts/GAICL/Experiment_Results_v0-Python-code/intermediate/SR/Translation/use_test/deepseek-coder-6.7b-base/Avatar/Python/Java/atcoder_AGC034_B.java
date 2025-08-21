```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = "";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'A') {
                t += "A";
                i++;
            } else if (s.charAt(i) == 'B') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'C') {
                        t += "D";
                        i += 2;
                    } else {
                        t += "X";
                        i++;
                    }
                } else {
                    t += "X";
                    i++;
                }
            } else {
                t += "X";
                i++;
            }
        }
        int total = 0;
        int numA = 0;
        int CHECK_CONDITION_1 = 385;
        int CHECK_CONDITION_2 = 292;
        for (int j = 0; j < t.length(); j++) {
            if (CHECK_CONDITION_1 & CHECK_CONDITION_2) {
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
            power_calculation_queue.add(result);
        });
        thread_calculate_power0.start();
        thread_calculate_power0.join();
        int power_calculation_result = power_calculation_queue.poll();
        int INF = power_calculation_result;
        int mod = 7 + 1000000000;
    }

    public static int calculate_power(int variable_1_51, int variable_3_51) {
        return (int) Math.pow(variable_1_51, variable_3_51);
    }
}
```

