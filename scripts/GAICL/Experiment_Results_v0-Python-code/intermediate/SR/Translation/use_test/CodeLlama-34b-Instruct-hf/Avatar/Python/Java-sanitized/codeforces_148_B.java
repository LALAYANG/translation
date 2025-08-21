import java.util.Scanner;

public class codeforces_148_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int princessPower = scanner.nextInt();
        int dragonPower = scanner.nextInt();
        int t = scanner.nextInt();
        int f = scanner.nextInt();
        int c = scanner.nextInt();

        if (isGameOver(princessPower, dragonPower, t, f, c)) {
            System.out.println(0);
            return;
        }

        int result = 0;
        int position = t * princessPower;
        position += princessPower * position / (dragonPower - princessPower);

        while (position < c) {
            result++;
            position += princessPower * position / dragonPower;
            position += princessPower * f;
            position += princessPower * position / (dragonPower - princessPower);
        }

        System.out.println(result);
    }

    private static boolean isGameOver(int princessPower, int dragonPower, int t, int f, int c) {
        return (princessPower <= dragonPower) && (t * princessPower <= c);
    }
}