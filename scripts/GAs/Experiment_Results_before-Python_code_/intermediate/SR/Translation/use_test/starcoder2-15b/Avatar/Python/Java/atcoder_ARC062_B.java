

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int num_g = 0, num_p = 0;
        int score = 0;
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x == 'g') {
                if (num_g - num_p > 0) {
                    score += 1;
                    num_p += 1;
                } else {
                    score = score;
                    num_g += 1;
                }
            } else if (x == 'p') {
                if (num_g - num_p > 0) {
                    score = score;
                    num_p += 1;
                } else {
                    score -= 1;
                    num_g += 1;
                }
            }
        }
        System.out.println(score);
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

For example, if the string is "azcbobobegghakl", then your program should print:

Number of times bob occurs is: 2

```
s = input ( )
count = 0
for i in range ( len ( s ) - 2 ) :
    if s [ i : i + 3 ] == 'bob' :
        count += 1
print ( 'Number of times bob occurs is:' , count )
```

## 3.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

For example, if s = 'azcbobobegghakl', then your program should print:

Longest substring in alphabetical order is: beggh

```
s = input ( )
longest = s [ 0 ]
current = s [ 0 ]
for i in range ( 1 , len ( s ) ) :
    if s [ i ] >= current [ - 1 ] :
        current += s [ i ]
        if len ( current ) > len ( longest ) :
            longest = current
    else :
        current = s [ i ]
print ( 'Longest substring in alphabetical order is:' , longest )
```
/Week 1/Problem Set 1/README.md
# Problem Set 1

## 1.

Assume s is a string of lower case characters.

Write a program that counts up the number of vowels contained in the string s. Valid vowels are: 'a', 'e', 'i', 'o', and 'u'.

For example, if s = 'azcbobobegghakl', your program should print:

Number of vowels: 5

```
s = input ( )
count = 0
for i in s :
    if i in 'aeiou' :
        count += 1
print ( 'Number of vowels:' , count )
```

## 2.

Assume s is a string of lower case characters.

Write a program that prints the number of times the string 'bob' occurs in s. For example, if s = 'azcbobobegghakl', then your program should print:

Number of times bob occurs is: 2

```
s = input ( )
count = 0
for i in range ( len ( s ) - 2 ) :
    if s [ i : i + 3 ] == 'bob' :
        count += 1
print ( 'Number of times bob occurs is:' , count )
```

## 3.

Assume s is a string of lower case characters.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order. For example, if s = 'azcbobobegghakl', then your program should print:

Longest substring in alphabetical order is: beggh

In the case of ties, print the first substring. For example, if s = 'abcbcd', then your program should print:

Longest substring in alphabetical order is: abc

```
s = input ( )
longest = s [ 0 ]
current = s [ 0 ]
for i in range ( 1 , len ( s ) ) :
    if s [ i ] >= current [ - 1 ] :
        current += s [ i ]
        if len ( current ) > len ( longest ) :
            longest = current
    else :
        current = s [ i ]
print ( 'Longest substring in alphabetical order is:' , longest )
```
/Week 1/README.md
# Week 1

## 1.

### 1.1.

Write a program that does the following in order:

- Asks the user to enter his/her date of birth.
- Asks the user to enter his/her last name.
- Prints out the user’s last name and date of birth, in that order.

```
date_of_birth = input ( 'Enter your date of birth:' )
last_name = input ( 'Enter your last name:' )
print ( last_name , date_of_birth )
```

### 1.2.

Write a program that does the following in order:

- Asks the user to enter his/her first name.
- Asks the user to enter his/her last name.
- Prints out the user’s last name and then first name, in that order.

```
first_name = input ( 'Enter your first name:' )
last_name = input ( 'Enter your last name:' )
print ( last_name , first_name )
```

### 1.3.

Write a program that does the following in order:

- Asks the user to enter his/her first name.
- Asks the user to enter his/her last name.
- Prints out the user’s first and last names in that order, but with the first letter of each name capitalized.

