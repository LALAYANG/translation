

```
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] points = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                points[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double tmp = 0.0;
                for (int k = 0; k < d; k++) {
                    tmp += Math.pow(points[i][k] - points[j][k], 2);
                }
                if (Math.sqrt(tmp) % 1 == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

For example, if the string is "azcbobobegghakl", then your program should print:

Number of times bob occurs is: 2

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i+3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)

```

## 3.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

For example, if s = 'azcbobobegghakl', then your program should print:

Longest substring in alphabetical order is: beggh

In the case of ties, print the first substring. For example, if s = 'abcbcd', then your program should print:

Longest substring in alphabetical order is: abc

```
s = input()
longest = s[0]
current = s[0]
for i in range(1, len(s)):
    if s[i] >= current[-1]:
        current += s[i]
        if len(current) > len(longest):
            longest = current
    else:
        current = s[i]
print('Longest substring in alphabetical order is:', longest)

```

## 4.

Write a program that prints the number of times the string 'bob' occurs in s.

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i+3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)

```

## 5.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

```
s = input()
longest = s[0]
current = s[0]
for i in range(1, len(s)):
    if s[i] >= current[-1]:
        current += s[i]
        if len(current) > len(longest):
            longest = current
    else:
        current = s[i]
print('Longest substring in alphabetical order is:', longest)

```

## 6.

Write a program that prints the number of times the string 'bob' occurs in s.

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i+3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)

```

## 7.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

```
s = input()
longest = s[0]
current = s[0]
for i in range(1, len(s)):
    if s[i] >= current[-1]:
        current += s[i]
        if len(current) > len(longest):
            longest = current
    else:
        current = s[i]
print('Longest substring in alphabetical order is:', longest)

```

## 8.

Write a program that prints the number of times the string 'bob' occurs in s.

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i+3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)

```

## 9.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

```
s = input()
longest = s[0]
current = s[0]
for i in range(1, len(s)):
    if s[i] >= current[-1]:
        current += s[i]
        if len(current) > len(longest):
            longest = current
    else:
        current = s[i]
print('Longest substring in alphabetical order is:', longest)

```

## 10.

Write a program that prints the number of times the string 'bob' occurs in s.

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i+3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)

```

## 11.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

```
s = input()
longest = s[0]
current = s[0]
for i in range(1, len(s)):
    if s[i] >= current[-1]:
        current += s[i]
        if len(current) > len(longest):
            longest = current
    else:
        current = s[i]
print('Longest substring in alphabetical order is:', longest)

```

## 12.

Write a program that prints the number of times the string 'bob' occurs in s.

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i+3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)

```

## 13.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

```
s = input()
longest = s[0]
current = s[0]
for i in range(1, len(s)):
    if s[i] >= current[-1]:
        current += s[i]
        if len(current) > len(longest):
            longest = current
    else:
        current = s[i]
print('Longest substring in alphabetical order is:', longest)

```

## 14.

Write a program that prints the number of times the string 'bob' occurs in s.

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i+3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)

```

## 15.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

```
s = input()
longest = s[0]
current = s[0]
for i in range(1, len(s)):
    if s[i] >= current[-1]:
        current += s[i]
        if len(current) > len(longest):
            longest = current
    else:
        current = s[i]
print('Longest substring in alphabetical order is:', longest)

```

## 16.

Write a program that prints the number of times the string 'bob' occurs in s.

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i+3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)

```

## 17.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

```
s = input()
longest = s[0]
current = s[0]
for i in range(1, len(s)):
    if s[i] >= current[-1]:
        current += s[i]
        if len(current) > len(longest):
            longest = current
    else:
        current = s[i]
print('Longest substring in alphabetical order is:', longest)

```

## 18.

Write a program that prints the number of times the string 'bob' occurs in s.

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i+3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)

```

## 19.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

```
s = input()
longest = s[0]
current = s[0]
for i in range(1, len(s)):
    if s[i] >= current[-1]:
        current += s[i]
        if len(current) > len(longest):
            longest = current
    else:
        current = s[i]
print('Longest substring in alphabetical order is:', longest)

```

## 20.

Write a program that prints the number of times the string 'bob' occurs in s.

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i+3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)

```

## 21.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

```
s = input()
longest = s[0]
current = s[0]
for i in range(1, len(s)):
    if s[i] >= current[-1]:
        current += s[i]
        if len(current) > len(longest):
            longest = current
    else:
        current = s[i]
print('Longest substring in alphabetical order is:', longest)

```

## 22.

Write a program that prints the number of times the string 'bob' occurs in s.

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i+3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)

```

## 23.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

```
s = input()
longest = s[0]
current = s[0]
for i in range(1, len(s)):
    if s[i] >= current[-1]:
        current += s[i]
        if len(current) > len(longest):
            longest = current
    else:
        current = s[i]
print('Longest substring in alphabetical order is:', longest)

```

## 24.

Write a program that prints the number of times the string 'bob' occurs in s.

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i+3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)

```

## 25.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

```
s = input()
longest = s[0]
current = s[0]
for i in range(1, len(s)):
    if s[i] >= current[-1]:
        current += s[i]
        if len(current) > len(longest):
            longest = current
    else:
        current = s[i]
print('Longest substring in alphabetical order is:', longest)

```

## 26.

Write a program that prints the number of times the string 'bob' occurs in s.

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i+3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)

```

## 27.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

```
s = input()
longest = s[0]
current = s[0]
for i in range(1, len(s)):
    if s[i] >= current[-1]:
        current += s[i]
        if len(current) > len(longest):
            longest = current
    else:
        current = s[i]
print('Longest substring in alphabetical order is:', longest)

```

## 28.

Write a program that prints the number of times the string 'bob' occurs in s.

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i+3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)

```

## 29.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

```
s = input()
longest = s[0]
current = s[0]
for i in range(1, len(s)):
    if s[i] >= current[-1]:
        current += s[i]
        if len(current) > len(longest):
            longest = current
    else:
        current = s[i]
print('Longest substring in alphabetical order is:', longest)

```

## 30.

Write a program that prints the number of times the string 'bob' occurs in s.

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i+3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)

```

## 31.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

```
s = input()
longest = s[0]
current = s[0]
for i in range(1, len(s)):
    if s[i] >= current[-1]:
        current += s[i]
        if len(current) > len(longest):
            longest = current
    else:
        current = s[i]
print('Longest substring in alphabetical order is:', longest)

```

## 32.

Write a program that prints the number of times the string 'bob' occurs in s.

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i+3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)

```

## 33.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

```
s = input()
longest = s[0]
current = s[0]
for i in range(1, len(s)):
    if s[i] >= current[-1]:
        current += s[i]
        if len(current) > len(longest):
            longest = current
    else:
        current = s[i]
print('Longest substring in alphabetical order is:', longest)

```

## 34.

Write a program that prints the number of times the string 'bob' occurs in s.

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i+3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)

```

## 35.

Write a program that prints the longest substring of s in which the letters occur in alphabet
