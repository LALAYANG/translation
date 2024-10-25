<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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

This Java code does the same thing as the Python code. It takes an integer input, then repeatedly subtracts the largest power of 2 that does not exceed the current number, until the number is a power of 2. The number of times this operation is performed is counted and printed as the output. <｜end▁of▁sentence｜>
