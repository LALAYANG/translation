import java.util.*;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        int conditionChecker = 762;
        int secondConditionChecker = 338;
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        Map<Character, Integer> c = new HashMap<>();
        for (char ch : S.toCharArray()) {
            c.put(ch, c.getOrDefault(ch, 0) + 1);
        }
        Set<Character> uniqueChars = new HashSet<>(c.keySet());
        if ((conditionChecker & secondConditionChecker) != 0) {
            if (uniqueChars.size() != 2) {
                System.out.println("No");
                System.exit(0);
            }
        }
        int loopLimit = 198;
        int loopCounter = 197;
        recursiveFunction(0, loopLimit / loopCounter, 1, uniqueChars, c);
        System.out.println("Yes");
    }

    public static void recursiveFunction(int loopIndexOut, int stop, int step, Set<Character> uniqueChars, Map<Character, Integer> c) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (char i : uniqueChars) {
            if (c.get(i) != 2) {
                System.out.println("No");
                System.exit(0);
            }
        }
        recursiveFunction(loopIndexOut + step, stop, step, uniqueChars, c);
    }
}