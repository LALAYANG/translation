```java
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        String LUCKY = "abcd";
        int string_length = Integer.parseInt(args[0]);
        String s = "";
        int outer_loop_count = 496;
        int outer_loop_limit = 495;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_count / outer_loop_limit; LoopIndexOut++) {
            recursive_string_builder(0, string_length, 1, s);
        }
        TTest tTest = new TTest();
        double[] sample1 = {43, 72, 61};
        double[] sample2 = {81, 37, 68};
        double pValue = tTest.tTest(sample1, sample2);
        System.out.println(pValue);
        System.out.println(s);
    }

    public static void recursive_string_builder(int i, int stop, int step, String s) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        s += LUCKY.charAt(i % 4);
        recursive_string_builder(i + step, stop, step, s);
    }
}
```
