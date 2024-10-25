<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1

Expected output:
Hello World


```
age = int ( input ( ) )
if age == 1 :
    print ( 'Hello World' )
else :
    a , b = [ int ( input ( ) ) for i in range ( 2 ) ]
    print ( a + b )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age == 1) {
            System.out.println("Hello World");
        } else {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a + b);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, checks if it's 1, and if it is, it prints "Hello World". If it's not 1, it reads two more integers from the user and prints their sum. <｜end▁of▁sentence｜>
