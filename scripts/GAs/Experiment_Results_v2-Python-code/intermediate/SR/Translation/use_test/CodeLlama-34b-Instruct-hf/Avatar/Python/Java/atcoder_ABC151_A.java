```java
import java.util.Scanner;

public class Solution {
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
Note: The above code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user and the `charAt()` method to get the first character of the input string. The `solve()` method is similar to the Python implementation, but it uses the `char` data type instead of `string`. The `main()` method is the entry point of the program, it reads the input, calls the `solve()` method and prints the result.
