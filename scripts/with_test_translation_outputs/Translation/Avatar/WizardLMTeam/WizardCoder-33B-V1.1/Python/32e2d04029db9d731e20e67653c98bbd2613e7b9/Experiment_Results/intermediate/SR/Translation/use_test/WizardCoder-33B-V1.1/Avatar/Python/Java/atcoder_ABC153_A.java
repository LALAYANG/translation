<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1 10000

Expected output:
1


```
h , a = map ( int , input ( ).split ( " " ) )
sho = int ( h / a )
am = int ( h % a )
if am != 0 :
    sho += 1
else :
    pass
print ( sho )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int sho = h / a;
        int am = h % a;
        if (am != 0) {
            sho += 1;
        }
        System.out.println(sho);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, performs integer division and modulus operations, and then prints the result. If the modulus operation is not zero, it increments the result by 1. <｜end▁of▁sentence｜>
