```java
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] s = scanner.nextLine().split(" ");
        List<String> list = Arrays.asList(s);
        Collections.reverse(list);
        s = list.toArray(new String[0]);
        Map<String, Long> w = Arrays.stream(s).collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        int c = -1;
        String a = "";
        int firstConditionChecker = 715;
        int outerConditionChecker = 156;
        int innerConditionChecker = 937;
        int secondConditionChecker = 979;
        int outerLoopChecker = 727;
        int loopChecker = 726;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopChecker / loopChecker; LoopIndexOut++) {
            for (String word : w.keySet()) {
                if ((innerConditionChecker & secondConditionChecker) != 0) {
                    if ((firstConditionChecker & outerConditionChecker) != 0) {
                        if (w.get(word) == Collections.max(w.values())) {
                            if (Arrays.asList(s).indexOf(word) > c) {
                                a = word;
                                c = Arrays.asList(s).indexOf(word);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(a);
    }
}
```

Please note that the Java code does not include the t-test function as it is not available in Java's standard library. Also, the bitwise operations are replaced with logical operations as Java does not support bitwise operations on boolean values.

