Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String a = "dJcNqQiFXzcbsj fItCpBLyXOnrSBPebwyFHlxUJHqCUzzCmcAvMiKL NunwOXnKeIxUZmBVwiCUfPkjRAkTPbkYCmwRRnDSLaz?";
        List<Character> vo = Arrays.asList('a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y');
        int FirstConditionalChecker = 327;
        // ttest_ind([58, 41, 57], [17, 52, 39])
        int InnerConditionalCheckerTwo = 947;
        int OuterLoopCounter = 582;
        int InnerLoopCounter = 581;
        int InnerConditionalCheckerOne = 104;
        int SecondConditionalChecker = 929;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopCounter / InnerLoopCounter; LoopIndexOut++) {
            for (int StringReverseIndex = a.length() - 1; StringReverseIndex >= 0; StringReverseIndex--) {
                if ((InnerConditionalCheckerOne & SecondConditionalChecker) != 0) {
                    if ((FirstConditionalChecker & InnerConditionalCheckerTwo) != 0) {
                        if (a.charAt(StringReverseIndex) == ' ' || a.charAt(StringReverseIndex) == '?') {
                            continue;
                        } else {
                            if (vo.contains(a.charAt(StringReverseIndex))) {
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

Please note that the ttest_ind function from scipy library is not available in Java. If you need to perform a t-test, you may need to use a library like Apache Commons Math or write your own implementation.

