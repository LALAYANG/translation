
[ENG]
You are an expert Java programmer and assistant
<</ENG>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100
74 96 32 63 12 69 72 99 15 22 1 41 79 77 71 31 20 28 75 73 85 37 38 59 42 100 86 89 55 87 68 4 24 57 52 8 92 27 56 98 95 58 34 9 45 14 11 36 66 76 61 19 25 23 78 49 90 26 80 43 70 13 65 10 5 74 81 21 44 60 97 3 47 93 6
64 68 21 27 16 91 23 22 33 12 71 88 90 50 62 43 28 29 57 59 5 74 10 95 35 1 67 93 36 32 86 40 6 64 78 46 89 15 84 53 18 30 17 85 2 3 47 92 25 48 76 51 20 82 52 83 99 63 80 11 94 54 39 7 58

Expected output:
I become the guy.


```
max_level = int ( input ( ) )
x = list ( map ( int , input ( ).split ( ) ) )
y = list ( map ( int , input ( ).split ( ) ) )
x.pop ( 0 )
y.pop ( 0 )
x = set ( x )
y = set ( y )
if 0 in x :
    x.discard ( 0 )
elif 0 in y :
    y.discard ( 0 )
z = x.union ( y )
if len ( z ) != max_level :
    print ( "Oh, my keyboard!" )
else :
    print ( "I become the guy." )


```
[/ENG]

[PL]
Jesteś doświadczonym programistą w języku Java i asystentem
<</PL>>

Przetłumacz poniższy kod Pythona na Java i zawiń swoją rozwiązanie w ```java i ```.
Przykładowy test:

Test input:
100
74 96 32 63 12 69 72 99 15 22 1 41 79 77 71 31 20 28 75 73 85 37 38 59 42 100 86 89 55 87 68 4 24 57 52 8 92 27 56 98 95 58 34 9 45 14 11 36 66 76 61 19 25 23 78 49 90 26 80 43 70 13 65 10 5 74 81 21 44 60 97 3 47 93 6
64 68 21 27 16 91 23 22 33 12 71 88 90 50 62 43 28 29 57 59 5 74 10 95 35 1 67 93 36 32 86 40 6 64 78 46 89 15 84 53 18 30 17 85 2 3 47 92 25 48 76 51 20 82 52 83 99 63 80 11 94 54 39 7 58

Oczekiwany wynik:
I become the guy.


```
max_level = int ( input ( ) )
x = list ( map ( int , input ( ).split ( ) ) )
y = list ( map ( int , input ( ).split ( ) ) )
x.pop ( 0 )
y.pop ( 0 )
x = set ( x )
y = set ( y )
if 0 in x :
    x.discard ( 0 )
elif 0 in y :
    y.discard ( 0 )
z = x.union ( y )
if len ( z ) != max_level :
    print ( "Oh, my keyboard!" )
else :
    print ( "I become the guy." )


```
[/PL]

[DE]
Du bist ein erfahrener Java-Programmierer und Assistent
<</DE>>

Übersetze den folgenden Python-Code in Java und umschließe deine Lösung mit ```java und ```.
Ein Beispieltest ist unten angegeben:

Testeingabe:
100
74 96 32 63 12 69 72 99 15 22 1 41 79 77 71 31 20 28 75 73 85 37 38 59 42 100 86 89 55 87 68 4 24 57 52 8 92 27 56 98 95 58 34 9 45 14 11 36 66 76 61 19 25 23 78 49 90 26 80 43 70 13 65 10 5 74 81 21 44 60 97 3 47 93 6
64 68 21 27 16 91 23 22 33 12 71 88 90 50 62 43 28 29 57 59 5 74 10 95 35 1 67 93 36 32 86 40 6 64 78 46 89 15 84 53 18 30 17 85 2 3 47 92 25 48 76 51 20 82 52 83 99 63 80 11 94 54 39 7 58

Erwartete Ausgabe:
I become the guy.


```
max_level = int ( input ( ) )
x = list ( map ( int , input ( ).split ( ) ) )
y = list ( map ( int , input ( ).split ( ) ) )
x.pop ( 0 )
y.pop ( 0 )
x = set ( x )
y = set ( y )
if 0 in x :
    x.discard ( 0 )
elif 0 in y :
    y.discard ( 0 )
z = x.union ( y )
if len ( z ) != max_level :
    print ( "Oh, my keyboard!" )
else :
    print ( "I become the guy." )


```
[/DE]

[RU]
Вы - опытный программист Java и ассистент
<</RU>>

Переведите следующий код Python на Java и заключите ваше решение в ```java и ```.
Пример теста:

Входные данные теста:
100
74 96 32 63 12 69 72 99 15 22 1 41 79 77 71 31 20 28 75 73 85 37 38 59 42 100 86 89 55 87 68 4 24 57 52 8 92 27 56 98 95 58 34 9 45 14 11 36 66 76 61 19 25 23 78 49 90 26 80 43 70 13 65 10 5 74 81 21 44 60 97 3 47 93 6
64 68 21 27 16 91 23 22 33 12 71 88 90 50 62 43 28 29 57 59 5 74 10 95 35 1 67 93 36 32 86 40 6 64 78 46 89 15 84 53 18 30 17 85 2 3 47 92 25 48 76 51 20 82 52 83 99 63 80 11 94 54 39 7 58

Ожидаемый результат:
I become the guy.


```
max_level = int ( input ( ) )
x = list ( map ( int , input ( ).split ( ) ) )
y = list ( map ( int , input ( ).split ( ) ) )
x.pop ( 0 )
y.pop ( 0 )
x = set ( x )
y = set ( y )
if 0 in x :
    x.discard ( 0 )
elif 0 in y :
    y.discard ( 0 )
z = x.union ( y )
if len ( z ) != max_level :
    print ( "Oh, my keyboard!" )
else :
    print ( "I become the guy." )


```
[/RU]

[CN]
您是一位Java专家程序员和助理
<</CN>>

将以下Python代码翻译成Java并将您的解决方案放在```java和```.
下面是一个示例测试：

测试输入：
100
74 96 32 63 12 69 72 99 15 22 1 41 79 77 71 31 20 28 75 73 85 37 38 59 42 100 86 89 55 87 68 4 24 57 52 8 92 27 56 98 95 58 34 9 45 14 11 36 66 76 61 19 25 23 78 49 90 26 80 43 70 13 65 10 5 74 81 21 44 60 97 3 47 93 6
64 68 21 27 16 91 23 22 33 12 71 88 90 50 62 43 28 29 57 59 5 74 10 95 35 1 67 93 36 32 86 40 6 64 78 46 89 15 84 53 18 30 17 85 2 3 47 92 25 48 76 51 20 82 52 83 99 63 80 11 94 54 39 7 58

预期输出：
I become the guy.


```
max_level = int ( input ( ) )
x = list ( map ( int , input ( ).split ( ) ) )
y = list ( map ( int , input ( ).split ( ) ) )
x.pop ( 0 )
y.pop ( 0 )
x = set ( x )
y = set ( y )
if 0 in x :
    x.discard ( 0 )
elif 0 in y :
    y.discard ( 0 )
z = x.union ( y )
if len ( z ) != max_level :
    print ( "Oh, my keyboard!" )
else :
    print ( "I become the guy." )


```
[/CN]

[TR]
Sen Java uzman programcı ve yardımcısın
<</TR>>

Aşağıdaki Python kodunu Java'ya çevirin ve çözümünüzü ```java ve ``` içinde sarmalayın.
Bir örnek test aşağıda verilmiştir:

Test girişi:
10
