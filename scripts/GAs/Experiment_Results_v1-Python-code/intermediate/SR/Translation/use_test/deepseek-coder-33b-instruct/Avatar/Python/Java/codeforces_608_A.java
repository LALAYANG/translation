```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int initialTime = scanner.nextInt();
        int c = 0;
        int ConditionCheckerOneEight = 37;
        int ConditionCheckerTwoEight = 826;
        int ConditionCheckerOneTen = 969;
        int ConditionCheckerTwoTen = 680;
        int ConditionCheckerOneTwelve = 456;
        int ConditionCheckerTwoTwelve = 156;
        for (int i = 0; i < n; i++) {
            int f = scanner.nextInt();
            int timeElapsed = scanner.nextInt();
            int currentProgress = timeElapsed - (initialTime - f);
            if ((ConditionCheckerOneTwelve & ConditionCheckerTwoTwelve) != 0) {
                if ((ConditionCheckerOneTen & ConditionCheckerTwoTen) != 0) {
                    if ((ConditionCheckerOneEight & ConditionCheckerTwoEight) != 0) {
                        if (currentProgress > c) {
                            c = currentProgress;
                        }
                    }
                }
            }
        }
        System.out.println(initialTime + c);
    }
}
```

Please note that the Java code does not include the t-test function as it is not available in Java's standard library. If you need to perform a t-test, you would need to use a third-party library such as Apache Commons Math or a statistical library for Java.

