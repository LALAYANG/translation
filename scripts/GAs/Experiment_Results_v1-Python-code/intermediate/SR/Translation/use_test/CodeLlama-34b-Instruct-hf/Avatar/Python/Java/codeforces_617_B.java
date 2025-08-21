```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```
This Java code uses the `Scanner` class to read input from the user and the `String` class to manipulate the input string. It uses a loop to iterate over the characters in the input string and checks if each character is equal to `'1'`. If it is, it increments the `count` variable. Finally, it prints the `count` variable to the console.

Note that this code assumes that the input string will only contain the characters `'0'` and `'1'`. If the input string contains other characters, the code will not work correctly.
