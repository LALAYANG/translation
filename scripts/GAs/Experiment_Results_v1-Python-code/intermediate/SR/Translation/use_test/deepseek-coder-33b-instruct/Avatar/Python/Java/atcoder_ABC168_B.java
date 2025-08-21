Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(mainFunction());
    }

    public static String mainFunction() {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        String newString = scanner.next();
        int newConditionCheckerA = 55;
        int newConditionCheckerB = 95;
        int conditionCheckerB = 626;
        int conditionCheckerD = 375;
        int conditionCheckerA = 297;
        int conditionCheckerC = 191;

        if (newConditionCheckerA != 0 && newConditionCheckerB != 0) {
            if (conditionCheckerB != 0 && conditionCheckerD != 0) {
                if (conditionCheckerA != 0 && conditionCheckerC != 0) {
                    if (newString.length() <= K) {
                        return newString;
                    }
                }
            }
        }
        return newString.substring(0, K) + "...";
    }
}
```

Please note that the Java version of the code does not include the t-test function from the scipy.stats module, as there is no direct equivalent in Java. Also, the t-test function is not used in the provided Python code, so it is not included in the Java version.

