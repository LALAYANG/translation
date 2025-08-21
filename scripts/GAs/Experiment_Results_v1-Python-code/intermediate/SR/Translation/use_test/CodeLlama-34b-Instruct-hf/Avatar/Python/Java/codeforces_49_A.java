```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String vo = "aeiouyAEIOUY";
        int FirstConditionalChecker = 327;
        int SecondConditionalChecker = 929;
        int InnerConditionalCheckerOne = 104;
        int InnerConditionalCheckerTwo = 947;
        int OuterLoopCounter = 582;
        int InnerLoopCounter = 581;

        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopCounter / InnerLoopCounter; LoopIndexOut++) {
            for (int StringReverseIndex = a.length() - 1; StringReverseIndex >= 0; StringReverseIndex--) {
                if (InnerConditionalCheckerOne & SecondConditionalChecker) {
                    if (FirstConditionalChecker & InnerConditionalCheckerTwo) {
                        if (a.charAt(StringReverseIndex) == ' ' || a.charAt(StringReverseIndex) == '?') {
                            continue;
                        } else {
                            if (vo.indexOf(a.charAt(StringReverseIndex)) != -1) {
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
Note: The code above is a direct translation of the given Python code to Java. However, it is not optimized for performance and readability.
