
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 1280600
59 337600
25 140500
50 276000
52 281900
100 532200
88 459600
60 307300
28 140700
41 201800
93 448400

Expected output:
220


```
D , G = map ( int , input ( ).split ( ) )
PC = [ tuple ( map ( int , input ( ).split ( ) ) ) for _ in range ( D ) ]
ans = 10 ** 9
for i in range ( 2 ** D ) :
    score = 0
    problem = 0
    for j in range ( D ) :
        if ( i >> j ) & 1 :
            score += 100 * ( j + 1 ) * PC [ j ] [ 0 ] + PC [ j ] [ 1 ]
            problem += PC [ j ] [ 0 ]
    if score > G :
        continue
    left = G - score
    for j in range ( D ) :
        if ( i >> j ) & 1 :
            continue
        if left > 100 * ( j + 1 ) * PC [ j ] [ 0 ] + PC [ j ] [ 1 ] :
            pass
        else :
            tmp = ( left + ( 100 * ( j + 1 ) ) - 1 ) // ( 100 * ( j + 1 ) )
            ans = min ( ans , problem + min ( tmp , PC [ j ] [ 0 ] ) )
print ( ans )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 1280600
59 337600
25 140500
50 276000
52 281900
100 532200
88 459600
60 307300
28 140700
41 201800
93 448400

Expected output:
220


```
D , G = map ( int , input ( ).split ( ) )
PC = [ tuple ( map ( int , input ( ).split ( ) ) ) for _ in range ( D ) ]
ans = 10 ** 9
for i in range ( 2 ** D ) :
    score = 0
    problem = 0
    for j in range ( D ) :
        if ( i >> j ) & 1 :
            score += 100 * ( j + 1 ) * PC [ j ] [ 0 ] + PC [ j ] [ 1 ]
            problem += PC [ j ] [ 0 ]
    if score > G :
        continue
    left = G - score
    for j in range ( D ) :
        if ( i >> j ) & 1 :
            continue
        if left > 100 * ( j + 1 ) * PC [ j ] [ 0 ] + PC [ j ] [ 1 ] :
            pass
        else :
            tmp = ( left + ( 100 * ( j + 1 ) ) - 1 ) // ( 100 * ( j + 1 ) )
            ans = min ( ans , problem + min ( tmp , PC [ j ] [ 0 ] ) )
print ( ans )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 1280600
59 337600
25 140500
50 276000
52 281900
100 532200
88 459600
60 307300
28 140700
41 201800
93 448400

Expected output:
220


```
D , G = map ( int , input ( ).split ( ) )
PC = [ tuple ( map ( int , input ( ).split ( ) ) ) for _ in range ( D ) ]
ans = 10 ** 9
for i in range ( 2 ** D ) :
    score = 0
    problem = 0
    for j in range ( D ) :
        if ( i >> j ) & 1 :
            score += 100 * ( j + 1 ) * PC [ j ] [ 0 ] + PC [ j ] [ 1 ]
            problem += PC [ j ] [ 0 ]
    if score > G :
        continue
    left = G - score
    for j in range ( D ) :
        if ( i >> j ) & 1 :
            continue
        if left > 100 * ( j + 1 ) * PC [ j ] [ 0 ] + PC [ j ] [ 1 ] :
            pass
        else :
            tmp = ( left + ( 100 * ( j + 1 ) ) - 1 ) // ( 100 * ( j + 1 ) )
            ans = min ( ans , problem + min ( tmp , PC [ j ] [ 0 ] ) )
print ( ans )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 1280600
59 337600
25 140500
50 276000
52 281900
100 532200
88 459600
60 307300
28 140700
41 201800
93 448400

Expected output:
220


```
D , G = map ( int , input ( ).split ( ) )
PC = [ tuple ( map ( int , input ( ).split ( ) ) ) for _ in range ( D ) ]
ans = 10 ** 9
for i in range ( 2 ** D ) :
    score = 0
    problem = 0
    for j in range ( D ) :
        if ( i >> j ) & 1 :
            score += 100 * ( j + 1 ) * PC [ j ] [ 0 ] + PC [ j ] [ 1 ]
            problem += PC [ j ] [ 0 ]
    if score > G :
        continue
    left = G - score
    for j in range ( D ) :
        if ( i >> j ) & 1 :
            continue
        if left > 100 * ( j + 1 ) * PC [ j ] [ 0 ] + PC [ j ] [ 1 ] :
            pass
        else :
            tmp = ( left + ( 100 * ( j + 1 ) ) - 1 ) // ( 100 * ( j + 1 ) )
            ans = min ( ans , problem + min ( tmp , PC [ j ] [ 0 ] ) )
