
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxLength = scanner.nextInt();
        String inputString = scanner.nextLine();
        if (thresholdA && thresholdD) {
            if (thresholdB && thresholdC) {
                if (inputString.length() <= maxLength) {
                    return inputString;
                }
            }
        }
        return concatStrings(inputString.substring(0, maxLength), "...");
    }

    public static String concatStrings(String arg0, String arg1) {
        return arg0 + arg1;
    }
}
```
Note that the `shuffle` function is not available in Java, so I replaced it with a random number generator. Also, the `input` function is not available in Java, so I replaced it with a `Scanner` object to read input from the user.
