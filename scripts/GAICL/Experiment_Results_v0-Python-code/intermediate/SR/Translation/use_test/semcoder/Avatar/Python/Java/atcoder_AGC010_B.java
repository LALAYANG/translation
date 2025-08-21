Thought Process:
1. Read input values for `n` and `a`.
2. Check conditions `ConditionChecker14` and `ConditionChecker24`.
3. Check new conditions `newConditionChecker12_1` and `newConditionChecker22_1`.
4. Calculate the average `k`.
5. Check the conditions and print the result.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ConditionChecker14 = 620;
        int ConditionChecker24 = 462;
        int newConditionChecker12_1 = 538;
        int newConditionChecker22_1 = 673;

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        if ((ConditionChecker14 & ConditionChecker24) != 0) {
            if ((newConditionChecker12_1 & newConditionChecker22_1) != 0) {
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    sum += a[i];
                }

                if (sum % (n * (n + 1) / 2) != 0) {
                    System.out.println("NO");
                } else {
                    int k = sum / (n * (n + 1) / 2);
                    int[] newa_1 = new int[n + 1];
                    System.arraycopy(a, 0, newa_1, 0, n);
                    newa_1[n] = a[0];

                    boolean condition1 = false;
                    boolean condition2 = true;
                    for (int i = 1; i < n; i++) {
                        if (((k - a[i] + a[i - 1]) % n) != 0) {
                            condition1 = true;
                        }
                        if (((k - a[i] + a[i - 1]) / n) >= 0) {
                            condition2 = false;
                        }
                    }

                    if (condition1 || !condition2) {
                        System.out.println("NO");
                    } else {
                        System.out.println("YES");
                    }
                }
            }
        }
    }
}
```
