Here is the Java version of the provided Python code:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String[]> q = new ArrayList<>();
        AtomicInteger matchCount = new AtomicInteger(0);

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
                        matchCount.getAndAdd(variable_3_23);
                    } else {
                        continue;
                    }
                }
            }
        }

        System.out.println(matchCount.get());
    }
}
```

Please note that the Java version does not use the `scipy.stats.ttest_ind` function as it is not available in Java. Also, the `queue` and `threading` modules are not used in the Java version as they are not necessary for the functionality of the code.

