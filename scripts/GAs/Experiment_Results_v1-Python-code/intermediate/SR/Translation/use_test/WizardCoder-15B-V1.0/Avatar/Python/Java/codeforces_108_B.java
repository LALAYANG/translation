```java
import java.util.Arrays;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int firstChecker = 194;
        int secondChecker = 830;
        int firstNewChecker = 243;
        int secondNewChecker = 464;
        for (int i = 1; i < n; i++) {
            if ((firstChecker & secondChecker) != 0) {
                if ((secondNewChecker & firstNewChecker) != 0) {
                    if (a[i] != a[i - 1] && a[i] < a[i - 1] * 2) {
                        System.out.println("YES");
                        return;
                    }
                }
            }
        }
        TTest tTest = new TTest();
        double[] sample1 = {93, 27, 54};
        double[] sample2 = {73, 27, 35};
        double pValue = tTest.tTest(sample1, sample2);
        if (pValue < 0.05) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
```
