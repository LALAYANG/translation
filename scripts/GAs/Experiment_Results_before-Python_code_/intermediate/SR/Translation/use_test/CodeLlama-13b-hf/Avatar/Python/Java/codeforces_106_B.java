
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2
2000 500 200 100
3000 600 100 200

Expected output:
1

```
n = int ( input ( ) )
input_array = [ ]
for i in range ( n ) :
    S , R , H , C = map ( int , input ( ).split ( ) )
    input_array.append ( ( S , R , H , C ) )
outdated = [ ]
for i in range ( n ) :
    for j in range ( n ) :
        if ( input_array [ i ] [ 0 ] < input_array [ j ] [ 0 ] and input_array [ i ] [ 1 ] < input_array [ j ] [ 1 ] and input_array [ i ] [ 2 ] < input_array [ j ] [ 2 ] ) :
            outdated.append ( input_array [ i ] )
outdated = set ( outdated )
minimum_cost = 100000
input_number = 0
for i in range ( n ) :
    current_item = input_array [ i ]
    cost = current_item [ 3 ]
    if ( current_item not in outdated and cost < minimum_cost ) :
        minimum_cost = current_item [ 3 ]
        input_number = i + 1
print ( input_number )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2
2000 500 200 100
3000 600 100 200

Expected output:
1

```
n = int ( input ( ) )
input_array = [ ]
for i in range ( n ) :
    S , R , H , C = map ( int , input ( ).split ( ) )
    input_array.append ( ( S , R , H , C ) )
outdated = [ ]
for i in range ( n ) :
    for j in range ( n ) :
        if ( input_array [ i ] [ 0 ] < input_array [ j ] [ 0 ] and input_array [ i ] [ 1 ] < input_array [ j ] [ 1 ] and input_array [ i ] [ 2 ] < input_array [ j ] [ 2 ] ) :
            outdated.append ( input_array [ i ] )
outdated = set ( outdated )
minimum_cost = 100000
input_number = 0
for i in range ( n ) :
    current_item = input_array [ i ]
    cost = current_item [ 3 ]
    if ( current_item not in outdated and cost < minimum_cost ) :
        minimum_cost = current_item [ 3 ]
        input_number = i + 1
print ( input_number )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2
2000 500 200 100
3000 600 100 200

Expected output:
1

```
n = int ( input ( ) )
input_array = [ ]
for i in range ( n ) :
    S , R , H , C = map ( int , input ( ).split ( ) )
    input_array.append ( ( S , R , H , C ) )
outdated = [ ]
for i in range ( n ) :
    for j in range ( n ) :
        if ( input_array [ i ] [ 0 ] < input_array [ j ] [ 0 ] and input_array [ i ] [ 1 ] < input_array [ j ] [ 1 ] and input_array [ i ] [ 2 ] < input_array [ j ] [ 2 ] ) :
            outdated.append ( input_array [ i ] )
outdated = set ( outdated )
minimum_cost = 100000
input_number = 0
for i in range ( n ) :
    current_item = input_array [ i ]
    cost = current_item [ 3 ]
    if ( current_item not in outdated and cost < minimum_cost ) :
        minimum_cost = current_item [ 3 ]
        input_number = i + 1
print ( input_number )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2
2000 500 200 100
3000 600 100 200

Expected output:
1

```
n = int ( input ( ) )
input_array = [ ]
for i in range ( n ) :
    S , R , H , C = map ( int , input ( ).split ( ) )
    input_array.append ( ( S , R , H , C ) )
outdated = [ ]
for i in range ( n ) :
    for j in range ( n ) :
        if ( input_array [ i ] [ 0 ] < input_array [ j ] [ 0 ] and input_array [ i ] [ 1 ] < input_array [ j ] [ 1 ] and input_array [ i ] [ 2 ] < input_array [ j ] [ 2 ] ) :
            outdated.append ( input_array [ i ] )
outdated = set ( outdated )
minimum_cost = 100000
input_number = 0
for i in range ( n ) :
    current_item = input_array [ i ]
    cost = current_item [ 3 ]
    if ( current_item not in outdated and cost < minimum_cost ) :
        minimum_cost = current_item [ 3 ]
        input_number = i + 1
print ( input_number )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2
2000 500 200 100
3000 600 100 200

Expected output:
1

