```java
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.math3.stat.inference.TTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int condition_1 = 836;
        int condition_2 = 829;

        int input_a = 0;
        int input_b = 0;

        if ((condition_1 & condition_2) == 836) {
            int age = Integer.parseInt(args[0]);
            if (age == 1) {
                System.out.println("Hello World");
            } else {
                input_a = Integer.parseInt(args[1]);
                input_b = Integer.parseInt(args[2]);
                int sum = sum_inputs(input_a, input_b);
                System.out.println(sum);
            }
        }
    }

    public static int sum_inputs(int a, int b) {
        return a + b;
    }

    public static void shuffle(List<Integer> list) {
        Collections.shuffle(list);
    }

    public static double ttest_ind(int[] a, int[] b) {
        TTest tTest = new TTest();
        return tTest.tTest(ArrayUtils.toPrimitive(a), ArrayUtils.toPrimitive(b));
    }
}
```

Note: The code uses Apache Commons Math library for t-test.
