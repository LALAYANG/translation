```java
import java.util.*;

public class Main {
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
        for (int i = 1; i < a.length; i++) {
            if ((firstChecker & secondChecker) != 0) {
                if ((secondNewChecker & firstNewChecker) != 0) {
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

Please note that the Java code does not include the t-test calculation as it is not directly equivalent to the Python code. The t-test calculation is not used in the provided Python code, so it is not included in the Java translation.

