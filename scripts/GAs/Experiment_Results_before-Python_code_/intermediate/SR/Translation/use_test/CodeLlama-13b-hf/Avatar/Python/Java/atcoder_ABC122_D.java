
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
90

Expected output:
252858375


```
def ok ( last4 ) :
    for i in range ( 4 ) :
        t = list ( last4 )
        if i >= 1 :
            t [ i ] , t [ i - 1 ] = t [ i - 1 ] , t [ i ]
        if ''.join ( t ).count ( 'AGC' ) >= 1 :
            return False
    return True
def dfs ( cur , last3 ) :
    if last3 in memo [ cur ] :
        return memo [ cur ] [ last3 ]
    if cur == n :
        return 1
    ret = 0
    for c in "ACGT" :
        if ok ( last3 + c ) :
            ret = ( ret + dfs ( cur + 1 , last3 [ 1 : ] + c ) ) % mod
    memo [ cur ] [ last3 ] = ret
    return ret
n = int ( input ( ) )
mod = 10 ** 9 + 7
memo = [ { } for i in range ( n + 1 ) ]
print ( dfs ( 0 , 'TTT' ) )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
90

Expected output:
252858375


```
def ok ( last4 ) :
    for i in range ( 4 ) :
        t = list ( last4 )
        if i >= 1 :
            t [ i ] , t [ i - 1 ] = t [ i - 1 ] , t [ i ]
        if ''.join ( t ).count ( 'AGC' ) >= 1 :
            return False
    return True
def dfs ( cur , last3 ) :
    if last3 in memo [ cur ] :
        return memo [ cur ] [ last3 ]
    if cur == n :
        return 1
    ret = 0
    for c in "ACGT" :
        if ok ( last3 + c ) :
            ret = ( ret + dfs ( cur + 1 , last3 [ 1 : ] + c ) ) % mod
    memo [ cur ] [ last3 ] = ret
    return ret
n = int ( input ( ) )
mod = 10 ** 9 + 7
memo = [ { } for i in range ( n + 1 ) ]
print ( dfs ( 0 , 'TTT' ) )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
90

Expected output:
252858375


```
def ok ( last4 ) :
    for i in range ( 4 ) :
        t = list ( last4 )
        if i >= 1 :
            t [ i ] , t [ i - 1 ] = t [ i - 1 ] , t [ i ]
        if ''.join ( t ).count ( 'AGC' ) >= 1 :
            return False
    return True
def dfs ( cur , last3 ) :
    if last3 in memo [ cur ] :
        return memo [ cur ] [ last3 ]
    if cur == n :
        return 1
    ret = 0
    for c in "ACGT" :
        if ok ( last3 + c ) :
            ret = ( ret + dfs ( cur + 1 , last3 [ 1 : ] + c ) ) % mod
    memo [ cur ] [ last3 ] = ret
    return ret
n = int ( input ( ) )
mod = 10 ** 9 + 7
memo = [ { } for i in range ( n + 1 ) ]
print ( dfs ( 0 , 'TTT' ) )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
90

Expected output:
252858375


```
def ok ( last4 ) :
    for i in range ( 4 ) :
        t = list ( last4 )
        if i >= 1 :
            t [ i ] , t [ i - 1 ] = t [ i - 1 ] , t [ i ]
        if ''.join ( t ).count ( 'AGC' ) >= 1 :
            return False
    return True
def dfs ( cur , last3 ) :
    if last3 in memo [ cur ] :
        return memo [ cur ] [ last3 ]
    if cur == n :
        return 1
    ret = 0
    for c in "ACGT" :
        if ok ( last3 + c ) :
            ret = ( ret + dfs ( cur + 1 , last3 [ 1 : ] + c ) ) % mod
    memo [ cur ] [ last3 ] = ret
    return ret
n = int ( input ( ) )
mod = 10 ** 9 + 7
memo = [ { } for i in range ( n + 1 ) ]
print ( dfs ( 0 , 'TTT' ) )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
90

Expected output:
252858375


```
def ok ( last4 ) :
    for i in range ( 4 ) :
        t = list ( last4 )
        if i >= 1 :
            t [ i ] , t [ i - 1 ] = t [ i - 1 ] , t [ i ]
        if ''.join ( t ).count ( 'AGC' ) >= 1 :
            return False
    return True
def dfs ( cur , last3 ) :
    if last3 in memo [ cur ] :
        return memo [ cur ] [ last3 ]
    if cur == n :
        return 1
    ret = 0
    for c in "ACGT" :
        if ok ( last3 + c ) :
            ret = ( ret + dfs ( cur + 1 , last3 [ 1 : ] + c ) ) % mod
    memo [ cur ] [ last3 ] = ret
    return ret
n = int ( input ( ) )
mod = 10 ** 9 + 7
memo = [ { } for i in range ( n + 1 ) ]
print ( dfs ( 0 , 'TTT' ) )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
90

Expected output:
252858375


```
def ok ( last4 ) :
    for i in range ( 4 ) :
        t = list ( last4 )
        if i >= 1 :
            t [ i ] , t [ i - 1 ] = t [ i - 1 ] , t [ i ]
        if ''.join ( t ).count ( 'AGC' ) >= 1 :
            return False
    return True
