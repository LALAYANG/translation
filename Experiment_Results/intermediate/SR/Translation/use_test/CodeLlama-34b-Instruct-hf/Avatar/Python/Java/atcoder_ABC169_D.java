<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(0);
            return;
        }

        List<Integer> primeFactors = primeFactorize(n);
        int[] count = new int[primeFactors.size()];
        for (int i = 0; i < primeFactors.size(); i++) {
            count[i] = 1;
        }

        for (int i = 0; i < primeFactors.size(); i++) {
            for (int j = i + 1; j < primeFactors.size(); j++) {
                if (primeFactors.get(i) == primeFactors.get(j)) {
                    count[i]++;
                    count[j] = 0;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < primeFactors.size(); i++) {
            if (count[i] > 0) {
                ans++;
            }
        }

        System.out.println(ans);
    }

    public static List<Integer> primeFactorize(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }
}
```
Note: The above code uses the `Scanner` class to read input from the user, and the `ArrayList` class to store the prime factors. The `primeFactorize` method is used to find the prime factors of a given number, and the `count` array is used to keep track of the frequency of each prime factor. The `ans` variable is used to store the final answer, which is the number of unique prime factors.</s>
