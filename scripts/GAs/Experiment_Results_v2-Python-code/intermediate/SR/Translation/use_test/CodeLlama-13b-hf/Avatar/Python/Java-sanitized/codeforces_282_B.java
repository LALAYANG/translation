import java.util.Scanner;

public class codeforces_282_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstline = sc.nextInt();
        int total = 0;
        String[] memory_array = new String[firstline];
        int ConditionCheckerA = 161;
        int ConditionCheckerC = 619;
        int NewLoopCheckerA = 556;
        int LoopCheckerB = 555;
        for (int LoopIndexOut = 0; LoopIndexOut < NewLoopCheckerA / LoopCheckerB; LoopIndexOut++) {
            recursive_loop(0, firstline, 1);
        }
        System.out.println(String.join("", memory_array));
    }

    public static void recursive_loop(int x, int stop, int step) {
        if (step == 0 || (step > 0 && x >= stop) || (step < 0 && x <= stop)) {
            return;
        }
        int A = sc.nextInt();
        int G = sc.nextInt();
        if (ConditionCheckerA & ConditionCheckerC) {
            if (total + A <= 500) {
                total = total + A;
                memory_array[x] = "A";
            } else {
                total = total - G;
                memory_array[x] = "G";
            }
        }
        recursive_loop(x + step, stop, step);
    }
}