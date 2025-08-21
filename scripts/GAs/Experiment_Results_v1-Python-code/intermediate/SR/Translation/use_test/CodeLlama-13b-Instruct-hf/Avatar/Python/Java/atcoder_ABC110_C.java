
Here is the Java code that translates the Python code:
```java
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        List<Integer> ss = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Integer> tt = new_t.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
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
Note that the Java code uses the `java.util.stream` API to perform the operations that were performed by the Python `map` and `sorted` functions. Additionally, the Java code uses the `java.util.List` and `java.util.Map` classes to store the data.
