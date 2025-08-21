
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class ProcessInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        String UserInput = scanner.nextLine();
        if (UserInput.length() <= K) {
            System.out.println(UserInput);
        } else {
            System.out.println(UserInput.substring(0, K) + "...");
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `substring` method to truncate the input string to the desired length. The `if` statement checks if the input string is shorter than the desired length, and if so, it prints the entire string. Otherwise, it prints the first `K` characters of the string followed by an ellipsis.
