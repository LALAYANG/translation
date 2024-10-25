<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
117422204

Expected output:
19


```
import math
n = int ( input ( ) )
x = 1
while math.log2 ( n ) % 1 :
    x += 1
    n -= 2 ** ( int ( math.log2 ( n ) ) )
print ( x )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 1;
        while (Math.log(n) / Math.log(2) % 1 != 0) {
            x += 1;
            n -= Math.pow(2, (int) Math.floor(Math.log(n) / Math.log(2)));
        }
        System.out.println(x);
    }
}
```
<|EOT|>
