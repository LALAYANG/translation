```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a + b + c == 17 && a == 5 && b == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `if` statement checks if the sum of `a`, `b`, and `c` is equal to 17 and if `a` and `b` are both equal to 5.
* If the conditions are met, the program prints "YES", otherwise it prints "NO".

Note: The `map` function in Python is not necessary in Java, as the `Scanner` class can directly read integers from the user.
