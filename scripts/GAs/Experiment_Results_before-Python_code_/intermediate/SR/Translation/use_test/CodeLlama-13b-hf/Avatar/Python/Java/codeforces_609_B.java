
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100 10
7 4 5 5 10 10 5 8 5 7 4 5 4 6 8 8 2 6 3 3 10 7 10 8 6 2 7 3 9 7 7 2 4 5 2 4 9 5 10 1 10 5 10 4 1 3 4 2 6 9 9 9 10 6 2 5 6 1 8 10 4 10 3 4 10 5 5 4 10 4 5 3 7 10 2 7 3 6 9 6 1 6 5 5 4 6 6 4 4 1 5 1 6 6 6 8 8 6 2 6

Expected output:
4428


```
def _input ( ) : return map ( int , input ( ).split ( ) )
n , m = _input ( )
lst = list ( _input ( ) )
l = { }
for i in range ( n ) :
    if lst [ i ] not in l :
        l [ lst [ i ] ] = 1
    else : l [ lst [ i ] ] += 1
res = 0
for i in range ( n ) :
    if l [ lst [ i ] ] > 1 :
        res += n - i - l [ lst [ i ] ]
        l [ lst [ i ] ] -= 1
    else :
        res += n - i - 1
print ( res )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100 10
7 4 5 5 10 10 5 8 5 7 4 5 4 6 8 8 2 6 3 3 10 7 10 8 6 2 7 3 9 7 7 2 4 5 2 4 9 5 10 1 10 5 10 4 1 3 4 2 6 9 9 9 10 6 2 5 6 1 8 10 4 10 3 4 10 5 5 4 10 4 5 3 7 10 2 7 3 6 9 6 1 6 5 5 4 6 6 4 4 1 5 1 6 6 6 8 8 6 2 6

Expected output:
4428


```
def _input ( ) : return map ( int , input ( ).split ( ) )
n , m = _input ( )
lst = list ( _input ( ) )
l = { }
for i in range ( n ) :
    if lst [ i ] not in l :
        l [ lst [ i ] ] = 1
    else : l [ lst [ i ] ] += 1
res = 0
for i in range ( n ) :
    if l [ lst [ i ] ] > 1 :
        res += n - i - l [ lst [ i ] ]
        l [ lst [ i ] ] -= 1
    else :
        res += n - i - 1
print ( res )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100 10
7 4 5 5 10 10 5 8 5 7 4 5 4 6 8 8 2 6 3 3 10 7 10 8 6 2 7 3 9 7 7 2 4 5 2 4 9 5 10 1 10 5 10 4 1 3 4 2 6 9 9 9 10 6 2 5 6 1 8 10 4 10 3 4 10 5 5 4 10 4 5 3 7 10 2 7 3 6 9 6 1 6 5 5 4 6 6 4 4 1 5 1 6 6 6 8 8 6 2 6

Expected output:
4428


```
def _input ( ) : return map ( int , input ( ).split ( ) )
n , m = _input ( )
lst = list ( _input ( ) )
l = { }
for i in range ( n ) :
    if lst [ i ] not in l :
        l [ lst [ i ] ] = 1
    else : l [ lst [ i ] ] += 1
res = 0
for i in range ( n ) :
    if l [ lst [ i ] ] > 1 :
        res += n - i - l [ lst [ i ] ]
        l [ lst [ i ] ] -= 1
    else :
        res += n - i - 1
print ( res )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100 10
7 4 5 5 10 10 5 8 5 7 4 5 4 6 8 8 2 6 3 3 10 7 10 8 6 2 7 3 9 7 7 2 4 5 2 4 9 5 10 1 10 5 10 4 1 3 4 2 6 9 9 9 10 6 2 5 6 1 8 10 4 10 3 4 10 5 5 4 10 4 5 3 7 10 2 7 3 6 9 6 1 6 5 5 4 6 6 4 4 1 5 1 6 6 6 8 8 6 2 6

Expected output:
4428


```
def _input ( ) : return map ( int , input ( ).split ( ) )
n , m = _input ( )
lst = list ( _input ( ) )
l = { }
for i in range ( n ) :
    if lst [ i ] not in l :
        l [ lst [ i ] ] = 1
    else : l [ lst [ i ] ] += 1
