```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = 0;
        if (x + y - 3 > 0) {
            result = x + y - 3;
        }
        System.out.println(result);
    }
}
```
Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `int` keyword is used to convert the input string to an integer.
* The `if` statement is used to check if the sum of `x` and `y` is greater than 3. If it is, the result is set to the sum of `x` and `y` minus 3. If it is not, the result is set to 0.
* The `System.out.println()` method is used to print the result to the console.

Note: The `map` function in Python is not necessary in Java, as the `Scanner` class can directly read input as integers.
