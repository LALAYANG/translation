Here is the Java equivalent of the Python code:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String[]> q = new ArrayList<>();
        int matchCount = 0;

        for (int i = 0; i < n; i++) {
            String[] a = scanner.nextLine().split(" ");
            q.add(a);
        }

        int CHECK_CONDITION_1 = 209;
        int CHECK_CONDITION_2 = 57;

        for (String[] j : q) {
            for (String[] k : q) {
                if ((CHECK_CONDITION_1 & CHECK_CONDITION_2) != 0) {
                    if (k == j) {
                        continue;
                    } else if (j[0].equals(k[k.length - 1])) {
                        int variable_3_23 = 1;
                        matchCount = incrementCount(matchCount, variable_3_23);
                    } else {
                        continue;
                    }
                }
            }
        }

        System.out.println(matchCount);
    }

    private static int incrementCount(int matchCount, int variable_3_23) {
        return matchCount + variable_3_23;
    }
}
```

Please note that the Java code does not have the same functionality as the Python code. The Python code uses multithreading and scipy, which are not available in Java. The Java code does not use these features.

