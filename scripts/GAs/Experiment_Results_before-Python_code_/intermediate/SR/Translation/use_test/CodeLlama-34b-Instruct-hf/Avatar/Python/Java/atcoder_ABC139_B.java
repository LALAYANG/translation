```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hole = 1;
        int i = 0;
        boolean check = true;
        while (check) {
            if (hole >= b) {
                check = false;
            } else {
                hole = a * (i + 1) - i;
                i++;
            }
        }
        System.out.println(i);
    }
}
```

Explanation:

The Python code is using the `map` function to convert the input string to a list of integers. In Java, we can use the `Scanner` class to read the input and convert it to integers.

The rest of the code is similar to the Python code, with a few minor changes to the syntax. The `while` loop is used to iterate until the `check` variable is set to `false`. The `if` statement is used to check if the `hole` variable is greater than or equal to `b`, and if it is, the `check` variable is set to `false`. Otherwise, the `hole` variable is set to the product of `a` and `i + 1`, minus `i`. The `i` variable is incremented by 1.

The `System.out.println` statement is used to print the value of `i` to the console.
