
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
18
0 1 0 1 0 1 0 1 0 1 1 0 1 1 0 1 1 0

Expected output:
11


```
import itertools
def find ( s , ch ) :
    return [ i for i , ltr in enumerate ( s ) if ltr == ch ]
if __name__ == '__main__' :
    n = int ( input ( ) )
    s = input ( ).replace ( "" , "" )
    if '0' not in s :
        print ( n - 1 )
    else :
        indices = find ( s , '0' )
        if len ( indices ) == 1 :
            print ( n )
        else :
            maximum = 0
            combs = itertools.combinations ( indices , 2 )
            for x in combs :
                maximum = max ( maximum , 2 + 2 * ( abs ( indices.index ( x [ 0 ] ) - indices.index ( x [ 1 ] ) ) - 1 ) - ( abs ( x [ 0 ] - x [ 1 ] ) - 1 ) )
            print ( s.count ( '1' ) + maximum )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
18
0 1 0 1 0 1 0 1 0 1 1 0 1 1 0 1 1 0

Expected output:
11


```
import itertools
def find ( s , ch ) :
    return [ i for i , ltr in enumerate ( s ) if ltr == ch ]
if __name__ == '__main__' :
    n = int ( input ( ) )
    s = input ( ).replace ( "" , "" )
    if '0' not in s :
        print ( n - 1 )
    else :
        indices = find ( s , '0' )
        if len ( indices ) == 1 :
            print ( n )
        else :
            maximum = 0
            combs = itertools.combinations ( indices , 2 )
            for x in combs :
                maximum = max ( maximum , 2 + 2 * ( abs ( indices.index ( x [ 0 ] ) - indices.index ( x [ 1 ] ) ) - 1 ) - ( abs ( x [ 0 ] - x [ 1 ] ) - 1 ) )
            print ( s.count ( '1' ) + maximum )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
18
0 1 0 1 0 1 0 1 0 1 1 0 1 1 0 1 1 0

Expected output:
11


```
import itertools
def find ( s , ch ) :
    return [ i for i , ltr in enumerate ( s ) if ltr == ch ]
if __name__ == '__main__' :
    n = int ( input ( ) )
    s = input ( ).replace ( "" , "" )
    if '0' not in s :
        print ( n - 1 )
    else :
        indices = find ( s , '0' )
        if len ( indices ) == 1 :
            print ( n )
        else :
            maximum = 0
            combs = itertools.combinations ( indices , 2 )
            for x in combs :
                maximum = max ( maximum , 2 + 2 * ( abs ( indices.index ( x [ 0 ] ) - indices.index ( x [ 1 ] ) ) - 1 ) - ( abs ( x [ 0 ] - x [ 1 ] ) - 1 ) )
            print ( s.count ( '1' ) + maximum )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
18
0 1 0 1 0 1 0 1 0 1 1 0 1 1 0 1 1 0

Expected output:
11


```
import itertools
def find ( s , ch ) :
    return [ i for i , ltr in enumerate ( s ) if ltr == ch ]
if __name__ == '__main__' :
    n = int ( input ( ) )
    s = input ( ).replace ( "" , "" )
    if '0' not in s :
        print ( n - 1 )
    else :
        indices = find ( s , '0' )
        if len ( indices ) == 1 :
            print ( n )
        else :
            maximum = 0
            combs = itertools.combinations ( indices , 2 )
            for x in combs :
                maximum = max ( maximum , 2 + 2 * ( abs ( indices.index ( x [ 0 ] ) - indices.index ( x [ 1 ] ) ) - 1 ) - ( abs ( x [ 0 ] - x [ 1 ] ) - 1 ) )
            print ( s.count ( '1' ) + maximum )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
18
0 1 0 1 0 1 0 1 0 1 1 0 1 1 0 1 1 0

Expected output:
11


```
import itertools
def find ( s , ch ) :
    return [ i for i , ltr in enumerate ( s ) if ltr == ch ]
if __name__ == '__main__' :
    n = int ( input ( ) )
    s = input ( ).replace ( "" , "" )
    if '0' not in s :
        print ( n - 1 )
    else :
        indices = find ( s , '0' )
        if len ( indices ) == 1 :
            print ( n )
        else :
            maximum = 0
            combs = itertools.combinations ( indices , 2 )
            for x in combs :
                maximum = max ( maximum , 2 + 2 * ( abs ( indices.index ( x [ 0 ] ) - indices.index ( x [ 1 ] ) ) - 1 ) - ( abs ( x [ 0 ] - x [ 1 ] ) - 1 ) )
            print ( s.count ( '1' ) + maximum )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
18
0 1 0 1 0 1 0 1 0 1 1 0 1 1 0 1 1 0

Expected output:
11


```
import itertools
def find ( s , ch ) :
    return [ i for i , ltr in enumerate ( s ) if ltr == ch ]
