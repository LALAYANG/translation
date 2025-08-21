```java
import java.util.Scanner;

public class TTestInd {
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
            if (ConditionCheckerOneTwelve & ConditionCheckerTwoTwelve) {
                if (ConditionCheckerOneTen & ConditionCheckerTwoTen) {
                    if (ConditionCheckerOneEight & ConditionCheckerTwoEight) {
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
Note: The `ttest_ind` function from the `scipy.stats` library is not available in Java, so it has been removed from the code.
