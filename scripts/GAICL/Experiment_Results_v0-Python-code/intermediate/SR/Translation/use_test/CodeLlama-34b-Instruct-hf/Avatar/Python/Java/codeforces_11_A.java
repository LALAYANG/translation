
Here's the Java code that is equivalent to the given Python code:
```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] x = new int[n];
        int m = 0;
        int q = 0;

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            if (x[i] >= x[i + 1]) {
                q = (x[i] - x[i + 1]) / d + 1;
                m += q;
                x[i + 1] += q * d;
            }
        }

        System.out.println(m);
    }
}
```
Note that the `ttest_ind` function from the Python code is not needed in the Java code, as it is not used in the given code snippet.
