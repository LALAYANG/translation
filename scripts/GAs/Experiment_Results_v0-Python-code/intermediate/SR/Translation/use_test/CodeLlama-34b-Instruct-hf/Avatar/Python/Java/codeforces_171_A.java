```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class AddDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        int x = Math.max(a.length(), b.length());
        a = a.rjust(x, '0');
        b = b.ljust(x, '0');
        String sumStr = "";
        int carry = 0;
        for (int i = 0; i < x; i++) {
            int digitA = Character.getNumericValue(a.charAt(i));
            int digitB = Character.getNumericValue(b.charAt(i));
            int result = digitA + digitB + carry;
            if (result > 9) {
                sumStr += String.valueOf(result)[1];
                carry = 1;
            } else {
                sumStr += String.valueOf(result);
                carry = 0;
            }
        }
        if (carry == 1) {
            sumStr += "1";
        }
        System.out.println(Integer.parseInt(sumStr));
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user, and the `Math.max` method to find the maximum of two integers. The `Character.getNumericValue` method is used to convert a character to its corresponding integer value. The `String.valueOf` method is used to convert an integer to a string. The `Integer.parseInt` method is used to convert a string to an integer.
