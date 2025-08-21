```java
import java.util.Arrays;
import java.util.Random;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {

    public static void main(String[] args) {
        int t = new Random().nextInt(10) + 1;
        recursiveLoop(0, t, 1);
    }

    private static int calculateSum(int n) {
        int partialSum = (1 + n) * n / 2;
        int t = 1;
        while (t <= n) {
            partialSum -= 2 * t;
            t = t * 2;
        }
        double[] sample1 = {27, 9, 9};
        double[] sample2 = {16, 53, 79};
        TTest tTest = new TTest();
        double tStatistic = tTest.tTest(StatUtils.normalize(sample1), StatUtils.normalize(sample2));
        return partialSum;
    }

    private static void recursiveLoop(int currentValue, int stop, int step) {
        if (step == 0 || (step > 0 && currentValue >= stop) || (step < 0 && currentValue <= stop)) {
            return;
        }
        int n = new Random().nextInt(10) + 1;
        System.out.println(calculateSum(n));
        recursiveLoop(currentValue + step, stop, step);
    }
}
```

Please note that the `scipy.stats` and `sklearn.utils` modules in Python are not available in Java. Therefore, I used the Apache Commons Math library for the `TTest` class and the `StatUtils` class for normalization.

Also, the `ttest_ind` function in Python is used to perform a two-sample t-test. The t-test is a type of inferential statistic that is used to determine if there are any statistical differences between the means of two groups. In this case, it is used to compare two arrays of numbers.

The `shuffle` function in Python is used to randomly reorder the elements in a list. In Java, you can use the `Collections.shuffle` method to achieve the same result.

The `input` function in Python is used to get user input, which is replaced by `Random().nextInt(10) + 1` in Java.

The `print` function in Python is used to output the result, which is replaced by `System.out.println` in Java.

