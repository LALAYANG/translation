import java.util.*;

public class codeforces_282_B {
    static int total = 0;
    static List<Character> memory = new ArrayList<>();
    static int firstCondition = 477;
    static int secondCondition = 258;
    static int outerLoopStart = 801;
    static int outerLoopEnd = 800;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstLine = scanner.nextInt();

        for (int loopIndexOut = 0; loopIndexOut < outerLoopStart / outerLoopEnd; loopIndexOut++) {
            recursiveFunction(0, firstLine, 1, scanner);
        }

        for (char c : memory) {
            System.out.print(c);
        }
    }

    public static void recursiveFunction(int x, int stop, int step, Scanner scanner) {
        if (step == 0 || (step > 0 && x >= stop) || (step < 0 && x <= stop)) {
            return;
        }
        int A = scanner.nextInt();
        int G = scanner.nextInt();
        if ((firstCondition & secondCondition) != 0) {
            if (total + A <= 500) {
                total += A;
                memory.add('A');
            } else {
                total -= G;
                memory.add('G');
            }
        }
        recursiveFunction(x + step, stop, step, scanner);
    }
}