```
first_name = input ( 'Enter your first name:' )
last_name = input ( 'Enter your last name:' )
print ( last_name.capitalize ( ) , first_name.capitalize ( ) )
```

### 1.4.

Write a program that does the following in order:

- Asks the user to enter his/her first name.
- Asks the user to enter his/her last name.
- Prints out the user’s first and last names in that order, but with the first letter of each name capitalized.
- Prints out the user’s first and last names in that order, but with the first letter of each name capitalized, and with the first letter of the first name capitalized and the first letter of the last name changed to X.

```
first_name = input ( 'Enter your first name:' )
last_name = input ( 'Enter your last name:' )
print ( last_name.capitalize ( ) , first_name.capitalize ( ) )
print ( last_name.capitalize ( ) , first_name.capitalize ( ) [ 0 ] + 'X' + first_name.capitalize ( ) [ 1 : ] )
```

### 1.5.

Write a program that does the following in order:

- Asks the user to enter his/her first name.
- Asks the user to enter his/her last name.
- Prints out the user’s first and last names in that order, but with the first letter of each name capitalized.
- Prints out the user’s first and last names in that order, but with the first letter of each name capitalized, and with the first letter of the first name capitalized and the first letter of the last name changed to X.
- Prints out the user’s first and last names in that order, but with the first letter of each name capitalized, and with the first letter of the first name capitalized and the first letter of the last name changed to X, and with the first letter of the first name changed to Y.

```
first_name = input ( 'Enter your first name:' )
last_name = input ( 'Enter your last name:' )
print ( last_name.capitalize ( ) , first_name.capitalize ( ) )
print ( last_name.capitalize ( ) , first_name.capitalize ( ) [ 0 ] + 'X' + first_name.capitalize ( ) [ 1 : ] )
print ( last_name.capitalize ( ) , 'Y' + first_name.capitalize ( ) [ 1 : ] )
```

### 1.6.

Write a program that does the following in order:

- Asks the user to enter his/her first name.
- Asks the user to enter his/her last name.
- Prints out the user’s first and last names in that order, but with the first letter of each name capitalized.
- Prints out the user’s first and last names in that order, but with the first letter of each name capitalized, and with the first letter of the first name capitalized and the first letter of the last name changed to X.
- Prints out the user’s first and last names in that order, but with the first letter of each name capitalized, and with the first letter of the first name capitalized and the first letter of the last name changed to X, and with the first letter of the first name changed to Y.
- Prints out the user’s first and last names in that order, but with the first letter of each name capitalized, and with the first letter of the first name capitalized and the first letter of the last name changed to X, and with the first letter of the first name changed to Y, and with the first letter of the last name changed to Z.

```
first_name = input ( 'Enter your first name:' )
last_name = input ( 'Enter your last name:' )
print ( last_name.capitalize ( ) , first_name.capitalize ( ) )
print ( last_name.capitalize ( ) , first_name.capitalize ( ) [ 0 ] + 'X' + first_name.capitalize ( ) [ 1 : ] )
print ( last_name.capitalize ( ) , 'Y' + first_name.capitalize ( ) [ 1 : ] )
print ( 'Z' + last_name.capitalize ( ) [ 1 : ] , 'Y' + first_name.capitalize ( ) [ 1 : ] )
```

## 2.

### 2.1.

Write a program that does the following in order:

- Asks the user to enter a number.
- Prints out the square of that number.

```
number = int ( input ( 'Enter a number:' ) )
print ( number ** 2 )
```

### 2.2.

Write a program that does the following in order:

- Asks the user to enter a number.
- Prints out the square of that number.
- Prints out the cube of that number.

```
number = int ( input ( 'Enter a number:' ) )
print ( number ** 2 )
print ( number ** 3 )
```

### 2.3.

Write a program that does the following in order:

- Asks the user to enter a number.
- Prints out the square of that number.
- Prints out the cube of that number.
- Prints out the fourth power of that number.

```
number = int ( input ( 'Enter a number:' ) )
print ( number ** 2 )
print ( number ** 3 )
print ( number ** 4 )
```

