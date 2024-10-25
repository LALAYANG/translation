<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100000000 100000000 100000000 100000000
1000000000

Expected output:
50000000000000000


```
import sys , re
from collections import deque , defaultdict , Counter
from math import sqrt , hypot , factorial , pi , sin , cos , radians
if sys.version_info.minor >= 5 : from math import gcd
else : from fractions import gcd
from heapq import heappop , heappush , heapify , heappushpop
from bisect import bisect_left , bisect_right
from itertools import permutations , combinations , product
from operator import itemgetter , mul
from copy import deepcopy
from functools import reduce , partial
from fractions import Fraction
from string import ascii_lowercase , ascii_uppercase , digits
def input ( ) : return sys.stdin.readline ( ).strip ( )
def ceil ( a , b = 1 ) : return int ( - ( - a // b ) )
def round ( x ) : return int ( ( x * 2 + 1 ) // 2 )
def fermat ( x , y , MOD ) : return x * pow ( y , MOD - 2 , MOD ) % MOD
def lcm ( x , y ) : return ( x * y ) // gcd ( x , y )
def lcm_list ( nums ) : return reduce ( lcm , nums , initial = 1 )
def INT ( ) : return int ( input ( ) )
def MAP ( ) : return map ( int , input ( ).split ( ) )
def LIST ( ) : return list ( map ( int , input ( ).split ( ) ) )
sys.setrecursionlimit ( 10 ** 9 )
INF = float ( 'inf' )
MOD = 10 ** 9 + 7
q , h , s , d = MAP ( )
n = INT ( )
best1L = min ( q * 4 , h * 2 , s )
best2L = min ( d , best1L * 2 )
if n % 2 == 0 :
    print ( best2L * ( n // 2 ) )
else :
    print ( best2L * ( n // 2 ) + best1L )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long q = sc.nextLong();
        long h = sc.nextLong();
        long s = sc.nextLong();
        long d = sc.nextLong();
        long n = sc.nextLong();
        long best1L = Math.min(Math.min(q * 4, h * 2), s);
        long best2L = Math.min(d, best1L * 2);
        if (n % 2 == 0) {
            System.out.println(best2L * (n / 2));
        } else {
            System.out.println(best2L * (n / 2) + best1L);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads in the same input and calculates the same output. The only difference is that Java uses `System.in` for reading input and `System.out.println` for printing output. <｜end▁of▁sentence｜>
