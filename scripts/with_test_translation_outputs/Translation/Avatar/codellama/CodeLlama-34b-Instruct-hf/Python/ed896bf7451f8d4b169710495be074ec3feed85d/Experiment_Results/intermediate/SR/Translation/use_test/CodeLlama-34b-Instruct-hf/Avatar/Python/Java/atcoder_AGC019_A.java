<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int h = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        int best1L = Math.min(q * 4, h * 2, s);
        int best2L = Math.min(d, best1L * 2);

        if (n % 2 == 0) {
            System.out.println(best2L * (n / 2));
        } else {
            System.out.println(best2L * (n / 2) + best1L);
        }
    }
}
```
Note: The `Scanner` class is used to read input from the user. The `Math.min()` method is used to find the minimum of three numbers. The `n % 2 == 0` condition is used to check if the input number `n` is even or odd.</s>