res = 0
for i in range ( n ) :
    if l [ lst [ i ] ] > 1 :
        res += n - i - l [ lst [ i ] ]
        l [ lst [ i ] ] -= 1
    else :
        res += n - i - 1
print ( res )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100 10
7 4 5 5 10 10 5 8 5 7 4 5 4 6 8 8 2 6 3 3 10 7 10 8 6 2 7 3 9 7 7 2 4 5 2 4 9 5 10 1 10 5 10 4 1 3 4 2 6 9 9 9 10 6 2 5 6 1 8 10 4 10 3 4 10 5 5 4 10 4 5 3 7 10 2 7 3 6 9 6 1 6 5 5 4 6 6 4 4 1 5 1 6 6 6 8 8 6 2 6

Expected output:
4428


```
def _input ( ) : return map ( int , input ( ).split ( ) )
n , m = _input ( )
lst = list ( _input ( ) )
l = { }
for i in range ( n ) :
    if lst [ i ] not in l :
        l [ lst [ i ] ] = 1
    else : l [ lst [ i ] ] += 1
res = 0
for i in range ( n ) :
    if l [ lst [ i ] ] > 1 :
        res += n - i - l [ lst [ i ] ]
        l [ lst [ i ] ] -= 1
    else :
        res += n - i - 1
print ( res )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100 10
7 4 5 5 10 10 5 8 5 7 4 5 4 6 8 8 2 6 3 3 10 7 10 8 6 2 7 3 9 7 7 2 4 5 2 4 9 5 10 1 10 5 10 4 1 3 4 2 6 9 9 9 10 6 2 5 6 1 8 10 4 10 3 4 10 5 5 4 10 4 5 3 7 10 2 7 3 6 9 6 1 6 5 5 4 6 6 4 4 1 5 1 6 6 6 8 8 6 2 6

Expected output:
4428


```
def _input ( ) : return map ( int , input ( ).split ( ) )
n , m = _input ( )
lst = list ( _input ( ) )
l = { }
for i in range ( n ) :
    if lst [ i ] not in l :
        l [ lst [ i ] ] = 1
    else : l [ lst [ i ] ] += 1
res = 0
for i in range ( n ) :
    if l [ lst [ i ] ] > 1 :
        res += n - i - l [ lst [ i ] ]
        l [ lst [ i ] ] -= 1
    else :
        res += n - i - 1
print ( res )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100 10
7 4 5 5 10 10 5 8 5 7 4 5 4 6 8 8 2 6 3 3 10 7 10 8 6 2 7 3 9 7 7 2 4 5 2 4 9 5 10 1 10 5 10 4 1 3 4 2 6 9 9 9 10 6 2 5 6 1 8 10 4 10 3 4 10 5 5 4 10 4 5 3 7 10 2 7 3 6 9 6 1 6 5 5 4 6 6 4 4 1 5 1 6 6 6 8 8 6 2 6

Expected output:
4428


```
def _input ( ) : return map ( int , input ( ).split ( ) )
n , m = _input ( )
lst = list ( _input ( ) )
l = { }
for i in range ( n ) :
    if lst [ i ] not in l :
        l [ lst [ i ] ] = 1
    else : l [ lst [ i ] ] += 1
res = 0
for i in range ( n ) :
    if l [ lst [ i ] ] > 1 :
        res += n - i - l [ lst [ i ] ]
        l [ lst [ i ] ] -= 1
    else :
        res += n - i - 1
print ( res )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100 10
7 4 5 5 10 10 5 8 5 7 4 5 4 6 8 8 2 6 3 3 10 7 10 8 6 2 7 3 9 7 7 2 4 5 2 4 9 5 10 1 10 5 10 4 1 3 4 2 6 9 9 9 10 6 2 5 6 1 8 10 4 10 3 4 10 5 5 4 10 4 5 3 7 10 2 7 3 6 9 6 1 6 5 5 4 6 6 4 4 1 5 1 6 6 6 8 8 6 2 6

Expected output:
4428


```
def _input ( ) : return map ( int , input ( ).split ( ) )
n , m = _input ( )
lst = list ( _input ( ) )
l = { }
for i in range ( n ) :
    if lst [ i ] not in l :
        l [ lst [ i ] ] = 1