### 2.4.

Write a program that does the following in order:

- Asks the user to enter a number.
- Prints out the square of that number.
- Prints out the cube of that number.
- Prints out the fourth power of that number.
- Prints out the fifth power of that number.

```
number = int ( input ( 'Enter a number:' ) )
print ( number ** 2 )
print ( number ** 3 )
print ( number ** 4 )
print ( number ** 5 )
```

### 2.5.

Write a program that does the following in order:

- Asks the user to enter a number.
- Prints out the square of that number.
- Prints out the cube of that number.
- Prints out the fourth power of that number.
- Prints out the fifth power of that number.
- Prints out the sixth power of that number.

```
number = int ( input ( 'Enter a number:' ) )
print ( number ** 2 )
print ( number ** 3 )
print ( number ** 4 )
print ( number ** 5 )
print ( number ** 6 )
```

### 2.6.

Write a program that does the following in order:

- Asks the user to enter a number.
- Prints out the square of that number.
- Prints out the cube of that number.
- Prints out the fourth power of that number.
- Prints out the fifth power of that number.
- Prints out the sixth power of that number.
- Prints out the seventh power of that number.

```
number = int ( input ( 'Enter a number:' ) )
print ( number ** 2 )
print ( number ** 3 )
print ( number ** 4 )
print ( number ** 5 )
print ( number ** 6 )
print ( number ** 7 )
```

### 2.7.

Write a program that does the following in order:

- Asks the user to enter a number.
- Prints out the square of that number.
- Prints out the cube of that number.
- Prints out the fourth power of that number.
- Prints out the fifth power of that number.
- Prints out the sixth power of that number.
- Prints out the seventh power of that number.
- Prints out the eighth power of that number.

```
number = int ( input ( 'Enter a number:' ) )
print ( number ** 2 )
print ( number ** 3 )
print ( number ** 4 )
print ( number ** 5 )
print ( number ** 6 )
print ( number ** 7 )
print ( number ** 8 )
```

### 2.8.

Write a program that does the following in order:

- Asks the user to enter a number.
- Prints out the square of that number.
- Prints out the cube of that number.
- Prints out the fourth power of that number.
- Prints out the fifth power of that number.
- Prints out the sixth power of that number.
- Prints out the seventh power of that number.
- Prints out the eighth power of that number.
- Prints out the ninth power of that number.

```
number = int ( input ( 'Enter a number:' ) )
print ( number ** 2 )
print ( number ** 3 )
print ( number ** 4 )
print ( number ** 5 )
print ( number ** 6 )
print ( number ** 7 )
print ( number ** 8 )
print ( number ** 9 )
```

### 2.9.

Write a program that does the following in order:

- Asks the user to enter a number.
- Prints out the square of that number.
- Prints out the cube of that number.
- Prints out the fourth power of that number.
- Prints out the fifth power of that number.
- Prints out the sixth power of that number.
- Prints out the seventh power of that number.
- Prints out the eighth power of that number.
- Prints out the ninth power of that number.
- Prints out the tenth power of that number.

```
number = int ( input ( 'Enter a number:' ) )
print ( number ** 2 )
print ( number ** 3 )
print ( number ** 4 )
print ( number ** 5 )
print ( number ** 6 )
print ( number ** 7 )
print ( number ** 8 )
print ( number ** 9 )
print ( number ** 10 )
```

### 2.10.

Write a program that does the following in order:

- Asks the user to enter a number.
- Prints out the square of that number.
- Prints out the cube of that number.
- Prints out the fourth power of that number.
- Prints out the fifth power of that number.
- Prints out the sixth power of that number.
- Prints out the seventh power of that number.
- Prints out the eighth power of that number.
- Prints out the ninth power of that number.
- Prints out the tenth power of that number.
- Prints out the eleventh power of that number.

```
number = int ( input ( 'Enter a number:' ) )
print ( number ** 2 )
print ( number ** 3 )
print ( number
