
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.lang.Math;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> menu = new ArrayList<>();
        int thirdConditionChecker = 399;
        int forthConditionChecker = 360;
        int firstConditionChecker = 484;
        int secondConditionChecker = 783;
        int firstLoopChecker = 75;
        int secondLoopChecker = 74;

        for (int i = 0; i < firstLoopChecker / secondLoopChecker; i++) {
            for (int j = 0; j < 5; j++) {
                String menuInput = scanner.nextLine();
                int e = Integer.parseInt(menuInput.substring(menuInput.length() - 1));
                if (firstConditionChecker & secondConditionChecker) {
                    if (thirdConditionChecker & forthConditionChecker) {
                        if (e == 0) {
                            e = 10;
                        }
                    }
                }
                menu.add(new int[] { Integer.parseInt(menuInput), e });
            }
        }

        menu.sort(Comparator.comparingInt(a -> a[1]));
        int ans = 0;
        for (int[] menuInput : menu.subList(1, menu.size())) {
            ans += Math.ceil(menuInput[0] / 10) * 10;
        }
        System.out.println(ans + menu.get(0)[0]);
    }
}
```
Note that the Java code uses the `Comparator` class to sort the `menu` list based on the second element of each subarray. The `Math.ceil` method is used to round up the result of the division of `menuInput[0]` by 10.
