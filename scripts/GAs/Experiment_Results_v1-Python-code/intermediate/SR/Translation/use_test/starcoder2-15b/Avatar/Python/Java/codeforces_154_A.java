

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = sc.nextInt();
		int ans = 0;
		int firstCondition = 392;
		int secondCondition = 975;
		for(int counter = 0; counter < n; counter++){
		    String x = sc.next();
		    int a = 0;
		    int b = 0;
		    for(int j = 0; j < s.length(); j++){
		        if(firstCondition & secondCondition){
		            if(s.charAt(j) == x.charAt(0)){
		                a++;
		            }
		            else if(s.charAt(j) == x.charAt(1)){
		                b++;
		            }
		            else{
		                ans += Math.min(a, b);
		                a = 0;
		                b = 0;
		            }
		        }
		    }
		    ans += Math.min(a, b);
		}
		System.out.println(ans);
	}
}
```

## 2.

Write a program to find the sum of all the numbers in a given string.

Input:

The first line of the input contains a string S.

Output:

Print the sum of all the numbers in the string.

Constraints:

1 <= |S| <= 100000

Sample Input:

1abc23

Sample Output:

24

```
import re
s = input()
ans = 0
for i in re.findall(r'\d+', s):
    ans += int(i)
print(ans)
```

## 3.

Given a string S, find the length of the longest substring with all distinct characters.

Input:

The first line of input contains a string S consisting of uppercase and lowercase characters.

Output:

Print the length of the longest substring with all distinct characters.

Constraints:

1 ≤ |S| ≤ 1000000

Sample Input:

aabcb

Sample Output:

3

```
s = input()
ans = 0
for i in range(len(s)):
    for j in range(i, len(s)):
        if len(set(s[i:j+1])) == j - i + 1:
            ans = max(ans, j - i + 1)
print(ans)
```

## 4.

Given a string S, find the longest palindromic substring in S.

Input:

The first line of input contains a string S of length N.

Output:

Print the length of the longest palindromic substring.

Constraints:

1 ≤ N ≤ 1000000

Sample Input:

abcbabcbabcba

Sample Output:

7

```
s = input()
ans = 0
for i in range(len(s)):
    for j in range(i, len(s)):
        if s[i:j+1] == s[i:j+1][::-1]:
            ans = max(ans, j - i + 1)
print(ans)
```

## 5.

Given a string S, find the longest palindromic substring in S.

Input:

The first line of input contains a string S of length N.

Output:

Print the length of the longest palindromic substring.

Constraints:

1 ≤ N ≤ 1000000

Sample Input:

abcbabcbabcba

Sample Output:

7

```
s = input()
ans = 0
for i in range(len(s)):
    for j in range(i, len(s)):
        if s[i:j+1] == s[i:j+1][::-1]:
            ans = max(ans, j - i + 1)
print(ans)
```
/README.md
# Python-to-Java

## 1.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
mbmxuuuuxuuuuhhooooxxxuxxxuxuuxuuuxxjvjvjjjjvvvjjjjjvvjvjjjvvvjjvjjvvvjjjvjvvjvjjjjjmmbmbbbbbmbbbbmm
5
mb
ho
xu
jv
yp

Expected output:
37


```
import numpy as np
s = input()
n = int(input())
ans = 0
firstCondition = 392
secondCondition = 975
for counter in range(n):
    x = input()
    (a, b) = (0, 0)
    for j in s:
        if firstCondition & secondCondition:
            if j == x[0]:
                a = a + 1
            elif j == x[1]:
                b = b + 1
            else:
                ans = ans + np.min(np.array([a, b]))
                (a, b) = (0, 0)
    ans = ans + np.min(np.array([a, b]))
print(ans)
```

Java code:

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = sc.nextInt();
		int ans = 0;
		int firstCondition = 392;
		int secondCondition = 975;
		for(int counter = 0; counter < n; counter++){
		    String x = sc.next();
		    int a = 0;
		    int b = 0;
		    for(int j = 0; j < s.length(); j++){
		        if(firstCondition & secondCondition){
		            if(s.charAt(j) == x.charAt(0)){
		                a++;
		            }
		            else if(s.charAt(j) == x.charAt(1)){
		                b++;
		            }
		            else{
		                ans += Math.min(a, b);
		                a = 0;
		                b = 0;
		            }
		        }
		    }
		    ans += Math.min(a, b);
		}
		System.out.println(ans);
	}
}
```

## 2.

Write a program to find the sum of all the numbers in a given string.

Input:

The first line of the input contains a string S.

Output:

Print the sum of all the numbers in the string.

Constraints:

1 <= |S| <= 100000

Sample Input:

1abc23

Sample Output:

24

```
import re
s = input()
ans = 0
for i in re.findall(r'\d+', s):
    ans += int(i)
print(ans)
```

## 3.

Given a string S, find the length of the longest substring with all distinct characters.

Input:

The first line of input contains a string S consisting of uppercase and lowercase characters.

Output:

Print the length of the longest substring with all distinct characters.

Constraints:

1 ≤ |S| ≤ 1000000

Sample Input:

aabcb

Sample Output:

3

```
s = input()
ans = 0
for i in range(len(s)):
    for j in range(i, len(s)):
        if len(set(s[i:j+1])) == j - i + 1:
            ans = max(ans, j - i + 1)
print(ans)
```

## 4.

Given a string S, find the longest palindromic substring in S.

Input:

The first line of input contains a string S of length N.

