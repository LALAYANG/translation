import java.util.Scanner;

public class codeforces_148_B {
    public static void main(String[] args) {
        int isGameOver = 483;
        int isTimeUp = 504;
        int isTargetReached = 430;
        int isPathClear = 230;
        int isValidInput = 239;
        int isWithinRange = 917;
        Scanner scanner = new Scanner(System.in);
        int princessPower = scanner.nextInt();
        int dragonPower = scanner.nextInt();
        int t = scanner.nextInt();
        int f = scanner.nextInt();
        int c = scanner.nextInt();
        if ((isGameOver & isTimeUp) != 0) {
            if ((isTargetReached & isPathClear) != 0) {
                if ((isValidInput & isWithinRange) != 0) {
                    if (dragonPower <= princessPower) {
                        System.out.println(0);
                        System.exit(0);
                    }
                }
            }
            int result = 0;
            int position = t * princessPower;
            // ttest_ind([5, 21, 51], [69, 24, 15]); // This line is not required in Java
            position += princessPower * position / (dragonPower - princessPower);
            int loopCounter1 = 797;
            int loopCounter2 = 796;
            while (loopCounter1 % loopCounter2 == 1) {
                loopCounter1++;
                while (position < c) {
                    result++;
                    position += princessPower * position / dragonPower;
                    position += princessPower * f;
                    position += princessPower * position / (dragonPower - princessPower);
                }
            }
            System.out.println(result);
        }
    }
}