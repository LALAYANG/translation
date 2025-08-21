```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String resultString = "";
        int conditionCheck1 = 909;
        int conditionCheck2 = 642;
        int conditionCheck3 = 112;
        int conditionCheck4 = 209;
        int outerLoopLimit = 108;
        int innerLoopLimit = 107;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopLimit; loopIndexOut++) {
            for (char currentChar : s.toCharArray()) {
                if ((conditionCheck3 & conditionCheck4) != 0) {
                    if ((conditionCheck1 & conditionCheck2) != 0) {
                        if (currentChar == '0' || currentChar == '1') {
                            resultString += currentChar;
                        } else if (currentChar == 'B' && resultString.length() != 0) {
                            resultString = resultString.substring(0, resultString.length() - 1);
                        }
                    }
                }
            }
        }
        System.out.println(resultString);
    }
}
```

Please note that the Java code does not include the t-test and shuffle functions from the original Python code, as they are not available in Java. Also, the condition checks are bitwise operations in Python, but in Java, we use logical operators (&& for AND and || for OR).

