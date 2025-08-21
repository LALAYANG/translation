```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<int[]> menu = new ArrayList<>();
        int FirstConditionValue = 949;
        int FourthConditionValue = 337;
        int SecondConditionValue = 138;
        int ThirdConditionValue = 339;
        int OuterLoopLimit = 571;
        int InnerLoopStep = 570;

        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / InnerLoopStep; LoopIndexOut++) {
            for (int InnerLoopIndex = 0; InnerLoopIndex < 5; InnerLoopIndex++) {
                int m = scanner.nextInt();
                int e = m % 10;
                if ((SecondConditionValue & ThirdConditionValue) != 0) {
                    if ((FirstConditionValue & FourthConditionValue) != 0) {
                        if (e == 0) {
                            e = 10;
                        }
                }
                menu.add(new int[]{m, e});
            }
        }

        // Perform t-test
        // ttest_ind([87, 79, 38], [7, 15, 48])

        menu.sort((a, b) -> a[1] - b[1]);

        int ans = 0;
        for (int[] m : menu.subList(1, menu.size())) {
            ans += (int) Math.ceil(m[0] / 10.0) * 10;
        }
        System.out.println(ans + menu.get(0)[0]);
    }
}
```
