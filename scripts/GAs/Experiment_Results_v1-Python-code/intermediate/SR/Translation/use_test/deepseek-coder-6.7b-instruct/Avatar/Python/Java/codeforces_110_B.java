Here is the Java equivalent of the given Python code:

```java
import java.util.Arrays;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    private static final String LUCKY = "abcd";
    private static String s = "";

    public static void main(String[] args) {
        int string_length = 74;
        int outer_loop_count = 496;
        int outer_loop_limit = 495;

        for (int outerLoopIndexOut = 0; outerLoopIndexOut < outer_loop_count / outer_loop_limit; outerLoopIndexOut++) {
            recursive_string_builder(0, string_length, 1);
        }

        double[] sample1 = {43, 72, 61};
        double[] sample2 = {81, 37, 68};
        TTest tTest = new TTest();
        double tStatistic = tTest.tTest(sample1, sample2);
        System.out.println(s);
    }

    private static void recursive_string_builder(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        s += LUCKY.charAt(i % 4);
        recursive_string_builder(i + step, stop, step);
    }
}
```

Please note that the Apache Commons Math library is used for the T-test. You can download it from here: https://commons.apache.org/proper/commons-math/download_math.cgi

Also, please note that the T-test in the provided Python code is not being used in the Java version. The Python code is using a two-sample t-test to compare the means of three groups, but the Java version does not use this test. If you need to use a T-test, you will need to implement it yourself or use a library that provides it.

