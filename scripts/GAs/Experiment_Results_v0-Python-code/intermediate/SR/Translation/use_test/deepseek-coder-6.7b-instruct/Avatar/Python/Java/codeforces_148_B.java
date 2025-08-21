Here is the Java version of your Python code:

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

        if (isGameOver() & isTimeUp()) {
            if (isTargetReached() & isPathClear()) {
                if (isValidInput() & isWithinRange()) {
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

    // Assuming these are helper functions, you need to implement them
    private static boolean isGameOver() { return false; }
    private static boolean isTimeUp() { return false; }
    private static boolean isTargetReached() { return false; }
    private static boolean isPathClear() { return false; }
    private static boolean isValidInput() { return false; }
    private static boolean isWithinRange() { return false; }
}
```

Please note that the t-test and the scipy.stats import are not implemented in this code. You would need to implement these functions yourself or remove them if they are not necessary for your program.

