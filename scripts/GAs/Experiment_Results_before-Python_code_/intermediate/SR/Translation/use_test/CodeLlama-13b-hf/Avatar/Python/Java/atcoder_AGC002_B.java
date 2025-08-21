
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
50000 99998
2 1
3 1
4 1
5 1
6 1
7 1
8 1
9 1
10 1
11 1
12 1
13 1
14 1
15 1
16 1
17 1
18 1
19 1
20 1
21 1
22 1
23 1
24 1
25 1
26 1
27 1
28 1
29 1
30 1
31 1
32 1
33 1
34 1
35 1
36 1
37 1
38 1
39 1
40 1
41 1
42 1
43 1
44 1
45 1
46 1
47 1
48 1
49 1
50 1
51 1
52 1
53 1
54 1
55 1
56 1
57 1
58 1
59 1
60 1
61 1
62 1
63 1
64 1
65 1
66 1
67 1
68 1
69 1
70 1
71 1
72 1
73 1
74 1
75 1
76 1
77 1
78 1
79 1
80 1
81 1
82 1
83 1
84 1
85 1
86 1
87 1
88 1
89 1
90 1
91 1
92 1
93 1
94 1
95 1
96 1
97 1
98 1
99 1
100 1

Expected output:
50000


```
import sys , re
from collections import deque , defaultdict , Counter
from math import ceil , sqrt , hypot , factorial , pi , sin , cos , radians
from itertools import accumulate , permutations , combinations , product
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
N , M = MAP ( )
balls = [ [ 1 , 0 ] for _ in range ( N ) ]
balls [ 0 ] = [ 0 , 1 ]
for _ in range ( M ) :
    x , y = MAP ( )
    w_x , r_x = balls [ x - 1 ]
    w_y , r_y = balls [ y - 1 ]
    if w_x >= 1 and r_x >= 1 :
        balls [ x - 1 ] [ 0 ] -= 1
        balls [ y - 1 ] [ 1 ] += 1
    elif w_x == 0 :
        balls [ x - 1 ] [ 1 ] -= 1
        balls [ y - 1 ] [ 1 ] += 1
    else :
        balls [ x - 1 ] [ 0 ] -= 1
        balls [ y - 1 ] [ 0 ] += 1
ans = 0
for i in range ( N ) :
    if balls [ i ] [ 1 ] :
        ans += 1
print ( ans )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
50000 99998
2 1
3 1
4 1
5 1
6 1
7 1
8 1
9 1
10 1
11 1
12 1
13 1
14 1
15 1
16 1
17 1
18 1
19 1
20 1
21 1
22 1
23 1
24 1
25 1
26 1
27 1
28 1
29 1
30 1
31 1
32 1
33 1
34 1
35 1
36 1
37 1
38 1
39 1
40 1
41 1
42 1
43 1
44 1
45 1
46 1
47 1
48 1
49 1
50 1
51 1
52 1
53 1
54 1
55 1
56 1
57 1
58 1
59 1
60 1
61 1
62 1
63 1
64 1
65 1
66 1
67 1
68 1
69 1
70 1
71 1
72 1
73 1
74 1
75 1
76 1
77 1
78 1
79 1
80 1
81 1
82 1
83 1
84 1
85 1
86 1
87 1
88 1
89 1
90 1
91 1
92 1
93 1
94 1
95 1
96 1
97 1
98 1
99 1
100 1

Expected output:
50000


```
import sys , re
from collections import deque , defaultdict , Counter
from math import ceil , sqrt , hypot , factorial , pi , sin , cos , radians
from itertools import accumulate , permutations , combinations , product
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
N , M = MAP ( )
balls = [ [ 1 , 0 ] for _ in range ( N ) ]
balls [ 0 ] = [ 0 , 1 ]
for _ in range ( M ) :
    x , y = MAP ( )
    w_x , r_x = balls [ x - 1 ]
    w_y , r_y = balls [ y - 1 ]
    if w_x >= 1 and r_x >= 1 :
        balls [ x - 1 ] [ 0 ] -= 1
        balls [ y - 1 ] [ 1 ] += 1
    elif w_x == 0 :
        balls [ x - 1 ] [ 1 ] -= 1
        balls [ y - 1 ] [ 1 ] += 1
    else :
        balls [ x - 1 ] [ 0 ] -= 1
        balls [ y - 1 ] [ 0 ] += 1
ans = 0
for i in range ( N ) :
    if balls [ i ] [ 1 ] :
        ans += 1
print ( ans )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
50000 99998
2 1
3 1
4 1
5 1
6 1
7 1
8 1
9 1
10 1
11 1
12 1
13 1
14 1
15 1
16 1
17 1
18 1
19 1
20 1
21 1
22 1
23 1
24 1
25 1
26 1
27 1
28 1
29 1
30 1
31 1
32 1
33 1
34 1
35 1
36 1
37 1
38 1
39 1
40 1
41 1
42 1
43 1
44 1
45 1
46 1
47 1
48 1
49 1
50 1
51 1
52 1
53 1
54 1
55 1
56 1
57 1
58 1
59 1
60 1
61 1
62 1
63 1
64 1
65 1
66 1
67 1
68 1
69 1
70 1
71 1
72 1
73 1
74 1
75 1
76 1
77 1
78 1
79 1
80 1
81 1
82 1
83 1
84 1
85 1
86 1
87 1
88 1
89 1
90 1
91 1
92 1
93 1
94 1
95 1
96 1
97 1
98 1
99 1
100 1

Expected output:
50000


```
import sys , re
from collections import deque , defaultdict , Counter
from math import ceil , sqrt , hypot , factorial , pi , sin , cos , radians
from itertools import accumulate , permutations , combinations , product
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
def ZIP ( n
