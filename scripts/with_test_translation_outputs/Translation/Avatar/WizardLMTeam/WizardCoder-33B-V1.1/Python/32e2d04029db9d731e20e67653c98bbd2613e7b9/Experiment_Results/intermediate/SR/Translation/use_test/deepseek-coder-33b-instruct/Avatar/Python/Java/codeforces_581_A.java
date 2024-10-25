<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        System.out.println(min + " " + (max - min) / 2);
    }
}
```
<|EOT|>
