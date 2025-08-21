```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int NewBreakTime = sc.nextInt();
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
            if ((NewConditionCheckerC & ConditionCheckerE) != 0) {
                if ((ConditionCheckerF & ConditionCheckerD) != 0) {
                    if ((ConditionCheckerB & ConditionCheckerA) != 0) {
                        if (now + NewBreakTime > st) {
                            ans++;
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
Note: The above code is a direct translation of the given Python code to Java. However, the Python code has some issues, such as using `map` to convert the input strings to integers, which is not necessary in Java. Additionally, the Python code uses the `input` function to read input from the user, which is not available in Java. Therefore, the Java code uses the `Scanner` class to read input from the user.
