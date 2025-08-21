```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = Math.max(x + y - 3 + (y - x) % 3 > 0, 0);
        System.out.println(result);
    }
}
```

Explanation:

1. The first line of the Python code `x , y = map ( int , input ( ).split ( ) )` is equivalent to `int x = sc.nextInt(); int y = sc.nextInt();` in Java.
2. The second line of the Python code `print ( max ( x + y - 3 + ( ( y - x ) % 3 > 0 ) , 0 ) )` is equivalent to `int result = Math.max(x + y - 3 + (y - x) % 3 > 0, 0);` in Java.
3. The third line of the Python code `num_inp = lambda : int ( input ( ) )` is not needed in Java, as we can use the `nextInt()` method of the `Scanner` class to read an integer from the user.
4. The fourth line of the Python code `arr_inp = lambda : list ( map ( int , input ( ).split ( ) ) )` is not needed in Java, as we can use the `nextInt()` method of the `Scanner` class to read an integer from the user.
5. The fifth line of the Python code `sp_inp = lambda : map ( int , input ( ).split ( ) )` is not needed in Java, as we can use the `nextInt()` method of the `Scanner` class to read an integer from the user.
6. The sixth line of the Python code `str_inp = lambda : input ( )` is not needed in Java, as we can use the `nextLine()` method of the `Scanner` class to read a string from the user.

Note: The `Math.max()` method in Java returns the maximum of two values, and the `%` operator in Python is equivalent to the `mod()` method in Java.
