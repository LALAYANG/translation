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
        for (int LoopIndexOut = OuterLoopCounter / InnerLoopCounter - 1; LoopIndexOut >= 0; LoopIndexOut--) {
            for (int StringReverseIndex = a.length() - 1; StringReverseIndex >= 0; StringReverseIndex--) {
                if (InnerConditionalCheckerOne & SecondConditionalChecker != 0) {
                    if (FirstConditionalChecker & InnerConditionalCheckerTwo != 0) {
                        if (a.charAt(StringReverseIndex) == ' ' || a.charAt(StringReverseIndex) == '?') {
                            continue;
                        } else {
                            for (char v : vo) {
                                if (a.charAt(StringReverseIndex) == v) {
                                    System.out.println("YES");
                                    return;
                                }
                            }
                            System.out.println("NO");
                            return;
                        }
                    }
                }
            }
        }
    }
}
```

Test input:
dJcNqQiFXzcbsj fItCpBLyXOnrSBPebwyFHlxUJHqCUzzCmcAvMiKL NunwOXnKeIxUZmBVwiCUfPkjRAkTPbkYCmwRRnDSLaz?

Expected output:
NO 
