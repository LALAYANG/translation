Here is the Java equivalent of the Python code:

```java
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = scanner.nextInt();
        int dummyVar = scanner.nextInt();
        scanner.nextLine();

        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < numLines; i++) {
            String inputString = scanner.nextLine();
            int startIndex = inputString.indexOf('S') - inputString.indexOf('G');
            results.add(startIndex);
        }

        if (results.stream().anyMatch(i -> i < 0)) {
            System.out.println(-1);
        } else {
            System.out.println(new HashSet<>(results).size());
        }
    }
}
```

Please note that the Python code uses `scipy.stats.ttest_ind` and `sklearn.utils.shuffle` which are not available in Java. The equivalent Java code does not use these functions.

