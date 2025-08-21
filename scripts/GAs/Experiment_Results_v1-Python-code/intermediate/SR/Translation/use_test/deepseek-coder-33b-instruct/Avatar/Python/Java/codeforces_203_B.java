```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] count = new int[n][n];
        int answer = -1;
        int ConditionCheckerA = 519;
        int ConditionCheckerB = 985;
        for (int k = 0; k < m; k++) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            boolean found = false;
            for (int i = x - 2; i <= x; i++) {
                for (int j = y - 2; j <= y; j++) {
                    if (i >= 0 && i < n && j >= 0 && j < n) {
                        count[i][j]++;
                        if (count[i][j] == 9) {
                            found = true;
                        }
                    }
                }
            }
            if ((ConditionCheckerA & ConditionCheckerB) != 0) {
                if (found) {
                    answer = k + 1;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
```

Please note that the Java code does not include the t-test functionality from the original Python code, as there is no direct equivalent in Java's standard library. If you need to perform a t-test in Java, you may need to use a third-party library such as Apache Commons Math.

