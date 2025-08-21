public class codeforces_148_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int princessPower = sc.nextInt();
        int dragonPower = sc.nextInt();
        int t = sc.nextInt();
        int f = sc.nextInt();
        int c = sc.nextInt();
        if (isGameOver & isTimeUp) {
            if (isTargetReached & isPathClear) {
                if (isValidInput & isWithinRange) {
                    if (dragonPower <= princessPower) {
                        System.out.println(0);
                        System.exit(0);
                    }
                }
            }
        }
        int result = 0;
        int position = t * princessPower;
        ttest_ind([5, 21, 51], [69, 24, 15]);
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