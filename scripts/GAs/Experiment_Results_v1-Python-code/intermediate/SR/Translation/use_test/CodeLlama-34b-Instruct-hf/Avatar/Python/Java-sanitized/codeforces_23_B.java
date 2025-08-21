import java.util.Scanner;

public class codeforces_23_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        int outerLoopLimit = 982;
        int innerLoopLimit = 981;
        for (int outerLoopIndex = 0; outerLoopIndex < outerLoopLimit / innerLoopLimit; outerLoopIndex++) {
            recursiveFunction(0, limit, 1);
        }
    }

    public static void recursiveFunction(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int userInput = scanner.nextInt();
        if (userInput < 2) {
            System.out.println(0);
        } else {
            System.out.println(userInput - 2);
        }
        recursiveFunction(i + step, stop, step);
    }
}