<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int lcm = 1;
        for (int i = 0; i < n; i++) {
            lcm = lcm * a[i] / gcd(lcm, a[i]);
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += pow(a[i], MOD - 2, MOD);
        }

        int ans = lcm * sum % MOD;
        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int pow(int a, int b, int m) {
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            return pow(a, b / 2, m) % m * pow(a, b / 2, m) % m;
        } else {
            return a * pow(a, b - 1, m) % m;
        }
    }
}
```
Note: In Java, the `pow` method is not available in the `Math` class, so we need to define it ourselves. Also, the `gcd` method is not available in the `Math` class, so we need to define it ourselves.</s>
