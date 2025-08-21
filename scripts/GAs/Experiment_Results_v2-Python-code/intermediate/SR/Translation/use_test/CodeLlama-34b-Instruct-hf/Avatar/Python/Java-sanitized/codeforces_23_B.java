import java.util.Arrays;
import java.util.Scanner;

public class codeforces_23_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int outerLoopLimit = 172;
        int innerLoopLimit = 171;

        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopLimit; loopIndexOut++) {
            recursiveFunction(0, limit, 1);
        }
    }

    public static void recursiveFunction(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int value = sc.nextInt();
        if (value < 2) {
            System.out.println(0);
        } else {
            System.out.println(value - 2);
        }
        recursiveFunction(i + step, stop, step);
    }
}