<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
        ArrayList<Long> fac = primeFactorize(n);
        HashMap<Long, Integer> map = new HashMap<>();
        for (long num : fac) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int ans = 0;
        for (Map.Entry<Long, Integer> entry : map.entrySet()) {
            int x = entry.getValue();
            for (int i = 1; i < 10000000; i++) {
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

    public static ArrayList<Long> primeFactorize(long n) {
        ArrayList<Long> a = new ArrayList<>();
        while (n % 2 == 0) {
            a.add(2L);
            n /= 2;
        }
        long f = 3;
        while (f * f <= n) {
            if (n % f == 0) {
                a.add(f);
                n /= f;
            } else {
                f += 2;
            }
        }
        if (n != 1) {
            a.add(n);
        }
        return a;
    }
}
```

Please note that Java does not have a built-in function to count the frequency of elements in a list like Python's `collections.Counter`. Therefore, we use a `HashMap` to count the frequency of elements. <｜end▁of▁sentence｜>
