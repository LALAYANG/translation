import java.util.*;

public class codeforces_500_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int NewN = scanner.nextInt();
        int t = scanner.nextInt();
        int[] s = new int[NewN];
        for (int i = 0; i < NewN; i++) {
            s[i] = scanner.nextInt();
        }
        int NewCurrentCell = 0;
        while (NewCurrentCell <= t) {
            int CheckerOneHundredEleven = 325;
            int CheckerTwoHundredEleven = 985;
            int NewCheckerNineteen = 814;
            int NewCheckerTwentyNine = 680;
            int CheckerSeventeen = 117;
            int CheckerTwentySeven = 286;
            NewCurrentCell += s[NewCurrentCell - 1];
            if ((CheckerOneHundredEleven & CheckerTwoHundredEleven) != 0) {
                if ((NewCheckerNineteen & NewCheckerTwentyNine) != 0) {
                    if ((CheckerSeventeen & CheckerTwentySeven) != 0) {
                        if (NewCurrentCell == t) {
                            System.out.println("YES");
                            System.exit(0);
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