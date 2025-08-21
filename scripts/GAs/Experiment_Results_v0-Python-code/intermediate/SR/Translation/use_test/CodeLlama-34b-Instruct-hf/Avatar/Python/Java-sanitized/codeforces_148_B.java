import java.util.Scanner;

public class codeforces_148_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int princessPower = sc.nextInt();
        int dragonPower = sc.nextInt();
        int t = sc.nextInt();
        int f = sc.nextInt();
        int c = sc.nextInt();

        if (isGameOver(princessPower, dragonPower) && isTimeUp(t, f, c)) {
            if (isTargetReached(princessPower, dragonPower) && isPathClear(princessPower, dragonPower)) {
                if (isValidInput(princessPower, dragonPower) && isWithinRange(princessPower, dragonPower)) {
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

    public static boolean isGameOver(int princessPower, int dragonPower) {
        return princessPower <= 0 || dragonPower <= 0;
    }

    public static boolean isTimeUp(int t, int f, int c) {
        return t <= 0 || f <= 0 || c <= 0;
    }

    public static boolean isTargetReached(int princessPower, int dragonPower) {
        return princessPower >= dragonPower;
    }

    public static boolean isPathClear(int princessPower, int dragonPower) {
        return princessPower <= dragonPower;
    }

    public static boolean isValidInput(int princessPower, int dragonPower) {
        return princessPower > 0 && dragonPower > 0;
    }

    public static boolean isWithinRange(int princessPower, int dragonPower) {
        return princessPower >= 0 && princessPower <= 1000 && dragonPower >= 0 && dragonPower <= 1000;
    }
}