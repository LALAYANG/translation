
Here is the Java code that implements the same functionality as the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String luckyString = "abcd";
        String s = "";

        for (int i = 0; i < n; i++) {
            s += luckyString.charAt(i % 4);
        }

        System.out.println(s);
    }
}
```
This code uses a `for` loop to iterate over the input `n` and append the characters of the `luckyString` to the `s` string. The `i % 4` expression is used to get the remainder of the division of `i` by 4, which is used to index the `luckyString` string.

Note that the `ttest_ind` function is not used in the Java code, as it is not a built-in function in Java. If you need to use this function, you can use a library that provides it, such as the Apache Commons Math library.
