Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int initialTime = scanner.nextInt();
        int c = 0;
        final int ConditionCheckerOneEight = 37;
        final int ConditionCheckerTwoEight = 826;
        final int ConditionCheckerOneTen = 969;
        final int ConditionCheckerTwoTen = 680;
        final int ConditionCheckerOneTwelve = 456;
        final int ConditionCheckerTwoTwelve = 156;
        for (int i = 0; i < n; i++) {
            int f = scanner.nextInt();
            int timeElapsed = scanner.nextInt();
            int currentProgress = timeElapsed - (initialTime - f);
            if ((ConditionCheckerOneTwelve & ConditionCheckerTwoTwelve) != 0 &&
                    (ConditionCheckerOneTen & ConditionCheckerTwoTen) != 0 &&
                    (ConditionCheckerOneEight & ConditionCheckerTwoEight) != 0) {
                if (currentProgress > c) {
                    c = currentProgress;
                }
            }
        }
        System.out.println(initialTime + c);
    }
}
```

Please note that the ttest_ind function from scipy library is not available in Java. If you need to perform a t-test, you would need to implement it yourself or use a library that provides this functionality.

Also, the bitwise AND operator (&) in Java is equivalent to the bitwise AND operator (&) in Python. The bitwise AND operator in Java returns a number that represents the bitwise AND of the two numbers.

The condition `if (ConditionCheckerOneTwelve & ConditionCheckerTwoTwelve) != 0` is equivalent to `if ConditionCheckerOneTwelve & ConditionCheckerTwoTwelve:` in Python.

The `&` operator in Java returns 0 if both bits are 0; otherwise, it returns 1. So, `if ((ConditionCheckerOneTwelve & ConditionCheckerTwoTwelve) != 0)` is equivalent to `if ConditionCheckerOneTwelve & ConditionCheckerTwoTwelve:` in Python.

