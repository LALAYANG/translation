import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_282_B {
    private static int total = 0;
    private static List<Character> memory = new ArrayList<>();
    private static final int FirstCondition = 477;
    private static final int SecondCondition = 258;
    private static final int OuterLoopStart = 801;
    private static final int OuterLoopEnd = 800;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstline = scanner.nextInt();
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopStart / OuterLoopEnd; LoopIndexOut++) {
            recursiveFunction(0, firstline, 1);
        }
        for (char c : memory) {
            System.out.print(c);
        }
    }

    private static void recursiveFunction(int x, int stop, int step) {
        if (step == 0 || (step > 0 && x >= stop) || (step < 0 && x <= stop)) {
            return;
        }
        int A = scanner.nextInt();
        int G = scanner.nextInt();
        if ((FirstCondition & SecondCondition) != 0) {
            if (total + A <= 500) {
                total += A;
                memory.add('A');
            } else {
                total -= G;
                memory.add('G');
            }
        }
        recursiveFunction(x + step, stop, step);
    }
}