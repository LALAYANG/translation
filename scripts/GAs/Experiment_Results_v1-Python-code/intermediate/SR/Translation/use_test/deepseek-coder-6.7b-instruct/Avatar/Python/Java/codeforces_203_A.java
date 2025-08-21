```java
import java.util.*;

public class Main {
    private static int initial_value, t, a, b, da, db;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initial_value = scanner.nextInt();
        t = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();
        da = scanner.nextInt();
        db = scanner.nextInt();

        System.out.println(checkCombination() ? "YES" : "NO");
    }

    private static boolean checkCombination() {
        if (initial_value == 0) {
            return true;
        }
        int a_time = Math.min(a / da, t - 1);
        int b_time = Math.min(b / db, t - 1);
        for (int i = 0; i <= a_time; i++) {
            for (int j = 0; j <= b_time; j++) {
                if (a - da * i == initial_value || b - db * j == initial_value) {
                    return true;
                }
                if (a - da * i + (b - db * j) == initial_value) {
                    return true;
                }
            }
        }
        return false;
    }
}
```

This Java code does the same thing as the Python code. It reads the input from the user, checks if the initial value can be obtained by using the given values of a and b, and prints "YES" if it can, "NO" otherwise.

