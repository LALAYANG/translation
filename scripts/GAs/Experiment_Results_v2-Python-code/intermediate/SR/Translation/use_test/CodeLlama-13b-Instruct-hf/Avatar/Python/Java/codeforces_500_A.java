
Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NewN = sc.nextInt();
        int t = sc.nextInt();
        int[] s = new int[NewN];
        for (int i = 0; i < NewN; i++) {
            s[i] = sc.nextInt();
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
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.exit(0)` method to exit the program when the condition is met. The `System.out.println()` method is used to print the output.
