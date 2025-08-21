```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] l = input.split("\\.");
        String s = l[0];
        String p = l[1];
        int i = Integer.parseInt(String.valueOf(p.charAt(0)));
        if (s.charAt(s.length() - 1) == '9') {
            System.out.println("GOTO Vasilisa.");
        } else if (s.charAt(s.length() - 1) != '9' && i < 5) {
            System.out.println(s);
        } else {
            int num = Integer.parseInt(s) + 1;
            System.out.println(num);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input, splits it into two parts at the decimal point, and then checks the last digit of the first part and the first digit of the second part. If the last digit of the first part is '9', it prints "GOTO Vasilisa.". If the last digit of the first part is not '9' and the first digit of the second part is less than 5, it prints the first part of the input. Otherwise, it converts the first part to an integer, increments it by 1, and prints the result.

