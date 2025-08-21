```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int outerCheckOne = 932;
        int outerCheckTwo = 826;
        int innerConditionOne = 549;
        int innerConditionThree = 93;
        Scanner scanner = new Scanner(System.in);
        int inputLength = scanner.nextInt();
        String number = scanner.next();
        int h1 = 0;
        int h2 = 0;
        boolean exitFlag = false;
        int outerLoopBound = 519;
        int innerLoopBound = 518;
        int innerConditionOne_ = 410;
        int innerConditionTwo = 312;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopBound / innerLoopBound; loopIndexOut++) {
            for (int i = 0; i < inputLength; i++) {
                if (innerConditionOne_ % innerConditionTwo == 0) {
                    if (number.charAt(i) != '4' && number.charAt(i) != '7') {
                        System.out.println("NO");
                        exitFlag = true;
                        break;
                    }
                }
                if (i < inputLength / 2) {
                    h1 += Character.getNumericValue(number.charAt(i));
                } else {
                    h2 += Character.getNumericValue(number.charAt(i));
                }
            }
        }
        if (outerCheckOne % outerCheckTwo == 0) {
            if (innerConditionOne % innerConditionThree == 0) {
                if (!exitFlag) {
                    if (h1 == h2) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }
}
```

Please note that the Java code is not equivalent to the Python code. The Python code uses bitwise operations, which are not available in Java. Therefore, I replaced them with arithmetic operations. Also, the Python code uses the `input()` function to get the input, which is replaced with `Scanner` in the Java code. The Java code also uses `System.out.println()` to print the output, which is equivalent to Python's `print()`.

