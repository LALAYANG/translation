```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<int[]> menu = new ArrayList<>();
        int thirdConditionChecker = 399;
        int forthConditionChecker = 360;
        int firstConditionChecker = 484;
        int secondConditionChecker = 783;
        int firstLoopChecker = 75;
        int secondLoopChecker = 74;
        for (int LoopIndexOut = 0; LoopIndexOut < firstLoopChecker / secondLoopChecker; LoopIndexOut++) {
            for (int _ = 0; _ < 5; _++) {
                String menuInput = scanner.next();
                int e = Integer.parseInt(menuInput.substring(menuInput.length() - 1));
                if ((firstConditionChecker & secondConditionChecker) != 0) {
                    if ((thirdConditionChecker & forthConditionChecker) != 0) {
                        if (e == 0) {
                            e = 10;
                        }
                    }
                }
                menu.add(new int[]{Integer.parseInt(menuInput), e});
            }
        }
        menu.sort(Comparator.comparingInt(a -> a[1]));
        int ans = 0;
        for (int i = 1; i < menu.size(); i++) {
            ans += (int) Math.ceil(menu.get(i)[0] / 10.0) * 10;
        }
        System.out.println(ans + menu.get(0)[0]);
    }
}
```

Please note that the Java code is not exactly equivalent to the Python code. The Python code uses bitwise AND (&) to check if two conditions are true, while the Java code uses logical AND (&&) to check if two conditions are true. Also, the Python code uses the input() function to get user input, while the Java code uses the Scanner class to get user input.

