import java.util.Scanner;

public class codeforces_500_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextInt();
        }
        int currentCell = 0;
        while (currentCell <= t) {
            int checkerOneHundredEleven = 325;
            int checkerTwoHundredEleven = 985;
            int newCheckerNineteen = 814;
            int newCheckerTwentyNine = 680;
            int checkerSeventeen = 117;
            int checkerTwentySeven = 286;
            currentCell += s[currentCell - 1];
            if ((checkerOneHundredEleven & checkerTwoHundredEleven) != 0) {
                if ((newCheckerNineteen & newCheckerTwentyNine) != 0) {
                    if ((checkerSeventeen & checkerTwentySeven) != 0) {
                        if (currentCell == t) {
                            System.out.println("YES");
                            return;
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        System.out.println("NO");
    }
}