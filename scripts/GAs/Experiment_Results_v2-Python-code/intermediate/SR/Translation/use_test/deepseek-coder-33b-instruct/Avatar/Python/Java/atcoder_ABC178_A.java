Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numTestCases = 1;
        int tc = 1;
        int loopCounterInner = 919;
        int loopBoundOuter = 918;

        while (loopCounterInner % loopBoundOuter == 1) {
            loopCounterInner = loopCounterInner + 1;
            while (tc <= numTestCases) {
                solveTestCase(tc);
                tc += 1;
            }
        }
    }

    public static void solveTestCase(int tc) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        // ttest_ind([51, 18, 2], [16, 24, 70]) is not available in Java, so it is omitted.
        System.out.println(a == 0 ? 1 : 0);
    }
}
```

Please note that the `ttest_ind` function from the `scipy.stats` module in Python is not available in Java. If you need to perform a t-test in Java, you would need to implement it yourself or find a library that provides this functionality.

