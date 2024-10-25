<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1
3

Expected output:
1


```
n = int ( input ( ) )
for i in range ( n ) :
    a = int ( input ( ) )
    if a < 2 :
        print ( 0 )
    if a >= 2 :
        print ( a - 2 )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a < 2) {
                System.out.println(0);
            }
            if (a >= 2) {
                System.out.println(a - 2);
            }
        }
    }
}
```
<|EOT|>
