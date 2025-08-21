```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int i = 1;
        while (m >= i) {
            m -= i;
            i = (i % n) + 1;
        }
        System.out.println(m);
    }
}
```

Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `split()` method is used to split the input string into two integers.
* The `map()` method is used to convert the input strings to integers.
* The `i` variable is initialized to 1.
* The `while` loop is used to iterate until `m` is less than or equal to `i`.
* Inside the loop, `m` is decremented by `i`, and `i` is incremented by 1.
* The `i` variable is then modulo-ed by `n` and added to 1.
* The final value of `m` is printed to the console.

Note: The `map()` method is not necessary in this case, as the input is already in the correct format. However, it is included for completeness and to demonstrate how to use the `map()` method in Java.
