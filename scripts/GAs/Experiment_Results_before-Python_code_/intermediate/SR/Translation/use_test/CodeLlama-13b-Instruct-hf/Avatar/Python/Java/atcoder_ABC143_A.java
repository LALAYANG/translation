```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = A - 2 * B;
        if (ans < 0) {
            ans = 0;
        }
        System.out.println(ans);
    }
}
```

Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `split()` method is used to split the input string into two parts, separated by a space.
* The `map()` method is used to convert the two parts of the input string into integers.
* The `ans` variable is calculated by subtracting 2 times the second integer from the first integer.
* If the result is negative, it is set to 0.
* The `System.out.println()` method is used to print the result.
