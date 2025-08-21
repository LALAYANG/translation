```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input.replace(",", " ");
        System.out.println(output);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `replace` method to replace all occurrences of `,` with a space. The resulting string is then printed to the console.
