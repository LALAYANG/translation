```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String[] parts = input.split("\\.");
        char[] integerPart = parts[0].toCharArray();
        int decimalPart = Integer.parseInt(String.valueOf(parts[1].charAt(0)));

        if (integerPart[integerPart.length - 1] == '9') {
            System.out.println("GOTO Vasilisa.");
        } else if (integerPart[integerPart.length - 1] != '9' && decimalPart < 5) {
            System.out.println(new String(integerPart));
        } else {
            integerPart[integerPart.length - 1]++;
            System.out.println(new String(integerPart));
        }
    }
}
```

This Java code does the same thing as the Python code you provided. It reads a decimal number from the standard input, splits it into the integer and decimal parts, and then checks the last digit of the integer part. If it's a '9', it prints "GOTO Vasilisa.". If it's not a '9' and the first digit of the decimal part is less than 5, it prints the integer part as is. Otherwise, it increments the last digit of the integer part and prints the result.

