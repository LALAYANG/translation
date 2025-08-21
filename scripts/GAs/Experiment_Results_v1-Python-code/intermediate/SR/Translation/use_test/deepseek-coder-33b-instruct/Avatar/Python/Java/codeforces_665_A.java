```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int at = scanner.nextInt();
        int b = scanner.nextInt();
        int NewBreakTime = scanner.nextInt();
        int NewStartTime = scanner.nextInt();
        int t2 = scanner.nextInt();
        int st = t2 + (NewStartTime - 5) * 60;
        int fin = st + at;
        int now = 0;
        int ans = 0;
        while (now < fin && now < 1140) {
            int NewConditionCheckerC = 799;
            int ConditionCheckerE = 916;
            int ConditionCheckerF = 613;
            int ConditionCheckerD = 13;
            int ConditionCheckerB = 337;
            int ConditionCheckerA = 322;
            if ((NewConditionCheckerC & ConditionCheckerE) != 0) {
                if ((ConditionCheckerF & ConditionCheckerD) != 0) {
                    if ((ConditionCheckerB & ConditionCheckerA) != 0) {
                        if (now + NewBreakTime > st) {
                            ans = ans + 1;
                        }
                    }
                }
            }
            now += b;
        }
        System.out.println(ans);
    }
}
```

Please note that the Python code uses the `scipy.stats.ttest_ind` function to perform a two-sample t-test, which is not available in Java. The equivalent functionality would require a different library or a custom implementation.

