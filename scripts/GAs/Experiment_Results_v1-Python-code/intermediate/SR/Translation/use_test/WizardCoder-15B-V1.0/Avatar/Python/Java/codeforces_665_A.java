```java
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class TTestExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] sample1 = {70, 47, 20};
        int[] sample2 = {3, 73, 15};
        TTest tTest = new TTest();
        double t = tTest.tTest(sample1, sample2);
        System.out.println(t);
        int a = input.nextInt();
        int b = input.nextInt();
        String[] time = input.next().split(":");
        int NewStartTime = Integer.parseInt(time[0]);
        int NewBreakTime = input.nextInt();
        int st = (NewStartTime - 5) * 60 + Integer.parseInt(time[1]);
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
