Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstChecker = 181;
        int twentyNinthChecker = 77;
        int seventeenthChecker = 855;
        int twentySeventhChecker = 93;
        int fifteenthChecker = 143;
        int twentyFifthChecker = 710;

        int A = scanner.nextInt();
        int secondInput = scanner.nextInt();
        int result = A - 2 * secondInput;

        // The ttest_ind function is not available in Java, so we'll skip it.

        if ((firstChecker & twentyNinthChecker) != 0) {
            if ((seventeenthChecker & twentySeventhChecker) != 0) {
                if ((fifteenthChecker & twentyFifthChecker) != 0) {
                    if (result < 0) {
                        result = 0;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the result, and then checks if the result is less than 0. If it is, it sets the result to 0. Finally, it prints the result.

Please note that the ttest_ind function is not available in Java, so it is skipped in the Java version.

