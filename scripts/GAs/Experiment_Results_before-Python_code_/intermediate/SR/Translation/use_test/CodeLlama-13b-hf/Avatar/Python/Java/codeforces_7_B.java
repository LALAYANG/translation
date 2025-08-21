
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
42 98
defragment
defragment
defragment
defragment
defragment
alloc 5
alloc 66
defragment
erase 3
alloc 53
defragment
erase 4
erase 2
alloc 70
erase 3
defragment
defragment
erase 2
erase 3
erase -1327931832
alloc 93
alloc 64
erase 7
erase 6
erase 3
alloc 61
alloc 12
alloc 65
erase 2
alloc 46
erase 11
erase 9
erase 9
erase 6
alloc 2
alloc 78
defragment
erase 13
erase 6
erase 10
alloc 53
alloc 46

Expected output:
1
2
ILLEGAL_ERASE_ARGUMENT
NULL
ILLEGAL_ERASE_ARGUMENT
3
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
4
NULL
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
NULL
NULL
NULL
ILLEGAL_ERASE_ARGUMENT
NULL
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
NULL
NULL
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
NULL
NULL


```
t , m = map ( int , input ( ).split ( ) )
alocuente = [ 0 ] * m
ind = 1
for i in range ( t ) :
    op = input ( ).split ( )
    if op [ 0 ] == 'alloc' :
        pos = 0
        for j in range ( m ) :
            if alocuente [ j ] == 0 :
                pos += 1
                if pos == int ( op [ 1 ] ) :
                    alocuente [ j - int ( op [ 1 ] ) + 1 : j + 1 ] = [ ind ] * int ( op [ 1 ] )
                    print ( ind )
                    ind += 1
                    break
            else :
                pos = 0
        else :
            print ( "NULL" )
    if op [ 0 ] == 'erase' :
        pos = 0
        if int ( op [ 1 ] ) not in alocuente or int ( op [ 1 ] ) == 0 :
            print ( 'ILLEGAL_ERASE_ARGUMENT' )
        else :
            for j in range ( m ) :
                if int ( op [ 1 ] ) > 0 and alocuente [ j ] == int ( op [ 1 ] ) :
                    alocuente [ j ] = 0
    if op [ 0 ] == "defragment" :
        cnt = 0
        cnt = alocuente.count ( 0 )
        alocuente = [ j for j in alocuente if j != 0 ]
        for j in range ( cnt ) :
            alocuente.append ( 0 )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
42 98
defragment
defragment
defragment
defragment
defragment
alloc 5
alloc 66
defragment
erase 3
alloc 53
defragment
erase 4
erase 2
alloc 70
erase 3
defragment
defragment
erase 2
erase 3
erase -1327931832
alloc 93
alloc 64
erase 7
erase 6
erase 3
alloc 61
alloc 12
alloc 65
erase 2
alloc 46
erase 11
erase 9
erase 9
erase 6
alloc 2
alloc 78
defragment
erase 13
erase 6
erase 10
alloc 53
alloc 46

Expected output:
1
2
ILLEGAL_ERASE_ARGUMENT
NULL
ILLEGAL_ERASE_ARGUMENT
3
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
4
NULL
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
NULL
NULL
NULL
ILLEGAL_ERASE_ARGUMENT
NULL
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
NULL
NULL
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
NULL
NULL


```
t , m = map ( int , input ( ).split ( ) )
alocuente = [ 0 ] * m
ind = 1
for i in range ( t ) :
    op = input ( ).split ( )
    if op [ 0 ] == 'alloc' :
        pos = 0
        for j in range ( m ) :
            if alocuente [ j ] == 0 :
                pos += 1
                if pos == int ( op [ 1 ] ) :
                    alocuente [ j - int ( op [ 1 ] ) + 1 : j + 1 ] = [ ind ] * int ( op [ 1 ] )
                    print ( ind )
                    ind += 1
                    break
            else :
                pos = 0
        else :
            print ( "NULL" )
    if op [ 0 ] == 'erase' :
        pos = 0
        if int ( op [ 1 ] ) not in alocuente or int ( op [ 1 ] ) == 0 :
            print ( 'ILLEGAL_ERASE_ARGUMENT' )
        else :
            for j in range ( m ) :
                if int ( op [ 1 ] ) > 0 and alocuente [ j ] == int ( op [ 1 ] ) :
                    alocuente [ j ] = 0
    if op [ 0 ] == "defragment" :
        cnt = 0
        cnt = alocuente.count ( 0 )
        alocuente = [ j for j in alocuente if j != 0 ]
        for j in range ( cnt ) :
            alocuente.append ( 0 )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
42 98
defragment
defragment
defragment
defragment
defragment
alloc 5
alloc 66
defragment
erase 3
alloc 53
defragment
erase 4
erase 2
alloc 70
erase 3
defragment
defragment
erase 2
erase 3
erase -1327931832
alloc 93
alloc 64
erase 7
erase 6
erase 3
alloc 61
alloc 12
alloc 65
erase 2
alloc 46
erase 11
erase 9
erase 9
erase 6
alloc 2
alloc 78
defragment
erase 13
erase 6
erase 10
alloc 53
alloc 46

Expected output:
1
2
ILLEGAL_ERASE_ARGUMENT
NULL
ILLEGAL_ERASE_ARGUMENT
3
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
4
NULL
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
NULL
NULL
NULL
ILLEGAL_ERASE_ARGUMENT
NULL
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
NULL
NULL
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
NULL
NULL


```
t , m = map ( int , input ( ).split ( ) )
alocuente = [ 0 ] * m
ind = 1
for i in range ( t ) :
    op = input ( ).split ( )
    if op [ 0 ] == 'alloc' :
        pos = 0
        for j in range ( m ) :
            if alocuente [ j ] == 0 :
                pos += 1
                if pos == int ( op [ 1 ] ) :
                    alocuente [ j - int ( op [ 1 ] ) + 1 : j + 1 ] = [ ind ] * int ( op [ 1 ] )
                    print ( ind )
                    ind += 1
                    break
            else :
                pos = 0
        else :
            print ( "NULL" )
    if op [ 0 ] == 'erase' :
        pos = 0
        if int ( op [ 1 ] ) not in alocuente or int ( op [ 1 ] ) == 0 :
            print ( 'ILLEGAL_ERASE_ARGUMENT' )
        else :
            for j in range ( m ) :
                if int ( op [ 1 ] ) > 0 and alocuente [ j ] == int ( op [ 1 ] ) :
                    alocuente [ j ] = 0
    if op [ 0 ] == "defragment" :
        cnt = 0
        cnt = alocuente.count ( 0 )
        alocuente = [ j for j in alocuente if j != 0 ]
        for j in range ( cnt ) :
            alocuente.append ( 0 )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
42 98
defragment
defragment
defragment
defragment
defragment
alloc 5
alloc 66
defragment
erase 3
alloc 53
defragment
erase 4
erase 2
alloc 70
erase 3
defragment
defragment
erase 2
erase 3
erase -1327931832
alloc 93
alloc 64
erase 7
erase 6
erase 3
alloc 61
alloc 12
alloc 65
erase 2
alloc 46
erase 11
erase 9
erase 9
erase 6
alloc 2
alloc 78
defragment
erase 13
erase 6
erase 10
alloc 53
alloc 46

Expected output:
1
2
ILLEGAL_ERASE_ARGUMENT
NULL
ILLEGAL_ERASE_ARGUMENT
3
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
4
NULL
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
NULL
NULL
NULL
ILLEGAL_ERASE
