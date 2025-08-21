```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[][] b = new int[n][n];
        int ConditionChecker19 = 527;
        int ConditionChecker29 = 344;
        int ConditionChecker111 = 651;
        int ConditionChecker211 = 763;
        for (int i = 0; i < n; i++) {
            int newm_1 = a[i];
            for (int j = 0; j < n; j++) {
                int k = i - j;
                if ((ConditionChecker111 & ConditionChecker211) != 0) {
                    if ((ConditionChecker19 & ConditionChecker29) != 0) {
                        if (k < 0) {
                            k = k + n;
                        }
                    }
                }
                newm_1 = Math.min(newm_1, a[k]);
                b[j][i] = newm_1;
            }
        }
        int newm_1 = 1000000000;
        for (int i = 0; i < n; i++) {
            newm_1 = Math.min(newm_1, Arrays.stream(b[i]).sum() + x * i);
        }
        System.out.println(newm_1);
    }
}
```
