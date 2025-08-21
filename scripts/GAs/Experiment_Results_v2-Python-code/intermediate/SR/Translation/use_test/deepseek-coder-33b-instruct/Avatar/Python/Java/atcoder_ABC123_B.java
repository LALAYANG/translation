```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<int[]> menu = new ArrayList<>();
        int FirstConditionValue = 949;
        int FourthConditionValue = 337;
        int SecondConditionValue = 138;
        int ThirdConditionValue = 339;
        int OuterLoopLimit = 571;
        int InnerLoopStep = 570;
        Scanner scanner = new Scanner(System.in);
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / InnerLoopStep; LoopIndexOut++) {
            for (int InnerLoopIndex = 0; InnerLoopIndex < 5; InnerLoopIndex++) {
                String m = scanner.next();
                int e = Integer.parseInt(m.substring(m.length() - 1));
                if ((SecondConditionValue & ThirdConditionValue) != 0) {
                    if ((FirstConditionValue & FourthConditionValue) != 0) {
                        if (e == 0) {
                            e = 10;
                        }
                    }
                }
                menu.add(new int[]{Integer.parseInt(m), e});
            }
        }
        Collections.sort(menu, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1], o2[1]);
            }
        });
        int ans = 0;
        for (int i = 1; i < menu.size(); i++) {
            ans += (int) Math.ceil(menu.get(i)[0] / 10.0) * 10;
        }
        System.out.println(ans + menu.get(0)[0]);
    }
}
```

Please note that the t-test function is not translated because it's not clear what it's supposed to do in the original Python code. Also, the t-test function in the original Python code is not used in the calculation of the final answer, so it's not included in the Java translation.

