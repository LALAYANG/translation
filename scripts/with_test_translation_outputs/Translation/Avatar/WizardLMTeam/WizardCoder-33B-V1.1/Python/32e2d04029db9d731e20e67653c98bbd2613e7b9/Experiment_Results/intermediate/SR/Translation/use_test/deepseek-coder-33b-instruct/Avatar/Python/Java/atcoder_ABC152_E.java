<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
12 12 12 12 12

Expected output:
5


```
from fractions import gcd
def lcm ( a , b ) :
    return a * b / gcd ( a , b )
MOD = 10 ** 9 + 7
N = int ( input ( ) )
A = list ( map ( int , input ( ).split ( ) ) )
_lcm = 1
for a in A :
    _lcm = _lcm * a // gcd ( _lcm , a )
ans = _lcm * sum ( [ pow ( s , MOD - 2 , MOD ) for s in A ] ) % MOD
print ( int ( ans % MOD ) )


```

### Response:
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        BigInteger MOD = BigInteger.valueOf(10).pow(9).add(BigInteger.ONE);
        BigInteger lcm = BigInteger.ONE;
        for (int a : A) {
            lcm = lcm.multiply(BigInteger.valueOf(a)).divide(lcm.gcd(BigInteger.valueOf(a)));
        }
        BigInteger sum = BigInteger.ZERO;
        for (int a : A) {
            sum = sum.add(BigInteger.valueOf(a).modPow(MOD.subtract(BigInteger.valueOf(2)), MOD));
        }
        BigInteger ans = lcm.multiply(sum).mod(MOD);
        System.out.println(ans);
    }
}
```
<|EOT|>
