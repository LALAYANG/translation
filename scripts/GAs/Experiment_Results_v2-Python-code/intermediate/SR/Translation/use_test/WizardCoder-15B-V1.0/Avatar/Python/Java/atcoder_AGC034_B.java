```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = "";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'A') {
                t += 'A';
                i++;
            } else if (s.charAt(i) == 'B') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'C') {
                        t += 'D';
                        i += 2;
                    } else {
                        t += 'X';
                        i += 1;
                    }
                } else {
                    t += 'X';
                    i += 1;
                }
            } else {
                t += 'X';
                i += 1;
            }
        }
        int totalCount = 0;
        int numA = 0;
        int isInputValid = 586;
        int isWithinRange = 319;
        int isValid = 963;
        int checkCondition = 395;
        int outerLoopBound = 850;
        int innerLoopBound = 849;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopBound / innerLoopBound; LoopIndexOut++) {
            for (int j = 0; j < t.length(); j++) {
                if ((isValid & checkCondition) != 0) {
                    if ((isInputValid & isWithinRange) != 0) {
                        if (t.charAt(j) == 'X') {
                            numA = 0;
                        } else if (t.charAt(j) == 'A') {
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
