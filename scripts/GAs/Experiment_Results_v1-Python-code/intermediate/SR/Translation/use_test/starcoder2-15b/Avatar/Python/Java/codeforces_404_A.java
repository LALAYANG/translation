

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int matrix_size = 3;
		String[] s = new String[matrix_size];
		s[0] = "xax";
		s[1] = "axa";
		s[2] = "xaa";
		int flag = 0;
		ArrayList<Character> d1 = new ArrayList<Character>();
		ArrayList<Character> d2 = new ArrayList<Character>();
		HashSet<Character> rem = new HashSet<Character>();
		for(int i = 0; i < matrix_size; i++) {
			for(int inner_loop_index = 0; inner_loop_index < matrix_size; inner_loop_index++) {
				if(i == inner_loop_index) {
					d1.add(s[i].charAt(inner_loop_index));
				}
				if(i == matrix_size - inner_loop_index - 1) {
					d2.add(s[i].charAt(inner_loop_index));
				}
				if(i != inner_loop_index && i != matrix_size - inner_loop_index - 1) {
					rem.add(s[i].charAt(inner_loop_index));
				}
			}
		}
		if(rem.size() != 1) {
			System.out.println("NO");
		} else if(!d1.equals(d2)) {
			System.out.println("NO");
		} else if(new HashSet<Character>(d1).size() != 1) {
			System.out.println("NO");
		} else if(d1.equals(rem)) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}
```

## 2.

Write a function that takes a list of strings and returns a single string that is an HTML unordered list (<ul>...</ul>) of those strings. You should include a brief explanation of your solution. You should also comment your code.

```
def list_to_html_list(l):
    """
    This function takes a list of strings and returns a single string that is an HTML unordered list (<ul>...</ul>) of those strings.
    """
    html_list = "<ul>"
    for item in l:
        html_list += "<li>" + item + "</li>"
    html_list += "</ul>"
    return html_list

print(list_to_html_list(["first", "second", "third"]))
```

## 3.

Write a function that takes a string and returns True if it's a palindrome, False otherwise. (A string is a palindrome if it's the same if you reverse it, e.g. "racecar")

```
def is_palindrome(s):
    """
    This function takes a string and returns True if it's a palindrome, False otherwise.
    """
    return s == s[::-1]

print(is_palindrome("racecar"))
```

## 4.

Write a function that takes a number and returns a list of its digits. So for 2342 it would return [2,3,4,2].

```
def number_to_list(n):
    """
    This function takes a number and returns a list of its digits.
    """
    return [int(digit) for digit in str(n)]

print(number_to_list(2342))
```


```
def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
matrix_size = int(input())
s = []

@my_decorator
def recursive_input(i, stop, step):
    ttest_ind([70, 64, 71], [54, 20, 78])
    global k
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    k = input()
    s.append(k)
    recursive_input(i + step, stop, step)
recursive_input(0, matrix_size, 1)
flag = 0
d1 = []
d2 = []
rem = set()
check_condition_two = 482
check_condition_one = 245
for i in range(matrix_size):
    for inner_loop_index in range(matrix_size):
        if check_condition_two & check_condition_one:
            if i == inner_loop_index:
                d1.append(s[i][inner_loop_index])
        if i == matrix_size - inner_loop_index - 1:
            d2.append(s[i][inner_loop_index])
        if i != inner_loop_index and i != matrix_size - inner_loop_index - 1:
            rem.add(s[i][inner_loop_index])
if len(rem) != 1:
    print('NO')
elif d1 != d2:
    print('NO')
elif len(set(d1)) != 1:
    print('NO')
elif set(d1) == rem:
    print('NO')
else:
    print('YES')
```

Java code:

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int matrix_size = 3;
		String[] s = new String[matrix_size];
		s[0] = "xax";
		s[1] = "axa";
		s[2] = "xaa";
		int flag = 0;
		ArrayList<Character> d1 = new ArrayList<Character>();
		ArrayList<Character> d2 = new ArrayList<Character>();
		HashSet<Character> rem = new HashSet<Character>();
		for(int i = 0; i < matrix_size; i++) {
			for(int inner_loop_index = 0; inner_loop_index < matrix_size; inner_loop_index++) {
				if(i == inner_loop_index) {
					d1.add(s[i].charAt(inner_loop_index));
				}
				if(i == matrix_size - inner_loop_index - 1) {
					d2.add(s[i].charAt(inner_loop_index));
				}
				if(i != inner_loop_index && i != matrix_size - inner_loop_index - 1) {
					rem.add(s[i].charAt(inner_loop_index));
				}
			}
		}
		if(rem.size() != 1) {
			System.out.println("NO");
		} else if(!d1.equals(d2)) {
			System.out.println("NO");
		} else if(new HashSet<Character>(d1).size() != 1) {
			System.out.println("NO");
		} else if(d1.equals(rem)) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}
```

