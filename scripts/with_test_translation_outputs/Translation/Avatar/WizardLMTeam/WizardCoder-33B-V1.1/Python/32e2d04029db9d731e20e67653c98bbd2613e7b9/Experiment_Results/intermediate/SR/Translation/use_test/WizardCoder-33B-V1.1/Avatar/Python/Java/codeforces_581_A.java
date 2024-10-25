<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
34 30

Expected output:
30 2


```
a , b = map ( int , input ( ).split ( ) )
print ( min ( a , b ) , ( max ( a , b ) - min ( a , b ) ) // 2 )


```

### Response:
Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        System.out.println(min + " " + ((max - min) / 2));
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, finds the minimum and maximum of the two, and then prints the minimum and the half of the difference between the maximum and the minimum. <｜end▁of▁sentence｜>
