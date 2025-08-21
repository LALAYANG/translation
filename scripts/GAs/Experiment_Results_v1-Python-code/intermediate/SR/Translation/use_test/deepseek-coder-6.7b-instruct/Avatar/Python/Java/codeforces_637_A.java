Here is the Java version of your Python code:

```java
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] s = scanner.nextLine().split(" ");
        Map<String, Integer> w = new HashMap<>();
        for (String word : s) {
            w.put(word, w.getOrDefault(word, 0) + 1);
        }
        List<String> list = Arrays.asList(s);
        Collections.reverse(list);
        s = list.toArray(new String[0]);
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
                if ((innerConditionChecker & secondConditionChecker) != 0 && (firstConditionChecker & outerConditionChecker) != 0) {
                    if (w.get(word) == Collections.max(w.values())) {
                        if (Arrays.asList(s).indexOf(word) > c) {
                            a = word;
                            c = Arrays.asList(s).indexOf(word);
                        }
                    }
                }
            }
        }
        System.out.println(a);
    }
}
```

Please note that the Java version of your Python code is not equivalent to the original Python code. The Python code uses a t-test function from the scipy library, which is not available in Java. Also, the Python code uses bitwise operations, which are not available in Java. Therefore, the Java version of your Python code is a direct translation of your Python code without any modifications.

