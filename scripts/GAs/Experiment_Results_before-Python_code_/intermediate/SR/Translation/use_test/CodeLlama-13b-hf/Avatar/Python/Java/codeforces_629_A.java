
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
17
CCC..C.C....C.C.C
.C.CC.CC...CC..C.
.CCCC.CC.C..CCC.C
...CCC.CC.CCC.C.C
CCCCCCCC..C.CC.CC
...C..C....C.CC.C
CC....CCC...C.CC.
.CC.C.CC..C......
.CCCCC.C.CC.CCCCC
..CCCC...C..CC..C
C.CC.C.CC..C.C.C.
C..C..C..CCC.C...
.C..CCCC..C......
.CC.C...C..CC.CC.
C..C....CC...CC..
C.CC.CC..C.C..C..
CCCC...C.C..CCCC.

Expected output:
1160


```
n = int ( input ( ) )
cake = [ ]
happiness = 0
chocCount = 0
nfat = 1
for i in range ( n ) :
    line = str ( input ( ) )
    cake.append ( line )
    for j in line :
        if ( j == 'C' ) :
            chocCount += 1
    if ( chocCount > 1 ) :
        for i in range ( chocCount , chocCount - 2 , - 1 ) :
            nfat *= i
        happiness += nfat / 2
    nfat = 1
    chocCount = 0
posCount = 0
for j in range ( n ) :
    for i in range ( n ) :
        if ( cake [ i ] [ j ] == 'C' ) :
            chocCount += 1
    if ( chocCount > 1 ) :
        for i in range ( chocCount , chocCount - 2 , - 1 ) :
            nfat *= i
        happiness += nfat / 2
    nfat = 1
    chocCount = 0
print ( int ( happiness ) )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
17
CCC..C.C....C.C.C
.C.CC.CC...CC..C.
.CCCC.CC.C..CCC.C
...CCC.CC.CCC.C.C
CCCCCCCC..C.CC.CC
...C..C....C.CC.C
CC....CCC...C.CC.
.CC.C.CC..C......
.CCCCC.C.CC.CCCCC
..CCCC...C..CC..C
C.CC.C.CC..C.C.C.
C..C..C..CCC.C...
.C..CCCC..C......
.CC.C...C..CC.CC.
C..C....CC...CC..
C.CC.CC..C.C..C..
CCCC...C.C..CCCC.

Expected output:
1160


```
n = int ( input ( ) )
cake = [ ]
happiness = 0
chocCount = 0
nfat = 1
for i in range ( n ) :
    line = str ( input ( ) )
    cake.append ( line )
    for j in line :
        if ( j == 'C' ) :
            chocCount += 1
    if ( chocCount > 1 ) :
        for i in range ( chocCount , chocCount - 2 , - 1 ) :
            nfat *= i
        happiness += nfat / 2
    nfat = 1
    chocCount = 0
posCount = 0
for j in range ( n ) :
    for i in range ( n ) :
        if ( cake [ i ] [ j ] == 'C' ) :
            chocCount += 1
    if ( chocCount > 1 ) :
        for i in range ( chocCount , chocCount - 2 , - 1 ) :
            nfat *= i
        happiness += nfat / 2
    nfat = 1
    chocCount = 0
print ( int ( happiness ) )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
17
CCC..C.C....C.C.C
.C.CC.CC...CC..C.
.CCCC.CC.C..CCC.C
...CCC.CC.CCC.C.C
CCCCCCCC..C.CC.CC
...C..C....C.CC.C
CC....CCC...C.CC.
.CC.C.CC..C......
.CCCCC.C.CC.CCCCC
..CCCC...C..CC..C
C.CC.C.CC..C.C.C.
C..C..C..CCC.C...
.C..CCCC..C......
.CC.C...C..CC.CC.
C..C....CC...CC..
C.CC.CC..C.C..C..
CCCC...C.C..CCCC.

Expected output:
1160


