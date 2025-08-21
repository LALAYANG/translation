```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        for (int i = 0; i < 2; i++) {
            c += Math.max(a, b);
            if (a >= b) {
                a -= 1;
            } else {
                b -= 1;
            }
        }
        System.out.println(c);
    }
}
```

Explanation:

1. The first line of the Python code `a , b = map ( int , input ( ).split ( ) )` is equivalent to `Scanner sc = new Scanner(System.in);` in Java. This line creates a new `Scanner` object that reads input from the console.
2. The next line `c = 0` is equivalent to `int c = 0;` in Java. This line declares a variable `c` of type `int` and initializes it to 0.
3. The line `for i in range ( 2 ) :` is equivalent to `for (int i = 0; i < 2; i++)` in Java. This line creates a loop that iterates over the range of values from 0 to 1 (inclusive).
4. The line `c += max ( a , b )` is equivalent to `c += Math.max(a, b);` in Java. This line calculates the maximum of `a` and `b` and adds it to `c`.
5. The line `if a >= b :` is equivalent to `if (a >= b)` in Java. This line checks if `a` is greater than or equal to `b`.
6. The line `a -= 1` is equivalent to `a--;` in Java. This line decrements `a` by 1.
7. The line `else :` is equivalent to `else` in Java. This line is the else part of the if statement.
8. The line `b -= 1` is equivalent to `b--;` in Java. This line decrements `b` by 1.
9. The line `print ( c )` is equivalent to `System.out.println(c);` in Java. This line prints the value of `c` to the console.

Note: In Java, the `Math.max()` method is used to calculate the maximum of two values.
