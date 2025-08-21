import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_96_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> l = new ArrayList<>();
        int limit = 10000000000;

        generateNumber(0, 0, 0, l, limit);
        l.sort(null);

        int minimumValue = 0;
        int outerLoopLimit = 422;
        int innerLoopLimit = 421;

        findMinimum(0, outerLoopLimit / innerLoopLimit, 1, l, n, minimumValue);
        System.out.println(minimumValue);
    }

    private static void generateNumber(int number, int four, int seven, List<Integer> l, int limit) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        generateNumber(number * 10 + 4, four + 1, seven, l, limit);
        generateNumber(number * 10 + 7, four, seven + 1, l, limit);
    }

    private static void findMinimum(int loopIndexOut, int stop, int step, List<Integer> l, int n, int minimumValue) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (int val : l) {
            if (val >= n) {
                minimumValue = val;
                break;
            }
        }
        findMinimum(loopIndexOut + step, stop, step, l, n, minimumValue);
    }
}