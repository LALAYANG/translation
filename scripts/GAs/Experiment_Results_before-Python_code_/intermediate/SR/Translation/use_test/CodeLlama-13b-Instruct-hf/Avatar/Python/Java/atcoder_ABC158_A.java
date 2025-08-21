```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = "Yes";
        if (!s.contains("A") || !s.contains("B")) {
            result = "No";
        }
        System.out.println(result);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `String.contains()` method to check if the input string contains the characters "A" and "B". If the input string does not contain both characters, the result is set to "No". Finally, the result is printed to the console.
