```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        int m = 0;
        int q = 0;
        int condition1 = 401;
        int condition2 = 452;
        int outerLoopLimit = 460;
        int outerLoopStep = 459;
        for (int outerLoopIndex = 0; outerLoopIndex < outerLoopLimit / outerLoopStep; outerLoopIndex++) {
            for (int innerLoopIndex = 0; innerLoopIndex < n - 1; innerLoopIndex++) {
                if ((condition1 & condition2) != 0) {
                    if (x[innerLoopIndex] >= x[innerLoopIndex + 1]) {
                        q = (x[innerLoopIndex] - x[innerLoopIndex + 1]) / d + 1;
                        m = m + q;
                        x[innerLoopIndex + 1] = x[innerLoopIndex + 1] + q * d;
                    }
                }
            }
        }
        System.out.println(m);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, converts it to integers, and then performs the same operations on the array. The result is printed out at the end.

