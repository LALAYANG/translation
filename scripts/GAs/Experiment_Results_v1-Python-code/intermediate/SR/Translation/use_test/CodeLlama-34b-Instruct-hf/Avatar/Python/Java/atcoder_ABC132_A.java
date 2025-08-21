```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.Arrays;

public class TTestInd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int conditionChecker = 762;
        int secondConditionChecker = 338;
        Set<Character> uniqueChars = new HashSet<Character>();
        for (char c : input.toCharArray()) {
            uniqueChars.add(c);
        }
        if (conditionChecker & secondConditionChecker) {
            if (uniqueChars.size() != 2) {
                System.out.println("No");
                return;
            }
        }
        int loopLimit = 198;
        int loopCounter = 197;
        int[] ttestInd = ttest_ind(new int[] {28, 91, 52}, new int[] {89, 49, 58});
        for (int i = 0; i < ttestInd.length; i++) {
            if (ttestInd[i] != 0) {
                System.out.println("No");
                return;
            }
        }
        recursiveFunction(0, loopLimit / loopCounter, 1);
        System.out.println("Yes");
    }

    public static void recursiveFunction(int loopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (char c : uniqueChars) {
            if (c != 2) {
                System.out.println("No");
                return;
            }
        }
        recursiveFunction(loopIndexOut + step, stop, step);
    }

    public static int[] ttest_ind(int[] a, int[] b) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] - b[i];
        }
        return result;
    }
}
```
Note: The `ttest_ind` function is not a built-in function in Java, so I have implemented it as a custom function. The `ttest_ind` function takes two arrays as input and returns an array of integers representing the difference between the corresponding elements of the two input arrays.
