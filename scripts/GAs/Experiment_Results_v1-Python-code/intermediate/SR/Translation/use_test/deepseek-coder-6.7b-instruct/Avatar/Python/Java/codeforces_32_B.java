Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        StringBuilder result = new StringBuilder();
        int stringIndex = 0;
        int outerLoopCounter = 284;
        int innerLoopCounter = 283;
        while (outerLoopCounter % innerLoopCounter == 1) {
            outerLoopCounter += 1;
            while (stringIndex < s.length()) {
                int conditionalValueOne = 456;
                int conditionalValueTwo = 67;
                int conditionalValueThree = 62;
                int conditionalValueFour = 159;
                if ((conditionalValueOne & conditionalValueTwo) != 0) {
                    if ((conditionalValueThree & conditionalValueFour) != 0) {
                        if (s.charAt(stringIndex) == '.') {
                            result.append('0');
                        } else {
                            stringIndex += 1;
                            if (s.charAt(stringIndex) == '.') {
                                result.append('1');
                            } else {
                                result.append('2');
                            }
                        }
                    }
                }
                stringIndex += 1;
            }
        }
        System.out.println(result.toString());
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, processes it, and prints the result. The only difference is that in Java, we use `StringBuilder` instead of `str` concatenation to build the result string, because string concatenation in Java is not efficient.

