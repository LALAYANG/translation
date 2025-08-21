
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
20 20
20 1 19 2 18 3 17 4 16 5 15 6 14 7 13 8 12 9 11 10

Expected output:
19


```
def main ( ) :
    n , k = list ( map ( int , input ( ).split ( ' ' ) ) )
    elems = list ( map ( int , input ( ).split ( ' ' ) ) )
    all_same = lambda arr : all ( [ x == arr [ 0 ] for x in arr ] )
    if all_same ( elems ) :
        print ( 0 )
        return
    if k == 1 :
        print ( - 1 )
        return
    if not all_same ( elems [ k - 1 : ] ) :
        print ( - 1 )
        return
    target = elems [ - 1 ]
    to_delete = elems [ 0 : k - 1 ]
    while to_delete and to_delete [ - 1 ] == target :
        to_delete.pop ( )
    print ( len ( to_delete ) )
if __name__ == "__main__" :
    main ( )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
20 20
20 1 19 2 18 3 17 4 16 5 15 6 14 7 13 8 12 9 11 10

Expected output:
19


```
def main ( ) :
    n , k = list ( map ( int , input ( ).split ( ' ' ) ) )
    elems = list ( map ( int , input ( ).split ( ' ' ) ) )
    all_same = lambda arr : all ( [ x == arr [ 0 ] for x in arr ] )
    if all_same ( elems ) :
        print ( 0 )
        return
    if k == 1 :
        print ( - 1 )
        return
    if not all_same ( elems [ k - 1 : ] ) :
        print ( - 1 )
        return
    target = elems [ - 1 ]
    to_delete = elems [ 0 : k - 1 ]
    while to_delete and to_delete [ - 1 ] == target :
        to_delete.pop ( )
    print ( len ( to_delete ) )
if __name__ == "__main__" :
    main ( )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
20 20
20 1 19 2 18 3 17 4 16 5 15 6 14 7 13 8 12 9 11 10

Expected output:
19


```
def main ( ) :
    n , k = list ( map ( int , input ( ).split ( ' ' ) ) )
    elems = list ( map ( int , input ( ).split ( ' ' ) ) )
    all_same = lambda arr : all ( [ x == arr [ 0 ] for x in arr ] )
    if all_same ( elems ) :
        print ( 0 )
        return
    if k == 1 :
        print ( - 1 )
        return
    if not all_same ( elems [ k - 1 : ] ) :
        print ( - 1 )
        return
    target = elems [ - 1 ]
    to_delete = elems [ 0 : k - 1 ]
    while to_delete and to_delete [ - 1 ] == target :
        to_delete.pop ( )
    print ( len ( to_delete ) )
if __name__ == "__main__" :
    main ( )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
20 20
20 1 19 2 18 3 17 4 16 5 15 6 14 7 13 8 12 9 11 10

Expected output:
19


```
def main ( ) :
    n , k = list ( map ( int , input ( ).split ( ' ' ) ) )
    elems = list ( map ( int , input ( ).split ( ' ' ) ) )
    all_same = lambda arr : all ( [ x == arr [ 0 ] for x in arr ] )
    if all_same ( elems ) :
        print ( 0 )
        return
    if k == 1 :
        print ( - 1 )
        return
    if not all_same ( elems [ k - 1 : ] ) :
        print ( - 1 )
        return
    target = elems [ - 1 ]
    to_delete = elems [ 0 : k - 1 ]
    while to_delete and to_delete [ - 1 ] == target :
        to_delete.pop ( )
    print ( len ( to_delete ) )
if __name__ == "__main__" :
    main ( )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
20 20
20 1 19 2 18 3 17 4 16 5 15 6 14 7 13 8 12 9 11 10

Expected output:
19


