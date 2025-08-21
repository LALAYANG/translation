
[ENG]
You are an expert Java programmer and assistant
<</ENG>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5 100 1 1 10000
1 2 3 4 5

Expected output:
312


```
n , L , R , QL , QR = map ( int , input ( ).split ( ) )
W = list ( map ( int , input ( ).split ( ) ) )
sum_el = [ 0 ]
for i in range ( 1 , n + 1 ) :
    sum_el.append ( W [ i - 1 ] + sum_el [ i - 1 ] )
answer = QR * ( n - 1 ) + sum_el [ n ] * R
for i in range ( 1 , n + 1 ) :
    energy = L * sum_el [ i ] + R * ( sum_el [ n ] - sum_el [ i ] )
    if i > ( n - i ) :
        energy = energy + ( i - ( n - i ) - 1 ) * QL
    elif ( n - i ) > i :
        energy = energy + ( ( n - i ) - i - 1 ) * QR
    if energy < answer :
        answer = energy
print ( answer )


```
[/ENG]

[RU]
Вы - опытный программист Java и помощник
<</RU>>

Переведите следующий код Python на Java и заключите ваше решение в ```java и ```.
Пример тестового случая приведен ниже:

Входные данные:
5 100 1 1 10000
1 2 3 4 5

Ожидаемый вывод:
312


```
n , L , R , QL , QR = map ( int , input ( ).split ( ) )
W = list ( map ( int , input ( ).split ( ) ) )
sum_el = [ 0 ]
for i in range ( 1 , n + 1 ) :
    sum_el.append ( W [ i - 1 ] + sum_el [ i - 1 ] )
answer = QR * ( n - 1 ) + sum_el [ n ] * R
for i in range ( 1 , n + 1 ) :
    energy = L * sum_el [ i ] + R * ( sum_el [ n ] - sum_el [ i ] )
    if i > ( n - i ) :
        energy = energy + ( i - ( n - i ) - 1 ) * QL
    elif ( n - i ) > i :
        energy = energy + ( ( n - i ) - i - 1 ) * QR
    if energy < answer :
        answer = energy
print ( answer )


```
[/RU]

[/JP]

[CN]
您是一位具有 Java 编程经验的专家，并且是助手
<</CN>>

将以下 Python 代码翻译成 Java，并将您的解决方案放在 ```java和```.
下面提供了示例测试用例：

输入：
5 100 1 1 10000
1 2 3 4 5

期望输出：
312


```
n , L , R , QL , QR = map ( int , input ( ).split ( ) )
W = list ( map ( int , input ( ).split ( ) ) )
sum_el = [ 0 ]
for i in range ( 1 , n + 1 ) :
    sum_el.append ( W [ i - 1 ] + sum_el [ i - 1 ] )
answer = QR * ( n - 1 ) + sum_el [ n ] * R
for i in range ( 1 , n + 1 ) :
    energy = L * sum_el [ i ] + R * ( sum_el [ n ] - sum_el [ i ] )
    if i > ( n - i ) :
        energy = energy + ( i - ( n - i ) - 1 ) * QL
    elif ( n - i ) > i :
        energy = energy + ( ( n - i ) - i - 1 ) * QR
    if energy < answer :
        answer = energy
print ( answer )


```
[/CN]

[HINT]

[INST]

```

```

[/INST]

[ENG]

```

```

[/ENG]

[RU]

```

```

[/RU]

[JP]

```

```

[/JP]

[CN]

```

```

[/CN]

[/HINT]

[SOLUTION]

[INST]

```

```

[/INST]

[ENG]

```

```

[/ENG]

[RU]

```

```

[/RU]

[JP]

```

```

[/JP]

[CN]

```

```

[/CN]

[/SOLUTION]

[/EXERCISE]

[/SECTION]

[SECTION]

[EDITORIAL]

[INST]

[/INST]

[ENG]

[/ENG]

[RU]

[/RU]

[JP]

[/JP]

[CN]

[/CN]

[/EDITORIAL]

[/SECTION]

[SECTION]

[SUBSECTION]

[EDITORIAL]

[INST]

[/INST]

[ENG]

[/ENG]

[RU]

[/RU]

[JP]

[/JP]

[CN]

[/CN]

[/EDITORIAL]

[/SUBSECTION]

[SUBSECTION]

[EDITORIAL]

[INST]

[/INST]

[ENG]

[/ENG]

[RU]

[/RU]

[JP]

[/JP]

[CN]

[/CN]

[/EDITORIAL]

[/SUBSECTION]

[SUBSECTION]

[EDITORIAL]

[INST]

[/INST]

[ENG]

[/ENG]

[RU]

[/RU]

[JP]

[/JP]

[CN]

[/CN]

[/EDITORIAL]

[/SUBSECTION]

[SUBSECTION]

[EDITORIAL]

[INST]

[/INST]

[ENG]

[/ENG]

[RU]

[/RU]

[JP]

[/JP]

[CN]

[/CN]

[/EDITORIAL]

[/SUBSECTION]

[SUBSECTION]

[EDITORIAL]

[INST]

[/INST]

[ENG]

[/ENG]

[RU]

[/RU]

[JP]

[/JP]

[CN]

[/CN]

[/EDITORIAL]

[/SUBSECTION]

