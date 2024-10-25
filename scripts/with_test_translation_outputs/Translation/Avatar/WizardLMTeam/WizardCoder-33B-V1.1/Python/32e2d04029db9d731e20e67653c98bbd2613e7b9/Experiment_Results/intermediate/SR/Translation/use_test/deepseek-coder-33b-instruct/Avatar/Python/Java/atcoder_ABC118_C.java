<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
```
<|EOT|>
