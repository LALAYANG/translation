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
        long total = 0;
        int numA = 0;
        int CHECK_CONDITION_1 = 385;
        int CHECK_CONDITION_2 = 292;
        for (i = 0; i < t.length(); i++) {
            if ((CHECK_CONDITION_1 & CHECK_CONDITION_2) != 0) {
                if (t.charAt(i) == 'X') {
                    numA = 0;
                } else if (t.charAt(i) == 'A') {
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

        Runnable calculate_power_thread = () -> {
            int result = calculate_power(variable_1_51, variable_3_51);
            power_calculation_queue.add(result);
        };
        Thread thread_calculate_power0 = new Thread(calculate_power_thread);
        thread_calculate_power0.start();
        thread_calculate_power0.join();
        int power_calculation_result = power_calculation_queue.poll();
        int INF = power_calculation_result;
        int mod = 7 + 1000000000;
        System.out.println(0);
    }

    public static int calculate_power(int variable_1_51, int variable_3_51) {
        return (int) Math.pow(variable_1_51, variable_3_51);
    }
}