```
def main ( ) :
    n , k = list ( map ( int , input ( ).split ( ' ' ) ) )
    elems = list ( map ( int , input ( ).split ( ' ' ) ) )
    all_same = lambda arr : all ( [ x == arr [ 0 ] for x in arr ] )
    if all_same ( elems ) :
        print ( 0 )
        return
    if k == 1 :
        print ( - 1 )
        return
    if not all_same ( elems [ k - 1 : ] ) :
        print ( - 1 )
        return
    target = elems [ - 1 ]
    to_delete = elems [ 0 : k - 1 ]
    while to_delete and to_delete [ - 1 ] == target :
        to_delete.pop ( )
    print ( len ( to_delete ) )
if __name__ == "__main__" :
    main ( )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
20 20
20 1 19 2 18 3 17 4 16 5 15 6 14 7 13 8 12 9 11 10

Expected output:
19


```
def main ( ) :
    n , k = list ( map ( int , input ( ).split ( ' ' ) ) )
    elems = list ( map ( int , input ( ).split ( ' ' ) ) )
    all_same = lambda arr : all ( [ x == arr [ 0 ] for x in arr ] )
    if all_same ( elems ) :
        print ( 0 )
        return
    if k == 1 :
        print ( - 1 )
        return
    if not all_same ( elems [ k - 1 : ] ) :
        print ( - 1 )
        return
    target = elems [ - 1 ]
    to_delete = elems [ 0 : k - 1 ]
    while to_delete and to_delete [ - 1 ] == target :
        to_delete.pop ( )
    print ( len ( to_delete ) )
if __name__ == "__main__" :
    main ( )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
20 20
20 1 19 2 18 3 17 4 16 5 15 6 14 7 13 8 12 9 11 10

Expected output:
19


```
def main ( ) :
    n , k = list ( map ( int , input ( ).split ( ' ' ) ) )
    elems = list ( map ( int , input ( ).split ( ' ' ) ) )
    all_same = lambda arr : all ( [ x == arr [ 0 ] for x in arr ] )
    if all_same ( elems ) :
        print ( 0 )
        return
    if k == 1 :
        print ( - 1 )
        return
    if not all_same ( elems [ k - 1 : ] ) :
        print ( - 1 )
        return
    target = elems [ - 1 ]
    to_delete = elems [ 0 : k - 1 ]
    while to_delete and to_delete [ - 1 ] == target :
        to_delete.pop ( )
    print ( len ( to_delete ) )
if __name__ == "__main__" :
    main ( )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
20 20
20 1 19 2 18 3 17 4 16 5 15 6 14 7 13 8 12 9 11 10

Expected output:
19


```
def main ( ) :
    n , k = list ( map ( int , input ( ).split ( ' ' ) ) )
    elems = list ( map ( int , input ( ).split ( ' ' ) ) )
    all_same = lambda arr : all ( [ x == arr [ 0 ] for x in arr ] )
    if all_same ( elems ) :
        print ( 0 )
        return
    if k == 1 :
        print ( - 1 )
        return
    if not all_same ( elems [ k - 1 : ] ) :
        print ( - 1 )
        return
    target = elems [ - 1 ]
    to_delete = elems [ 0 : k - 1 ]
    while to_delete and to_delete [ - 1 ] == target :
        to_delete.pop ( )
    print ( len ( to_delete ) )
if __name__ == "__main__" :
    main ( )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
20 20
20 1 19 2 18 3 17 4 16 5 15 6 14 7 13 8 12 9 11 10

Expected output:
19


```
def main ( ) :
    n , k = list ( map ( int , input ( ).split ( ' ' ) ) )
    elems = list ( map ( int , input ( ).split ( ' ' ) ) )
    all_same = lambda arr : all ( [ x == arr [ 0 ] for x in arr ] )
    if all_same ( elems ) :
        print ( 0 )
        return
    if k == 1 :
        print ( - 1 )
        return
    if not all_same ( elems [ k - 1 : ] ) :
        print ( - 1 )
        return
    target = elems [ - 1 ]
    to_delete = elems [ 0 : k - 1 ]
    while to_delete and to_delete [ - 1 ] == target :
        to_delete.pop ( )
    print ( len ( to_delete ) )
if __name__ == "__main__" :
    main ( )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
20 20
20 1 19 2 18 3 17 4 16 5 15 6 14 7 13 8 12 9 11 10

Expected output:
19


```
def main ( ) :
    n , k = list ( map ( int , input ( ).split ( ' ' ) ) )
    elems = list ( map ( int , input ( ).split ( ' ' ) ) )
    all_same = lambda arr : all ( [ x == arr [ 0 ] for x in arr ] )
    if all_same ( elems ) :
        print ( 0 )
        return
    if k == 1 :
        print ( - 1 )
        return
    if not all_same ( elems [ k - 1 : ] ) :
        print ( - 1 )
        return
    target = elems [ - 1 ]
    to_delete = elems [ 0 : k - 1 ]
    while to_delete and to_delete [ - 1 ] == target :
        to_delete.pop ( )
    print ( len ( to_delete ) )
if __name__ == "__main__" :
    main ( )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
20 20
20 1 19 2 18 3 1
