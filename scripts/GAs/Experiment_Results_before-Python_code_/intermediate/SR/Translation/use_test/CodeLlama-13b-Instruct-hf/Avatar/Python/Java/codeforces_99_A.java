```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split("\\.");
        String[] s = parts[0].split("");
        String[] p = parts[1].split("");
        int i = Integer.parseInt(p[0]);
        if (s[s.length - 1].equals("9")) {
            System.out.println("GOTO Vasilisa.");
        } else if (!s[s.length - 1].equals("9") && i < 5) {
            String output = String.join("", s);
            System.out.println(output);
        } else {
            String output = String.join("", s);
            output = String.valueOf(Integer.parseInt(output) + 1);
            System.out.println(output);
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `String.split()` method to split the input string into two parts based on the `.` character. It then uses the `String.join()` method to join the two parts back together, and the `Integer.parseInt()` method to convert the resulting string to an integer. Finally, it uses the `String.valueOf()` method to convert the integer back to a string and print it to the console.

Note that this code assumes that the input string will always be in the format `x.y`, where `x` is a string and `y` is an integer. If the input string is in a different format, the code may not work correctly.
