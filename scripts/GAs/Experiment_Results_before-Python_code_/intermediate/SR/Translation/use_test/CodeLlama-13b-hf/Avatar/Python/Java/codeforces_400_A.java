
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
13
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX

Expected output:
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1


```
import collections
import heapq
import sys
import math
import itertools
import bisect
from io import BytesIO , IOBase
import os
def value ( ) : return tuple ( map ( int , input ( ).split ( ) ) )
def values ( ) : return tuple ( map ( int , sys.stdin.readline ( ).split ( ) ) )
def inlst ( ) : return [ int ( i ) for i in input ( ).split ( ) ]
def inlsts ( ) : return [ int ( i ) for i in sys.stdin.readline ( ).split ( ) ]
def inp ( ) : return int ( input ( ) )
def inps ( ) : return int ( sys.stdin.readline ( ) )
def instr ( ) : return input ( )
def stlst ( ) : return [ i for i in input ( ).split ( ) ]
def help ( a , b , l ) :
    tot = [ ]
    for i in range ( b ) :
        tot.append ( l [ i * a : i * a + a ] )
    for i in zip ( * tot ) :
        if sum ( ( i ) ) == b : return True
    return False
def solve ( ) :
    tot = [ ]
    x = instr ( )
    s = [ ]
    for i in x :
        if i == 'O' : s.append ( 0 )
        else : s.append ( 1 )
    for i in range ( 1 , 13 ) :
        if 12 % i == 0 :
            if help ( i , 12 // i , s ) : tot.append ( ( 12 // i , i ) )
    print ( len ( tot ) , end = ' ' )
    for a , b in sorted ( tot ) :
        print ( f'{a}x{b}' , end = ' ' )
    print ( )
if __name__ == "__main__" :
    for i in range ( inp ( ) ) :
        solve ( )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
13
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX

Expected output:
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1


```
import collections
import heapq
import sys
import math
import itertools
import bisect
from io import BytesIO , IOBase
import os
def value ( ) : return tuple ( map ( int , input ( ).split ( ) ) )
def values ( ) : return tuple ( map ( int , sys.stdin.readline ( ).split ( ) ) )
def inlst ( ) : return [ int ( i ) for i in input ( ).split ( ) ]
def inlsts ( ) : return [ int ( i ) for i in sys.stdin.readline ( ).split ( ) ]
def inp ( ) : return int ( input ( ) )
def inps ( ) : return int ( sys.stdin.readline ( ) )
def instr ( ) : return input ( )
def stlst ( ) : return [ i for i in input ( ).split ( ) ]
def help ( a , b , l ) :
    tot = [ ]
    for i in range ( b ) :
        tot.append ( l [ i * a : i * a + a ] )
    for i in zip ( * tot ) :
        if sum ( ( i ) ) == b : return True
    return False
def solve ( ) :
    tot = [ ]
    x = instr ( )
    s = [ ]
    for i in x :
        if i == 'O' : s.append ( 0 )
        else : s.append ( 1 )
    for i in range ( 1 , 13 ) :
        if 12 % i == 0 :
            if help ( i , 12 // i , s ) : tot.append ( ( 12 // i , i ) )
    print ( len ( tot ) , end = ' ' )
    for a , b in sorted ( tot ) :
        print ( f'{a}x{b}' , end = ' ' )
    print ( )
if __name__ == "__main__" :
    for i in range ( inp ( ) ) :
        solve ( )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
13
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX

Expected output:
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1


```
import collections
import heapq
import sys
import math
import itertools
import bisect
from io import BytesIO , IOBase
import os
def value ( ) : return tuple ( map ( int , input ( ).split ( ) ) )
def values ( ) : return tuple ( map ( int , sys.stdin.readline ( ).split ( ) ) )
def inlst ( ) : return [ int ( i ) for i in input ( ).split ( ) ]
def inlsts ( ) : return [ int ( i ) for i in sys.stdin.readline ( ).split ( ) ]
def inp ( ) : return int ( input ( ) )
def inps ( ) : return int ( sys.stdin.readline ( ) )
def instr ( ) : return input ( )
def stlst ( ) : return [ i for i in input ( ).split ( ) ]
def help ( a , b , l ) :
    tot = [ ]
    for i in range ( b ) :
        tot.append ( l [ i * a : i * a + a ] )
    for i in zip ( * tot ) :
        if sum ( ( i ) ) == b : return True
    return False
def solve ( ) :
    tot = [ ]
    x = instr ( )
    s = [ ]
    for i in x :
        if i == 'O' : s.append ( 0 )
        else : s.append ( 1 )
    for i in range ( 1 , 13 ) :
        if 12 % i == 0 :
            if help ( i , 12 // i , s ) : tot.append ( ( 12 // i , i ) )
    print ( len ( tot ) , end = ' ' )
    for a , b in sorted ( tot ) :
        print ( f'{a}x{b}' , end = ' ' )
    print ( )
if __name__ == "__main__" :
    for i in range ( inp ( ) ) :
        solve ( )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below
