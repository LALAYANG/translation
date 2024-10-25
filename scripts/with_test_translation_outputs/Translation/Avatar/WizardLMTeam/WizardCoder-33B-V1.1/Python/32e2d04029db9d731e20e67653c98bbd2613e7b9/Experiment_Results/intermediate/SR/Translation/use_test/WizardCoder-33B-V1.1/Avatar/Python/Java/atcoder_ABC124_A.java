<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3 4

Expected output:
7


```
a , b = map ( int , input ( ).split ( ) )
c = 0
for i in range ( 2 ) :
    c += max ( a , b )
    if a >= b :
        a -= 1
    else :
        b -= 1
print ( c )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
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

This Java code does the same thing as the Python code. It reads two integers from the standard input, performs some calculations, and prints the result. The `Scanner` class is used to read the input, and the `Math.max` function is used to find the maximum of two numbers. <｜end▁of▁sentence｜>
