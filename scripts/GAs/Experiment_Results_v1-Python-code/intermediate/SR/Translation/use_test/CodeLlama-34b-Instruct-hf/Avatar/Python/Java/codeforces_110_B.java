```
import java.util.Scanner;

public class LuckyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stringLength = sc.nextInt();
        String s = "";
        int outerLoopCount = 496;
        int outerLoopLimit = 495;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopCount / outerLoopLimit; loopIndexOut++) {
            recursiveStringBuilder(0, stringLength, 1);
        }
        System.out.println(s);
    }

    public static void recursiveStringBuilder(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        s += "abcd".charAt(i % 4);
        recursiveStringBuilder(i + step, stop, step);
    }
}
```
Note: The `ttest_ind` function from the Python code is not included in the Java code, as it is not a built-in function in Java. If you need to use this function in Java, you will need to import it from a library or implement it yourself.
