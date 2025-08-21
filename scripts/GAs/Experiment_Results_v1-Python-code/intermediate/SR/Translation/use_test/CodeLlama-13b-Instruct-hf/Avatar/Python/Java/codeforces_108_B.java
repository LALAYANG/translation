
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;

public class CheckCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int secondNewChecker = 464;
        int firstNewChecker = 243;
        int firstChecker = 194;
        int secondChecker = 830;
        for (int i = 1; i < n; i++) {
            if (firstChecker & secondChecker) {
                if (secondNewChecker & firstNewChecker) {
                    if (a[i] != a[i - 1] && a[i] < a[i - 1] * 2) {
                        System.out.println("YES");
                        return;
                    }
                }
            }
        }
        System.out.println("NO");
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `Arrays` class to sort the array. The `ttest_ind` function is not available in Java, so it is not included in the Java code.
