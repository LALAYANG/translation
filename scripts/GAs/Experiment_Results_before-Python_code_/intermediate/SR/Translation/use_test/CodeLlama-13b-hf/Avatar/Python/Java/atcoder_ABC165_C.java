
[INST] <<PYTHON>>
You are an expert Java programmer and assistant
<</PYTHON>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5 2 20
2 3 1 84578
1 4 0 7182
2 4 1 25494
1 5 0 81831
1 3 1 14734
1 4 1 39268
1 5 1 594
3 5 0 27228
1 2 0 95
2 3 0 56166
2 5 0 87980
4 5 0 56559
2 4 0 46228
3 5 1 61412
1 3 0 10258
3 4 0 77949
4 5 1 97604
3 4 1 20460
1 2 1 28731
2 5 1 46448

Expected output:
451476


```
import sys
def solve ( N : int , M : int , Q : int , a : "List[int]" , b : "List[int]" , c : "List[int]" , d : "List[int]" ) :
    res = 0
    def rec ( A ) :
        nonlocal res
        if len ( A ) == N :
            ans = 0
            for i in range ( Q ) :
                if A [ b [ i ] - 1 ] - A [ a [ i ] - 1 ] == c [ i ] :
                    ans += d [ i ]
            res = max ( res , ans )
            return
        last_max = 1 if len ( A ) == 0 else A [ - 1 ]
        for i in range ( last_max , M + 1 ) :
            rec ( A + [ i ] )
    rec ( [ ] )
    print ( res )
    return
def main ( ) :
    def iterate_tokens ( ) :
        for line in sys.stdin :
            for word in line.split ( ) :
                yield word
    tokens = iterate_tokens ( )
    N = int ( next ( tokens ) )
    M = int ( next ( tokens ) )
    Q = int ( next ( tokens ) )
    a = [ int ( ) ] * ( Q )
    b = [ int ( ) ] * ( Q )
    c = [ int ( ) ] * ( Q )
    d = [ int ( ) ] * ( Q )
    for i in range ( Q ) :
        a [ i ] = int ( next ( tokens ) )
        b [ i ] = int ( next ( tokens ) )
        c [ i ] = int ( next ( tokens ) )
        d [ i ] = int ( next ( tokens ) )
    solve ( N , M , Q , a , b , c , d )
if __name__ == '__main__' :
    main ( )


```
[/INST]

[INST] <<PYTHON>>
You are an expert Java programmer and assistant
<</PYTHON>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5 2 20
2 3 1 84578
1 4 0 7182
2 4 1 25494
1 5 0 81831
1 3 1 14734
1 4 1 39268
1 5 1 594
3 5 0 27228
1 2 0 95
2 3 0 56166
2 5 0 87980
4 5 0 56559
2 4 0 46228
3 5 1 61412
1 3 0 10258
3 4 0 77949
4 5 1 97604
3 4 1 20460
1 2 1 28731
2 5 1 46448

Expected output:
451476


```
import sys
def solve ( N : int , M : int , Q : int , a : "List[int]" , b : "List[int]" , c : "List[int]" , d : "List[int]" ) :
    res = 0
    def rec ( A ) :
        nonlocal res
        if len ( A ) == N :
            ans = 0
            for i in range ( Q ) :
                if A [ b [ i ] - 1 ] - A [ a [ i ] - 1 ] == c [ i ] :
                    ans += d [ i ]
            res = max ( res , ans )
            return
        last_max = 1 if len ( A ) == 0 else A [ - 1 ]
        for i in range ( last_max , M + 1 ) :
            rec ( A + [ i ] )
    rec ( [ ] )
    print ( res )
    return
def main ( ) :
    def iterate_tokens ( ) :
        for line in sys.stdin :
            for word in line.split ( ) :
                yield word
    tokens = iterate_tokens ( )
    N = int ( next ( tokens ) )
    M = int ( next ( tokens ) )
    Q = int ( next ( tokens ) )
    a = [ int ( ) ] * ( Q )
    b = [ int ( ) ] * ( Q )
    c = [ int ( ) ] * ( Q )
    d = [ int ( ) ] * ( Q )
    for i in range ( Q ) :
        a [ i ] = int ( next ( tokens ) )
        b [ i ] = int ( next ( tokens ) )
        c [ i ] = int ( next ( tokens ) )
        d [ i ] = int ( next ( tokens ) )
    solve ( N , M , Q , a , b , c , d )
if __name__ == '__main__' :
    main ( )


```
[/INST]

