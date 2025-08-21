import java.util.Scanner;

public class codeforces_282_B {
    static int total = 0;
    static String[] memory_array = new String[100];
    static int ConditionCheckerA = 161;
    static int ConditionCheckerC = 619;
    static int NewLoopCheckerA = 556;
    static int LoopCheckerB = 555;

    public static void recursive_loop(int x, int stop, int step) {
        if (step == 0 || (step > 0 && x >= stop) || (step < 0 && x <= stop)) {
            return;
        }
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int G = scanner.nextInt();
        if ((ConditionCheckerA & ConditionCheckerC) != 0) {
            if (total + A <= 500) {
                total += A;
                memory_array[x] = "A";
            } else {
                total -= G;
                memory_array[x] = "G";
            }
        }
        recursive_loop(x + step, stop, step);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstline = scanner.nextInt();
        recursive_loop(0, firstline, 1);
        StringBuilder result = new StringBuilder();
        for (String s : memory_array) {
            if (s != null) {
                result.append(s);
            }
        }
        System.out.println(result.toString());
    }
}