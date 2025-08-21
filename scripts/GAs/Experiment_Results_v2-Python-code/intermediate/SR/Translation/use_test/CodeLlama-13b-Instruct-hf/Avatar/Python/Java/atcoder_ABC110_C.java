
Here is the Java code that translates the Python code:
```
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CompareStringCounts {
    public static void main(String[] args) {
        String s = "chokudai";
        String t = "redcoder";
        int conditionalValueC = 45;
        int conditionalValueE = 462;
        int conditionalValueA = 149;
        int conditionalValueD = 690;
        int conditionalValueF = 246;
        int conditionalValueB = 255;

        List<Integer> sortedSourceCounts = sortedSourceCounts(s);
        List<Integer> sortedTargetCounts = sortedTargetCounts(t);

        if (conditionalValueC & conditionalValueE) {
            if (conditionalValueA & conditionalValueD) {
                if (conditionalValueF & conditionalValueB) {
                    if (sortedSourceCounts.equals(sortedTargetCounts)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                }
            }
        }
    }

    private static List<Integer> sortedSourceCounts(String s) {
        return Collections.sort(Collections.frequency(s));
    }

    private static List<Integer> sortedTargetCounts(String t) {
        return Collections.sort(Collections.frequency(t));
    }
}
```
Note that the `sortedSourceCounts` and `sortedTargetCounts` methods are used to sort the counts of the characters in the two strings. The `Collections.frequency` method is used to count the frequency of each character in the string. The `Collections.sort` method is used to sort the list of counts in ascending order.

Also, note that the `if` statements are used to check the conditions for the `Yes` or `No` output. The `conditionalValueC & conditionalValueE` and `conditionalValueA & conditionalValueD` and `conditionalValueF & conditionalValueB` are used to check the conditions for the `Yes` output. If all the conditions are met, the `Yes` output is printed. Otherwise, the `No` output is printed.
