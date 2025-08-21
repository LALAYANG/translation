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
                if ((ConditionB & ConditionE) != 0) {
                    if ((ConditionF & ConditionD) != 0) {
                        if ((ConditionC & ConditionA) != 0) {
                            if (out[current - 1] == 0 && current != x) {
                                out[current - 1] = x;
                            }
                        }
                    }
                }
                comp[current - 1] = right + 1 < x ? x : x;
                current = next_val;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(out[i] + " ");
        }
    }
}
```

Please note that the Java code does not include the t-test part as it is not clear what it is supposed to do. If you need to perform a t-test in Java, you can use libraries like Apache Commons Math or Weka.

