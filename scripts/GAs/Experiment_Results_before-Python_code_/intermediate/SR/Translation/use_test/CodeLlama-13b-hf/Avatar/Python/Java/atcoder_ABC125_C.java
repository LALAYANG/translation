
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
12 15 18

Expected output:
6


```
def gcd ( a : int , b : int ) -> int :
    if b == 0 :
        return a
    return gcd ( b , a % b )
def ruiseki_lr ( array ) :
    op = lambda a , b : gcd ( a , b )
    e = 0
    n = len ( array )
    left = [ e ] * ( n + 1 )
    right = [ e ] * ( n + 1 )
    for i in range ( n ) :
        left [ i + 1 ] = op ( left [ i ] , array [ i ] )
    for i in reversed ( range ( n ) ) :
        right [ i ] = op ( right [ i + 1 ] , array [ i ] )
    return left , right
n = int ( input ( ) )
a = list ( map ( int , input ( ).split ( ) ) )
left , right = ruiseki_lr ( a )
ans = 0
for i in range ( n ) :
    ans = max ( gcd ( left [ i ] , right [ i + 1 ] ) , ans )
print ( ans )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
12 15 18

Expected output:
6


```
def gcd ( a : int , b : int ) -> int :
    if b == 0 :
        return a
    return gcd ( b , a % b )
def ruiseki_lr ( array ) :
    op = lambda a , b : gcd ( a , b )
    e = 0
    n = len ( array )
    left = [ e ] * ( n + 1 )
    right = [ e ] * ( n + 1 )
    for i in range ( n ) :
        left [ i + 1 ] = op ( left [ i ] , array [ i ] )
    for i in reversed ( range ( n ) ) :
        right [ i ] = op ( right [ i + 1 ] , array [ i ] )
    return left , right
n = int ( input ( ) )
a = list ( map ( int , input ( ).split ( ) ) )
left , right = ruiseki_lr ( a )
ans = 0
for i in range ( n ) :
    ans = max ( gcd ( left [ i ] , right [ i + 1 ] ) , ans )
print ( ans )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
12 15 18

Expected output:
6


```
def gcd ( a : int , b : int ) -> int :
    if b == 0 :
        return a
    return gcd ( b , a % b )
def ruiseki_lr ( array ) :
    op = lambda a , b : gcd ( a , b )
    e = 0
    n = len ( array )
    left = [ e ] * ( n + 1 )
    right = [ e ] * ( n + 1 )
    for i in range ( n ) :
        left [ i + 1 ] = op ( left [ i ] , array [ i ] )
    for i in reversed ( range ( n ) ) :
        right [ i ] = op ( right [ i + 1 ] , array [ i ] )
    return left , right
n = int ( input ( ) )
a = list ( map ( int , input ( ).split ( ) ) )
left , right = ruiseki_lr ( a )
ans = 0
for i in range ( n ) :
    ans = max ( gcd ( left [ i ] , right [ i + 1 ] ) , ans )
print ( ans )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
12 15 18

Expected output:
6


```
def gcd ( a : int , b : int ) -> int :
    if b == 0 :
        return a
    return gcd ( b , a % b )
def ruiseki_lr ( array ) :
    op = lambda a , b : gcd ( a , b )
    e = 0
    n = len ( array )
    left = [ e ] * ( n + 1 )
    right = [ e ] * ( n + 1 )
    for i in range ( n ) :
        left [ i + 1 ] = op ( left [ i ] , array [ i ] )
    for i in reversed ( range ( n ) ) :
        right [ i ] = op ( right [ i + 1 ] , array [ i ] )
    return left , right
n = int ( input ( ) )
a = list ( map ( int , input ( ).split ( ) ) )
left , right = ruiseki_lr ( a )
ans = 0
for i in range ( n ) :
    ans = max ( gcd ( left [ i ] , right [ i + 1 ] ) , ans )
print ( ans )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
12 15 18

Expected output:
6


```
def gcd ( a : int , b : int ) -> int :
    if b == 0 :
        return a
    return gcd ( b , a % b )
def ruiseki_lr ( array ) :
    op = lambda a , b : gcd ( a , b )
    e = 0
    n = len ( array )
    left = [ e ] * ( n + 1 )
    right = [ e ] * ( n + 1 )
    for i in range ( n ) :
        left [ i + 1 ] = op ( left [ i ] , array [ i ] )
    for i in reversed ( range ( n ) ) :
        right [ i ] = op ( right [ i + 1 ] , array [ i ] )
    return left , right
n = int ( input ( ) )
a = list ( map ( int , input ( ).split ( ) ) )
left , right = ruiseki_lr ( a )
ans = 0
for i in range ( n ) :
    ans = max ( gcd ( left [ i ] , right [ i + 1 ] ) , ans )
print ( ans )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
12 15 18

Expected output:
6


```
def gcd ( a : int , b : int ) -> int :
    if b == 0 :
        return a
    return gcd ( b , a % b )
