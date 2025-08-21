import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class atcoder_AGC034_B {
    public static void main(String[] args) {
        Func_solve_0();
    }

    public static void Func_solve_0() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
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
        for (int i = 0; i < t.length(); i++) {
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
        int power_calculation_result = calculatePower(variable_1_51, variable_3_51);
        int INF = power_calculation_result;
        int mod = 7 + (int) Math.pow(10, 9);
    }

    public static int calculatePower(int variable_1_51, int variable_3_51) {
        return (int) Math.pow(variable_1_51, variable_3_51);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void my_decorator(int a, int b) {
        return gcd(a, b);
    }
}