Here is the Java translation of the Python code:

```java
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static String s = "";
    static String base_string = "abcd";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_length = scanner.nextInt();
        stringBuilder(0, input_length, 1);
        System.out.println(s);
    }

    public static void stringBuilder(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        s += base_string.charAt(i % 4);
        stringBuilder(i + step, stop, step);
    }
}
```

Please note that the `ttest_ind` and `shuffle` functions from the Python code are not used in the Java translation. The `ttest_ind` function is used for performing a two-sample t-test for the null hypothesis that 2 independent samples have identical average (expected) values. The `shuffle` function is used for shuffling the elements in a list. In the Java translation, these functions are not used.

