```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += i * (N / i) * (N / i + 1) / 2;
        }
        System.out.println(ans);
    }
}
```

Explanation:

The Python code you provided is using the `sys` module to read input from the standard input stream. In Java, we can use the `Scanner` class to achieve the same functionality.

The `rs()` function in Python is used to read a line of input from the standard input stream and strip the trailing newline character. In Java, we can use the `nextLine()` method of the `Scanner` class to achieve the same functionality.

The `ri()` function in Python is used to read an integer from the standard input stream. In Java, we can use the `nextInt()` method of the `Scanner` class to achieve the same functionality.

The `rs_()` function in Python is used to read a line of input from the standard input stream and split it into a list of strings. In Java, we can use the `split()` method of the `String` class to achieve the same functionality.

The `ri_()` function in Python is used to read a list of integers from the standard input stream. In Java, we can use the `nextInt()` method of the `Scanner` class to achieve the same functionality.

The rest of the code is similar in both Python and Java. It uses a loop to iterate over the range of integers from 1 to N, and calculates the sum of the products of each integer and its factors. The `N / i` expression in Python is equivalent to the `N / i` expression in Java, which calculates the integer division of N by i. The `N // i` expression in Python is equivalent to the `N / i` expression in Java, which calculates the integer division of N by i and returns the result as an integer. The `N // i + 1` expression in Python is equivalent to the `N / i + 1` expression in Java, which calculates the integer division of N by i and adds 1 to the result. The `/ 2` expression in Python is equivalent to the `/ 2` expression in Java, which divides the result by 2.

The `print()` function in Python is used to print the result to the standard output stream. In Java, we can use the `System.out.println()` method to achieve the same functionality.
