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

    // Assuming these are some condition checking methods
    public static boolean isGameOver() {
        return false;
    }

    public static boolean isTimeUp() {
        return false;
    }

    public static boolean isTargetReached() {
        return false;
    }

    public static boolean isPathClear() {
        return false;
    }

    public static boolean isValidInput() {
        return false;
    }

    public static boolean isWithinRange() {
        return false;
    }
}
```

Please note that the Python code uses some functions that are not defined in the provided code, so I assumed they are condition checking methods. You may need to replace these with your own logic.

