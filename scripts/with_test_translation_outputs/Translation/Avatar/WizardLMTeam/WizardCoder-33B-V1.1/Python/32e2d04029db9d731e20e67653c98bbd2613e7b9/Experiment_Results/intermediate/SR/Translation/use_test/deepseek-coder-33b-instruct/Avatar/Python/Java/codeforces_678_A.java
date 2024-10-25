<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
<|EOT|>
