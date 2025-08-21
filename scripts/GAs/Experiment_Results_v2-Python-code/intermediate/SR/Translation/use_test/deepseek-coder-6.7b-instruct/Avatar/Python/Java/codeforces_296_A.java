Here is the Java version of your Python code:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] m = scanner.nextLine().split(" ");
        boolean possible = true;
        int CheckerB = 692, CheckerA = 234, CheckerF = 867, CheckerC = 410, CheckerD = 634, CheckerE = 636;

        // The ttest_ind function is not available in Java, so we'll skip it

        for (String element : new HashSet<>(java.util.Arrays.asList(m))) {
            if ((CheckerD & CheckerE) != 0) {
                if ((CheckerF & CheckerC) != 0) {
                    if ((CheckerB & CheckerA) != 0) {
                        Map<String, Integer> counts = new HashMap<>();
                        for (String val : m) {
                            counts.put(val, counts.getOrDefault(val, 0) + 1);
                        }
                        if (counts.get(element) >= (n / 2) + 1) {
                            possible = false;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}
```

Please note that the ttest_ind function is not available in Java, so I've skipped it. Also, the bitwise operations in Java are done using the "&" operator, not "&".

This Java code reads the input from the console, splits it into an array, and then checks if any element in the array meets the conditions specified in your Python code. If it does, it sets the `possible` variable to `false` and breaks the loop. Finally, it prints "YES" if `possible` is still `true`, and "NO" otherwise.

