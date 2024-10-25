<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
79 6

Expected output:
67


```
A , B = map ( int , input ( ).split ( ) )
ans = A - 2 * B
if ans < 0 :
    ans = 0
print ( ans )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int ans = A - 2 * B;
        if (ans < 0) {
            ans = 0;
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, performs the calculation, and prints the result. If the result is less than 0, it sets the result to 0. <｜end▁of▁sentence｜>