[SUBSECTION]

[EDITORIAL]

[INST]

[/INST]

[ENG]

[/ENG]

[RU]

[/RU]

[JP]

[/JP]

[CN]

[/CN]

[/EDITORIAL]

[/SUBSECTION]

[SUBSECTION]

[EDITORIAL]

[INST]

[/INST]

[ENG]

[/ENG]

[RU]

[/RU]

[JP]

[/JP]

[CN]

[/CN]

[/EDITORIAL]

[/SUBSECTION]

[SUBSECTION]

[EDITORIAL]

[INST]

[/INST]

[ENG]

[/ENG]

[RU]

[/RU]

[JP]

[/JP]

[CN]

[/CN]

[/EDITORIAL]

[/SUBSECTION]

[SUBSECTION]

[EDITORIAL]

[INST]

[/INST]

[ENG]

[/ENG]

[RU]

[/RU]

[JP]

[/JP]

[CN]

[/CN]

[/EDITORIAL]

[/SUBSECTION]

[SUBSECTION]

[EDITORIAL]

[INST]

[/INST]

[ENG]

[/ENG]

[RU]

[/RU]

[JP]

[/JP]

[CN]

[/CN]

[/EDITORIAL]

[/SUBSECTION]

[SUBSECTION]

[EDITORIAL]

[INST]

[/INST]

[ENG]

[/ENG]

[RU]

[/RU]

[JP]

[/JP]

[CN]

[/CN]

[/EDITORIAL]

[/SUBSECTION]

[SUBSECTION]

[EDITORIAL]

[INST]

[/INST]

[ENG]

[/ENG]

[RU]

[/RU]

[JP]

[/JP]

[CN]

[/CN]

[/EDITORIAL]

[/SUBSECTION]

[SUBSECTION]

[EDITORIAL]

[INST]

[/INST]

[ENG]

[/ENG]

[RU]

[/RU]

[JP]

[/JP]

[CN]

[/CN]

[/EDITORIAL]

[/SUBSECTION]

[SUBSECTION]

[EDITORIAL]

[INST]

[/INST]

[ENG]

[/ENG]

[RU]

[/RU]

[JP]

[/JP]

[CN]

[/CN]

[/EDITORIAL]

[/SUBSECTION]

[SUBSECTION]

[EDITORIAL]

[INST]

[/INST]

[ENG]

[/ENG]

[RU]

[/RU]

[JP]

[/JP]

[CN]

[/CN]

[/EDITORIAL]

[/SUBSECTION]

[SUBSECTION]

[EDITORIAL]

[INST]

[/INST]

[ENG]

[/ENG]

[RU]

[/RU]

[JP]

[/JP]

[CN]

[/CN]

[/EDITORIAL]

[/SUBSECTION]

[SUBSECTION]

[EDITORIAL]

[INST]

[/INST]

[ENG]

[/ENG]

[RU]

[/RU]

[JP]

[/JP]

[CN]

[/CN]

[/EDITORIAL]

[/SUBSECTION]

[SUBSECTION]

[EDITORIAL]

[INST]

[/INST]

[ENG]

[/ENG]

[RU]

[/RU]

[JP]

[/JP]

[CN]

[/CN]

[/EDITORIAL]

[/SUBSECTION]

[SUBSECTION]

[EDITORIAL]

[INST]

[/INST]

[ENG]

[/ENG]

[RU]

[/RU]

[JP]

[/JP]

[CN]

[/CN]

[/EDITORIAL]

[/SUBSECTION]

[SUBSECTION]

[EDITORIAL]

[INST]

[/INST]

[ENG]

[/ENG]

[RU]

[/RU]

[JP]

[/JP]

[CN]

[/CN]

[/EDITORIAL]

[/SUBSECTION]

[SUBSECTION]

[EDITORIAL]

[INST]

[/INST]

[ENG]

[/ENG]

[RU]

[/RU]

[JP]

[/JP]

[CN]

[/CN]

[/EDITORIAL]

[/SUBSECTION]

[SUBSECTION]

[EDITORIAL]

[INST]

[/INST]

[ENG]

[/ENG]

[RU]

[/RU]

[JP]

[/JP]

[CN]

[/CN]

[/EDITORIAL]

[/SUBSECTION]

[SUBSECTION]

[EDITORIAL]

[INST]

[/INST]

[ENG]

[/ENG]

[RU]

[/RU]

[JP]

[/JP]

[CN]

[/CN]

[/EDITORIAL]

[/SUBSECTION]

[SUBSECTION]

[EDITORIAL]

[INST]

[/INST]

[ENG]

[/ENG]

[RU]

[/RU]

[JP]

[/JP]

[CN]

[/CN]

[/EDITORIAL]

[/SUBSECTION]

[SUBSECTION]

[EDITORIAL]

[INST]

[/INST]

[ENG]

[/ENG]

[RU]

[/RU]

[JP]

[/JP]

[CN]

[/CN]

[/EDITORIAL]

[/SUBSECTION]

[SUBSECTION]

[EDITORIAL]

[INST]

[/INST]

[ENG]

[/ENG]

[RU]

[/RU]

[JP]

[/JP]

[CN]

[/CN]

[/EDITORIAL]

[/SUBSECTION]

[SUBSECTION]

[EDITORIAL]

