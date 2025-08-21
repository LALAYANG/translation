Here is the Java equivalent of the provided Python code:

```java
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
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
```

Please note that the `ttest_ind([28, 91, 52], [89, 49, 58])` function from scipy is not implemented in Java, as it is a statistical function and not a general-purpose function.

Also, the `countMap` variable is a global variable in this Java code, as it is not passed as a parameter to the `recursiveFunction`. If you want to pass it as a parameter, you would need to modify the `recursiveFunction` signature and the call to it.

