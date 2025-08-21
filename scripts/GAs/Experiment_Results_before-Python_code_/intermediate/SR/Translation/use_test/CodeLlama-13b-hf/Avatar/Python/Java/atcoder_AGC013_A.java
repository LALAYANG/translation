
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
47651
10300 16650 26911 44865 125511 137160 214838 219388 233386 247276 281312 396645 403705 436137 459412 481801 509267 515629 516869 571319 579728 583647 585864 632036 668357 719892 739016 814363 844268 861486 877453 906208 917107 957212 1001682 1016062 1021302 1030475 1053379 1067642 1104572 1138806 1144122 1214740 1218255 1265088 1281553 1286239 1340651 1343393 1355966 1377586 1442253 1466084 1466471 1474654 1476698 1488577 1519107 1524583 1558509 1591406 1601818 1613502 1631404 1648719 1699
Expected output:
1


```
import sys , re
from collections import deque , defaultdict , Counter
from math import ceil , sqrt , hypot , factorial , pi , sin , cos , radians
from itertools import groupby , accumulate , permutations , combinations , product
from operator import itemgetter , mul
from copy import deepcopy
from string import ascii_lowercase , ascii_uppercase , digits
from bisect import bisect , bisect_left
from fractions import gcd
from heapq import heappush , heappop
from functools import reduce
def input ( ) : return sys.stdin.readline ( ).strip ( )
def INT ( ) : return int ( input ( ) )
def MAP ( ) : return map ( int , input ( ).split ( ) )
def LIST ( ) : return list ( map ( int , input ( ).split ( ) ) )
def ZIP ( n ) : return zip ( * ( MAP ( ) for _ in range ( n ) ) )
sys.setrecursionlimit ( 10 ** 9 )
INF = float ( 'inf' )
mod = 10 ** 9 + 7
N = INT ( )
A = LIST ( )
A = [ k for k , g in groupby ( A ) ]
N = len ( A )
i = 1
ans = 0
while i < N - 1 :
    if A [ i - 1 ] < A [ i ] > A [ i + 1 ] or A [ i - 1 ] > A [ i ] < A [ i + 1 ] :
        ans += 1
        i += 1
    i += 1
print ( ans + 1 )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
47651
10300 16650 26911 44865 125511 137160 214838 219388 233386 247276 281312 396645 403705 436137 459412 481801 509267 515629 516869 571319 579728 583647 585864 632036 668357 719892 739016 814363 844268 861486 877453 906208 917107 957212 1001682 1016062 1021302 1030475 1053379 1067642 1104572 1138806 1144122 1214740 1218255 1265088 1281553 1286239 1340651 1343393 1355966 1377586 1442253 1466084 1466471 1474654 1476698 1488577 1519107 1524583 1558509 1591406 1601818 1613502 1631404 1648719 1699
Expected output:
1


```
import sys , re
from collections import deque , defaultdict , Counter
from math import ceil , sqrt , hypot , factorial , pi , sin , cos , radians
from itertools import groupby , accumulate , permutations , combinations , product
from operator import itemgetter , mul
from copy import deepcopy
from string import ascii_lowercase , ascii_uppercase , digits
from bisect import bisect , bisect_left
from fractions import gcd
from heapq import heappush , heappop
from functools import reduce
def input ( ) : return sys.stdin.readline ( ).strip ( )
def INT ( ) : return int ( input ( ) )
def MAP ( ) : return map ( int , input ( ).split ( ) )
def LIST ( ) : return list ( map ( int , input ( ).split ( ) ) )
def ZIP ( n ) : return zip ( * ( MAP ( ) for _ in range ( n ) ) )
sys.setrecursionlimit ( 10 ** 9 )
INF = float ( 'inf' )
mod = 10 ** 9 + 7
N = INT ( )
A = LIST ( )
A = [ k for k , g in groupby ( A ) ]
N = len ( A )
i = 1
ans = 0
while i < N - 1 :
    if A [ i - 1 ] < A [ i ] > A [ i + 1 ] or A [ i - 1 ] > A [ i ] < A [ i + 1 ] :
        ans += 1
        i += 1
    i += 1
print ( ans + 1 )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
47651
10300 16650 26911 44865 125511 137160 214838 219388 233386 247276 281312 396645 403705 436137 459412 481801 509267 515629 516869 571319 579728 583647 585864 632036 668357 719892 739016 814363 844268 861486 877453 906208 917107 957212 1001682 1016062 1021302 1030475 1053379 1067642 1104572 1138806 1144122 1214740 1218255 1265088 1281553 1286239 1340651 1343393 1355966 1377586 1442253 1466084 1466471 1474654 1476698 1488577 1519107 1524583 1558509 1591406 1601818 1613502 1631404 1648719 1699
Expected output:
1


```
import sys , re
from collections import deque , defaultdict , Counter
from math import ceil , sqrt , hypot , factorial , pi , sin , cos , radians
from itertools import groupby , accumulate , permutations , combinations , product
from operator import itemgetter , mul
from copy import deepcopy
from string import ascii_lowercase , ascii_uppercase , digits
from bisect import bisect , bisect_left
from fractions import gcd
from heapq import heappush , heappop
from functools import reduce
def input ( ) : return sys.stdin.readline ( ).strip ( )
def INT ( ) : return int ( input ( ) )
def MAP ( ) : return map ( int , input ( ).split ( ) )
def LIST ( ) : return list ( map ( int , input ( ).split ( ) ) )
def ZIP ( n ) : return zip ( * ( MAP ( ) for _ in range ( n ) ) )
sys.setrecursionlimit ( 10 ** 9 )
INF = float ( 'inf' )
mod = 10 ** 9 + 7
N = INT ( )
A = LIST ( )
A = [ k for k , g in groupby ( A ) ]
N = len ( A )
i = 1
ans = 0
while i < N - 1 :
    if A [ i - 1 ] < A [ i ] > A [ i + 1 ] or A [ i - 1 ] > A [ i ] < A [ i + 1 ] :
        ans += 1
        i += 1
    i += 1
print ( ans + 1 )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
47651
10300 16650 26911 44865 125511 137160 214838 219388 233386 247276 281312 396645 403705 436137 459412 481801 509267 515629 516869 571319 579728 583647 5
