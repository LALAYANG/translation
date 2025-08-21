
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputString = input.split("\\.");
        int check1 = 488;
        int check2 = 752;
        int check1a = 85;
        int check2a = 98;
        int i = Integer.parseInt(inputString[1]);
        if (check1 & check2) {
            if (check1a & check2a) {
                if (inputString[0].charAt(inputString[0].length() - 1) == '9') {
                    System.out.println("GOTO Vasilisa.");
                } else if (inputString[0].charAt(inputString[0].length() - 1) != '9' && i < 5) {
                    System.out.println(inputString[0]);
                } else {
                    System.out.println(Integer.toString(Integer.parseInt(inputString[0]) + 1));
                }
            }
        }
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `String.split()` method to split the input string into two parts based on the dot character. The `Integer.parseInt()` method is used to convert the decimal part of the input string to an integer, and the `Integer.toString()` method is used to convert the integer back to a string. The `String.charAt()` method is used to access the characters in the input string.