[INST] <<PYTHON>>
You are an expert Java programmer and assistant
<</PYTHON>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5 2 20
2 3 1 84578
1 4 0 7182
2 4 1 25494
1 5 0 81831
1 3 1 14734
1 4 1 39268
1 5 1 594
3 5 0 27228
1 2 0 95
2 3 0 56166
2 5 0 87980
4 5 0 56559
2 4 0 46228
3 5 1 61412
1 3 0 10258
3 4 0 77949
4 5 1 97604
3 4 1 20460
1 2 1 28731
2 5 1 46448

Expected output:
451476


```
import sys
def solve ( N : int , M : int , Q : int , a : "List[int]" , b : "List[int]" , c : "List[int]" , d : "List[int]" ) :
    res = 0
    def rec ( A ) :
        nonlocal res
        if len ( A ) == N :
            ans = 0
            for i in range ( Q ) :
                if A [ b [ i ] - 1 ] - A [ a [ i ] - 1 ] == c [ i ] :
                    ans += d [ i ]
            res = max ( res , ans )
            return
        last_max = 1 if len ( A ) == 0 else A [ - 1 ]
        for i in range ( last_max , M + 1 ) :
            rec ( A + [ i ] )
    rec ( [ ] )
    print ( res )
    return
def main ( ) :
    def iterate_tokens ( ) :
        for line in sys.stdin :
            for word in line.split ( ) :
                yield word
    tokens = iterate_tokens ( )
    N = int ( next ( tokens ) )
    M = int ( next ( tokens ) )
    Q = int ( next ( tokens ) )
    a = [ int ( ) ] * ( Q )
    b = [ int ( ) ] * ( Q )
    c = [ int ( ) ] * ( Q )
    d = [ int ( ) ] * ( Q )
    for i in range ( Q ) :
        a [ i ] = int ( next ( tokens ) )
        b [ i ] = int ( next ( tokens ) )
        c [ i ] = int ( next ( tokens ) )
        d [ i ] = int ( next ( tokens ) )
    solve ( N , M , Q , a , b , c , d )
if __name__ == '__main__' :
    main ( )


```
[/INST]

[INST] <<PYTHON>>
You are an expert Java programmer and assistant
<</PYTHON>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5 2 20
2 3 1 84578
1 4 0 7182
2 4 1 25494
1 5 0 81831
1 3 1 14734
1 4 1 39268
1 5 1 594
3 5 0 27228
1 2 0 95
2 3 0 56166
2 5 0 87980
4 5 0 56559
2 4 0 46228
3 5 1 61412
1 3 0 10258
3 4 0 77949
4 5 1 97604
3 4 1 20460
1 2 1 28731
2 5 1 46448

Expected output:
451476


```
import sys
def solve ( N : int , M : int , Q : int , a : "List[int]" , b : "List[int]" , c : "List[int]" , d : "List[int]" ) :
    res = 0
    def rec ( A ) :
        nonlocal res
        if len ( A ) == N :
            ans = 0
            for i in range ( Q ) :
                if A [ b [ i ] - 1 ] - A [ a [ i ] - 1 ] == c [ i ] :
                    ans += d [ i ]
            res = max ( res , ans )
            return
        last_max = 1 if len ( A ) == 0 else A [ - 1 ]
        for i in range ( last_max , M + 1 ) :
            rec ( A + [ i ] )
    rec ( [ ] )
    print ( res )
    return
def main ( ) :
    def iterate_tokens ( ) :
        for line in sys.stdin :
            for word in line.split ( ) :
                yield word
    tokens = iterate_tokens ( )
    N = int ( next ( tokens ) )
    M = int ( next ( tokens ) )
    Q = int ( next ( tokens ) )
    a = [ int ( ) ] * ( Q )
    b = [ int ( ) ] * ( Q )
    c = [ int ( ) ] * ( Q )
    d = [ int ( ) ] * ( Q )
    for i in range ( Q ) :
        a [ i ] = int ( next ( tokens ) )
        b [ i ] = int ( next ( tokens ) )
        c [ i ] = int ( next ( tokens ) )
        d [ i ] = int ( next ( tokens ) )
    solve ( N , M , Q , a , b , c , d )
if __name__ == '__main__' :
    main ( )


```
[/INST]

[INST] <<PYTHON>>
You are an expert Java programmer and assistant
<</PYTHON>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5 2 20
2 3 1 84578
1 4 0 7182
2 4 1 25494
1 5 0 81831
1 3 1 14734
1 4 1 39268
1 5 1 594
3 5 0 27228
1 2 0 95
2 3 0 56166
2 5 0 87980
4 5 
