```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int conditionChecker14 = 620;
        int conditionChecker24 = 462;
        int newConditionChecker12_1 = 538;
        int newConditionChecker22_1 = 673;

        if (conditionChecker14 & conditionChecker24) {
            if (newConditionChecker12_1 & newConditionChecker22_1) {
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    sum += a[i];
                }
                if (sum % (n * (n + 1) / 2) != 0) {
                    System.out.println("NO");
                } else {
                    int k = sum / (n * (n + 1) / 2);
                    a[n] = a[0];
                    int[] b = new int[n + 1];
                    for (int i = 0; i < n; i++) {
                        b[i] = (k - a[i + 1] + a[i]) % n;
                    }
                    if (b[0] != 0 || b[n - 1] != 0) {
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
Note: The above code is a Java implementation of the given Python code. The Python code uses NumPy for array operations, but Java does not have a built-in equivalent. Therefore, the Java code uses a simple array implementation instead. Additionally, the Java code uses the `Scanner` class to read input from the user, while the Python code uses the `input()` function.