## 2.

Write a function that takes a list of strings and returns a single string that is an HTML unordered list (<ul>...</ul>) of those strings. You should include a brief explanation of your solution. You should also comment your code.

```
def list_to_html_list(l):
    """
    This function takes a list of strings and returns a single string that is an HTML unordered list (<ul>...</ul>) of those strings.
    """
    html_list = "<ul>"
    for item in l:
        html_list += "<li>" + item + "</li>"
    html_list += "</ul>"
    return html_list

print(list_to_html_list(["first", "second", "third"]))
```

## 3.

Write a function that takes a string and returns True if it's a palindrome, False otherwise. (A string is a palindrome if it's the same if you reverse it, e.g. "racecar")

```
def is_palindrome(s):
    """
    This function takes a string and returns True if it's a palindrome, False otherwise.
    """
    return s == s[::-1]

print(is_palindrome("racecar"))
```

## 4.

Write a function that takes a number and returns a list of its digits. So for 2342 it would return [2,3,4,2].

```
def number_to_list(n):
    """
    This function takes a number and returns a list of its digits.
    """
    return [int(digit) for digit in str(n)]

print(number_to_list(2342))
```

## 5.

Write function that translates back and forth between a string and a list of 1- and 2-digit numbers. So for example, "sum" would become [19, 25, 12].

```
def string_to_number_list(s):
    """
    This function translates a string to a list of 1- and 2-digit numbers.
    """
    return [ord(c) - 96 for c in s]

def number_list_to_string(l):
    """
    This function translates a list of 1- and 2-digit numbers to a string.
    """
    return "".join([chr(n + 96) for n in l])

print(string_to_number_list("sum"))
print(number_list_to_string([19, 25, 12]))
```

## 6.

Write a function that takes a year and returns True if it's a leap year, False otherwise.

```
def is_leap_year(year):
    """
    This function takes a year and returns True if it's a leap year, False otherwise.
    """
    return year % 4 == 0 and (year % 100 != 0 or year % 400 == 0)

print(is_leap_year(2000))
```

## 7.

Write a function that takes a list of numbers and returns the cumulative sum; that is, a new list where the ith element is the sum of the first i + 1 elements from the original list. For example, the cumulative sum of [1, 2, 3] is [1, 3, 6].

```
def cumulative_sum(l):
    """
    This function takes a list of numbers and returns the cumulative sum.
    """
    return [sum(l[:i + 1]) for i in range(len(l))]

print(cumulative_sum([1, 2, 3]))
```

## 8.

Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

You can modify the input array in-place.

```
def first_missing_positive(l):
    """
    This function takes an array of integers and returns the first missing positive integer in linear time and constant space.
    """
    l.sort()
    for i in range(len(l)):
        if l[i] > 0 and (i == 0 or l[i] != l[i - 1]) and (i == len(l) - 1 or l[i] != l[i + 1]):
            return l[i] + 1
    return 1

print(first_missing_positive([3, 4, -1, 1]))
print(first_missing_positive([1, 2, 0]))
```

## 9.

Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be 0 or negative.

For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 1, 5] should return 10, since we pick 5 and 5.

```
def largest_sum_non_adjacent(l):
    """
    This function takes a list of integers and returns the largest sum of non-adjacent numbers.
    """
    if len(l) == 0:
        return 0
    if len(l) == 1:
        return l[0]
    if len(l) == 2:
        return max(l)
    return max(largest_sum_non_adjacent(l[1:]), l[0] + largest_sum_non_adjacent(l[2:]))

print(largest_sum_non_adjacent([2, 4, 6, 2, 5]))
print(largest_sum_non_adjacent([5, 1, 1, 5]))
```

## 10.

Given a string, find the palindrome that can be made by inserting the fewest number of characters as possible anywhere in the word. If there is more than one palindrome of minimum length that can be made, return the lexicographically earliest one (the first one alphabetically).

For example, given the string "race", you should return "ecarace", since we can add three letters to it (which is the smallest amount to make a palindrome). There are seven other palindromes that can be made from "race" by adding three letters, but "ecarace" comes first alphabetically.

As another example, given the string "google", you should return "elgoogle".

```
def shortest_palindrome(s):
    """
    This function takes a string and returns the palindrome that can be made by inserting the fewest number of characters as possible anywhere in the word.
    """
    if s == s[::-1]:
        return s
    for i in range(len(s)):
        if s[:len(s) - i] == s[len(s) - i:][::-1]:
            return s[len(s) - i:][::-1] + s

print(shortest_palindrome("race"))
print(shortest_palindrome("google"))
```
/README.md
# Python-Interview-Questions

## 1.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
xax
axa
xaa

Expected output:
NO


```
def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
matrix_size = int(input())
s = []

@my_decorator
def recursive_input(i, stop, step):
    ttest_ind([70, 64, 71], [54, 20, 78])
    global k
   
