import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_148_B {
    public static void main(String[] args) {
        int princessPower = Integer.parseInt(args[0]);
        int dragonPower = Integer.parseInt(args[1]);
        int t = Integer.parseInt(args[2]);
        int f = Integer.parseInt(args[3]);
        int c = Integer.parseInt(args[4]);

        int isGameOver = 483;
        int isTimeUp = 504;
        int isTargetReached = 430;
        int isPathClear = 230;
        int isValidInput = 239;
        int isWithinRange = 917;

        if ((isGameOver & isTimeUp) != 0) {
            if ((isTargetReached & isPathClear) != 0) {
                if ((isValidInput & isWithinRange) != 0) {
                    if (dragonPower <= princessPower) {
                        System.out.println(0);
                        System.exit(0);
                    }
                }
            }
        }

        int result = 0;
        int position = t * princessPower;
        TTest tTest = new TTest();
        double tTestResult = tTest.tTest(new double[]{5, 21, 51}, new double[]{69, 24, 15});
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
}