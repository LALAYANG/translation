<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
24 15

Expected output:
36


```
x , y = map ( int , input ( ).split ( ) )
print ( max ( x + y - 3 + ( ( y - x ) % 3 > 0 ) , 0 ) )
num_inp = lambda : int ( input ( ) )
arr_inp = lambda : list ( map ( int , input ( ).split ( ) ) )
sp_inp = lambda : map ( int , input ( ).split ( ) )
str_inp = lambda : input ( )


```

### Response:
Here is the equivalent Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(Math.max(x + y - 3 + ((y - x) % 3 > 0 ? 1 : 0), 0));
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the maximum of `x + y - 3 + ((y - x) % 3 > 0 ? 1 : 0)` and 0, and prints the result.

Please note that in Java, you need to import the `java.util.Scanner` class to read input from the standard input. Also, the `nextInt()` method of the `Scanner` class is used to read an integer from the standard input. <｜end▁of▁sentence｜>