def ruiseki_lr ( array ) :
    op = lambda a , b : gcd ( a , b )
    e = 0
    n = len ( array )
    left = [ e ] * ( n + 1 )
    right = [ e ] * ( n + 1 )
    for i in range ( n ) :
        left [ i + 1 ] = op ( left [ i ] , array [ i ] )
    for i in reversed ( range ( n ) ) :
        right [ i ] = op ( right [ i + 1 ] , array [ i ] )
    return left , right
n = int ( input ( ) )
a = list ( map ( int , input ( ).split ( ) ) )
left , right = ruiseki_lr ( a )
ans = 0
for i in range ( n ) :
    ans = max ( gcd ( left [ i ] , right [ i + 1 ] ) , ans )
print ( ans )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
12 15 18

Expected output:
6


```
def gcd ( a : int , b : int ) -> int :
    if b == 0 :
        return a
    return gcd ( b , a % b )
def ruiseki_lr ( array ) :
    op = lambda a , b : gcd ( a , b )
    e = 0
    n = len ( array )
    left = [ e ] * ( n + 1 )
    right = [ e ] * ( n + 1 )
    for i in range ( n ) :
        left [ i + 1 ] = op ( left [ i ] , array [ i ] )
    for i in reversed ( range ( n ) ) :
        right [ i ] = op ( right [ i + 1 ] , array [ i ] )
    return left , right
n = int ( input ( ) )
a = list ( map ( int , input ( ).split ( ) ) )
left , right = ruiseki_lr ( a )
ans = 0
for i in range ( n ) :
    ans = max ( gcd ( left [ i ] , right [ i + 1 ] ) , ans )
print ( ans )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
12 15 18

Expected output:
6


```
def gcd ( a : int , b : int ) -> int :
    if b == 0 :
        return a
    return gcd ( b , a % b )
def ruiseki_lr ( array ) :
    op = lambda a , b : gcd ( a , b )
    e = 0
    n = len ( array )
    left = [ e ] * ( n + 1 )
    right = [ e ] * ( n + 1 )
    for i in range ( n ) :
        left [ i + 1 ] = op ( left [ i ] , array [ i ] )
    for i in reversed ( range ( n ) ) :
        right [ i ] = op ( right [ i + 1 ] , array [ i ] )
    return left , right
n = int ( input ( ) )
a = list ( map ( int , input ( ).split ( ) ) )
left , right = ruiseki_lr ( a )
ans = 0
for i in range ( n ) :
    ans = max ( gcd ( left [ i ] , right [ i + 1 ] ) , ans )
print ( ans )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
12 15 18

Expected output:
6


```
def gcd ( a : int , b : int ) -> int :
    if b == 0 :
        return a
    return gcd ( b , a % b )
def ruiseki_lr ( array ) :
    op = lambda a , b : gcd ( a , b )
    e = 0
    n = len ( array )
    left = [ e ] * ( n + 1 )
    right = [ e ] * ( n + 1 )
    for i in range ( n ) :
        left [ i + 1 ] = op ( left [ i ] , array [ i ] )
    for i in reversed ( range ( n ) ) :
        right [ i ] = op ( right [ i + 1 ] , array [ i ] )
    return left , right
n = int ( input ( ) )
a = list ( map ( int , input ( ).split ( ) ) )
left , right = ruiseki_lr ( a )
ans = 0
for i in range ( n ) :
    ans = max ( gcd ( left [ i ] , right [ i + 1 ] ) , ans )
print ( ans )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
12 15 18

Expected output:
6


```
def gcd ( a : int , b : int ) -> int :
    if b == 0 :
        return a
    return gcd ( b , a % b )
def ruiseki_lr ( array ) :
    op = lambda a , b : gcd ( a , b )
    e = 0
    n = len ( array )
    left = [ e ] * ( n + 1 )
    right = [ e ] * ( n + 1 )
    for i in range ( n ) :
        left [ i + 1 ] = op ( left [ i ] , array [ i ] )
    for i in reversed ( range ( n ) ) :
        right [ i ] = op ( right [ i + 1 ] , array [ i ] )
    return left , right
n = int ( input ( ) )
a = list ( map ( int , input ( ).split ( ) ) )
left , right = ruiseki_lr ( a )
ans = 0
for i in range ( n ) :
    ans = max ( gcd ( left [ i ] , right [ i + 1 ] ) , ans )
print ( ans )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
12 15 18

Expected output:
6


```
def gcd ( a : int , b : int ) -> int :
    if b == 0 :
        return a
    return gcd ( b , a % b )
def ruiseki_lr ( array ) :
    op = lambda a , b : gcd ( a , b )
    e = 0
    n = len ( array )
    left = [ e ]
