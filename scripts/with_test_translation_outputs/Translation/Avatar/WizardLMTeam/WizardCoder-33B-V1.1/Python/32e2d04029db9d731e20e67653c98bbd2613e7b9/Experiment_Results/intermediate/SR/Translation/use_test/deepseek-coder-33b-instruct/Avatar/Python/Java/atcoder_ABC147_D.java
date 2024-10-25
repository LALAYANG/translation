<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10
3 1 4 1 5 9 2 6 5 3

Expected output:
237


```
import numpy as np
N = int ( input ( ) )
A = np.fromiter ( map ( int , input ( ).split ( ) ) , np.int64 )
result = 0
for b in range ( 60 ) :
    bs = int ( ( ( A >> b ) & 1 ).sum ( ) )
    result = ( result + bs * ( N - bs ) * ( 1 << b ) ) % 1000000007
print ( result )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextLong();
        }
        long result = 0;
        for (int b = 0; b < 60; b++) {
            long bs = 0;
            for (int i = 0; i < N; i++) {
                bs += (A[i] >> b) & 1;
            }
            result = (result + bs * (N - bs) * (1L << b)) % 1000000007;
        }
        System.out.println(result);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer N and an array of N long integers from the standard input. It then calculates the result by iterating over each bit position (from 0 to 59) and for each bit position, it counts the number of 1s and 0s in the array. The result is updated by adding the product of the count of 1s and 0s and the current bit position (shifted left by b bits) to the result. The result is then printed to the standard output.
<|EOT|>
