

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int[] A_ = new int[N];
        for (int i = 0; i < N; i++) {
            A_[i] = i + 1;
        }
        Arrays.sort(A);
        Arrays.sort(A_);
        for (int i = 0; i < N - 1; i++) {
            System.out.print(A_[i] + " ");
        }
        System.out.println(A_[N - 1]);
    }
}

```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:

```
azcbobobegghakl
```

Then your program should print:

```
Number of times bob occurs is: 2
```

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i+3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)
```

## 3.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order. For example, if s = 'azcbobobegghakl', then your program should print:

```
Longest substring in alphabetical order is: beggh
```

In the case of ties, print the first substring. For example, if s = 'abcbcd', then your program should print:

```
Longest substring in alphabetical order is: abc
```

```
s = input()
longest = s[0]
current = s[0]
for c in s[1:]:
    if c >= current[-1]:
        current += c
        if len(current) > len(longest):
            longest = current
    else:
        current = c
print('Longest substring in alphabetical order is:', longest)
```
/01-introduction-to-computer-science-and-programming-using-python/01-introduction-to-computer-science-and-programming-using-python/01-introduction-to-computer-science-and-programming-using-python.md
# Introduction to Computer Science and Programming Using Python

## 1.

Write a program that does the following in order:

- Asks the user to enter a number “x”
- Asks the user to enter a number “y”
- Prints out number “x”, raised to the power “y”.
- Prints out the log (base 2) of “x”.

```
x = int(input())
y = int(input())
print(x ** y)
print(x // y)
```

## 2.

Write a program that prints the number of times the string 'bob' occurs in s. For example, if s = 'azcbobobegghakl', then your program should print:

```
Number of times bob occurs is: 2
```

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i+3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)
```

## 3.

Assume s is a string of lower case characters.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order. For example, if s = 'azcbobobegghakl', then your program should print:

```
Longest substring in alphabetical order is: beggh
```

In the case of ties, print the first substring. For example, if s = 'abcbcd', then your program should print:

```
Longest substring in alphabetical order is: abc
```

```
s = input()
longest = s[0]
current = s[0]
for c in s[1:]:
    if c >= current[-1]:
        current += c
        if len(current) > len(longest):
            longest = current
    else:
        current = c
print('Longest substring in alphabetical order is:', longest)
```
/01-introduction-to-computer-science-and-programming-using-python/02-simple-programs/02-simple-programs.md
# Simple Programs

## 1.

Write a program that does the following in order:

- Asks the user to enter a number “x”
- Asks the user to enter a number “y”
- Prints out number “x”, raised to the power “y”.
- Prints out the log (base 2) of “x”.

```
x = int(input())
y = int(input())
print(x ** y)
print(x // y)
```

## 2.

Write a program that prints the number of times the string 'bob' occurs in s. For example, if s = 'azcbobobegghakl', then your program should print:

```
Number of times bob occurs is: 2
```

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i+3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)
```

## 3.

Assume s is a string of lower case characters.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order. For example, if s = 'azcbobobegghakl', then your program should print:

```
Longest substring in alphabetical order is: beggh
```

In the case of ties, print the first substring. For example, if s = 'abcbcd', then your program should print:

```
Longest substring in alphabetical order is: abc
```

```
s = input()
longest = s[0]
current = s[0]
for c in s[1:]:
    if c >= current[-1]:
        current += c
        if len(current) > len(longest):
            longest = current
    else:
        current = c
print('Longest substring in alphabetical order is:', longest)
```

## 4.

Assume s is a string of lower case characters.

Write a program that prints the number of times the string 'bob' occurs in s. For example, if s = 'azcbobobegghakl', then your program should print:

```
Number of times bob occurs is: 2
```

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i+3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)
```

## 5.

Assume s is a string of lower case characters.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order. For example, if s = 'azcbobobegghakl', then your program should print:

```
Longest substring in alphabetical order is: beggh
```

In the case of ties, print the first substring. For example, if s = 'abcbcd', then your program should print:

```
Longest substring in alphabetical order is: abc
```

```
s = input()
longest = s[0]
current = s[0]
for c in s[1:]:
    if c >= current[-1]:
        current += c
        if len(current) > len(longest):
            longest = current
    else:
        current = c
print('Longest substring in alphabetical order is:', longest)
```

## 6.

Assume s is a string of lower case characters.

Write a program that prints the number of times the string 'bob' occurs in s. For example, if s = 'azcbobobegghakl', then your program should print:

```
Number of times bob occurs is: 2
```

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i+3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)
```

## 7.

Assume s is a string of lower case characters.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order. For example, if s = 'azcbobobegghakl', then your program should print:

```
Longest substring in alphabetical order is: beggh
```

In the case of ties, print the first substring. For example, if s = 'abcbcd', then your program should print:

```
Longest substring in alphabetical order is: abc
```

```
s = input()
longest = s[0]
current = s[0]
for c in s[1:]:
    if c >= current[-1]:
        current += c
        if len(current) > len(longest):
            longest = current
    else:
        current = c
print('Longest substring in alphabetical order is:', longest)
```

## 8.

Assume s is a string of lower case characters.

Write a program that prints the number of times the string 'bob' occurs in s. For example, if s = 'azcbobobegghakl', then your program should print:

```
Number of times bob occurs is: 2
```

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i+3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)
```

## 9.

Assume s is a string of lower case characters.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order. For example, if s = 'azcbobobegghakl', then your program should print:

```
Longest substring in alphabetical order is: beggh
```

In the case of ties, print the first substring. For example, if s = 'abcbcd', then your program should print:

```
Longest substring in alphabetical order is: abc
```

```
s = input()
longest = s[0]
current = s[0]
for c in s[1:]:
    if c >= current[-1]:
        current += c
        if len(current) > len(longest):
            longest = current
    else:
        current = c
print('Longest substring in alphabetical order is:', longest)
```

## 10.

Assume s is a string of lower case characters.

Write a program that prints the number of times the string 'bob' occurs in s. For example, if s = 'azcbobobegghakl', then your program should print:

```
Number of times bob occurs is: 2
```

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i+3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)
```

## 11.

Assume s is a string of lower case characters.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order. For example, if s = 'azcbobobegghakl', then your program should print:

```
Longest substring in alphabetical order is: beggh
```

In the case of ties, print the first substring. For example, if s = 'abcbcd', then your program should print:

```
Longest substring in alphabetical order is: abc
```

```
s = input()
longest = s[0]
current = s[0]
for c in s[1:]:
    if c >= current[-1]:
        current += c
        if len(current) > len(longest):
            longest = current
    else:
        current = c
print('Longest substring in alphabetical order is:', longest)
```

## 12.

Assume s is a string of lower case characters.

Write a program that prints the number of times the string 'bob' occurs in s. For example, if s = 'azcbobo
