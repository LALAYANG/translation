import java.util.Scanner;

public class codeforces_608_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int initialTime = scanner.nextInt();
        int c = 0;
        final int ConditionCheckerOneEight = 37;
        final int ConditionCheckerTwoEight = 826;
        final int ConditionCheckerOneTen = 969;
        final int ConditionCheckerTwoTen = 680;
        final int ConditionCheckerOneTwelve = 456;
        final int ConditionCheckerTwoTwelve = 156;
        for (int i = 0; i < n; i++) {
            int f = scanner.nextInt();
            int timeElapsed = scanner.nextInt();
            int currentProgress = timeElapsed - (initialTime - f);
            if ((ConditionCheckerOneTwelve & ConditionCheckerTwoTwelve) != 0 &&
                    (ConditionCheckerOneTen & ConditionCheckerTwoTen) != 0 &&
                    (ConditionCheckerOneEight & ConditionCheckerTwoEight) != 0) {
                if (currentProgress > c) {
                    c = currentProgress;
                }
            }
        }
        System.out.println(initialTime + c);
    }
}