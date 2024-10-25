<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
29 7772

Expected output:
26


```
n , m = map ( int , input ( ).split ( ) )
i = 1
while m >= i :
    m -= i
    i = ( i % n ) + 1
print ( m )


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int i = 1;
        while (m >= i) {
            m -= i;
            i = (i % n) + 1;
        }
        System.out.println(m);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, performs some calculations, and prints the result.

Please note that in Java, you need to import the `java.util.Scanner` class to read input from the standard input. Also, the `nextInt()` method of the `Scanner` class is used to read an integer from the standard input. <｜end▁of▁sentence｜>
