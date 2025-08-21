```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> matrix = new ArrayList<>();
        int commonCount = 0;

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                row.add(scanner.nextInt());
            }
            matrix.add(row);
        }

        int conditionOne = 145;
        int conditionTwo = 467;

        for (List<Integer> j : matrix) {
            for (List<Integer> k : matrix) {
                if ((conditionOne & conditionTwo) != 0) {
                    if (j == k) {
                        continue;
                    } else if (j.get(0).equals(k.get(k.size() - 1))) {
                        commonCount++;
                    }
                }
            }
        }

        System.out.println(commonCount);
    }
}
```

Please note that the Java code does not have the same functionality as the Python code. The Python code uses the `scipy.stats.ttest_ind` function to perform a t-test on two independent samples of scores, but this function is not available in Java. The Java code simply reads the input and performs the same operations as the Python code.

