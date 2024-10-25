<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
500000000000 500000000000 1000000000000

Expected output:
0 0


```
cookies = [ int ( x ) for x in input ( ).split ( ) ]
leftOver = cookies [ 0 ] - cookies [ 2 ]
takahashi = max ( 0 , leftOver )
print ( str ( takahashi ) + ' ' + ( str ( cookies [ 1 ] ) if takahashi > 0 else str ( max ( 0 , cookies [ 1 ] - abs ( leftOver ) ) ) ) )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] cookies = new long[3];
        for (int i = 0; i < 3; i++) {
            cookies[i] = scanner.nextLong();
        }
        long leftOver = cookies[0] - cookies[2];
        long takahashi = Math.max(0, leftOver);
        System.out.println(takahashi + " " + (takahashi > 0 ? cookies[1] : Math.max(0, cookies[1] - Math.abs(leftOver))));
    }
}
```

This Java code does the same thing as your Python code. It reads three long integers from the standard input, calculates the remaining cookies after Takahashi ate, and then prints the amount of cookies Takahashi and Aoki have left. If Takahashi ate more than he could, Aoki eats the remaining cookies. <｜end▁of▁sentence｜>
