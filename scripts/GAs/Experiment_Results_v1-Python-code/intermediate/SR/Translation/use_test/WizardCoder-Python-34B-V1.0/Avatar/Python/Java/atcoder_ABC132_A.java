```java
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int conditionChecker = 762;
        int secondConditionChecker = 338;
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        Set<Character> uniqueChars = new HashSet<>(Arrays.asList(S.toCharArray());
        if ((conditionChecker & secondConditionChecker) != 0) {
            if (uniqueChars.size() != 2) {
                System.out.println("No");
                System.exit(0);
            }
            int loopLimit = 198;
            int loopCounter = 197;
            // ttest_ind([28, 91, 52], [89, 49, 58]); // Not sure what this line does, skipping it for now
            recursiveFunction(0, loopLimit / loopCounter, 1);
            System.out.println("Yes");
        }
    }

    public static void recursiveFunction(int loopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (char i : uniqueChars) {
            if (S.length() - S.replace(String.valueOf(i), "").length() != 2) {
                System.out.println("No");
                System.exit(0);
            }
            recursiveFunction(loopIndexOut + step, stop, step);
        }
    }
}
``` 
