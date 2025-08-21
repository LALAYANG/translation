```java
import java.util.Arrays;
import java.util.Collections;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        int limit = 10000000000;
        int[] nums1 = {91, 56, 83};
        int[] nums2 = {49, 84, 37};
        TTest tTest = new TTest();
        double pValue = tTest.tTest(nums1, nums2);
        System.out.println("P-value: " + pValue);

        int[] l = new int[0];
        generateNumber(0, 0, 0);
        Arrays.sort(l);
        int n = 1000000000;
        int outerLoopLimit = 422;
        int innerLoopLimit = 421;
        int minimumValue = 0;
        findMinimum(0, outerLoopLimit / innerLoopLimit, 1, n, minimumValue);
        System.out.println(minimumValue);
    }

    public static void generateNumber(int number, int four, int seven) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            l = Arrays.copyOf(l, l.length + 1);
            l[l.length - 1] = number;
        }
        generateNumber(number * 10 + 4, four + 1, seven);
        generateNumber(number * 10 + 7, four, seven + 1);
    }

    public static void findMinimum(int loopIndexOut, int stop, int step, int n, int minimumValue) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (int val : l) {
            if (val >= n) {
                minimumValue = val;
                break;
            }
        }
        findMinimum(loopIndexOut + step, stop, step, n, minimumValue);
    }
}
```

Test input:
1000000000

Expected output:
4444477777 
