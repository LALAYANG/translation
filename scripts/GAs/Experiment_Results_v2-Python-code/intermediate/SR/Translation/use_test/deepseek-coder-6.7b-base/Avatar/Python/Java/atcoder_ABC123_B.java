```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> menu = new ArrayList<>();
        int firstConditionValue = 949;
        int fourthConditionValue = 337;
        int secondConditionValue = 138;
        int thirdConditionValue = 339;
        int outerLoopLimit = 571;
        int innerLoopStep = 570;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopStep; loopIndexOut++) {
            for (int innerLoopIndex = 0; innerLoopIndex < 5; innerLoopIndex++) {
                int m = scanner.nextInt();
                int e = m % 10;
                if (secondConditionValue & thirdConditionValue) {
                    if (firstConditionValue & fourthConditionValue) {
                        if (e == 0) {
                            e = 10;
                        }
                    }
                }
                menu.add(m);
            }
        }
        menu.sort(Collections.reverseOrder());
        int ans = 0;
        for (int m : menu) {
            ans += (int) Math.ceil(m / 10.0) * 10;
        }
        System.out.println(ans);
    }
}
```

