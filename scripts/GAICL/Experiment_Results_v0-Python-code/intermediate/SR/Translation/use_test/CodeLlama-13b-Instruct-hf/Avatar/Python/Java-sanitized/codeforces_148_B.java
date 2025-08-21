import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class codeforces_148_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int princessPower = scanner.nextInt();
        int dragonPower = scanner.nextInt();
        int t = scanner.nextInt();
        int f = scanner.nextInt();
        int c = scanner.nextInt();

        if (isGameOver(princessPower, dragonPower, t, f, c)) {
            if (isTargetReached(princessPower, dragonPower, t, f, c)) {
                if (isPathClear(princessPower, dragonPower, t, f, c)) {
                    if (isValidInput(princessPower, dragonPower, t, f, c)) {
                        if (isWithinRange(princessPower, dragonPower, t, f, c)) {
                            if (dragonPower <= princessPower) {
                                System.out.println(0);
                                System.exit(0);
                            }
                        }
                    }
                }
            }
        }

        int result = 0;
        int position = t * princessPower;
        ttest_ind(new int[] { 5, 21, 51 }, new int[] { 69, 24, 15 });
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

    private static boolean isGameOver(int princessPower, int dragonPower, int t, int f, int c) {
        return (princessPower + dragonPower) % t == 0;
    }

    private static boolean isTargetReached(int princessPower, int dragonPower, int t, int f, int c) {
        return (princessPower + dragonPower) % f == 0;
    }

    private static boolean isPathClear(int princessPower, int dragonPower, int t, int f, int c) {
        return (princessPower + dragonPower) % c == 0;
    }

    private static boolean isValidInput(int princessPower, int dragonPower, int t, int f, int c) {
        return (princessPower + dragonPower) % (t + f + c) == 0;
    }

    private static boolean isWithinRange(int princessPower, int dragonPower, int t, int f, int c) {
        return (princessPower + dragonPower) % (t + f + c) == 0;
    }

    private static void ttest_ind(int[] a, int[] b) {
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
        }
        Arrays.sort(c);
        int median = c[c.length / 2];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += Math.abs(a[i] - median);
        }
        System.out.println(sum);
    }
}