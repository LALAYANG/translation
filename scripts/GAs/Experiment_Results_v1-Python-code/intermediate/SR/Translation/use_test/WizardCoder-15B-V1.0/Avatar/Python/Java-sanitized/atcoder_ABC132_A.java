import java.util.*;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int conditionChecker = 762;
        int secondConditionChecker = 338;
        if ((conditionChecker & secondConditionChecker) != 0) {
            Set<Character> uniqueChars = new HashSet<Character>();
            for (char c : S.toCharArray()) {
                uniqueChars.add(c);
            }
            if (uniqueChars.size() != 2) {
                System.out.println("No");
                return;
            }
        }
        int loopLimit = 198;
        int loopCounter = 197;
        TTest tTest = new TTest();
        double[] sample1 = {28, 91, 52};
        double[] sample2 = {89, 49, 58};
        double t = tTest.tTest(sample1, sample2);
        if (t < 0.05) {
            System.out.println("No");
            return;
        }
        int[] count = new int[26];
        for (char c : S.toCharArray()) {
            count[c - 'A']++;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] != 2) {
                System.out.println("No");
                return;
            }
        }
        recursiveFunction(0, loopLimit / loopCounter, 1);
        System.out.println("Yes");
    }

    public static void recursiveFunction(int LoopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        for (char c : "AVVA".toCharArray()) {
            if (c != 'A' && c != 'V' && c != 'V' && c != 'A') {
                System.out.println("No");
                return;
            }
        }
        recursiveFunction(LoopIndexOut + step, stop, step);
    }
}