
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100000
597 36415
70142 27872
72650 59411
26228 21317
91664 68658
16341 19718
74729 8862
36666 15000
60529 76324
36353 29980
48780 66955
55541 8438
7038 63787
52490 78881
79201 48691
69788 22295
92723 83852
3879 760
77188 64666
99743 70264
19634 99136
65828 8273
51870 89031
33029 76391
53367 96627
12829 19889
49776 1883
2937 25247
71970 31068
67464 84394
26307 18671
71420 72565
17426 30920
72361 70951
61289 77285
95084 25677
58408 75228
85181 37140
58300 61321
27820 90278
84901 25532
71684 58559

Expected output:
First


```
import sys
from collections import deque
input = sys.stdin.buffer.readline
N = int ( input ( ) )
adj = [ [ ] for _ in range ( N + 1 ) ]
for _ in range ( N - 1 ) :
    a , b = map ( int , input ( ).split ( ) )
    adj [ a ].append ( b )
    adj [ b ].append ( a )
que = deque ( )
que.append ( 1 )
seen = [ 0 ] * ( N + 1 )
seen [ 1 ] = 1
par = [ 0 ] * ( N + 1 )
child_num = [ 0 ] * ( N + 1 )
while que :
    v = que.popleft ( )
    for u in adj [ v ] :
        if seen [ u ] == 0 :
            seen [ u ] = 1
            par [ u ] = v
            child_num [ v ] += 1
            que.append ( u )
seq = deque ( )
for i in range ( 1 , N + 1 ) :
    if child_num [ i ] == 0 :
        seq.append ( i )
while seq :
    c = seq.pop ( )
    seen [ c ] = 0
    if seen [ par [ c ] ] == 0 :
        print ( 'First' )
        exit ( )
    seen [ par [ c ] ] = 0
    child_num [ par [ par [ c ] ] ] -= 1
    if child_num [ par [ par [ c ] ] ] == 0 :
        seq.append ( par [ par [ c ] ] )
print ( 'Second' )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100000
597 36415
70142 27872
72650 59411
26228 21317
91664 68658
16341 19718
74729 8862
36666 15000
60529 76324
36353 29980
48780 66955
55541 8438
7038 63787
52490 78881
79201 48691
69788 22295
92723 83852
3879 760
77188 64666
99743 70264
19634 99136
65828 8273
51870 89031
33029 76391
53367 96627
12829 19889
49776 1883
2937 25247
71970 31068
67464 84394
26307 18671
71420 72565
17426 30920
72361 70951
61289 77285
95084 25677
58408 75228
85181 37140
58300 61321
27820 90278
84901 25532
71684 58559

Expected output:
First


```
import sys
from collections import deque
input = sys.stdin.buffer.readline
N = int ( input ( ) )
adj = [ [ ] for _ in range ( N + 1 ) ]
for _ in range ( N - 1 ) :
    a , b = map ( int , input ( ).split ( ) )
    adj [ a ].append ( b )
    adj [ b ].append ( a )
que = deque ( )
que.append ( 1 )
seen = [ 0 ] * ( N + 1 )
seen [ 1 ] = 1
par = [ 0 ] * ( N + 1 )
child_num = [ 0 ] * ( N + 1 )
while que :
    v = que.popleft ( )
    for u in adj [ v ] :
        if seen [ u ] == 0 :
            seen [ u ] = 1
            par [ u ] = v
            child_num [ v ] += 1
            que.append ( u )
seq = deque ( )
for i in range ( 1 , N + 1 ) :
    if child_num [ i ] == 0 :
        seq.append ( i )
while seq :
    c = seq.pop ( )
    seen [ c ] = 0
    if seen [ par [ c ] ] == 0 :
        print ( 'First' )
        exit ( )
    seen [ par [ c ] ] = 0
    child_num [ par [ par [ c ] ] ] -= 1
    if child_num [ par [ par [ c ] ] ] == 0 :
        seq.append ( par [ par [ c ] ] )
print ( 'Second' )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100000
597 36415
70142 27872
72650 59411
26228 21317
91664 68658
16341 19718
74729 8862
36666 15000
60529 76324
36353 29980
48780 66955
55541 8438
7038 63787
52490 78881
79201 48691
69788 22295
92723 83852
3879 760
77188 64666
99743 70264
19634 99136
65828 8273
51870 89031
33029 76391
53367 96627
12829 19889
49776 1883
2937 25247
71970 31068
67464 84394
26307 18671
71420 72565
17426 30920
72361 70951
61289 77285
95084 25677
58408 75228
85181 37140
58300 61321
27820 90278
84901 25532
71684 58559

Expected output:
First


```
import sys
from collections import deque
input = sys.stdin.buffer.readline
N = int ( input ( ) )
adj = [ [ ] for _ in range ( N + 1 ) ]
for _ in range ( N - 1 ) :
    a , b = map ( int , input ( ).split ( ) )
    adj [ a ].append ( b )
    adj [ b ].append ( a )
que = deque ( )
que.append ( 1 )
seen = [ 0 ] * ( N + 1 )
seen [ 1 ] = 1
par = [ 0 ] * ( N + 1 )
child_num = [ 0 ] * ( N + 1 )
while que :
    v = que.popleft ( )
    for u in adj [ v ] :
        if seen [ u ] == 0 :
            seen [ u ] = 1
            par [ u ] = v
            child_num [ v ] += 1
            que.append ( u )
seq = deque ( )
for i in range ( 1 , N + 1 ) :
    if child_num [ i ] == 0 :
        seq.append ( i )
while seq :
    c = seq.pop ( )
    seen [ c ] = 0
    if seen [ par [ c ] ] == 0 :
        print ( 'First' )
        exit ( )
    seen [ par [ c ] ] = 0
    child_num [ par [ par [ c ] ] ] -= 1
    if child_num [ par [ par [ c ] ] ] == 0 :
        seq.append ( par [ par [ c ] ] )
print ( 'Second' )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100000
597 36415
70142 27872
72650 59411
26228 21317
91664 68658
16341 19718
74729 8862
36666 15000
60529 76324
36353 29980
4
