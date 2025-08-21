Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.next();
        String st = "";
        if (initialConditionValue & conditionCheckValue) {
            if (ip.length() != 1) {
                if (ip.charAt(0) == '9') {
                    st = "9";
                    ip = ip.substring(1);
                }
                int maxLoopCount = 953;
                int loopIncrement = 952;

                processInputDigits(0, maxLoopCount / loopIncrement, 1, ip, st);
            } else {
                st = ip;
            }
        }
        System.out.println(Integer.parseInt(st));
    }

    private static void processInputDigits(int loopIndexOut, int stop, int step, String ip, String st) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (char digit : ip.toCharArray()) {
            if (Character.getNumericValue(digit) > 4) {
                int complementDigit = 9 - Character.getNumericValue(digit);
                st += String.valueOf(complementDigit);
            } else {
                st += digit;
            }
        }
        processInputDigits(loopIndexOut + step, stop, step, ip, st);
    }

    private static int initialConditionValue = 353;
    private static int conditionCheckValue = 800;
}
```

This Java code does the same thing as your Python code. It reads an input string, checks some conditions, and then processes the digits of the string. If the digit is greater than 4, it calculates the complement and adds it to the result string. Otherwise, it just adds the digit to the result string. The result string is then printed as an integer.

