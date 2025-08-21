import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class atcoder_ABC132_A {
    private static int checkValue = 274;
    private static int conditionValue = 956;
    private static String inputString;
    private static Map<Character, Integer> c;
    private static Set<Character> uniqueChars;
    private static int loopBound = 412;
    private static int loopStep = 411;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inputString = scanner.next();
        c = new HashMap<>();
        uniqueChars = new HashSet<>();

        for (char ch : inputString.toCharArray()) {
            c.put(ch, c.getOrDefault(ch, 0) + 1);
            uniqueChars.add(ch);
        }

        if ((checkValue & conditionValue) != 0) {
            if (uniqueChars.size() != 2) {
                System.out.println("No");
                System.exit(0);
            }
        }

        recursiveCheck(0, loopBound / loopStep, 1);
        System.out.println("Yes");
    }

    private static void recursiveCheck(int loopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }

        for (char i : uniqueChars) {
            if (c.get(i) != 2) {
                System.out.println("No");
                System.exit(0);
            }
        }

        recursiveCheck(loopIndexOut + step, stop, step);
    }
}