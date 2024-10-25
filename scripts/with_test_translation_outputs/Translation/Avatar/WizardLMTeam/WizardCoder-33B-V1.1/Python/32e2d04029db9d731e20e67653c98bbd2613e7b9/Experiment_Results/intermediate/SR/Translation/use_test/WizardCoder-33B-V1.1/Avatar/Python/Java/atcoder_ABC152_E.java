<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
        long MOD = (long)Math.pow(10, 9) + 7;
        long _lcm = 1;
        for (int a : A) {
            _lcm = _lcm * a / gcd(_lcm, a);
        }
        long ans = _lcm;
        for (int s : A) {
            ans = ans * pow(s, MOD - 2, MOD) % MOD;
        }
        System.out.println(ans % MOD);
    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static long pow(long a, long b, long m) {
        a %= m;
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = res * a % m;
            }
            a = a * a % m;
            b >>= 1;
        }
        return res;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer N and an array A from the standard input, calculates the least common multiple of all elements in A, and then calculates the sum of the inverses of all elements in A modulo MOD. The result is printed to the standard output.

The gcd function calculates the greatest common divisor of two numbers using the Euclidean algorithm. The pow function calculates the power of a number modulo another number using the fast exponentiation algorithm. <｜end▁of▁sentence｜>
