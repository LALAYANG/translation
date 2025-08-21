
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3 3
1 2
1 3
2 3

Expected output:
1

```
def readInts ( ) : return map ( int , input ( ).split ( ) )
def dfs ( g , seen , i ) :
    if i in seen :
        return 0 , 0
    seen.add ( i )
    nodes = 1
    edges = len ( g [ i ] )
    for j in g [ i ] :
        x , y = dfs ( g , seen , j )
        nodes += x
        edges += y
    return nodes , edges
def solve ( ) :
    line0 = [ ]
    try : line0 = readInts ( )
    except EOFError : return False
    n , m = line0
    g = { }
    seen = set ( )
    for i in range ( 1 , n + 1 ) :
        g [ i ] = set ( )
    for _ in range ( m ) :
        a , b = readInts ( )
        g [ a ].add ( b )
        g [ b ].add ( a )
    ans = 0
    for i in range ( 1 , n + 1 ) :
        if i not in seen :
            nodes , edges = dfs ( g , seen , i )
            if nodes > 1 and nodes % 2 == 1 and 2 * nodes == edges :
                ans += 1
    if ( n - ans ) % 2 == 1 :
        ans += 1
    print ( ans )
    return True
while solve ( ) : pass


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3 3
1 2
1 3
2 3

Expected output:
1

```
def readInts ( ) : return map ( int , input ( ).split ( ) )
def dfs ( g , seen , i ) :
    if i in seen :
        return 0 , 0
    seen.add ( i )
    nodes = 1
    edges = len ( g [ i ] )
    for j in g [ i ] :
        x , y = dfs ( g , seen , j )
        nodes += x
        edges += y
    return nodes , edges
def solve ( ) :
    line0 = [ ]
    try : line0 = readInts ( )
    except EOFError : return False
    n , m = line0
    g = { }
    seen = set ( )
    for i in range ( 1 , n + 1 ) :
        g [ i ] = set ( )
    for _ in range ( m ) :
        a , b = readInts ( )
        g [ a ].add ( b )
        g [ b ].add ( a )
    ans = 0
    for i in range ( 1 , n + 1 ) :
        if i not in seen :
            nodes , edges = dfs ( g , seen , i )
            if nodes > 1 and nodes % 2 == 1 and 2 * nodes == edges :
                ans += 1
    if ( n - ans ) % 2 == 1 :
        ans += 1
    print ( ans )
    return True
while solve ( ) : pass


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3 3
1 2
1 3
2 3

Expected output:
1

```
def readInts ( ) : return map ( int , input ( ).split ( ) )
def dfs ( g , seen , i ) :
    if i in seen :
        return 0 , 0
    seen.add ( i )
    nodes = 1
    edges = len ( g [ i ] )
    for j in g [ i ] :
        x , y = dfs ( g , seen , j )
        nodes += x
        edges += y
    return nodes , edges
def solve ( ) :
    line0 = [ ]
    try : line0 = readInts ( )
    except EOFError : return False
    n , m = line0
    g = { }
    seen = set ( )
    for i in range ( 1 , n + 1 ) :
        g [ i ] = set ( )
    for _ in range ( m ) :
        a , b = readInts ( )
        g [ a ].add ( b )
        g [ b ].add ( a )
    ans = 0
    for i in range ( 1 , n + 1 ) :
        if i not in seen :
            nodes , edges = dfs ( g , seen , i )
            if nodes > 1 and nodes % 2 == 1 and 2 * nodes == edges :
                ans += 1
    if ( n - ans ) % 2 == 1 :
        ans += 1
    print ( ans )
    return True
while solve ( ) : pass


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3 3
1 2
1 3
2 3

Expected output:
1

```
def readInts ( ) : return map ( int , input ( ).split ( ) )
def dfs ( g , seen , i ) :
    if i in seen :
        return 0 , 0
    seen.add ( i )
    nodes = 1
    edges = len ( g [ i ] )
    for j in g [ i ] :
        x , y = dfs ( g , seen , j )
        nodes += x
        edges += y
    return nodes , edges
def solve ( ) :
    line0 = [ ]
    try : line0 = readInts ( )
    except EOFError : return False
    n , m = line0
    g = { }
    seen = set ( )
    for i in range ( 1 , n + 1 ) :
        g [ i ] = set ( )
    for _ in range ( m ) :
        a , b = readInts ( )
        g [ a ].add ( b )
        g [ b ].add ( a )
    ans = 0
    for i in range ( 1 , n + 1 ) :
        if i not in seen :
            nodes , edges = dfs ( g , seen , i )
            if nodes > 1 and nodes % 2 == 1 and 2 * nodes == edges :
                ans += 1
    if ( n - ans ) % 2 == 1 :
        ans += 1
    print ( ans )
    return True
while solve ( ) : pass


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3 3
1 2
1 3
2 3

