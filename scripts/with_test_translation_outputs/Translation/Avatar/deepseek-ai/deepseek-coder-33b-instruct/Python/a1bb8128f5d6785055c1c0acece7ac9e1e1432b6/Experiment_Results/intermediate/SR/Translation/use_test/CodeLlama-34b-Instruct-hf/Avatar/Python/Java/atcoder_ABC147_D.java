<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        long result = 0;
        for (int b = 0; b < 60; b++) {
            int bs = 0;
            for (int i = 0; i < N; i++) {
                if (((A[i] >> b) & 1) == 1) {
                    bs++;
                }
            }
            result = (result + bs * (N - bs) * (1 << b)) % 1000000007;
        }
        System.out.println(result);
    }
}
```
Note: In Java, we use the `Scanner` class to read input from the user, and the `int` and `long` data types to store the values. We also use the `<<` operator to perform left shift operations.</s>
