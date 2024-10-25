<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
453145 333625

Expected output:
667250


```
vamshi , z = map ( int , input ( ).split ( ) )
print ( ( vamshi // z + 1 ) * z )


```

### Response:
Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vamshi = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.println((vamshi / z + 1) * z);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, performs the division and multiplication operations, and prints the result. <｜end▁of▁sentence｜>
