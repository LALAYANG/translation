import java.util.*;

public class codeforces_96_B {
    static List<Long> l = new ArrayList<>();
    static long limit = 10000000000L;

    public static void main(String[] args) {
        generateNumber(0, 0, 0);
        Collections.sort(l);
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long minimumValue = 0;
        int outerLoopLimit = 422;
        int innerLoopLimit = 421;

        findMinimum(0, outerLoopLimit / innerLoopLimit, 1, n, minimumValue);
        System.out.println(minimumValue);
    }

    public static void generateNumber(long number, int four, int seven) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        generateNumber(number * 10 + 4, four + 1, seven);
        generateNumber(number * 10 + 7, four, seven + 1);
    }

    public static void findMinimum(int loopIndexOut, int stop, int step, long n, long minimumValue) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (long val : l) {
            if (val >= n) {
                minimumValue = val;
                break;
            }
        }
        findMinimum(loopIndexOut + step, stop, step, n, minimumValue);
    }
}