if __name__ == '__main__' :
    n = int ( input ( ) )
    s = input ( ).replace ( "" , "" )
    if '0' not in s :
        print ( n - 1 )
    else :
        indices = find ( s , '0' )
        if len ( indices ) == 1 :
            print ( n )
        else :
            maximum = 0
            combs = itertools.combinations ( indices , 2 )
            for x in combs :
                maximum = max ( maximum , 2 + 2 * ( abs ( indices.index ( x [ 0 ] ) - indices.index ( x [ 1 ] ) ) - 1 ) - ( abs ( x [ 0 ] - x [ 1 ] ) - 1 ) )
            print ( s.count ( '1' ) + maximum )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
18
0 1 0 1 0 1 0 1 0 1 1 0 1 1 0 1 1 0

Expected output:
11


```
import itertools
def find ( s , ch ) :
    return [ i for i , ltr in enumerate ( s ) if ltr == ch ]
if __name__ == '__main__' :
    n = int ( input ( ) )
    s = input ( ).replace ( "" , "" )
    if '0' not in s :
        print ( n - 1 )
    else :
        indices = find ( s , '0' )
        if len ( indices ) == 1 :
            print ( n )
        else :
            maximum = 0
            combs = itertools.combinations ( indices , 2 )
            for x in combs :
                maximum = max ( maximum , 2 + 2 * ( abs ( indices.index ( x [ 0 ] ) - indices.index ( x [ 1 ] ) ) - 1 ) - ( abs ( x [ 0 ] - x [ 1 ] ) - 1 ) )
            print ( s.count ( '1' ) + maximum )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
18
0 1 0 1 0 1 0 1 0 1 1 0 1 1 0 1 1 0

Expected output:
11


```
import itertools
def find ( s , ch ) :
    return [ i for i , ltr in enumerate ( s ) if ltr == ch ]
if __name__ == '__main__' :
    n = int ( input ( ) )
    s = input ( ).replace ( "" , "" )
    if '0' not in s :
        print ( n - 1 )
    else :
        indices = find ( s , '0' )
        if len ( indices ) == 1 :
            print ( n )
        else :
            maximum = 0
            combs = itertools.combinations ( indices , 2 )
            for x in combs :
                maximum = max ( maximum , 2 + 2 * ( abs ( indices.index ( x [ 0 ] ) - indices.index ( x [ 1 ] ) ) - 1 ) - ( abs ( x [ 0 ] - x [ 1 ] ) - 1 ) )
            print ( s.count ( '1' ) + maximum )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
18
0 1 0 1 0 1 0 1 0 1 1 0 1 1 0 1 1 0

Expected output:
11


```
import itertools
def find ( s , ch ) :
    return [ i for i , ltr in enumerate ( s ) if ltr == ch ]
if __name__ == '__main__' :
    n = int ( input ( ) )
    s = input ( ).replace ( "" , "" )
    if '0' not in s :
        print ( n - 1 )
    else :
        indices = find ( s , '0' )
        if len ( indices ) == 1 :
            print ( n )
        else :
            maximum = 0
            combs = itertools.combinations ( indices , 2 )
            for x in combs :
                maximum = max ( maximum , 2 + 2 * ( abs ( indices.index ( x [ 0 ] ) - indices.index ( x [ 1 ] ) ) - 1 ) - ( abs ( x [ 0 ] - x [ 1 ] ) - 1 ) )
            print ( s.count ( '1' ) + maximum )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
18
0 1 0 1 0 1 0 1 0 1 1 0 1 1 0 1 1 0

Expected output:
11


```
import itertools
def find ( s , ch ) :
    return [ i for i , ltr in enumerate ( s ) if ltr == ch ]
if __name__ == '__main__' :
    n = int ( input ( ) )
    s = input ( ).replace ( "" , "" )
    if '0' not in s :
        print ( n - 1 )
    else :
        indices = find ( s , '0' )
        if len ( indices ) == 1 :
            print ( n )
        else :
            maximum = 0
            combs = itertools.combinations ( indices , 2 )
            for x in combs :
                maximum = max ( maximum , 2 + 2 * ( abs ( indices.index ( x [ 0 ] ) - indices.index ( x [ 1 ] ) ) - 1 ) - ( abs ( x [ 0 ] - x [ 1 ] ) - 1 ) )
            print ( s.count ( '1' ) + maximum )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
18
0 1 0 1 0 1 0 1 0 1 1 0 1 1 0 1 1 0

Expected output:
11


```
import itertools
def find ( s , ch ) :
    return [ i for i , ltr in enumerate ( s ) if ltr == ch ]
if __name__ == '__main__' :
    n = int ( input ( ) )
    s = input ( ).replace ( "" , "" )
    if '0' not in s :
       
