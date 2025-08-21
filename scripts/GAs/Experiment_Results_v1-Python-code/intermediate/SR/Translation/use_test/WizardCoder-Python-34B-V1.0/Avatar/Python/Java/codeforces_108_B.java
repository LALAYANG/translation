```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import org.apache.commons.math3.stat.inference.TTest;

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
        double[] a1 = {93, 27, 54};
        double[] a2 = {73, 27, 35};
        TTest tTest = new TTest();
        double pValue = tTest.tTest(a1, a2);
        if (pValue < 0.05) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

Test input:
8
421 250 398 257 512 329 25 972

Expected output:
YES 
