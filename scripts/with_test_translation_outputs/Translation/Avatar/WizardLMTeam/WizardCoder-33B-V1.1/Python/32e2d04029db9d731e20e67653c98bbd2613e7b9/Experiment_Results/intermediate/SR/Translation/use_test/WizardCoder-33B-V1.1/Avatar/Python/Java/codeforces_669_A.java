<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
6

Expected output:
4


```
n = int ( input ( ) )
print ( ( n * 2 + 1 ) // 3 )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((n * 2 + 1) / 3);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, performs the calculation `(n * 2 + 1) / 3`, and prints the result. <｜end▁of▁sentence｜>
