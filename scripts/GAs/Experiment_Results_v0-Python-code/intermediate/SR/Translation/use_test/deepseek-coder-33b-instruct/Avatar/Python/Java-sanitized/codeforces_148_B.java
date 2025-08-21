import java.util.Scanner;

public class codeforces_148_B {
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
        int position = t * princessPower;
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
        // Implement your logic here
        return false;
    }

    private static boolean isTimeUp() {
        // Implement your logic here
        return false;
    }

    private static boolean isTargetReached() {
        // Implement your logic here
        return false;
    }

    private static boolean isPathClear() {
        // Implement your logic here
        return false;
    }

    private static boolean isValidInput() {
        // Implement your logic here
        return false;
    }

    private static boolean isWithinRange() {
        // Implement your logic here
        return false;
    }
}