<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
5 13 8 1000000000

Expected output:
1


```
N = int ( input ( ) )
A = list ( map ( int , input ( ).split ( ) ) )
import functools
import fractions
gcd = functools.reduce ( fractions.gcd , A )
print ( gcd )


```

### Response:
Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int gcd = A[0];
        for (int i = 1; i < N; i++) {
            gcd = gcd(gcd, A[i]);
        }
        System.out.println(gcd);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer N from the standard input, then reads N integers into an array A. It then calculates the greatest common divisor (gcd) of all the numbers in A and prints it. The gcd function is a recursive implementation of the Euclidean algorithm for calculating the gcd of two numbers. <｜end▁of▁sentence｜>
