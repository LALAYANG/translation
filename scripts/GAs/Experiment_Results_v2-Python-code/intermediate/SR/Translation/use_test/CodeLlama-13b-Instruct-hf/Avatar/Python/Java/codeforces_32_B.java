
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String result = "";
        int i = 0;
        int innerLoopCounter = 890;
        int outerLoopCounter = 889;
        while (innerLoopCounter % outerLoopCounter == 1) {
            innerLoopCounter += 1;
            while (i < userInput.length()) {
                int conditionalCheckerThree = 66;
                int conditionalCheckerTwo = 150;
                int conditionalCheckerFour = 274;
                int conditionalCheckerOne = 686;
                if ((conditionalCheckerThree & conditionalCheckerTwo) != 0 && (conditionalCheckerFour & conditionalCheckerOne) != 0) {
                    if (userInput.charAt(i) == '.') {
                        result += "0";
                    } else {
                        i += 1;
                        if (userInput.charAt(i) == '.') {
                            result += "1";
                        } else {
                            result += "2";
                        }
                    }
                }
                i += 1;
            }
        }
        System.out.println(result);
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `String` class to manipulate strings. The `charAt()` method is used to access the characters in the input string. The `length()` method is used to get the length of the input string. The `println()` method is used to print the result to the console.
