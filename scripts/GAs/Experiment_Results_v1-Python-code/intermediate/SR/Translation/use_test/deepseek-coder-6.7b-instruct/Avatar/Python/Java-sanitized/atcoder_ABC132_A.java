import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        int conditionChecker = 762;
        int secondConditionChecker = 338;
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (char c : S.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        if ((conditionChecker & secondConditionChecker) != 0 && countMap.size() != 2) {
            System.out.println("No");
            System.exit(0);
        }
        int loopLimit = 198;
        int loopCounter = 197;
        // ttest_ind([28, 91, 52], [89, 49, 58]) is not implemented in Java, so it is omitted
        recursiveFunction(0, loopLimit / loopCounter, 1);
        System.out.println("Yes");
    }

    private static void recursiveFunction(int loopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        // Assuming that the countMap is a global variable, as it is not passed as a parameter
        for (char c : countMap.keySet()) {
            if (!countMap.get(c).equals(2)) {
                System.out.println("No");
                System.exit(0);
            }
        }
        recursiveFunction(loopIndexOut + step, stop, step);
    }
}