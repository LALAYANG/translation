```java
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] vo = {"a", "e", "i", "o", "u", "y", "A", "E", "I", "O", "U", "Y"};
        int FirstConditionalChecker = 327;
        TTest tTest = new TTest();
        double[] sample1 = {58, 41, 57};
        double[] sample2 = {17, 52, 39};
        double t = tTest.tTest(sample1, sample2);
        int InnerConditionalCheckerTwo = 947;
        int OuterLoopCounter = 582;
        int InnerLoopCounter = 581;
        int InnerConditionalCheckerOne = 104;
        int SecondConditionalChecker = 929;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopCounter / InnerLoopCounter; LoopIndexOut++) {
            for (int StringReverseIndex = a.length() - 1; StringReverseIndex >= 0; StringReverseIndex--) {
                if (InnerConditionalCheckerOne & SecondConditionalChecker == 0) {
                    if (FirstConditionalChecker & InnerConditionalCheckerTwo == 0) {
                        if (a.charAt(StringReverseIndex) == ' ' || a.charAt(StringReverseIndex) == '?') {
                            continue;
                        } else {
                            boolean isVowel = false;
                            for (int i = 0; i < vo.length; i++) {
                                if (a.charAt(StringReverseIndex) == vo[i]) {
                                    isVowel = true;
                                    break;
                                }
                            }
                            if (isVowel) {
                                System.out.println("YES");
                            } else {
                                System.out.println("NO");
                            }
                            break;
                        }
                    }
                }
            }
        }
    }
}
```
