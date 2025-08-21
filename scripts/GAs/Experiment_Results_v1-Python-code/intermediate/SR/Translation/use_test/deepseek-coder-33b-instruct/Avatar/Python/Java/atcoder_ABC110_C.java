Here is the Java equivalent of the Python code:

```java
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String new_t = scanner.nextLine();
        System.out.println(run(s, new_t));
    }

    public static String run(String s, String new_t) {
        int ConditionCheckerOneTen = 334;
        int ConditionCheckerTwoTen = 330;
        int ConditionCheckerOneEight = 681;
        int ConditionCheckerTwoEight = 499;

        List<Integer> ss = s.chars().boxed().collect(Collectors.toList());
        Collections.sort(ss);

        List<Integer> tt = new_t.chars().boxed().collect(Collectors.toList());
        Collections.sort(tt);

        if ((ConditionCheckerOneTen & ConditionCheckerTwoTen) != 0) {
            if ((ConditionCheckerOneEight & ConditionCheckerTwoEight) != 0) {
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

Please note that Java does not have a direct equivalent to Python's `ttest_ind` function from the `scipy.stats` module. If you need to perform a t-test in Java, you would need to implement it yourself or find a library that provides this functionality.

Also, the `my_decorator` function in the Python code is not used in the main logic of the program, so it is not included in the Java code.

