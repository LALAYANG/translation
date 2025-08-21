Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String resultString = "";
        int conditionCheck1 = 909;
        int conditionCheck2 = 642;
        int conditionCheck3 = 112;
        int conditionCheck4 = 209;
        int outerLoopLimit = 108;
        int innerLoopLimit = 107;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopLimit; loopIndexOut++) {
            for (int i = 0; i < s.length(); i++) {
                char currentChar = s.charAt(i);
                if ((conditionCheck3 & conditionCheck4) != 0 && (conditionCheck1 & conditionCheck2) != 0) {
                    if (currentChar == '0' || currentChar == '1') {
                        resultString += currentChar;
                    } else if (currentChar == 'B' && resultString.length() != 0) {
                        resultString = resultString.substring(0, resultString.length() - 1);
                    }
                }
            }
        }
        System.out.println(resultString);
    }
}
```

Please note that the Python code you provided uses the `scipy.stats.ttest_ind` function for a t-test, which is a statistical test that is used to compare the means of two groups. In Java, there is no equivalent function, so I removed it. Also, the Python code uses bitwise operations to check conditions, which is equivalent to the bitwise AND operation in Java.

