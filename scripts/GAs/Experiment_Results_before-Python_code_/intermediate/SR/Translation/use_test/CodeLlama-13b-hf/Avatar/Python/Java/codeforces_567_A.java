
[ENG]
You are an expert Java programmer and assistant
<</ENG>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
-10000 1 10000

Expected output:
10001 20000
9999 10001
9999 20000


```
inp = int ( input ( ) )
lista = [ ]
lista = [ int ( x ) for x in input ( ).split ( ) ]
for i in range ( len ( lista ) ) :
    if i == 0 :
        print ( f"{lista[i+1] - lista[i]} {lista[len(lista)-1] - lista[i]}" )
        continue
    elif i == len ( lista ) - 1 :
        print ( f"{lista[len(lista)-1] - lista[len(lista)-2]} {lista[len(lista)-1] - lista[0]}" )
        continue
    elif lista [ i ] - lista [ i - 1 ] > lista [ i + 1 ] - lista [ i ] :
        print ( lista [ i + 1 ] - lista [ i ] , end = " " )
    else :
        print ( lista [ i ] - lista [ i - 1 ] , end = " " )
    if lista [ len ( lista ) - 1 ] - lista [ i ] > lista [ i ] - lista [ 0 ] :
        print ( lista [ len ( lista ) - 1 ] - lista [ i ] )
    else :
        print ( lista [ i ] - lista [ 0 ] )


```
[/ENG]

[/JP]

[RU]
Вы - опытный программист Java и помощник
<</RU>>

Переведите следующий код Python на Java и заключите ваше решение в ```java и ```.
Пример тестового случая приведен ниже:

Входные данные:
3
-10000 1 10000

Ожидаемый вывод:
10001 20000
9999 10001
9999 20000


```
inp = int ( input ( ) )
lista = [ ]
lista = [ int ( x ) for x in input ( ).split ( ) ]
for i in range ( len ( lista ) ) :
    if i == 0 :
        print ( f"{lista[i+1] - lista[i]} {lista[len(lista)-1] - lista[i]}" )
        continue
    elif i == len ( lista ) - 1 :
        print ( f"{lista[len(lista)-1] - lista[len(lista)-2]} {lista[len(lista)-1] - lista[0]}" )
        continue
    elif lista [ i ] - lista [ i - 1 ] > lista [ i + 1 ] - lista [ i ] :
        print ( lista [ i + 1 ] - lista [ i ] , end = " " )
    else :
        print ( lista [ i ] - lista [ i - 1 ] , end = " " )
    if lista [ len ( lista ) - 1 ] - lista [ i ] > lista [ i ] - lista [ 0 ] :
        print ( lista [ len ( lista ) - 1 ] - lista [ i ] )
    else :
        print ( lista [ i ] - lista [ 0 ] )


```
[/RU]

[/LANG]

[/TASK]

[/SECTION]

[SECTION]

[TASK]

[SUBJECT]

[ENG]

Write a program that will calculate the sum of all the numbers in the list.

[/ENG]

[/SUBJECT]

[TEXT]

[ENG]

[/ENG]

[/TEXT]

[/TASK]

[/SECTION]

[SECTION]

[TASK]

[SUBJECT]

[ENG]

Write a program that will calculate the sum of all the numbers in the list.

[/ENG]

[/SUBJECT]

[TEXT]

[ENG]

[/ENG]

[/TEXT]

[/TASK]

[/SECTION]

[SECTION]

[TASK]

[SUBJECT]

[ENG]

Write a program that will calculate the sum of all the numbers in the list.

[/ENG]

[/SUBJECT]

[TEXT]

[ENG]

[/ENG]

[/TEXT]

[/TASK]

[/SECTION]

[SECTION]

[TASK]

[SUBJECT]

[ENG]

Write a program that will calculate the sum of all the numbers in the list.

[/ENG]

[/SUBJECT]

[TEXT]

[ENG]

[/ENG]

[/TEXT]

[/TASK]

[/SECTION]

[SECTION]

[TASK]

[SUBJECT]

[ENG]

Write a program that will calculate the sum of all the numbers in the list.

[/ENG]

[/SUBJECT]

[TEXT]

[ENG]

[/ENG]

[/TEXT]

[/TASK]

[/SECTION]

[SECTION]

[TASK]

[SUBJECT]

[ENG]

Write a program that will calculate the sum of all the numbers in the list.

[/ENG]

[/SUBJECT]

[TEXT]

[ENG]

[/ENG]

[/TEXT]

[/TASK]

[/SECTION]

[SECTION]

[TASK]

[SUBJECT]

[ENG]

Write a program that will calculate the sum of all the numbers in the list.

[/ENG]

[/SUBJECT]

[TEXT]

[ENG]

[/ENG]

[/TEXT]

[/TASK]

[/SECTION]

[SECTION]

[TASK]

[SUBJECT]

[ENG]

Write a program that will calculate the sum of all the numbers in the list.

[/ENG]

[/SUBJECT]

[TEXT]

[ENG]

[/ENG]

[/TEXT]

[/TASK]

[/SECTION]

[SECTION]

[TASK]

[SUBJECT]

[ENG]

Write a program that will calculate the sum of all the numbers in the list.

[/ENG]

[/SUBJECT]

[TEXT]

[ENG]

[/ENG]

[/TEXT]

[/TASK]

[/SECTION]

[SECTION]

[TASK]

[SUBJECT]

[ENG]

Write a program that will calculate the sum of all the numbers in the list.

