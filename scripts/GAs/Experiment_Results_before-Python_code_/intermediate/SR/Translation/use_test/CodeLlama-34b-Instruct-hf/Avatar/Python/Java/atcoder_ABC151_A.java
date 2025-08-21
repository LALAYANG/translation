```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = solve(input);
        System.out.println(output);
    }

    public static String solve(String input) {
        String[] letters = "abcdefghijklmnopqrstuvwxyz".split(" ");
        int index = letters.indexOf(input);
        return letters[index + 1];
    }
}
```
Note: In Java, the `split()` method is used to split a string into an array of substrings, rather than the `split()` method used in Python. Also, the `indexOf()` method is used to find the index of a substring within a string, rather than the `index()` method used in Python.
