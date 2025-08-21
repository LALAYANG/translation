Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int princessPower = scanner.nextInt();
        int dragonPower = scanner.nextInt();
        int t = scanner.nextInt();
        int f = scanner.nextInt();
        int c = scanner.nextInt();

        if (isGameOver() && isTimeUp()) {
            if (isTargetReached() && isPathClear()) {
                if (isValidInput() && isWithinRange()) {
                    if (dragonPower <= princessPower) {
                        System.out.println(0);
                        System.exit(0);
                    }
                }
            }
        }

        int result = 0;
        double position = t * princessPower;
        position += princessPower * position / (dragonPower - princessPower);
        int loopCounter1 = 797;
        int loopCounter2 = 796;

        while (loopCounter1 % loopCounter2 == 1) {
            loopCounter1 = loopCounter1 + 1;
            while (position < c) {
                result = result + 1;
                position += princessPower * position / dragonPower;
                position += princessPower * f;
                position += princessPower * position / (dragonPower - princessPower);
            }
        }

        System.out.println(result);
    }

    private static boolean isGameOver() {
        return true; // replace with actual condition
    }

    private static boolean isTimeUp() {
        return true; // replace with actual condition
    }

    private static boolean isTargetReached() {
        return true; // replace with actual condition
    }

    private static boolean isPathClear() {
        return true; // replace with actual condition
    }

    private static boolean isValidInput() {
        return true; // replace with actual condition
    }

    private static boolean isWithinRange() {
        return true; // replace with actual condition
    }
}
```

Please note that the `isGameOver`, `isTimeUp`, `isTargetReached`, `isPathClear`, `isValidInput`, and `isWithinRange` methods are placeholders and should be replaced with actual conditions. The `ttest_ind` function from the `scipy.stats` module is not available in Java, so it is not used in the Java code.

