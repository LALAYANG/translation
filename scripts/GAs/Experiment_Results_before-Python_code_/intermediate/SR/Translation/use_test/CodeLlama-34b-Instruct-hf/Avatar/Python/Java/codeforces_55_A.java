```
import java.util.Scanner;

public class IsPowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n % 2 == 0) {
            n /= 2;
        }
        if (n == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
Note: In Java, the `Scanner` class is used to read input from the user. The `nextInt()` method is used to read an integer input from the user. The `System.out.println()` method is used to print output to the console.
