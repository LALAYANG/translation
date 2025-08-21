```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char c = input.charAt(0);
        char result = solve(c);
        System.out.println(result);
    }

    public static char solve(char c) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int index = c - 'a';
        return alphabet[index + 1];
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user and the `charAt()` method to get the first character of the input string. The `solve()` method is similar to the Python implementation, but it uses a `char` array to represent the alphabet instead of a string. The `main()` method calls the `solve()` method with the first character of the input string and prints the result to the console.
