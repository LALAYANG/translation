<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1


```
import math
from functools import reduce
from collections import deque , Counter
import sys
sys.setrecursionlimit ( 10 ** 7 )
def input ( ) :
    return sys.stdin.readline ( ).strip ( )
def get_nums_l ( ) :
    return [ int ( s ) for s in input ( ).split ( " " ) ]
def get_nums_n ( n ) :
    return [ int ( input ( ) ) for _ in range ( n ) ]
def get_all_int ( ) :
    return map ( int , open ( 0 ).read ( ).split ( ) )
def rangeI ( it , l , r ) :
    for i , e in enumerate ( it ) :
        if l <= i < r :
            yield e
        elif l >= r :
            break
def log ( * args ) :
    print ( "DEBUG:" , * args , file = sys.stderr )
INF = 999999999999999999999999
MOD = 10 ** 9 + 7
n = int ( input ( ) )
if n == 1 :
    print ( 0 )
    exit ( )
def prime_factorize ( n ) :
    a = [ ]
    while n % 2 == 0 :
        a.append ( 2 )
        n //= 2
    f = 3
    while f * f <= n :
        if n % f == 0 :
            a.append ( f )
            n //= f
        else :
            f += 2
    if n != 1 :
        a.append ( n )
    return a
    if len ( arr ) == 0 :
        arr.append ( ( n , 1 ) )
    return arr
fac_ = prime_factorize ( n )
fac = Counter ( fac_ )
ans = 0
for p , e in fac.items ( ) :
    x = e
    for i in range ( 1 , 99999999 ) :
        if x >= i :
            x -= i
            ans += 1
        else :
            break
print ( ans )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n == 1) {
            System.out.println(0);
            return;
        }
        Map<Long, Integer> fac = primeFactorize(n);
        int ans = 0;
        for (Map.Entry<Long, Integer> entry : fac.entrySet()) {
            int x = entry.getValue();
            for (int i = 1; i < 100000000; i++) {
                if (x >= i) {
                    x -= i;
                    ans += 1;
                } else {
                    break;
                }
            }
        }
        System.out.println(ans);
    }

    private static Map<Long, Integer> primeFactorize(long n) {
        Map<Long, Integer> a = new HashMap<>();
        while (n % 2 == 0) {
            a.put(2L, a.getOrDefault(2L, 0) + 1);
            n /= 2;
        }
        long f = 3;
        while (f * f <= n) {
            if (n % f == 0) {
                a.put(f, a.getOrDefault(f, 0) + 1);
                n /= f;
            } else {
                f += 2;
            }
        }
        if (n != 1) {
            a.put(n, a.getOrDefault(n, 0) + 1);
        }
        return a;
    }
}
```
<|EOT|>
