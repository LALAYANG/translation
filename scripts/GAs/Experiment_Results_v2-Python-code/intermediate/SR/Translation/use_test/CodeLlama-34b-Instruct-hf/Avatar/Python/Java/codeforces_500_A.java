```
import java.util.Scanner;

public class TTestInd {
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
            if (CheckerOneHundredEleven & CheckerTwoHundredEleven) {
                if (NewCheckerNineteen & NewCheckerTwentyNine) {
                    if (CheckerSeventeen & CheckerTwentySeven) {
                        if (NewCurrentCell == t) {
                            System.out.println("YES");
                            break;
                        } else {
                            continue;
                        }
                    }
                }
            }
        }

        if (NewCurrentCell > t) {
            System.out.println("NO");
        }
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not a good practice to use variable names like `CheckerOneHundredEleven`, `CheckerTwoHundredEleven`, etc. It is recommended to use meaningful variable names that describe the purpose of the variable.
