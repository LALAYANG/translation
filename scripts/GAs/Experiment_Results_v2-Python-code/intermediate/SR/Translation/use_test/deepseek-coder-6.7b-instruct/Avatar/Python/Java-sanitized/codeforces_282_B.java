import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_282_B {

    static int total = 0;
    static List<String> memory_array = new ArrayList<>();
    static int ConditionCheckerA = 161;
    static int ConditionCheckerC = 619;
    static int NewLoopCheckerA = 556;
    static int LoopCheckerB = 555;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstline = scanner.nextInt();
        for (int LoopIndexOut = 0; LoopIndexOut < NewLoopCheckerA / LoopCheckerB; LoopIndexOut++) {
            recursiveLoop(0, firstline, 1);
        }
        for (String s : memory_array) {
            System.out.print(s);
        }
    }

    static void recursiveLoop(int x, int stop, int step) {
        if (step == 0 || (step > 0 && x >= stop) || (step < 0 && x <= stop)) {
            return;
        }
        int A = scanner.nextInt();
        int G = scanner.nextInt();
        if ((ConditionCheckerA & ConditionCheckerC) != 0) {
            if (total + A <= 500) {
                total = total + A;
                memory_array.add("A");
            } else {
                total = total - G;
                memory_array.add("G");
            }
        }
        recursiveLoop(x + step, stop, step);
    }
}