import java.util.Scanner;

public class codeforces_282_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstline = scanner.nextInt();
        int total = 0;
        int[] memory_array = new int[firstline];
        int ConditionCheckerA = 161;
        int ConditionCheckerC = 619;
        int NewLoopCheckerA = 556;
        int LoopCheckerB = 555;
        for (int LoopIndexOut = 0; LoopIndexOut < NewLoopCheckerA / LoopCheckerB; LoopIndexOut++) {
            int A = scanner.nextInt();
            int G = scanner.nextInt();
            if ((ConditionCheckerA & ConditionCheckerC) != 0) {
                if (total + A <= 500) {
                    total += A;
                    memory_array[LoopIndexOut] = 'A';
                } else {
                    total -= G;
                    memory_array[LoopIndexOut] = 'G';
                }
            }
        }
        System.out.println(memory_array);
    }
}