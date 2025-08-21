```
import java.util.Scanner;

public class LuckyString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String LUCKY = "abcd";
        String s = "";
        for (int i = 0; i < n; i++) {
            s += LUCKY.charAt(i % 4);
        }
        System.out.println(s);
    }
}
```
This code uses a `for` loop to iterate over the input `n` and append the characters of the `LUCKY` string to the `s` string. The `i % 4` expression is used to get the index of the character in the `LUCKY` string, starting from 0 and wrapping around to 0 after 4 characters.

The `Scanner` class is used to read the input from the user, and the `nextInt()` method is used to read the input as an integer. The `charAt()` method is used to get the character at a specific index in the `LUCKY` string.

The output is printed using the `System.out.println()` method.