print ( ans )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 1280600
59 337600
25 140500
50 276000
52 281900
100 532200
88 459600
60 307300
28 140700
41 201800
93 448400

Expected output:
220


```
D , G = map ( int , input ( ).split ( ) )
PC = [ tuple ( map ( int , input ( ).split ( ) ) ) for _ in range ( D ) ]
ans = 10 ** 9
for i in range ( 2 ** D ) :
    score = 0
    problem = 0
    for j in range ( D ) :
        if ( i >> j ) & 1 :
            score += 100 * ( j + 1 ) * PC [ j ] [ 0 ] + PC [ j ] [ 1 ]
            problem += PC [ j ] [ 0 ]
    if score > G :
        continue
    left = G - score
    for j in range ( D ) :
        if ( i >> j ) & 1 :
            continue
        if left > 100 * ( j + 1 ) * PC [ j ] [ 0 ] + PC [ j ] [ 1 ] :
            pass
        else :
            tmp = ( left + ( 100 * ( j + 1 ) ) - 1 ) // ( 100 * ( j + 1 ) )
            ans = min ( ans , problem + min ( tmp , PC [ j ] [ 0 ] ) )
print ( ans )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 1280600
59 337600
25 140500
50 276000
52 281900
100 532200
88 459600
60 307300
28 140700
41 201800
93 448400

Expected output:
220


```
D , G = map ( int , input ( ).split ( ) )
PC = [ tuple ( map ( int , input ( ).split ( ) ) ) for _ in range ( D ) ]
ans = 10 ** 9
for i in range ( 2 ** D ) :
    score = 0
    problem = 0
    for j in range ( D ) :
        if ( i >> j ) & 1 :
            score += 100 * ( j + 1 ) * PC [ j ] [ 0 ] + PC [ j ] [ 1 ]
            problem += PC [ j ] [ 0 ]
    if score > G :
        continue
    left = G - score
    for j in range ( D ) :
        if ( i >> j ) & 1 :
            continue
        if left > 100 * ( j + 1 ) * PC [ j ] [ 0 ] + PC [ j ] [ 1 ] :
            pass
        else :
            tmp = ( left + ( 100 * ( j + 1 ) ) - 1 ) // ( 100 * ( j + 1 ) )
            ans = min ( ans , problem + min ( tmp , PC [ j ] [ 0 ] ) )
print ( ans )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 1280600
59 337600
25 140500
50 276000
52 281900
100 532200
88 459600
60 307300
28 140700
41 201800
93 448400

Expected output:
220


```
D , G = map ( int , input ( ).split ( ) )
PC = [ tuple ( map ( int , input ( ).split ( ) ) ) for _ in range ( D ) ]
ans = 10 ** 9
for i in range ( 2 ** D ) :
    score = 0
    problem = 0
    for j in range ( D ) :
        if ( i >> j ) & 1 :
            score += 100 * ( j + 1 ) * PC [ j ] [ 0 ] + PC [ j ] [ 1 ]
            problem += PC [ j ] [ 0 ]
    if score > G :
        continue
    left = G - score
    for j in range ( D ) :
        if ( i >> j ) & 1 :
            continue
        if left > 100 * ( j + 1 ) * PC [ j ] [ 0 ] + PC [ j ] [ 1 ] :
            pass
        else :
            tmp = ( left + ( 100 * ( j + 1 ) ) - 1 ) // ( 100 * ( j + 1 ) )
            ans = min ( ans , problem + min ( tmp , PC [ j ] [ 0 ] ) )
print ( ans )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 1280600
59 337600
25 140500
50 276000
52 281900
100 532200
88 459600
60 307300
28 140700
41 201800
93 448400

Expected output:
220


```
D , G = map ( int , input ( ).split ( ) )
