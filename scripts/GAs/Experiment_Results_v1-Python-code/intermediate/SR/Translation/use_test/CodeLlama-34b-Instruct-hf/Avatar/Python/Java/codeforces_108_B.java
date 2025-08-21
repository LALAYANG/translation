```java
import java.util.Scanner;

public class CheckCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
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
Note: The `ttest_ind` function from the Python code is not available in Java, so it has been removed from the Java code.