def dfs ( cur , last3 ) :
    if last3 in memo [ cur ] :
        return memo [ cur ] [ last3 ]
    if cur == n :
        return 1
    ret = 0
    for c in "ACGT" :
        if ok ( last3 + c ) :
            ret = ( ret + dfs ( cur + 1 , last3 [ 1 : ] + c ) ) % mod
    memo [ cur ] [ last3 ] = ret
    return ret
n = int ( input ( ) )
mod = 10 ** 9 + 7
memo = [ { } for i in range ( n + 1 ) ]
print ( dfs ( 0 , 'TTT' ) )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
90

Expected output:
252858375


```
def ok ( last4 ) :
    for i in range ( 4 ) :
        t = list ( last4 )
        if i >= 1 :
            t [ i ] , t [ i - 1 ] = t [ i - 1 ] , t [ i ]
        if ''.join ( t ).count ( 'AGC' ) >= 1 :
            return False
    return True
def dfs ( cur , last3 ) :
    if last3 in memo [ cur ] :
        return memo [ cur ] [ last3 ]
    if cur == n :
        return 1
    ret = 0
    for c in "ACGT" :
        if ok ( last3 + c ) :
            ret = ( ret + dfs ( cur + 1 , last3 [ 1 : ] + c ) ) % mod
    memo [ cur ] [ last3 ] = ret
    return ret
n = int ( input ( ) )
mod = 10 ** 9 + 7
memo = [ { } for i in range ( n + 1 ) ]
print ( dfs ( 0 , 'TTT' ) )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
90

Expected output:
252858375


```
def ok ( last4 ) :
    for i in range ( 4 ) :
        t = list ( last4 )
        if i >= 1 :
            t [ i ] , t [ i - 1 ] = t [ i - 1 ] , t [ i ]
        if ''.join ( t ).count ( 'AGC' ) >= 1 :
            return False
    return True
def dfs ( cur , last3 ) :
    if last3 in memo [ cur ] :
        return memo [ cur ] [ last3 ]
    if cur == n :
        return 1
    ret = 0
    for c in "ACGT" :
        if ok ( last3 + c ) :
            ret = ( ret + dfs ( cur + 1 , last3 [ 1 : ] + c ) ) % mod
    memo [ cur ] [ last3 ] = ret
    return ret
n = int ( input ( ) )
mod = 10 ** 9 + 7
memo = [ { } for i in range ( n + 1 ) ]
print ( dfs ( 0 , 'TTT' ) )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
90

Expected output:
252858375


```
def ok ( last4 ) :
    for i in range ( 4 ) :
        t = list ( last4 )
        if i >= 1 :
            t [ i ] , t [ i - 1 ] = t [ i - 1 ] , t [ i ]
        if ''.join ( t ).count ( 'AGC' ) >= 1 :
            return False
    return True
def dfs ( cur , last3 ) :
    if last3 in memo [ cur ] :
        return memo [ cur ] [ last3 ]
    if cur == n :
        return 1
    ret = 0
    for c in "ACGT" :
        if ok ( last3 + c ) :
            ret = ( ret + dfs ( cur + 1 , last3 [ 1 : ] + c ) ) % mod
    memo [ cur ] [ last3 ] = ret
    return ret
n = int ( input ( ) )
mod = 10 ** 9 + 7
memo = [ { } for i in range ( n + 1 ) ]
print ( dfs ( 0 , 'TTT' ) )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
90

Expected output:
252858375


```
def ok ( last4 ) :
    for i in range ( 4 ) :
        t = list ( last4 )
        if i >= 1 :
            t [ i ] , t [ i - 1 ] = t [ i - 1 ] , t [ i ]
        if ''.join ( t ).count ( 'AGC' ) >= 1 :
            return False
    return True
def dfs ( cur , last3 ) :
    if last3 in memo [ cur ] :
        return memo [ cur ] [ last3 ]
    if cur == n :
        return 1
    ret = 0
    for c in "ACGT" :
        if ok ( last3 + c ) :
            ret = ( ret + dfs ( cur + 1 , last3 [ 1 : ] + c ) ) % mod
    memo [ cur ] [ last3 ] = ret
    return ret
n = int ( input ( ) )
mod = 10 ** 9 + 7
memo = [ { } for i in range ( n + 1 ) ]
print ( dfs ( 0 , 'TTT' ) )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
90

Expected output:
252858375


```
def ok ( last4 ) :
    for i in range ( 4 ) :
        t = list ( last4 )
        if i >= 1 :
            t [ i ] , t [ i - 1 ] = t [ i - 1 ] , t [ i ]
        if ''.join ( t ).count ( 'AGC' ) >= 1 :
            return False
    return True
def dfs ( cur , last3 ) :
    if last3 in memo
