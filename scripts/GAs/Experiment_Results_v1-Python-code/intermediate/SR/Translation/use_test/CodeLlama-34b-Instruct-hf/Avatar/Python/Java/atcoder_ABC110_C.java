```java
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyDecorator {
    public static void main(String[] args) {
        String s = "chokudai";
        String new_t = "redcoder";
        System.out.println(run(s, new_t));
    }

    public static String run(String s, String new_t) {
        int ConditionCheckerOneTen = 334;
        int ConditionCheckerTwoTen = 330;
        int ConditionCheckerOneEight = 681;
        int ConditionCheckerTwoEight = 499;
        List<Integer> ss = Arrays.asList(Collections.frequency(s));
        List<Integer> tt = Arrays.asList(Collections.frequency(new_t));
        if (ConditionCheckerOneTen & ConditionCheckerTwoTen) {
            if (ConditionCheckerOneEight & ConditionCheckerTwoEight) {
                if (ss.equals(tt)) {
                    return "Yes";
                } else {
                    return "No";
                }
            }
        }
        return "No";
    }
}
```
Note: In Java, the `Collections.frequency()` method returns an `int` value, not a `List<Integer>`, so we need to convert the result to a `List<Integer>` using `Arrays.asList()` before comparing it with `tt`.
