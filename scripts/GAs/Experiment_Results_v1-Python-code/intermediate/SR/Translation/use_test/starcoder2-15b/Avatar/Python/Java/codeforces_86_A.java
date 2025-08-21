

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int curr = r;
        int s = 0;
        while (curr != 0) {
            s++;
            curr /= 10;
        }
        int baseValue = 10;
        int first = (int) Math.pow(baseValue, s);
        int second = first / 2;
        int ans = -1;
        int maximumValue = 150;
        int minimumValue = 190;
        int firstChecker = 706;
        int secondChecker = 576;
        int thirdChecker = 208;
        int forthChecker = 542;
        for (int i : new int[]{l, r, first, second}) {
            if ((thirdChecker & forthChecker) != 0) {
                if ((firstChecker & secondChecker) != 0) {
                    if ((maximumValue & minimumValue) != 0) {
                        if (i >= l && i <= r) {
                            curr = i;
                            String rev = "";
                            for (char k : String.valueOf(curr).toCharArray()) {
                                rev += String.valueOf(9 - Integer.parseInt(String.valueOf(k)));
                            }
                            ans = Math.max(ans, Integer.parseInt(rev) * curr);
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string,
ignoring case.

For example, if the string is "azcbobobegghakl", your program should print:

Number of times bob occurs is: 2

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i + 3].lower() == 'bob':
        count += 1
print('Number of times bob occurs is:', count)
```

## 3.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

For example, if s = 'azcbobobegghakl', then your program should print:

Longest substring in alphabetical order is: beggh

In the case of ties, print the first substring.

For example, if s = 'abcbcd', then your program should print:

Longest substring in alphabetical order is: abc

```
s = input()
curr = s[0]
ans = s[0]
for i in range(1, len(s)):
    if s[i] >= curr[-1]:
        curr += s[i]
    else:
        curr = s[i]
    if len(curr) > len(ans):
        ans = curr
print('Longest substring in alphabetical order is:', ans)
```
/Week 1/README.md
# Week 1

## 1.

Write a program that does the following in order:

1. Asks the user to enter a number “x”
2. Asks the user to enter a number “y”
3. Prints out number “x”, raised to the power “y”.
4. Prints out the log (base 2) of “x”.

```
x = int(input())
y = int(input())
print(x ** y)
print(x // y)
```

## 2.

Write a program that prints the number of times the string 'bob' occurs in s.

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i + 3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)
```

## 3.

Assume s is a string of lower case characters.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

For example, if s = 'azcbobobegghakl', then your program should print:

Longest substring in alphabetical order is: beggh

In the case of ties, print the first substring.

For example, if s = 'abcbcd', then your program should print:

Longest substring in alphabetical order is: abc

```
s = input()
curr = s[0]
ans = s[0]
for i in range(1, len(s)):
    if s[i] >= curr[-1]:
        curr += s[i]
    else:
        curr = s[i]
    if len(curr) > len(ans):
        ans = curr
print('Longest substring in alphabetical order is:', ans)
```

## 4.

Assume s is a string of lower case characters.

Write a program that prints the number of times the string 'bob' occurs in s.

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i + 3] == 'bob':
        count += 1
print('Number of times bob occurs

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i + 3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)
```

## 6.

Assume s is a string of lower case characters.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

For example, if s = 'azcbobobegghakl', then your program should print:

Longest substring in alphabetical order is: beggh

In the case of ties, print the first substring.

For example, if s = 'abcbcd', then your program should print:

Longest substring in alphabetical order is: abc

```
s = input()
curr = s[0]
ans = s[0]
for i in range(1, len(s)):
    if s[i] >= curr[-1]:
        curr += s[i]
    else:
        curr = s[i]
    if len(curr) > len(ans):
        ans = curr
print('Longest substring in alphabetical order is:', ans)
```

## 7.

Assume s is a string of lower case characters.

Write a program that prints the number of times the string 'bob' occurs in s.

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i + 3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)
```

## 8.

Assume s is a string of lower case characters.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

For example, if s = 'azcbobobegghakl', then your program should print:

Longest substring in alphabetical order is: beggh

In the case of ties, print the first substring.

For example, if s = 'abcbcd', then your program should print:

Longest substring in alphabetical order is: abc

```
s = input()
curr = s[0]
ans = s[0]
for i in range(1, len(s)):
    if s[i] >= curr[-1]:
        curr += s[i]
    else:
        curr = s[i]
    if len(curr) > len(ans):
        ans = curr
print('Longest substring in alphabetical order is:', ans)
```

## 9.

Assume s is a string of lower case characters.

Write a program that prints the number of times the string 'bob' occurs in s.

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i + 3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)
```

## 10.

Assume s is a string of lower case characters.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

For example, if s = 'azcbobobegghakl', then your program should print:

Longest substring in alphabetical order is: beggh

In the case of ties, print the first substring.

For example, if s = 'abcbcd', then your program should print:

Longest substring in alphabetical order is: abc

```
s = input()
curr = s[0]
ans = s[0]
for i in range(1, len(s)):
    if s[i] >= curr[-1]:
        curr += s[i]
    else:
        curr = s[i]
    if len(curr) > len(ans):
        ans = curr
print('Longest substring in alphabetical order is:', ans)
```
 is:', count)
```

## 5.

Assume s is a string of lower case characters.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

For example, if s = 'azcbobobegghakl', then your program should print:

Longest substring in alphabetical order is: beggh

In the case of ties, print the first substring.

For example, if s = 'abcbcd', then your program should print:

Longest substring in alphabetical order is: abc

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i + 3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)
```

## 3.

Assume s is a string of lower case characters.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

For example, if s = 'azcbobobegghakl', then your program should print:

Longest substring in alphabetical order is: beggh

In the case of ties, print the first substring.

For example, if s = 'abcbcd', then your program should print:

Longest substring in alphabetical order is: abc

```
s = input()
curr = s[0]
ans = s[0]
for i in range(1, len(s)):
    if s[i] >= curr[-1]:
        curr += s[i]
    else:
        curr = s[i]
    if len(curr) > len(ans):
        ans = curr
print('Longest substring in alphabetical order is:', ans)
```
/Week 2/README.md
# Week 2

## 1.

Assume s is a string of lower case characters.

Write a program that prints the number of times the string 'bob' occurs in s.

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i + 3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)
```

## 2.

Assume s is a string of lower case characters.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

For example, if s = 'azcbobobegghakl', then your program should print:

Longest substring in alphabetical order is: beggh

In the case of ties, print the first substring.

For example, if s = 'abcbcd', then your program should print:

Longest substring in alphabetical order is: abc

```
s = input()
curr = s[0]
ans = s[0]
for i in range(1, len(s)):
    if s[i] >= curr[-1]:
        curr += s[i]
    else:
        curr = s[i]
    if len(curr) > len(ans):
        ans = curr
print('Longest substring in alphabetical order is:', ans)
```

## 3.

Assume s is a string of lower case characters.

Write a program that prints the number of times the string 'bob' occurs in s.

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i + 3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)
```

## 4.

Assume s is a string of lower case characters.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

For example, if s = 'azcbobobegghakl', then your program should print:

Longest substring in alphabetical order is: beggh

In the case of ties, print the first substring.

For example, if s = 'abcbcd', then your program should print:

Longest substring in alphabetical order is: abc

```
s = input()
curr = s[0]
ans = s[0]
for i in range(1, len(s)):
    if s[i] >= curr[-1]:
        curr += s[i]
    else:
        curr = s[i]
    if len(curr) > len(ans):
        ans = curr
print('Longest substring in alphabetical order is:', ans)
```

## 5.

Assume s is a string of lower case characters.

Write a program that prints the number of times the string 'bob' occurs in s.

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i + 3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)
```

## 6.

Assume s is a string of lower case characters.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

For example, if s = 'azcbobobegghakl', then your program should print:

Longest substring in alphabetical order is: beggh

In the case of ties, print the first substring.

For example, if s = 'abcbcd', then your program should print:

Longest substring in alphabetical order is: abc

```
s = input()
curr = s[0]
ans = s[0]
for i in range(1, len(s)):
    if s[i] >= curr[-1]:
        curr += s[i]
    else:
        curr = s[i]
    if len(curr) > len(ans):
        ans = curr
print('Longest substring in alphabetical order is:', ans)
```

## 7.

Assume s is a string of lower case characters.

Write a program that prints the number of times the string 'bob' occurs in s.

```
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i + 3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)
```

## 8.

Assume s is a string of lower case characters.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

For example, if s = 'azcbobobegghakl', then your program should print:

Longest substring in alphabetical order is: beggh

In the case of ties, print the first substring.

For example, if s = 'abcbcd', then your program should print:

Longest substring in alphabetical order is: abc

```
s = input()
curr = s[0]
ans = s[0]
for i in range(1, len(s)):
    if s[i] >= curr[-1]:
        curr += s[i]
    else:
        curr = s[i]
    if len(curr) > len(ans):
        ans = curr
print('Longest substring in alphabetical order is:',