Expected output:
1

```
def readInts ( ) : return map ( int , input ( ).split ( ) )
def dfs ( g , seen , i ) :
    if i in seen :
        return 0 , 0
    seen.add ( i )
    nodes = 1
    edges = len ( g [ i ] )
    for j in g [ i ] :
        x , y = dfs ( g , seen , j )
        nodes += x
        edges += y
    return nodes , edges
def solve ( ) :
    line0 = [ ]
    try : line0 = readInts ( )
    except EOFError : return False
    n , m = line0
    g = { }
    seen = set ( )
    for i in range ( 1 , n + 1 ) :
        g [ i ] = set ( )
    for _ in range ( m ) :
        a , b = readInts ( )
        g [ a ].add ( b )
        g [ b ].add ( a )
    ans = 0
    for i in range ( 1 , n + 1 ) :
        if i not in seen :
            nodes , edges = dfs ( g , seen , i )
            if nodes > 1 and nodes % 2 == 1 and 2 * nodes == edges :
                ans += 1
    if ( n - ans ) % 2 == 1 :
        ans += 1
    print ( ans )
    return True
while solve ( ) : pass


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3 3
1 2
1 3
2 3

Expected output:
1

```
def readInts ( ) : return map ( int , input ( ).split ( ) )
def dfs ( g , seen , i ) :
    if i in seen :
        return 0 , 0
    seen.add ( i )
    nodes = 1
    edges = len ( g [ i ] )
    for j in g [ i ] :
        x , y = dfs ( g , seen , j )
        nodes += x
        edges += y
    return nodes , edges
def solve ( ) :
    line0 = [ ]
    try : line0 = readInts ( )
    except EOFError : return False
    n , m = line0
    g = { }
    seen = set ( )
    for i in range ( 1 , n + 1 ) :
        g [ i ] = set ( )
    for _ in range ( m ) :
        a , b = readInts ( )
        g [ a ].add ( b )
        g [ b ].add ( a )
    ans = 0
    for i in range ( 1 , n + 1 ) :
        if i not in seen :
            nodes , edges = dfs ( g , seen , i )
            if nodes > 1 and nodes % 2 == 1 and 2 * nodes == edges :
                ans += 1
    if ( n - ans ) % 2 == 1 :
        ans += 1
    print ( ans )
    return True
while solve ( ) : pass


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3 3
1 2
1 3
2 3

Expected output:
1

```
def readInts ( ) : return map ( int , input ( ).split ( ) )
def dfs ( g , seen , i ) :
    if i in seen :
        return 0 , 0
    seen.add ( i )
    nodes = 1
    edges = len ( g [ i ] )
    for j in g [ i ] :
        x , y = dfs ( g , seen , j )
        nodes += x
        edges += y
    return nodes , edges
def solve ( ) :
    line0 = [ ]
    try : line0 = readInts ( )
    except EOFError : return False
    n , m = line0
    g = { }
    seen = set ( )
    for i in range ( 1 , n + 1 ) :
        g [ i ] = set ( )
    for _ in range ( m ) :
        a , b = readInts ( )
        g [ a ].add ( b )
        g [ b ].add ( a )
    ans = 0
    for i in range ( 1 , n + 1 ) :
        if i not in seen :
            nodes , edges = dfs ( g , seen , i )
            if nodes > 1 and nodes % 2 == 1 and 2 * nodes == edges :
                ans += 1
    if ( n - ans ) % 2 == 1 :
        ans += 1
    print ( ans )
    return True
while solve ( ) : pass


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3 3
1 2
1 3
2 3

Expected output:
1

```
def readInts ( ) : return map ( int , input ( ).split ( ) )
def dfs ( g , seen , i ) :
    if i in seen :
        return 0 , 0
    seen.add ( i )
    nodes = 1
    edges = len ( g [ i ] )
    for j in g [ i ] :
        x , y = dfs ( g , seen , j )
        nodes += x
        edges += y
    return nodes , edges
def solve ( ) :
    line0 = [ ]
    try : line0 = readInts ( )
    except EOFError : return False
    n , m = line0
    g = { }
    seen = set ( )
    for i in range ( 1 , n + 1 ) :
        g [ i ] = set ( )
    for _ in range ( m ) :
        a , b = readInts ( )
        g [ a ].add ( b )
        g [ b ].add ( a )
    ans = 0
    for i in range ( 1 , n + 1 ) :
        if i not in seen :
            nodes , edges = dfs ( g , seen , i )
            if nodes > 1 and nodes % 2 == 1 and 2 * nodes == edges :
                ans += 1
    if ( n - ans ) % 2 == 1 :
        ans += 1
    print ( ans )
    return True
while solve ( ) : pass


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3 3
1 2
1 3
2 3

Expected output:
1

```
def readInts ( ) : return map ( int , input (
