
[ENG]
You are an expert Java programmer and assistant
<</ENG>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100000 100000
866074010 254688476 407269433 739939214 873531693 248936553 371463687 248187352 664544362 727605859 99769389 432354388 643004509 632032831 914634327 364150435 740928867 681265557 440372467 111388501 293757895 124020006 345086446 307529147 796702141 405306514 961414286 822927968 155654690 246254556 392296695 348718347 219347138 130888239 815361539 688217660 527272072 344169776 80925633 198421983 983631331 355627283 373717552 474190761 412289304 564070300 129676014 354805943 45435805
Expected output:
43252


```
( n , m ) = [ int ( x ) for x in input ( ).split ( ) ]
p = [ x for x in range ( 1 , n + 1 ) ]
h = [ int ( x ) for x in input ( ).split ( ) ]
hp = dict ( zip ( p , h ) )
path = { i : [ ] for i in range ( 1 , n + 1 ) }
for i in range ( m ) :
    ( a , b ) = [ int ( x ) for x in input ( ).split ( ) ]
    path [ a ].append ( b )
    path [ b ].append ( a )
c = 0
for i , v in path.items ( ) :
    f = 0
    for j in v :
        if hp [ i ] <= hp [ j ] :
            f = 1
            break
    if f == 0 :
        c += 1
print ( c )


```
[/ENG]

[PL]
Jesteś doświadczonym programistą w języku Java i asystentem
<</PL>>

Przetłumacz poniższy kod Pythona na Java i zawiń swoją rozwiązanie w ```java i ```.
Przykładowy test:

Test input:
100000 100000
866074010 254688476 407269433 739939214 873531693 248936553 371463687 248187352 664544362 727605859 99769389 432354388 643004509 632032831 914634327 364150435 740928867 681265557 440372467 111388501 293757895 124020006 345086446 307529147 796702141 405306514 961414286 822927968 155654690 246254556 392296695 348718347 219347138 130888239 815361539 688217660 527272072 344169776 80925633 198421983 983631331 355627283 373717552 474190761 412289304 564070300 129676014 354805943 45435805
Expected output:
43252


```
( n , m ) = [ int ( x ) for x in input ( ).split ( ) ]
p = [ x for x in range ( 1 , n + 1 ) ]
h = [ int ( x ) for x in input ( ).split ( ) ]
hp = dict ( zip ( p , h ) )
path = { i : [ ] for i in range ( 1 , n + 1 ) }
for i in range ( m ) :
    ( a , b ) = [ int ( x ) for x in input ( ).split ( ) ]
    path [ a ].append ( b )
    path [ b ].append ( a )
c = 0
for i , v in path.items ( ) :
    f = 0
    for j in v :
        if hp [ i ] <= hp [ j ] :
            f = 1
            break
    if f == 0 :
        c += 1
print ( c )


```
[/PL]

[DE]
Du bist ein erfahrener Java-Programmierer und Assistent
<</DE>>

Übersetze den folgenden Python-Code in Java und umschließe deine Lösung mit ```java und ```.
Ein Beispieltest ist unten angegeben:

Test input:
100000 100000
866074010 254688476 407269433 739939214 873531693 248936553 371463687 248187352 664544362 727605859 99769389 432354388 643004509 632032831 914634327 364150435 740928867 681265557 440372467 111388501 293757895 124020006 345086446 307529147 796702141 405306514 961414286 822927968 155654690 246254556 392296695 348718347 219347138 130888239 815361539 688217660 527272072 344169776 80925633 198421983 983631331 355627283 373717552 474190761 412289304 564070300 129676014 354805943 45435805
Expected output:
43252


```
( n , m ) = [ int ( x ) for x in input ( ).split ( ) ]
p = [ x for x in range ( 1 , n + 1 ) ]
h = [ int ( x ) for x in input ( ).split ( ) ]
hp = dict ( zip ( p , h ) )
path = { i : [ ] for i in range ( 1 , n + 1 ) }
for i in range ( m ) :
    ( a , b ) = [ int ( x ) for x in input ( ).split ( ) ]
    path [ a ].append ( b )
    path [ b ].append ( a )
c = 0
for i , v in path.items ( ) :
    f = 0
    for j in v :
        if hp [ i ] <= hp [ j ] :
            f = 1
            break
    if f == 0 :
        c += 1
print ( c )


```
[/DE]

[RU]
Вы - опытный программист на Java и ассистент
<</RU>>

Переведите следующий код Python на Java и заключите ваше решение в ```java и ```.
Пример теста:

Test input:
100000 100000
866074010 254688476 407269433 739939214 873531693 248936553 371463687 248187352 664544362 727605859 99769389 432354388 643004509 632032831 914634327 364150435 740928867 681265557 440372467 111388501 293757895 124020006 345086446 307529147 796702141 405306514 961414286 822927968 155654690 246254556 392296695 348718347 219347138 130888239 815361539 688217660 527272072 344169776 80925633 198421983 983631331 355627283 373717552 474190761 412289304 564070300 129676014 354805943 45435805
Expected output:
43252


```
( n , m ) = [ int ( x ) for x in input ( ).split ( ) ]
p = [ x for x in range ( 1 , n + 1 ) ]
h = [ int ( x ) for x in input ( ).split ( ) ]
hp = dict ( zip ( p , h ) )
path = { i : [ ] for i in range ( 1 , n + 1 ) }
for i in range ( m ) :
    ( a , b ) = [ int ( x ) for x in input ( ).split ( ) ]
    path [ a ].append ( b )
    path [ b ].append ( a )
c = 0
for i , v in path.items ( ) :
    f = 0
    for j in v :
        if hp [ i ] <= hp [ j ] :
            f = 1
            break
    if f == 0 :
        c += 1
print ( c )


```
[/RU]

[TR]
Sen Java programcısın ve yardımcısın
<</TR>>

Aşağıdaki
