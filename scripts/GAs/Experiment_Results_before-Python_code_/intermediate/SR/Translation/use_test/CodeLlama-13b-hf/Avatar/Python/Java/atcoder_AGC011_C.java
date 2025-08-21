
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100000 59037
55663 96110
12302 40318
39426 61477
3948 91961
18024 44072
39717 70234
22833 25289
58772 83334
53855 78428
16444 37577
17928 87375
52006 55764
1893 71543
56568 61711
28494 40578
7283 15106
62129 87815
59049 86168
59908 86095
12056 32063
60702 99400
9074 94822
23465 59014
36971 44068
4342 43545
6598 34960
16775 44784
31735 41331
19681 70697
8498 83497
44260 82320
61913 64455
86066 96154
66005 72160
50825 99297
70660 95156
47405 78409
15674 97427
9229 63161
24841 94052
18274 84709
428
Expected output:
8938511365


```
import queue
n , m = map ( int , input ( ).split ( ) )
vis , ci , cb , cc = [ 0 ] * ( n + 1 ) , 0 , 0 , 0
g = [ [ ] for i in range ( n + 1 ) ]
def dfs ( x ) :
    stk , flag = queue.LifoQueue ( ) , True
    stk.put ( ( x , 1 ) )
    while not stk.empty ( ) :
        u , col = stk.get ( )
        if vis [ u ] :
            flag &= ( vis [ u ] == col )
            continue
        vis [ u ] = col
        for i in g [ u ] :
            stk.put ( ( i , 3 - col ) )
    return flag
for i in range ( m ) :
    u , v = map ( int , input ( ).split ( ) )
    g [ u ] += [ v ]
    g [ v ] += [ u ]
for i in range ( 1 , n + 1 ) :
    if vis [ i ] == 0 :
        if len ( g [ i ] ) == 0 :
            ci += 1
        else :
            if dfs ( i ) :
                cb += 1
            else :
                cc += 1
print ( ci * ci + 2 * ci * ( n - ci ) + cc * cc + 2 * cb * cc + 2 * cb * cb )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100000 59037
55663 96110
12302 40318
39426 61477
3948 91961
18024 44072
39717 70234
22833 25289
58772 83334
53855 78428
16444 37577
17928 87375
52006 55764
1893 71543
56568 61711
28494 40578
7283 15106
62129 87815
59049 86168
59908 86095
12056 32063
60702 99400
9074 94822
23465 59014
36971 44068
4342 43545
6598 34960
16775 44784
31735 41331
19681 70697
8498 83497
44260 82320
61913 64455
86066 96154
66005 72160
50825 99297
70660 95156
47405 78409
15674 97427
9229 63161
24841 94052
18274 84709
428
Expected output:
8938511365


```
import queue
n , m = map ( int , input ( ).split ( ) )
vis , ci , cb , cc = [ 0 ] * ( n + 1 ) , 0 , 0 , 0
g = [ [ ] for i in range ( n + 1 ) ]
def dfs ( x ) :
    stk , flag = queue.LifoQueue ( ) , True
    stk.put ( ( x , 1 ) )
    while not stk.empty ( ) :
        u , col = stk.get ( )
        if vis [ u ] :
            flag &= ( vis [ u ] == col )
            continue
        vis [ u ] = col
        for i in g [ u ] :
            stk.put ( ( i , 3 - col ) )
    return flag
for i in range ( m ) :
    u , v = map ( int , input ( ).split ( ) )
    g [ u ] += [ v ]
    g [ v ] += [ u ]
for i in range ( 1 , n + 1 ) :
    if vis [ i ] == 0 :
        if len ( g [ i ] ) == 0 :
            ci += 1
        else :
            if dfs ( i ) :
                cb += 1
            else :
                cc += 1
print ( ci * ci + 2 * ci * ( n - ci ) + cc * cc + 2 * cb * cc + 2 * cb * cb )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100000 59037
55663 96110
12302 40318
39426 61477
3948 91961
18024 44072
39717 70234
22833 25289
58772 83334
53855 78428
16444 37577
17928 87375
52006 55764
1893 71543
56568 61711
28494 40578
7283 15106
62129 87815
59049 86168
59908 86095
12056 32063
60702 99400
9074 94822
23465 59014
36971 44068
4342 43545
6598 34960
16775 44784
31735 41331
19681 70697
8498 83497
44260 82320
61913 64455
86066 96154
66005 72160
50825 99297
70660 95156
47405 78409
15674 97427
9229 63161
24841 94052
18274 84709
428
Expected output:
8938511365


```
import queue
n , m = map ( int , input ( ).split ( ) )
vis , ci , cb , cc = [ 0 ] * ( n + 1 ) , 0 , 0 , 0
g = [ [ ] for i in range ( n + 1 ) ]
def dfs ( x ) :
    stk , flag = queue.LifoQueue ( ) , True
    stk.put ( ( x , 1 ) )
    while not stk.empty ( ) :
        u , col = stk.get ( )
        if vis [ u ] :
            flag &= ( vis [ u ] == col )
            continue
        vis [ u ] = col
        for i in g [ u ] :
            stk.put ( ( i , 3 - col ) )
    return flag
for i in range ( m ) :
    u , v = map ( int , input ( ).split ( ) )
    g [ u ] += [ v ]
    g [ v ] += [ u ]
for i in range ( 1 , n + 1 ) :
    if vis [ i ] == 0 :
        if len ( g [ i ] ) == 0 :
            ci += 1
        else :
            if dfs ( i ) :
                cb += 1
            else :
                cc += 1
print ( ci * ci + 2 * ci * ( n - ci ) + cc * cc + 2 * cb * cc + 2 * cb * cb )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100000 59037
55663 96110
12302 40318
39426 61477
3948 91961
18024 44072
39717 70234
22833 25289
58772 83334
53855 78428
16444 37577
17928 87375
52006 55764
1893 71543
56568 61711
28494 40578
7283 15106
62129 87815
59049 86168
59908 86095
12056 32063
60702 99400
9074 94822
23465 59014
36971 44068
4342
