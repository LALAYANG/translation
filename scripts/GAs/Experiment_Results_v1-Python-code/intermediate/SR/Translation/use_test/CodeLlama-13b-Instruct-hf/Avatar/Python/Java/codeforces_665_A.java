
Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int NewStartTime = sc.nextInt();
        int t2 = sc.nextInt();
        int st = t2 + (NewStartTime - 5) * 60;
        int fin = st + a;
        int now = 0;
        int ans = 0;
        while (now < fin && now < 1140) {
            int NewConditionCheckerC = 799;
            int ConditionCheckerE = 916;
            int ConditionCheckerF = 613;
            int ConditionCheckerD = 13;
            int ConditionCheckerB = 337;
            int ConditionCheckerA = 322;
            if ((NewConditionCheckerC & ConditionCheckerE) != 0 && (ConditionCheckerF & ConditionCheckerD) != 0 && (ConditionCheckerB & ConditionCheckerA) != 0) {
                if (now + b > st) {
                    ans++;
                }
            }
            now += b;
        }
        System.out.println(ans);
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print the output. The `if` statements in the Java code are similar to the `if` statements in the Python code, but they use the bitwise AND operator (`&`) instead of the logical AND operator (`and`).
