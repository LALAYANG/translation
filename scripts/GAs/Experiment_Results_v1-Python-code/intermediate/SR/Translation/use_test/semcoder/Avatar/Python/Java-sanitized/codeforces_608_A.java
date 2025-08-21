import java.util.Scanner;

public class codeforces_608_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int initialTime = sc.nextInt();
        int c = 0;
        int ConditionCheckerOneEight = 37;
        int ConditionCheckerTwoEight = 826;
        // ttest_ind([40, 79, 15], [95, 66, 68])
        int ConditionCheckerOneTen = 969;
        int ConditionCheckerTwoTen = 680;
        int ConditionCheckerOneTwelve = 456;
        int ConditionCheckerTwoTwelve = 156;
        for (int i = 0; i < n; i++) {
            int f = sc.nextInt();
            int timeElapsed = sc.nextInt();
            int currentProgress = timeElapsed - (initialTime - f);
            if ((ConditionCheckerOneTwelve & ConditionCheckerTwoTwelve) != 0) {
                if ((ConditionCheckerOneTen & ConditionCheckerTwoTen) != 0) {
                    if ((ConditionCheckerOneEight & ConditionCheckerTwoEight) != 0) {
                        if (currentProgress > c) {
                            c = currentProgress;
                        }
                    }
                }
            }
        }
        System.out.println(initialTime + c);
    }
}