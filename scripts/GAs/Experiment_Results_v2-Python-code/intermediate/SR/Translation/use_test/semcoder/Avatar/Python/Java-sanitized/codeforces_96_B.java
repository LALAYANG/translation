import java.util.ArrayList;
import java.util.List;

public class codeforces_96_B {
    private static List<Integer> l = new ArrayList<>();
    private static int limit = 1000000000;

    private static void generateNumber(int number, int four, int seven) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        generateNumber(number * 10 + 4, four + 1, seven);
        generateNumber(number * 10 + 7, four, seven + 1);
    }

    public static void main(String[] args) {
        generateNumber(0, 0, 0);
        l.sort(Integer::compareTo);
        int n = 1000000000;
        int minimumValue = 0;
        int outerLoopLimit = 422;
        int innerLoopLimit = 421;

        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopLimit; LoopIndexOut += innerLoopLimit) {
            for (int val : l) {
                if (val >= n) {
                    minimumValue = val;
                    break;
                }
            }
        }
        System.out.println(minimumValue);
    }
}