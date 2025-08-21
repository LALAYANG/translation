

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] cake = new String[n];
        int happiness = 0;
        int chocCount = 0;
        int nfat = 1;
        for (int i = 0; i < n; i++) {
            cake[i] = sc.nextLine();
            for (int j = 0; j < n; j++) {
                if (cake[i].charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                for (int i1 = chocCount; i1 > chocCount - 2; i1--) {
                    nfat *= i1;
                }
                happiness += nfat / 2;
            }
            nfat = 1;
            chocCount = 0;
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (cake[i].charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                for (int i1 = chocCount; i1 > chocCount - 2; i1--) {
                    nfat *= i1;
                }
                happiness += nfat / 2;
            }
            nfat = 1;
            chocCount = 0;
        }
        System.out.println(happiness);
    }
}

```

## 3.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

For example, if the user enters the string "azcbobobegghakl", your program should print:

Number of times bob occurs is: 2

```
s = str ( input ( ) )
count = 0
for i in range ( len ( s ) - 2 ) :
    if ( s [ i ] == 'b' and s [ i + 1 ] == 'o' and s [ i + 2 ] == 'b' ) :
        count += 1
print ( "Number of times bob occurs is:" , count )

```

## 4.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

For example, if s = 'azcbobobegghakl', then your program should print:

Longest substring in alphabetical order is: beggh

In the case of ties, print the first substring. For example, if s = 'abcbcd', then your program should print:

Longest substring in alphabetical order is: abc

```
s = str ( input ( ) )
longest = s [ 0 ]
current = s [ 0 ]
for i in range ( 1 , len ( s ) ) :
    if ( s [ i ] >= current [ - 1 ] ) :
        current += s [ i ]
        if ( len ( current ) > len ( longest ) ) :
            longest = current
    else :
        current = s [ i ]
print ( "Longest substring in alphabetical order is:" , longest )

```

## 5.

Write a program that asks the user to enter a string. The program should then print the following:

The number of times that the string "bob" occurs in the string.
The number of times each letter occurs in the string.
The letter that occurs most often.
The letter that occurs least often.

```
s = str ( input ( ) )
count = 0
for i in range ( len ( s ) - 2 ) :
    if ( s [ i ] == 'b' and s [ i + 1 ] == 'o' and s [ i + 2 ] == 'b' ) :
        count += 1
print ( "Number of times bob occurs is:" , count )

letters = [ ]
for i in range ( 26 ) :
    letters.append ( 0 )
for i in s :
    if ( i.isalpha ( ) ) :
        letters [ ord ( i ) - 97 ] += 1
print ( "Number of times each letter occurs in the string:" )
for i in range ( 26 ) :
    if ( letters [ i ] != 0 ) :
        print ( chr ( i + 97 ) , ":" , letters [ i ] )
max = 0
min = 1000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
