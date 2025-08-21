```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }
        int c = 2;
        for (int i = 0; i < n; i++) {
            if (w[i] == 1) {
                System.out.println(c);
            } else if (w[i] % 2 == 0) {
                c = 3 - c;
                System.out.println(c);
            } else {
                System.out.println(c);
            }
        }
    }
}
```
Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the standard input stream.
* The `nextInt()` method is used to read the next integer from the input stream.
* The `int[] w` array is used to store the input values.
* The `for` loop is used to iterate over the input values and perform the necessary operations.
* The `if` statement is used to check if the current value is 1, and if it is, the value of `c` is printed.
* The `else if` statement is used to check if the current value is even, and if it is, the value of `c` is updated and printed.
* The `else` statement is used to print the value of `c` if the current value is odd.
* The `System.out.println()` method is used to print the output.

Note: The code assumes that the input is a single line of integers separated by spaces.
