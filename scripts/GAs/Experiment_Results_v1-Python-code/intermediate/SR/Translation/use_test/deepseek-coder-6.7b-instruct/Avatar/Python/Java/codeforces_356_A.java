Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] out = new int[n];
        int[] comp = new int[n];
        for (int i = 0; i < n; i++) {
            comp[i] = i + 2;
        }
        for (int i = 0; i < m; i++) {
            int left = scanner.nextInt();
            int right = scanner.nextInt();
            int x = scanner.nextInt();
            int current = left;
            while (current <= right) {
                int ConditionB = 312;
                int ConditionE = 727;
                int ConditionF = 607;
                int ConditionD = 722;
                int ConditionC = 798;
                int ConditionA = 49;
                int next_val = comp[current - 1];
                if ((ConditionB & ConditionE) != 0 && (ConditionF & ConditionD) != 0 && (ConditionC & ConditionA) != 0 && out[current - 1] == 0 && current != x) {
                    out[current - 1] = x;
                }
                comp[current - 1] = current >= x ? right + 1 : x;
                current = next_val;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(out[i] + " ");
        }
        System.out.println();
    }
}
```

Please note that the ttest_ind function from scipy is not available in Java. It is a statistical test that is used to compare the means of two groups. It is not a part of the standard Java library, so you would need to implement it yourself or find a third-party library that provides this functionality.

