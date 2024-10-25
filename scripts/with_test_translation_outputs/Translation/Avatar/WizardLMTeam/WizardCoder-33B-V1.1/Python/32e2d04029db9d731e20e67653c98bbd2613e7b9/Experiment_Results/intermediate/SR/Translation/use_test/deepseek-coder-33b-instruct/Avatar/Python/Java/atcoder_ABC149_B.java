<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
<|EOT|>