```
n = int ( input ( ) )
cake = [ ]
happiness = 0
chocCount = 0
nfat = 1
for i in range ( n ) :
    line = str ( input ( ) )
    cake.append ( line )
    for j in line :
        if ( j == 'C' ) :
            chocCount += 1
    if ( chocCount > 1 ) :
        for i in range ( chocCount , chocCount - 2 , - 1 ) :
            nfat *= i
        happiness += nfat / 2
    nfat = 1
    chocCount = 0
posCount = 0
for j in range ( n ) :
    for i in range ( n ) :
        if ( cake [ i ] [ j ] == 'C' ) :
            chocCount += 1
    if ( chocCount > 1 ) :
        for i in range ( chocCount , chocCount - 2 , - 1 ) :
            nfat *= i
        happiness += nfat / 2
    nfat = 1
    chocCount = 0
print ( int ( happiness ) )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
17
CCC..C.C....C.C.C
.C.CC.CC...CC..C.
.CCCC.CC.C..CCC.C
...CCC.CC.CCC.C.C
CCCCCCCC..C.CC.CC
...C..C....C.CC.C
CC....CCC...C.CC.
.CC.C.CC..C......
.CCCCC.C.CC.CCCCC
..CCCC...C..CC..C
C.CC.C.CC..C.C.C.
C..C..C..CCC.C...
.C..CCCC..C......
.CC.C...C..CC.CC.
C..C....CC...CC..
C.CC.CC..C.C..C..
CCCC...C.C..CCCC.

Expected output:
1160


```
n = int ( input ( ) )
cake = [ ]
happiness = 0
chocCount = 0
nfat = 1
for i in range ( n ) :
    line = str ( input ( ) )
    cake.append ( line )
    for j in line :
        if ( j == 'C' ) :
            chocCount += 1
    if ( chocCount > 1 ) :
        for i in range ( chocCount , chocCount - 2 , - 1 ) :
            nfat *= i
        happiness += nfat / 2
    nfat = 1
    chocCount = 0
posCount = 0
for j in range ( n ) :
    for i in range ( n ) :
        if ( cake [ i ] [ j ] == 'C' ) :
            chocCount += 1
    if ( chocCount > 1 ) :
        for i in range ( chocCount , chocCount - 2 , - 1 ) :
            nfat *= i
        happiness += nfat / 2
    nfat = 1
    chocCount = 0
print ( int ( happiness ) )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
17
CCC..C.C....C.C.C
.C.CC.CC...CC..C.
.CCCC.CC.C..CCC.C
...CCC.CC.CCC.C.C
CCCCCCCC..C.CC.CC
...C..C....C.CC.C
CC....CCC...C.CC.
.CC.C.CC..C......
.CCCCC.C.CC.CCCCC
..CCCC...C..CC..C
C.CC.C.CC..C.C.C.
C..C..C..CCC.C...
.C..CCCC..C......
.CC.C...C..CC.CC.
C..C....CC...CC..
C.CC.CC..C.C..C..
CCCC...C.C..CCCC.

Expected output:
1160


```
n = int ( input ( ) )
cake = [ ]
happiness = 0
chocCount = 0
nfat = 1
for i in range ( n ) :
    line = str ( input ( ) )
    cake.append ( line )
    for j in line :
        if ( j == 'C' ) :
            chocCount += 1
    if ( chocCount > 1 ) :
        for i in range ( chocCount , chocCount - 2 , - 1 ) :
            nfat *= i
        happiness += nfat / 2
    nfat = 1
    chocCount = 0
posCount = 0
for j in range ( n ) :
    for i in range ( n ) :
        if ( cake [ i ] [ j ] == 'C' ) :
            chocCount += 1
    if ( chocCount > 1 ) :
        for i in range ( chocCount , chocCount - 2 , - 1 ) :
            nfat *= i
        happiness += nfat / 2
    nfat = 1
    chocCount = 0
print ( int ( happiness ) )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
17
CCC..C.C....C.C.C
.C.CC.CC...CC..C.
.CCCC.CC.C..CCC.C
...CCC.CC.CCC.C.C
CCCCCCCC..C.CC.CC
...C..C....C.CC.C
CC....CCC...C.CC.
.CC.C.CC..C......
.CCCCC.C.CC.CCCCC
..CCCC...C..CC..C
C.CC.C.CC..C.C.C.
C..C..C..CCC.C...
.C..CCCC..C......
.CC.C...C..CC.CC.
C..C....CC...CC..
C.CC.CC..C.C..C..
CCCC...C.C..CCCC.

Expected output:
1160


```
n = int ( input ( ) )
cake = [ ]
happiness = 0
chocCount = 0
nfat = 1
for i in range ( n ) :
    line = str ( input ( ) )
    cake.append ( line )
    for j in line :
        if ( j == 'C' ) :
            chocCount += 1
    if ( chocCount > 1 ) :
        for i in range ( chocCount , chocCount - 2 , - 1 ) :
            nfat *= i
        happiness += nfat / 2
    nfat = 1
    chocCount = 0
posCount = 0
for j in range ( n ) :
    for i in range ( n ) :
        if ( cake [ i ] [ j ] == 'C' ) :
            chocCount += 1
    if ( chocCount > 1 ) :
        for i in range ( chocCount , chocCount - 2 , - 1 ) :
            nfat *= i
        happiness += nfat / 2
    nfat = 1
    chocCount = 0
print ( int ( happiness ) )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
17
CCC..C.C....C.C.C
.C.CC.CC...CC..C.
.CCCC.CC
