<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1 1

Expected output:
1


```
K , N = list ( map ( int , input ( ).split ( ) ) )
dprint = lambda * x : x
def cmb ( n , r , mod ) :
    if ( r < 0 or r > n ) :
        return 0
    r = min ( r , n - r )
    return g1 [ n ] * g2 [ r ] * g2 [ n - r ] % mod
mod = 998244353
__N = 8000
g1 = [ 1 , 1 ]
g2 = [ 1 , 1 ]
inverse = [ 0 , 1 ]
for i in range ( 2 , __N + 1 ) :
    g1.append ( ( g1 [ - 1 ] * i ) % mod )
    inverse.append ( ( - inverse [ mod % i ] * ( mod // i ) ) % mod )
    g2.append ( ( g2 [ - 1 ] * inverse [ - 1 ] ) % mod )
def kumiawase ( p , q ) :
    return cmb ( p + q - 1 , q - 1 , mod )
def solve ( n ) :
    assert n <= K + 1
    ans = 0
    kumi = ( n - 1 ) // 2
    for p in range ( kumi + 1 ) :
        if p > N :
            break
        ans += 2 ** p * cmb ( kumi , p , mod ) * kumiawase ( N - p , p + ( K - kumi * 2 - int ( n % 2 == 0 ) ) )
        if n % 2 == 0 and N - p - 1 >= 0 :
            ans += 2 ** p * cmb ( kumi , p , mod ) * kumiawase ( N - p - 1 , p + ( K - kumi * 2 - int ( n % 2 == 0 ) ) )
    return ans
ans = [ ]
for i in range ( 2 , 2 * K + 1 ) :
    if i <= K + 1 :
        tmp = solve ( i ) % 998244353
        ans.append ( tmp )
        print ( tmp )
    else :
        print ( ans [ - i + K ] )


```

### Response:
Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    static int mod = 998244353;
    static int __N = 8000;
    static long[] g1 = new long[__N + 1];
    static long[] g2 = new long[__N + 1];
    static long[] inverse = new long[__N + 1];

    static long cmb(int n, int r, int mod) {
        if (r < 0 || r > n) {
            return 0;
        }
        r = Math.min(r, n - r);
        return g1[n] * g2[r] % mod * g2[n - r] % mod;
    }

    static long kumiawase(int p, int q) {
        return cmb(p + q - 1, q - 1, mod);
    }

    static long solve(int n, int K, int N) {
        long ans = 0;
        int kumi = (n - 1) / 2;
        for (int p = 0; p <= kumi; p++) {
            if (p > N) {
                break;
            }
            ans += 2 * p * cmb(kumi, p, mod) * kumiawase(N - p, p + (K - kumi * 2 - (n % 2 == 0 ? 0 : 1)));
            if (n % 2 == 0 && N - p - 1 >= 0) {
                ans += 2 * p * cmb(kumi, p, mod) * kumiawase(N - p - 1, p + (K - kumi * 2 - (n % 2 == 0 ? 0 : 1)));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        g1[0] = g1[1] = g2[0] = g2[1] = inverse[0] = 1;
        inverse[1] = mod - 1;
        for (int i = 2; i <= __N; i++) {
            g1[i] = g1[i - 1] * i % mod;
            inverse[i] = (mod - inverse[mod % i] * (mod / i) % mod);
            g2[i] = g2[i - 1] * inverse[i] % mod;
        }
        List<Long> ans = new ArrayList<>();
        for (int i = 2; i <= 2 * K; i++) {
            if (i <= K + 1) {
                long tmp = solve(i, K, N) % mod;
                ans.add(tmp);
                System.out.println(tmp);
            } else {
                System.out.println(ans.get(2 * K - i));
            }
        }
    }
}
```

Please note that this Java code is a direct translation of the Python code. It may not work as expected if the Python code is not correct or if the input is not as expected.
<|EOT|>
