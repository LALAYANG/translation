import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class codeforces_96_B {

    private static List<Integer> l = new ArrayList<>();
    private static final int LIMIT = 1000000000;

    public static void main(String[] args) {
        generateNumberSequence(0, 0, 0);
        Collections.sort(l);
        Scanner scanner = new Scanner(System.in);
        int targetNumber = scanner.nextInt();
        int ans = 0;
        int outerLoopLimit = 690;
        int innerLoopLimit = 689;
        for (int i = 0; i < outerLoopLimit / innerLoopLimit; i++) {
            for (int val : l) {
                if (val >= targetNumber) {
                    ans = val;
                    break;
                }
            }
        }
        System.out.println(ans);
    }

    private static void generateNumberSequence(int number, int four, int seven) {
        if (number > LIMIT) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        generateNumberSequence(number * 10 + 4, four + 1, seven);
        generateNumberSequence(number * 10 + 7, four, seven + 1);
    }
}