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
This Java code uses the `Scanner` class to read input from the user and the `String` class to manipulate the input. It first reads the input string and then loops through each character in the string to check if it is equal to '1'. If it is, it increments the count variable. Finally, it prints the count to the console.

Note that this code assumes that the input will be a string of characters, and it will only count the number of '1' characters in the input. If the input is not a string of characters, or if you want to count a different character, you will need to modify the code accordingly.