```
n = int ( input ( ) )
input_array = [ ]
for i in range ( n ) :
    S , R , H , C = map ( int , input ( ).split ( ) )
    input_array.append ( ( S , R , H , C ) )
outdated = [ ]
for i in range ( n ) :
    for j in range ( n ) :
        if ( input_array [ i ] [ 0 ] < input_array [ j ] [ 0 ] and input_array [ i ] [ 1 ] < input_array [ j ] [ 1 ] and input_array [ i ] [ 2 ] < input_array [ j ] [ 2 ] ) :
            outdated.append ( input_array [ i ] )
outdated = set ( outdated )
minimum_cost = 100000
input_number = 0
for i in range ( n ) :
    current_item = input_array [ i ]
    cost = current_item [ 3 ]
    if ( current_item not in outdated and cost < minimum_cost ) :
        minimum_cost = current_item [ 3 ]
        input_number = i + 1
print ( input_number )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2
2000 500 200 100
3000 600 100 200

Expected output:
1

```
n = int ( input ( ) )
input_array = [ ]
for i in range ( n ) :
    S , R , H , C = map ( int , input ( ).split ( ) )
    input_array.append ( ( S , R , H , C ) )
outdated = [ ]
for i in range ( n ) :
    for j in range ( n ) :
        if ( input_array [ i ] [ 0 ] < input_array [ j ] [ 0 ] and input_array [ i ] [ 1 ] < input_array [ j ] [ 1 ] and input_array [ i ] [ 2 ] < input_array [ j ] [ 2 ] ) :
            outdated.append ( input_array [ i ] )
outdated = set ( outdated )
minimum_cost = 100000
input_number = 0
for i in range ( n ) :
    current_item = input_array [ i ]
    cost = current_item [ 3 ]
    if ( current_item not in outdated and cost < minimum_cost ) :
        minimum_cost = current_item [ 3 ]
        input_number = i + 1
print ( input_number )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2
2000 500 200 100
3000 600 100 200

Expected output:
1

```
n = int ( input ( ) )
input_array = [ ]
for i in range ( n ) :
    S , R , H , C = map ( int , input ( ).split ( ) )
    input_array.append ( ( S , R , H , C ) )
outdated = [ ]
for i in range ( n ) :
    for j in range ( n ) :
        if ( input_array [ i ] [ 0 ] < input_array [ j ] [ 0 ] and input_array [ i ] [ 1 ] < input_array [ j ] [ 1 ] and input_array [ i ] [ 2 ] < input_array [ j ] [ 2 ] ) :
            outdated.append ( input_array [ i ] )
outdated = set ( outdated )
minimum_cost = 100000
input_number = 0
for i in range ( n ) :
    current_item = input_array [ i ]
    cost = current_item [ 3 ]
    if ( current_item not in outdated and cost < minimum_cost ) :
        minimum_cost = current_item [ 3 ]
        input_number = i + 1
print ( input_number )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2
2000 500 200 100
3000 600 100 200

Expected output:
1

```
n = int ( input ( ) )
input_array = [ ]
for i in range ( n ) :
    S , R , H , C = map ( int , input ( ).split ( ) )
    input_array.append ( ( S , R , H , C ) )
outdated = [ ]
for i in range ( n ) :
    for j in range ( n ) :
        if ( input_array [ i ] [ 0 ] < input_array [ j ] [ 0 ] and input_array [ i ] [ 1 ] < input_array [ j ] [ 1 ] and input_array [ i ] [ 2 ] < input_array [ j ] [ 2 ] ) :
            outdated.append ( input_array [ i ] )
outdated = set ( outdated )
minimum_cost = 100000
input_number = 0
for i in range ( n ) :
    current_item = input_array [ i ]
    cost = current_item [ 3 ]
    if ( current_item not in outdated and cost < minimum_cost ) :
        minimum_cost = current_item [ 3 ]
        input_number = i + 1
print ( input_number )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2
2000 500 200 100
3000 600 100 200

Expected output:
1

```
n = int ( input ( ) )
input_array = [ ]
for i in range ( n ) :
    S , R , H , C = map ( int , input ( ).split ( ) )
    input_array.append ( ( S , R , H , C ) )
outdated = [ ]
for i in range ( n ) :
    for j in range ( n ) :
        if ( input_array [ i ] [ 0 ] < input_array [ j ] [ 0 ] and input_array [ i ] [ 1 ] < input_array [ j ] [ 1 ] and input_array [ i ] [ 2 ] < input_array [ j ] [ 2 ] ) :
            outdated.append ( input_array [ i ] )
outdated = set ( outdated )
minimum_cost = 100000
input_number = 0
for i in range ( n ) :
    current_item = input_array [ i ]
    cost = current_item [ 3 ]
    if ( current_item not in outdated and cost < minimum_cost ) :
        minimum_cost = current_item [ 3 ]
        input_number = i + 1
print ( input_number )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2
2000 500 200 100
3000 600 100 200

Expected output:
1

```

