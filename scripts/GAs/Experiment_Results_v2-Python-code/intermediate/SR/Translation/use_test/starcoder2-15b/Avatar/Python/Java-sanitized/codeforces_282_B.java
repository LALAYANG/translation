import java.util.Scanner;

public class codeforces_282_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstline = sc.nextInt();
        int total = 0;
        int[] memory_array = new int[firstline];
        int ConditionCheckerA = 161;
        int ConditionCheckerC = 619;
        int NewLoopCheckerA = 556;
        int LoopCheckerB = 555;
        for (int LoopIndexOut = 0; LoopIndexOut < NewLoopCheckerA / LoopCheckerB; LoopIndexOut++) {
            recursive_loop(0, firstline, 1, total, memory_array, ConditionCheckerA, ConditionCheckerC);
        }
        for (int i = 0; i < memory_array.length; i++) {
            System.out.print(memory_array[i]);
        }
    }

    public static void recursive_loop(int x, int stop, int step, int total, int[] memory_array, int ConditionCheckerA, int ConditionCheckerC) {
        if (step == 0 || (step > 0 && x >= stop) || (step < 0 && x <= stop)) {
            return;
        }
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int G = sc.nextInt();
        if (ConditionCheckerA & ConditionCheckerC) {
            if (total + A <= 500) {
                total = total + A;
                memory_array[x] = 65;
            } else {
                total = total - G;
                memory_array[x] = 71;
            }
        }
        recursive_loop(x + step, stop, step, total, memory_array, ConditionCheckerA, ConditionCheckerC);
    }
}