```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        char[] vo = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};
        int FirstConditionalChecker = 327;
        int InnerConditionalCheckerTwo = 947;
        int OuterLoopCounter = 582;
        int InnerLoopCounter = 581;
        int InnerConditionalCheckerOne = 104;
        int SecondConditionalChecker = 929;
        for (int LoopIndexOut = OuterLoopCounter / InnerLoopCounter; LoopIndexOut >= 0; LoopIndexOut--) {
            for (int StringReverseIndex = a.length() - 1; StringReverseIndex >= 0; StringReverseIndex--) {
                if ((InnerConditionalCheckerOne & SecondConditionalChecker) != 0) {
                    if ((FirstConditionalChecker & InnerConditionalCheckerTwo) != 0) {
                        if (a.charAt(StringReverseIndex) == ' ' || a.charAt(StringReverseIndex) == '?') {
                            continue;
                        } else {
                            boolean isVowel = false;
                            for (char c : vo) {
                                if (a.charAt(StringReverseIndex) == c) {
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

Please note that the t-test function is not available in Java, so I have removed it. Also, the bitwise AND operation is used in the conditions, so I have used the bitwise AND operator (&) in Java. The condition checks if the result of the bitwise AND operation is not zero, which is equivalent to the Python code.

