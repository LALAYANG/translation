```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int a = sc.nextInt();
            System.out.println(a == 0 ? 1 : 0);
        }
    }
}
```
Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the standard input stream.
* The `nextInt()` method is used to read the next integer from the input stream.
* The `println()` method is used to print the output to the standard output stream.
* The `tc-- > 0` condition is used to check if the number of test cases is greater than 0.
* The `while` loop is used to iterate over the test cases.
* The `solve()` method is not needed in Java, as the logic for solving the problem is directly implemented in the `main()` method.
