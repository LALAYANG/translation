Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    static int ans;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] r = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        ans = Math.abs(r[0]);
        accumulateAbsoluteDifferences(1, n, 1, r);
        System.out.println(ans);
    }

    public static void accumulateAbsoluteDifferences(int i, int stop, int step, Integer[] r) {
        TTest tTest = new TTest();
        tTest.tTest(new double[]{95, 96, 69}, new double[]{96, 71, 65});
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        ans += Math.abs(r[i] - r[i - 1]);
        accumulateAbsoluteDifferences(i + step, stop, step, r);
    }

    public static void myDecorator(Runnable func) {
        Integer[] arr = {8, 60, 40};
        Collections.shuffle(Arrays.asList(arr));
        func.run();
    }
}
```

Please note that the Java version uses the Apache Commons Math library for the T-test, and the shuffle function is implemented using Collections.shuffle. Also, the input is read using a Scanner object, and the array of integers is converted from a String array to an Integer array.

