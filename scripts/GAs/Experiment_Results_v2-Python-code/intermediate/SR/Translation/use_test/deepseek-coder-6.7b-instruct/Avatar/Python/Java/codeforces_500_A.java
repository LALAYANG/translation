Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
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
            NewCurrentCell += s[NewCurrentCell];
            if ((CheckerOneHundredEleven & CheckerTwoHundredEleven) != 0) {
                if ((NewCheckerNineteen & NewCheckerTwentyNine) != 0) {
                    if ((CheckerSeventeen & CheckerTwentySeven) != 0) {
                        if (NewCurrentCell == t) {
                            System.out.println("YES");
                            System.exit(0);
                        }
                    }
                }
            }
        }
        System.out.println("NO");
    }
}
```

This Java code does the same thing as your Python code. It reads the input, processes it, and prints the output. The only difference is that in Java, we use `Scanner` to read the input, and we use `System.exit(0)` to exit the program.

Please note that the `ttest_ind([18, 67, 72], [52, 53, 40])` line in your Python code is not included in the Java version because it's not relevant to the problem you're trying to solve. It's a function from the `scipy.stats` module, which is a scientific computation library in Python, not a part of the problem.