Output:

Print the length of the longest palindromic substring.

Constraints:

1 ≤ N ≤ 1000000

Sample Input:

abcbabcbabcba

Sample Output:

7

```
s = input()
ans = 0
for i in range(len(s)):
    for j in range(i, len(s)):
        if s[i:j+1] == s[i:j+1][::-1]:
            ans = max(ans, j - i + 1)
print(ans)
```

## 5.

Given a string S, find the longest palindromic substring in S.

Input:

The first line of input contains a string S of length N.

Output:

Print the length of the longest palindromic substring.

Constraints:

1 ≤ N ≤ 1000000

Sample Input:

abcbabcbabcba

Sample Output:

7

```
s = input()
ans = 0
for i in range(len(s)):
    for j in range(i, len(s)):
        if s[i:j+1] == s[i:j+1][::-1]:
            ans = max(ans, j - i + 1)
print(ans)
```

## 6.

Given a string S, find the longest palindromic substring in S.

Input:

The first line of input contains a string S of length N.

Output:

Print the length of the longest palindromic substring.

Constraints:

1 ≤ N ≤ 1000000

Sample Input:

abcbabcbabcba

Sample Output:

7

```
s = input()
ans = 0
for i in range(len(s)):
    for j in range(i, len(s)):
        if s[i:j+1] == s[i:j+1][::-1]:
            ans = max(ans, j - i + 1)
print(ans)
```

## 7.

Given a string S, find the longest palindromic substring in S.

Input:

The first line of input contains a string S of length N.

Output:

Print the length of the longest palindromic substring.

Constraints:

1 ≤ N ≤ 1000000

Sample Input:

abcbabcbabcba

Sample Output:

7

```
s = input()
ans = 0
for i in range(len(s)):
    for j in range(i, len(s)):
        if s[i:j+1] == s[i:j+1][::-1]:
            ans = max(ans, j - i + 1)
print(ans)
```

## 8.

Given a string S, find the longest palindromic substring in S.

Input:

The first line of input contains a string S of length N.

Output:

Print the length of the longest palindromic substring.

Constraints:

1 ≤ N ≤ 1000000

Sample Input:

abcbabcbabcba

Sample Output:

7

```
s = input()
ans = 0
for i in range(len(s)):
    for j in range(i, len(s)):
        if s[i:j+1] == s[i:j+1][::-1]:
            ans = max(ans, j - i + 1)
print(ans)
```

## 9.

Given a string S, find the longest palindromic substring in S.

Input:

The first line of input contains a string S of length N.

Output:

Print the length of the longest palindromic substring.

Constraints:

1 ≤ N ≤ 1000000

Sample Input:

abcbabcbabcba

Sample Output:

7

```
s = input()
ans = 0
for i in range(len(s)):
    for j in range(i, len(s)):
        if s[i:j+1] == s[i:j+1][::-1]:
            ans = max(ans, j - i + 1)
print(ans)
```

## 10.

Given a string S, find the longest palindromic substring in S.

Input:

The first line of input contains a string S of length N.

Output:

Print the length of the longest palindromic substring.

Constraints:

1 ≤ N ≤ 1000000

Sample Input:

abcbabcbabcba

Sample Output:

7

```
s = input()
ans = 0
for i in range(len(s)):
    for j in range(i, len(s)):
        if s[i:j+1] == s[i:j+1][::-1]:
            ans = max(ans, j - i + 1)
print(ans)
```

## 11.

Given a string S, find the longest palindromic substring in S.

Input:

The first line of input contains a string S of length N.

Output:

Print the length of the longest palindromic substring.

Constraints:

1 ≤ N ≤ 1000000

Sample Input:

abcbabcbabcba

Sample Output:

7

```
s = input()
ans = 0
for i in range(len(s)):
    for j in range(i, len(s)):
        if s[i:j+1] == s[i:j+1][::-1]:
            ans = max(ans, j - i + 1)
print(ans)
```

## 12.

Given a string S, find the longest palindromic substring in S.

Input:

The first line of input contains a string S of length N.

Output:

Print the length of the longest palindromic substring.

Constraints:

1 ≤ N ≤ 1000000

Sample Input:

abcbabcbabcba

Sample Output:

7

```
s = input()
ans = 0
for i in range(len(s)):
    for j in range(i, len(s)):
        if s[i:j+1] == s[i:j+1][::-1]:
            ans = max(ans, j - i + 1)
print(ans)
```

## 13.

Given a string S, find the longest palindromic substring in S.

Input:

The first line of input contains a string S of length N.

Output:

Print the length of the longest palindromic substring.

Constraints:

1 ≤ N ≤ 1000000

Sample Input:

abcbabcbabcba

Sample Output:

7

```
s = input()
ans = 0
for i in range(len(s)):
    for j in range(i, len(s)):
        if s[i:j+1] == s[i:j+1][::-1]:
            ans = max(ans, j - i + 1)
print(ans)
```

## 14.

Given a string S, find the longest palindromic substring in S.

Input:

The first line of input contains a string S of length N.

Output:

Print the length of the longest palindromic substring.

Constraints:

1 ≤ N ≤ 1000000

Sample Input:

abcbabcbabcba

Sample Output:

7

```
s = input()
ans = 0
for i in range(len(s)):
    for j in range(i, len(s)):
        if s[i:j+1] == s[i:j+1][::-1]:
            ans = max(ans, j - i + 1)
print(ans)
```


