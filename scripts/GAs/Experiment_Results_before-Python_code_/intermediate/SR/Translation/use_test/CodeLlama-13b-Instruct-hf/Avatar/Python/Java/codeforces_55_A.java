```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
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

Note: The `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the user. The `while` loop is used to repeatedly divide `n` by 2 until it is odd. The `if` statement is used to check if `n` is equal to 1, and if it is, the program prints "YES", otherwise it prints "NO".
