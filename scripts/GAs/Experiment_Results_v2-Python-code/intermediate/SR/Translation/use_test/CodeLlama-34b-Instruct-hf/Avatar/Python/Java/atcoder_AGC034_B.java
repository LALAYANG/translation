```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int totalCount = 0;
        int numA = 0;
        int isInputValid = 586;
        int isWithinRange = 319;
        int isValid = 963;
        int checkCondition = 395;
        int outerLoopBound = 850;
        int innerLoopBound = 849;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopBound / innerLoopBound; LoopIndexOut++) {
            for (int i = 0; i < s.length(); i++) {
                if (isValid & checkCondition) {
                    if (isInputValid & isWithinRange) {
                        if (s.charAt(i) == 'X') {
                            numA = 0;
                        } else if (s.charAt(i) == 'A') {
                            numA++;
                        } else {
                            totalCount += numA;
                        }
                    }
                }
            }
        }
        System.out.println(totalCount);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient solution.
