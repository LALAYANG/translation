
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.lang.Math;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstConditionValue = 949;
        int fourthConditionValue = 337;
        int secondConditionValue = 138;
        int thirdConditionValue = 339;
        int outerLoopLimit = 571;
        int innerLoopStep = 570;
        List<Integer> menu = new ArrayList<>();

        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopStep; loopIndexOut++) {
            for (int innerLoopIndex = 0; innerLoopIndex < 5; innerLoopIndex++) {
                String m = scanner.nextLine();
                int e = Integer.parseInt(m.substring(m.length() - 1));
                if (secondConditionValue & thirdConditionValue) {
                    if (firstConditionValue & fourthConditionValue) {
                        if (e == 0) {
                            e = 10;
                        }
                    }
                }
                menu.add(new int[] { Integer.parseInt(m), e });
            }
        }

        menu.sort(Comparator.comparingInt(a -> a[1]));
        int ans = 0;
        for (int[] m : menu.subList(1, menu.size())) {
            ans += Math.ceil(m[0] / 10) * 10;
        }
        System.out.println(ans + menu.get(0)[0]);
    }
}
```
Note that the Java code uses the `java.util.Scanner` class to read input from the user, and the `java.util.ArrayList` class to store the menu items. The `java.util.Comparator` class is used to sort the menu items based on their second element. The `java.lang.Math` class is used to perform mathematical operations such as ceiling and division.