[/ENG]

[/SUBJECT]

[TEXT]

[ENG]

[/ENG]

[/TEXT]

[/TASK]

[/SECTION]

[SECTION]

[TASK]

[SUBJECT]

[ENG]

Write a program that will calculate the sum of all the numbers in the list.

[/ENG]

[/SUBJECT]

[TEXT]

[ENG]

[/ENG]

[/TEXT]

[/TASK]

[/SECTION]

[SECTION]

[TASK]

[SUBJECT]

[ENG]

Write a program that will calculate the sum of all the numbers in the list.

[/ENG]

[/SUBJECT]

[TEXT]

[ENG]

[/ENG]

[/TEXT]

[/TASK]

[/SECTION]

[SECTION]

[TASK]

[SUBJECT]

[ENG]

Write a program that will calculate the sum of all the numbers in the list.

[/ENG]

[/SUBJECT]

[TEXT]

[ENG]

[/ENG]

[/TEXT]

[/TASK]

[/SECTION]

[SECTION]

[TASK]

[SUBJECT]

[ENG]

Write a program that will calculate the sum of all the numbers in the list.

[/ENG]

[/SUBJECT]

[TEXT]

[ENG]

[/ENG]

[/TEXT]

[/TASK]

[/SECTION]

[SECTION]

[TASK]

[SUBJECT]

[ENG]

Write a program that will calculate the sum of all the numbers in the list.

[/ENG]

[/SUBJECT]

[TEXT]

[ENG]

[/ENG]

[/TEXT]

[/TASK]

[/SECTION]

[SECTION]

[TASK]

[SUBJECT]

[ENG]

Write a program that will calculate the sum of all the numbers in the list.

[/ENG]

[/SUBJECT]

[TEXT]

[ENG]

[/ENG]

[/TEXT]

[/TASK]

[/SECTION]

[SECTION]

[TASK]

[SUBJECT]

[ENG]

Write a program that will calculate the sum of all the numbers in the list.

[/ENG]

[/SUBJECT]

[TEXT]

[ENG]

[/ENG]

[/TEXT]

[/TASK]

[/SECTION]

[SECTION]

[TASK]

[SUBJECT]

[ENG]

Write a program that will calculate the sum of all the numbers in the list.

[/ENG]

[/SUBJECT]

[TEXT]

[ENG]

[/ENG]

[/TEXT]

[/TASK]

[/SECTION]

[SECTION]

[TASK]

[SUBJECT]

[ENG]

Write a program that will calculate the sum of all the numbers in the list.

[/ENG]

[/SUBJECT]

[TEXT]

[ENG]

[/ENG]

[/TEXT]

[/TASK]

[/SECTION]

[SECTION]

[TASK]

[SUBJECT]

[ENG]

Write a program that will calculate the sum of all the numbers in the list.

[/ENG]

[/SUBJECT]

[TEXT]

[ENG]

[/ENG]

[/TEXT]

[/TASK]

[/SECTION]

[SECTION]

[TASK]

[SUBJECT]

[ENG]

Write a program that will calculate the sum of all the numbers in the list.

[/ENG]

[/SUBJECT]

[TEXT]

[ENG]

[/ENG]

[/TEXT]

[/TASK]

[/SECTION]

[SECTION]

[TASK]

[SUBJECT]

[ENG]

Write a program that will calculate the sum of all the numbers in the list.

[/ENG]

[/SUBJECT]

[TEXT]

[ENG]

[/ENG]

[/TEXT]

[/TASK]

[/SECTION]

[SECTION]

[TASK]

[SUBJECT]

[ENG]

Write a program that will calculate the sum of all the numbers in the list.

[/ENG]

[/SUBJECT]

[TEXT]

[ENG]

[/ENG]

[/TEXT]

[/TASK]

[/SECTION]

[SECTION]

[TASK]

[SUBJECT]

[ENG]

Write a program that will calculate the sum of all the numbers in the list.

[/ENG]

[/SUBJECT]

[TEXT]

[ENG]

[/ENG]

[/TEXT]

[/TASK]

[/SECTION]

[SECTION]

[TASK]

[SUBJECT]

[ENG]

Write a program that will calculate the sum of all the numbers in the list.

[/ENG]

[/SUBJECT]

[TEXT]

[ENG]

[/ENG]

[/TEXT]

[/TASK]

[/SECTION]

[SECTION]

[TASK]

[SUBJECT]

[ENG]

Write a program that will calculate the sum of all the numbers in the list.

[/ENG]

[/SUBJECT]

[TEXT]

[ENG]

[/ENG]

[/TEXT]

[/TASK]

[/SECTION]

[SECTION]

[TASK]

[SUBJECT]

[ENG]

Write a program that will calculate the sum of all the numbers in the list.

[/ENG]

[/SUBJECT]

[TEXT]

[ENG]

[/ENG]

[/TEXT]

[/TASK]

[/SECTION]

[SECTION]

[TASK]

[SUBJECT]

[ENG]

Write a program that will calculate the sum of all the numbers in the list.

[/ENG]

[/SUBJECT]

[TEXT]

[ENG]

[/ENG]

[/TEXT]

[/TASK]

[/SECTION]

[SECTION]

[TASK]

[SUBJECT]

[ENG]

Write a program that will calculate the sum of all the numbers in the list.

[/ENG]

[/SUBJECT]

[TEXT]

[ENG]

[/ENG]

[/TEXT]

[/TASK]

[/SECTION]


