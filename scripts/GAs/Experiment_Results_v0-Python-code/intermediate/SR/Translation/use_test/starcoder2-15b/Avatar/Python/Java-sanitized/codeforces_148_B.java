import java.util.Scanner;

public class codeforces_148_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int princessPower = scanner.nextInt();
        int dragonPower = scanner.nextInt();
        int t = scanner.nextInt();
        int f = scanner.nextInt();
        int c = scanner.nextInt();
        if (isGameOver(t) & isTimeUp(t)) {
            if (isTargetReached(c) & isPathClear(c)) {
                if (isValidInput(f) & isWithinRange(f)) {
                    if (dragonPower <= princessPower) {
                        System.out.println(0);
                        return;
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

    private static boolean isGameOver(int t) {
        return t == 483;
    }

    private static boolean isTimeUp(int t) {
        return t == 504;
    }

    private static boolean isTargetReached(int c) {
        return c == 430;
    }

    private static boolean isPathClear(int c) {
        return c == 230;
    }

    private static boolean isValidInput(int f) {
        return f == 239;
    }

    private static boolean isWithinRange(int f) {
        return f == 917;
    }
}