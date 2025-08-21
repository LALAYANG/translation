```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String T = scanner.nextLine();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String U = scanner.nextLine();

        if (S.equals(U)) {
            A--;
        }
        if (T.equals(U)) {
            B--;
        }
        System.out.println(A + " " + B);
    }
}
```
Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the standard input stream (i.e. the keyboard).
* The `nextLine()` method is used to read a line of input from the standard input stream.
* The `nextInt()` method is used to read an integer from the standard input stream.
* The `equals()` method is used to compare two strings for equality.
* The `System.out.println()` method is used to print the result to the standard output stream (i.e. the console).

Note: The `nextLine()` method returns a `String`, so you need to use the `equals()` method to compare it with another `String`. The `nextInt()` method returns an `int`, so you can directly compare it with another `int`.
