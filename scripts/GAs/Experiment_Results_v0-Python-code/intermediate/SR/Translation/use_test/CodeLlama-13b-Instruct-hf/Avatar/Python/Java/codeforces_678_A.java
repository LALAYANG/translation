```
import java.util.Scanner;

public class TTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int z = scanner.nextInt();
        int result = (value1 / z + 1) * z;
        System.out.println(result);
    }
}
```
This code uses the `Scanner` class to read the input from the user, and then it calculates the result using the formula `(value1 / z + 1) * z`. Finally, it prints the result to the console.

Note that this code assumes that the input is a single line of text, and that the two numbers are separated by a space. If the input is in a different format, you may need to modify the code accordingly.
